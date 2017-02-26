package com.currencyconverter.common;

import android.app.AlarmManager;
import android.content.Context;
import android.os.SystemClock;
import android.support.compat.BuildConfig;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowAlarmManager;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class UtilsTest {
    Context context;
    ShadowAlarmManager shadowAlarmManager;
    AlarmManager alarmManager;

    @Before
    public void setUp() throws Exception {
        context = RuntimeEnvironment.application.getApplicationContext();
        alarmManager = (AlarmManager) RuntimeEnvironment.application.getSystemService(Context.ALARM_SERVICE);
        shadowAlarmManager = shadowOf(alarmManager);

    }

    @Test
    public void setAlarm() throws Exception {
        assertNull(shadowAlarmManager.getNextScheduledAlarm());

        Utils.setAlarm(context);

        ShadowAlarmManager.ScheduledAlarm scheduledAlarm = shadowAlarmManager.getNextScheduledAlarm();
        assertEquals(AlarmManager.INTERVAL_HALF_HOUR, scheduledAlarm.interval);
        assertEquals(SystemClock.elapsedRealtime(), scheduledAlarm.triggerAtTime);
        assertEquals(AlarmManager.ELAPSED_REALTIME, scheduledAlarm.type);
    }

}