package com.kacperkwiatkowski.users.user;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void parseToDto() {

        //GIVEN
        User user = User.builder()
                .email("test@gmail.com")
                .dateOfBirth(LocalDate.of(1999, 9, 1))
                .city("London")
                .flatNumber("21")
                .build();

        //WHEN
        UserDto userDto = User.parseToDto(user);

        //THEN
        assertEquals(user.getEmail(), userDto.getEmail());
        assertEquals(user.getDateOfBirth(), userDto.getDateOfBirth());
        assertEquals(user.getCity(), userDto.getCity());
        assertEquals(user.getFlatNumber(), userDto.getFlatNumber());
    }
}