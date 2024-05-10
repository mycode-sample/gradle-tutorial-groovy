package com.chen.gradletutorial.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserApi {
    private static final Logger log = LoggerFactory.getLogger(UserApi.class);

    public String getName() {
        log.info("UserApi");
        return "username";
    }
}
