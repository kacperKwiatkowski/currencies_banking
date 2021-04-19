package com.kacperkwiatkowski.users.config;

import com.kacperkwiatkowski.users.user.UserDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }



}
