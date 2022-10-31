package com.jvm.benchmark.controller;

import com.jvm.benchmark.controller.model.ImmutableUserView;
import com.jvm.benchmark.controller.model.UserView;
import com.jvm.benchmark.domain.model.User;
import com.jvm.benchmark.domain.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    UserView getUser() {
        final User user = userService.getUser();
        LOGGER.info("Get user: [{}]", user);
        return ImmutableUserView.builder()
                .username(user.username())
                .build();
    }
}
