package com.currencyconverter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.currencyconverter.common.Constants;
import com.currencyconverter.models.Rate;

import java.text.DecimalFormat;
import java.util.List;

public class CurrencyResultAdapter extends
        RecyclerView.Adapter<CurrencyResultAdapter.ViewHolder> {

    private List<Rate> mRates;
    private Context mContext;

    public CurrencyResultAdapter(Context context, List<Rate> rates) {
        mRates = rates;
        mContext = context;
    }

    @Override
    public CurrencyResultAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate custom layout
        View contactView = inflater.inflate(R.layout.grid_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CurrencyResultAdapter.ViewHolder viewHolder, int position) {
        Rate rate = mRates.get(position);

       viewHolder.bind(rate);

    }

    @Override
    public int getItemCount() {
        return mRates.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtAmount;
        private TextView txtCurrency;

        public ViewHolder(View itemView) {
           super(itemView);

            txtAmount = (TextView) itemView.findViewById(R.id.txt_amount);
            txtCurrency = (TextView) itemView.findViewById(R.id.txt_currency);
        }

        public void bind(Rate rate){
            DecimalFormat df = new DecimalFormat(Constants.CURRENCY_FORMATTER);
            txtAmount.setText(df.format(rate.getAmount())+"");
            txtCurrency.setText(rate.getCurrency());
        }
    }
}
