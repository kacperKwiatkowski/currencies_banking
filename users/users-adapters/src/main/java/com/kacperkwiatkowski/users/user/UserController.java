package com.kacperkwiatkowski.users.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @GetMapping("/getAll")
    ResponseEntity<UserDto> getAllUsers(){
        log.debug("TEST");
        return ResponseEntity.ok(UserDto.builder().email("test@gmail.com").build());
    }
}
