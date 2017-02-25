package com.currencyconverter.receivers;

import android.app.IntentService;
import android.content.Intent;

import com.currencyconverter.models.FixerResponse;
import com.currencyconverter.services.CurrencyListService;
import com.currencyconverter.services.RetrofitCallback;

import retrofit2.Response;

public class BackgroundService extends IntentService {

    public BackgroundService() {
        super(BackgroundService.class.getName());

    }

    @Override
    protected void onHandleIntent(Intent intent) {
        new CurrencyListService(this).runAsync(new RetrofitCallback<FixerResponse>() {
            @Override
            public void onSuccess(Response<FixerResponse> response) {

            }

            @Override
            public void onFailure(String error) {

            }
        });
    }
}
