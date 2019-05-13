package com.ling.api.service;

import com.ling.api.domain.User;

/**
 * Created by Lian on 05/10/2019.
 */
public interface UserService {
    public User findUserById(Long id);
}
