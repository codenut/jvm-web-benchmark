package com.jvm.benchmark.domain.services.impl;

import com.jvm.benchmark.domain.model.ImmutableUser;
import com.jvm.benchmark.domain.model.User;
import com.jvm.benchmark.domain.services.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        return ImmutableUser.builder()
                .username("codenut")
                .firstName("Code")
                .lastName("Nut")
                .age(10)
                .build();
    }
}
