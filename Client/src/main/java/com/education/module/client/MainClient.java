package com.education.module.client;

import com.education.module.entity.User;
import com.education.module.service.UserService;

import java.util.ServiceLoader;

public class MainClient {

    public static void main(String[] args) {
        ServiceLoader<UserService> userServiceServiceLoader = ServiceLoader.load(UserService.class);
        UserService userService = userServiceServiceLoader.findFirst().orElseThrow(IllegalStateException::new);
        User user = userService.getUserById("some id");
        System.out.println(user);
    }

}
