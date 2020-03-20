package com.education.module.service.impl;

import com.education.module.entity.User;
import com.education.module.repository.UserRepository;
import com.education.module.service.UserService;

import java.util.ServiceLoader;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl() {
        ServiceLoader<UserRepository> userRepositoryServiceLoader = ServiceLoader.load(UserRepository.class);
        this.userRepository = userRepositoryServiceLoader.findFirst().get();
    }

    @Override
    public User getUserById(String id) {
        if (userRepository != null) {
            return userRepository.getUserById(id);
        }
        return null;
    }
}
