package com.chen.gradletutorial.app;

import com.chen.gradletutorial.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String name = userService.getName();
        // 中文乱码，暂时无法解决
        // System.out.println("用户名:" + name);
        System.out.println("username:" +name);
    }
}
