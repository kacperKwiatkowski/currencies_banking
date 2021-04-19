package com.kacperkwiatkowski.users.user;

import lombok.*;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserDto {

    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String postcode;
    private String city;
    private String country;

    public static User parseToEntity(UserDto userDto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDto, User.class);
    }
}
