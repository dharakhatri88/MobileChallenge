package com.currencyconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.currencyconverter.models.Rate;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityContract.MainActivityView{
    private static final int GRID_SPAN_COUNT = 3;

    EditText editAmount;
    Spinner spinnerCurrency;
    RecyclerView recyclerView;

    private MainActivityContract.MainActivityActionListener mainActivityActionListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAmount = (EditText) findViewById(R.id.edit_amount);
        spinnerCurrency = (Spinner) findViewById(R.id.spinner_currency);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        editAmount.addTextChangedListener(amountTextWatcher);
        spinnerCurrency.setOnItemSelectedListener(itemSelector);

        setupRecyclerView();

        if (mainActivityActionListener == null) {
            mainActivityActionListener = new MainActivityPresenter();
        }
        mainActivityActionListener.bindView(MainActivity.this, getApplicationContext());
    }

    private void setupRecyclerView(){
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, GRID_SPAN_COUNT);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(mLayoutManager);
    }

    TextWatcher amountTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            mainActivityActionListener.onEditAmountTextChanged(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    AdapterView.OnItemSelectedListener itemSelector = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            ((TextView) parent.getChildAt(0)).setGravity(Gravity.RIGHT);
            mainActivityActionListener.onSpinnerCurrencySelection(parent.getSelectedItem().toString());
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    @Override
    public void setupCurrencySpinner(List<String> currencies) {
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAdapter.addAll(currencies);
        spinnerCurrency.setAdapter(spinnerAdapter);
    }

    @Override
    public void notifyRecyclerView(List<Rate> rates) {
        CurrencyResultAdapter adapter = new CurrencyResultAdapter(MainActivity.this, rates);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public String getEditAmount(){
        return editAmount.getText().toString();
    }

    @Override
    public void showDialog(String message){
        final AlertDialog dialog = new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton(getString(R.string.ok_button), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();

        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainActivityActionListener.unBindView();
    }
}
