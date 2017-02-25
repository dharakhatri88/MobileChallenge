package com.currencyconverter.services;

import com.currencyconverter.models.Rate;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class RatesDeserializer implements JsonDeserializer<Map<String, String>> {
    @Override
    public Map<String, String> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        Type type = new TypeToken<Map<String, String>>(){}.getType();

        Map<String, String> myMap = new Gson().fromJson(json.getAsJsonObject(), type);
        return myMap;
    }
}
