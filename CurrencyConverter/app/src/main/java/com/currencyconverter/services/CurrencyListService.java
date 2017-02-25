package com.currencyconverter.services;

import android.content.Context;
import android.util.Log;

import com.currencyconverter.common.Constants;
import com.currencyconverter.database.DBHelper;
import com.currencyconverter.models.FixerResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyListService {
    private static final String TAG = "CurrencyListService";

    Context context;

    public CurrencyListService(Context context){
        this.context = context;
    }

    public void runAsync(final RetrofitCallback<FixerResponse> callback) {

        Log.i(TAG , "runAsync");
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        final DBHelper mydb = new DBHelper(context);

        Call<FixerResponse> call = apiService.getLatestRates(Constants.BASE_CURRENCY);
        call.enqueue(new Callback<FixerResponse>()
             {
                 @Override
                 public void onResponse(Call<FixerResponse> call, Response<FixerResponse> response) {
                     FixerResponse responseBody = response.body();

                     // remove all records before storing new data
                     mydb.removeAllCurrencies();

                     mydb.insertCurrency(Constants.BASE_CURRENCY, 1.0);
                     for (Map.Entry<String, String> m : responseBody.getRates().entrySet()) {
                         mydb.insertCurrency(m.getKey(), Double.parseDouble(m.getValue()));

                     }

                     callback.onSuccess(response);
                 }

                 @Override
                 public void onFailure(Call<FixerResponse> call, Throwable t) {
                     Log.e(TAG, t.toString());
                     callback.onFailure(t.toString());
                 }
             }

        );
    }
}
