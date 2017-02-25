package com.currencyconverter.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.currencyconverter.models.Rate;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CurrencyApp.db";
    private static final String CURRENCY_TABLE_NAME = "currencies";
    private static final String COLUMN_CURRENCY = "currency";
    private static final String COLUMN_AMOUNT = "amount";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table "+CURRENCY_TABLE_NAME+" "+
                        "(id integer primary key, "+ COLUMN_CURRENCY +" text,"+ COLUMN_AMOUNT +" real)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+CURRENCY_TABLE_NAME);
        onCreate(db);
    }

    public boolean insertCurrency (String currency, Double amount) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_CURRENCY, currency);
        contentValues.put(COLUMN_AMOUNT, amount);
        db.insert(CURRENCY_TABLE_NAME, null, contentValues);
        return true;
    }

    public Rate getDataByCurrency(String currency) {
        SQLiteDatabase db = this.getReadableDatabase();
        Rate obj = null;
        try {
            Cursor cursor =  db.rawQuery( "select * from "+CURRENCY_TABLE_NAME+" where "+COLUMN_CURRENCY+" = '"+currency+"'", null );
            if (cursor.moveToFirst()) {
                String cur = cursor.getString(cursor.getColumnIndex(COLUMN_CURRENCY));
                Double amount = cursor.getDouble(cursor.getColumnIndex(COLUMN_AMOUNT));
                obj = new Rate(cur, amount);
            }

        } finally {
            try { db.close(); } catch (Exception ignore) {}
        }
        return obj;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, CURRENCY_TABLE_NAME);
        return numRows;
    }

    public ArrayList<Rate> getAllCurrencies() {
        ArrayList<Rate> list = new ArrayList<Rate>();

        SQLiteDatabase db = this.getReadableDatabase();
        try {

            Cursor cursor = db.rawQuery( "select * from "+CURRENCY_TABLE_NAME, null);
            try {
                if (cursor.moveToFirst()) {
                    do {
                        String cur = cursor.getString(cursor.getColumnIndex(COLUMN_CURRENCY));
                        Double amount = cursor.getDouble(cursor.getColumnIndex(COLUMN_AMOUNT));
                        Rate obj = new Rate(cur, amount);
                        list.add(obj);
                    } while (cursor.moveToNext());
                }

            } finally {
                try { cursor.close(); } catch (Exception ignore) {}
            }

        } finally {
            try { db.close(); } catch (Exception ignore) {}
        }

        return list;
    }

    public void removeAllCurrencies(){
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("delete from "+ CURRENCY_TABLE_NAME);
    }
}
