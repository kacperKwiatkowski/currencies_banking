package com.kacperkwiatkowski.accounts.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {

    @GetMapping("/getAll")
    ResponseEntity<String> getAllUsers(){
        log.debug("TEST");
        return ResponseEntity.ok("asd");
    }
}
