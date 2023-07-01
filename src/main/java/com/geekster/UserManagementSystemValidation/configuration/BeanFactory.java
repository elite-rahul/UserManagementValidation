package com.geekster.UserManagementSystemValidation.configuration;

import com.geekster.UserManagementSystemValidation.model.Type;
import com.geekster.UserManagementSystemValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getAllUsers() {

        User initalizeUser = new User(1, "rahul", "2000-03-15", "sikroharrahul@gmail.com", "916386077464", Type.ADMIN, LocalDate.now(),LocalTime.now());
        List<User> userList = new ArrayList<>();
        userList.add(initalizeUser);
        return userList;
    }
}
