package com.kacperkwiatkowski.currencies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrenciesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrenciesApplication.class, args);
    }

}
