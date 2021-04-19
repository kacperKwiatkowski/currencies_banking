package com.kacperkwiatkowski.users.user;

import lombok.*;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
class User {

    @Email(message = "Email should be valid")
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @PastOrPresent
    private LocalDate dateOfBirth;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String street;
    @Positive
    private String houseNumber;
    @Positive
    private String flatNumber;
    @NotNull
    private String postcode;
    @NotNull
    private String city;
    @NotNull
    private String country;

    public static UserDto parseToDto(User user){

        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDto.class);
    }
}
