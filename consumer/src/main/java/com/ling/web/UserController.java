package com.ling.web;

import com.ling.api.domain.User;
import com.ling.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lian on 05/10/2019.
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/user")
    public User readUser(){
        User user = this.userService.findUserById(1L);
        return user;
    }
}
