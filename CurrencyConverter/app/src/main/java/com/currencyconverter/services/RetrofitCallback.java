package com.currencyconverter.services;

import retrofit2.Response;


public interface RetrofitCallback<T> {

    void onSuccess(Response<T> response);

    void onFailure(String error);

}
