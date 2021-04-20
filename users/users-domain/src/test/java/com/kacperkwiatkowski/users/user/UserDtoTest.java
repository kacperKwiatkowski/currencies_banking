package com.kacperkwiatkowski.users.user;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDtoTest {

    @Test
    void parseToEntity() {
        //GIVEN
        UserDto userDto = UserDto.builder()
                .email("test@gmail.com")
                .dateOfBirth(LocalDate.of(1999, 9, 1))
                .city("London")
                .flatNumber("21")
                .build();

        //WHEN
        User user = UserDto.parseToEntity(userDto);

        //THEN
        assertEquals(user.getEmail(), userDto.getEmail());
        assertEquals(user.getDateOfBirth(), userDto.getDateOfBirth());
        assertEquals(user.getCity(), userDto.getCity());
        assertEquals(user.getFlatNumber(), userDto.getFlatNumber());
    }
}