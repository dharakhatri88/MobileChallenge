package com.currencyconverter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;

import com.currencyconverter.common.Constants;
import com.currencyconverter.database.DBHelper;
import com.currencyconverter.models.FixerResponse;
import com.currencyconverter.models.Rate;
import com.currencyconverter.receivers.AlarmReceiver;
import com.currencyconverter.services.ApiInterface;
import com.google.gson.Gson;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowAlarmManager;

import java.util.ArrayList;
import java.util.Map;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@RunWith(MockitoJUnitRunner.class)
public class MainActivityPresenterTest {

    MainActivityContract.MainActivityView mockView = mock(MainActivityContract.MainActivityView.class);
    Context mockContext = mock(Context.class);
    Resources mockResources = mock(Resources.class);
    MockWebServer server;
    MainActivityPresenter presenter;
    DBHelper myDb;
    PendingIntent pendingIntent;

    String jsonResponse = "{    \"base\": \"USD\",\n" +
            "    \"date\": \"2017-02-24\",\n" +
            "    \"rates\": {\n" +
            "        \"AUD\": 1.3023,\n" +
            "        \"BGN\": 1.8435,\n" +
            "        \"BRL\": 3.0889,\n" +
            "        \"CAD\": 1.3109,\n" +
            "        \"CHF\": 1.0038,\n" +
            "        \"CNY\": 6.869,\n" +
            "        \"CZK\": 25.47,\n" +
            "        \"DKK\": 7.0076,\n" +
            "        \"GBP\": 0.79652,\n" +
            "        \"HKD\": 7.7614,\n" +
            "        \"HRK\": 7.0011,\n" +
            "        \"HUF\": 290.88,\n" +
            "        \"IDR\": 13317,\n" +
            "        \"ILS\": 3.6988,\n" +
            "        \"INR\": 66.608,\n" +
            "        \"JPY\": 112.21,\n" +
            "        \"KRW\": 1129.4,\n" +
            "        \"MXN\": 19.694,\n" +
            "        \"MYR\": 4.4405,\n" +
            "        \"NOK\": 8.3292,\n" +
            "        \"NZD\": 1.3867,\n" +
            "        \"PHP\": 50.198,\n" +
            "        \"PLN\": 4.0632,\n" +
            "        \"RON\": 4.2577,\n" +
            "        \"RUB\": 58.105,\n" +
            "        \"SEK\": 8.9724,\n" +
            "        \"SGD\": 1.4037,\n" +
            "        \"THB\": 34.882,\n" +
            "        \"TRY\": 3.581,\n" +
            "        \"ZAR\": 12.915,\n" +
            "        \"EUR\": 0.9426\n" +
            "    }\n" +
            "}";
    @Before
    public void setUp() throws Exception {
        server = new MockWebServer();
        server.start();
        myDb = new DBHelper(mockContext);
        pendingIntent = Mockito.mock(PendingIntent.class);

        presenter = new MainActivityPresenter();
    }


    @After
    public void tearDown() throws Exception {
        presenter.unBindView();
        server.shutdown();
    }

    @Test
    public void onEditAmountTextChanged() throws Exception {

        server.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(jsonResponse));

        FixerResponse response = new Gson().fromJson(jsonResponse, FixerResponse.class);

        ArrayList<Rate> rates = new ArrayList<>();
        rates.add(new Rate(Constants.BASE_CURRENCY, 1.0));
        for (Map.Entry<String, String> m : response.getRates().entrySet()) {
            rates.add(new Rate(m.getKey(), Double.parseDouble(m.getValue())));
        }
        assertEquals(rates.size(), 32);
    }

}