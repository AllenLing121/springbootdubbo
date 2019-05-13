package com.ling.service.impl;

import com.ling.api.domain.User;
import com.ling.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by Lian on 05/10/2019.
 */
@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUserName("allen");
        user.setPassword("123456");
        user.setRegTime(LocalDateTime.now());
        return user;
    }
}
