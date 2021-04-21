package com.kacperkwiatkowski.currencies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class Controller {

    @GetMapping("/test")
    ResponseEntity<String> test(){
        return ResponseEntity.ok("CURRENCIES-TEST");
    }

}
