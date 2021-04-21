package com.kacperkwiatkowski.currencies;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrenciesFacade {

    public List<CurrencyRate> fetchCurrenciesFromApi() {
        return CurrencyRate.parseMapToCurrencyRateObjectList(CurrenciesApiFetcher.fetchCurrenciesFromApi());
    }
}
