package com.currencyconverter;

import android.content.Context;

import com.currencyconverter.models.Rate;

import java.util.List;

public class MainActivityContract {

    interface MainActivityView {
        String getEditAmount();
        void showDialog(String message);
        void notifyRecyclerView(List<Rate> rates);
        void setupCurrencySpinner(List<String> currencies);
    }

    interface MainActivityActionListener {
        void bindView(MainActivityView view, Context context);
        void unBindView();
        void onEditAmountTextChanged(String amount);
        void onSpinnerCurrencySelection(String selectedCurrency);
    }
}
