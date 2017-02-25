package com.currencyconverter.receivers;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent updater = new Intent(context, BackgroundService.class);
        context.startService(updater);
        Log.i("ALarmReceiver","Inside alarm ");
    }
}
