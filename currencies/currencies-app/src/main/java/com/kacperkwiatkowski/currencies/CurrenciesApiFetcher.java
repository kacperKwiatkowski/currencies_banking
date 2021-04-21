package com.kacperkwiatkowski.currencies;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

class CurrenciesApiFetcher {
    private final static String apiKey = "b38ab6fd375880a74d4c9566dd1f19bf";
    private final static String apiUrl = "http://api.currencylayer.com/live?access_key=";

    public static HashMap<String, Object> fetchCurrenciesFromApi() {

        Gson gson = new Gson();
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(apiUrl + apiKey);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapCurrencies(content.toString());
    }

    private static HashMap<String, Object> mapCurrencies(String jsonFileString) {

        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> map = new HashMap<String, Object>();

        try
        {
            final ObjectNode node = new ObjectMapper().readValue(jsonFileString, ObjectNode.class);

            jsonFileString = node.get("quotes").toString();

            map = new ObjectMapper().readValue(jsonFileString, HashMap.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }
}
