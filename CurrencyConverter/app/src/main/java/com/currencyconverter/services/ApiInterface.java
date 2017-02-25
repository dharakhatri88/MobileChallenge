package com.currencyconverter.services;

import com.currencyconverter.models.FixerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("latest")
    Call<FixerResponse> getLatestRates(@Query("base") String base);

}
