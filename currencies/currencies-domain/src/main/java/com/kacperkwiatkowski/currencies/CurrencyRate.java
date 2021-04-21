package com.kacperkwiatkowski.currencies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
class CurrencyRate {

    private String code;
    private double rate;

    /*
        EXCHANGE METHOD
        ...............
        Sum / (RateFrom * (1 / RateTo))

     */

    static List<CurrencyRate> parseMapToCurrencyRateObjectList(HashMap<String, Object> mapToParse){

        List<CurrencyRate>currencyRates = new ArrayList<>();

        for (HashMap.Entry<String, Object> entry : mapToParse.entrySet()) {
            currencyRates.add(
                    new CurrencyRate(
                            entry.getKey().substring(3),
                            Double.parseDouble(entry.getValue().toString())
                    )
            );
        }

        return currencyRates;
    }
}
