package com.kacperkwiatkowski.currencies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currencies")
class Controller {

    private final CurrenciesFacade currenciesFacade;

    public Controller(CurrenciesFacade currenciesFacade) {
        this.currenciesFacade = currenciesFacade;
    }

    @GetMapping("/test")
    ResponseEntity<String> test(){
        return ResponseEntity.ok("CURRENCIES-TEST");
    }

    @GetMapping("/api")
    ResponseEntity<List<CurrencyRate>> getAll(){
        return ResponseEntity.ok(currenciesFacade.fetchCurrenciesFromApi());
    }

}
