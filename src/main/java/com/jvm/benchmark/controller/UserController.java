package com.jvm.benchmark.controller;

import com.jvm.benchmark.controller.model.ImmutableUserView;
import com.jvm.benchmark.controller.model.UserView;
import com.jvm.benchmark.domain.model.User;
import com.jvm.benchmark.domain.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    UserView getUser() {
        final User user = userService.getUser();
        return ImmutableUserView.builder()
                .username(user.username())
                .build();
    }
}
