package com.chen.gradletutorial.service;

import com.chen.gradletutorial.api.UserApi;

public class UserService {
    public String getName() {
        UserApi userApi = new UserApi();
        return userApi.getName();
    }
}
