package com.currencyconverter;

import android.content.Context;

import com.currencyconverter.common.Utils;
import com.currencyconverter.database.DBHelper;
import com.currencyconverter.models.FixerResponse;
import com.currencyconverter.models.Rate;
import com.currencyconverter.services.CurrencyListService;
import com.currencyconverter.services.RetrofitCallback;

import org.apache.commons.lang3.math.NumberUtils;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

public class MainActivityPresenter implements MainActivityContract.MainActivityActionListener{

    private String selectedCurrency;
    private DBHelper mydb;
    private Context mContext;
    transient private WeakReference<MainActivityContract.MainActivityView> myView = null;

    MainActivityPresenter() {
    }

    @Override
    public void bindView(MainActivityContract.MainActivityView view, Context context) {
        myView = new WeakReference<>(view);
        mContext = context;
        Utils.setAlarm(context);
        mydb = new DBHelper(context);
        if(mydb.numberOfRows() <= 0){
            getRatesFromServer();
        } else {
            setupCurrencySpinner();
            updateResult();
        }
    }

    private void getRatesFromServer(){
        new CurrencyListService(mContext).runAsync(new RetrofitCallback<FixerResponse>() {
            @Override
            public void onSuccess(Response<FixerResponse> response) {
                setupCurrencySpinner();
            }

            @Override
            public void onFailure(String error) {
                myView.get().showDialog(error);
            }
        });

    }

    private void setupCurrencySpinner(){
        List<Rate> rates = mydb.getAllCurrencies();
        List<String> currencies = new ArrayList<>();

        if(rates != null && rates.size() > 0){
            currencies.add(mContext.getResources().getString(R.string.select_currency));
            for (Rate rate: rates) {
                currencies.add(rate.getCurrency());
            }
            myView.get().setupCurrencySpinner(currencies);
        }
    }

    private void updateResult(){
        if(!mContext.getResources().getString(R.string.select_currency).equals(selectedCurrency) && isAmountValid()) {
            Rate selectedRate = mydb.getDataByCurrency(selectedCurrency);
            List<Rate> rates;
            List<Rate> newRates = new ArrayList<>();
            rates = mydb.getAllCurrencies();
            for (Rate rate: rates) {
                if(!rate.getCurrency().equals(selectedCurrency)){
                    Double input = Double.parseDouble(myView.get().getEditAmount());
                    // calculation is based on 1 USD rates which is (user_input * amount of row / selected currency amount)
                    Double calculatedAmount = (rate.getAmount() * input)/selectedRate.getAmount();
                    newRates.add(new Rate(rate.getCurrency(), calculatedAmount));
                }
            }

            myView.get().notifyRecyclerView(newRates);
        }

    }

    private boolean isAmountValid() {
        return myView.get().getEditAmount().length() > 0 && (NumberUtils.isNumber(myView.get().getEditAmount()) || myView.get().getEditAmount().matches("\\d+[.,]"));
    }

    @Override
    public void onEditAmountTextChanged(String amount) {
        if(amount.length() > 0) {
            updateResult();
        }else {
            myView.get().notifyRecyclerView(new ArrayList<Rate>());
        }
    }

    @Override
    public void onSpinnerCurrencySelection(String selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
        updateResult();
    }

}
