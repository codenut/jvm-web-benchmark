package com.jvm.benchmark.config;

import com.jvm.benchmark.domain.services.UserService;
import com.jvm.benchmark.domain.services.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
