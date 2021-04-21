package com.kacperkwiatkowski.accounts.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
class Controller {

    @GetMapping("/getAll")
    ResponseEntity<String>getAll(){
        return ResponseEntity.ok("ACCOUNT");
    }


    @GetMapping("/test")
    ResponseEntity<String>test(){
        return ResponseEntity.ok("ACCOUNT-TEST");
    }
}
