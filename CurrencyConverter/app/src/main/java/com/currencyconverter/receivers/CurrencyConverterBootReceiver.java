package com.currencyconverter.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.currencyconverter.common.Utils;

public class CurrencyConverterBootReceiver extends BroadcastReceiver {
    private static final String TAG = "BootReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Log.i(TAG , "BOOT_COMPLETED");
            Utils.setAlarm(context);
        }
    }
}
