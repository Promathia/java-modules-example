package com.education.module.repository.impl;

import com.education.module.entity.User;
import com.education.module.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User getUserById(String id) {
        return new User("User", "User");
    }
}
