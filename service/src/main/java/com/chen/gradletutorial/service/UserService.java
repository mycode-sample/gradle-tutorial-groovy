package com.chen.gradletutorial.service;

import com.chen.gradletutorial.api.UserApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public String getName() {
        log.info("userService");
        UserApi userApi = new UserApi();
        return userApi.getName();
    }
}
