package com.chen.gradletutorial.app;

import com.chen.gradletutorial.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception{
        UserService userService = new UserService();
        String name = userService.getName();
        // 中文乱码，暂时无法解决
        // System.out.println("用户名:" + name);
        System.out.println("username:" +name);
        Properties properties = System.getProperties();
        ObjectMapper objectMapper = new ObjectMapper();
        if (!new File("temp").exists()) {
            new File("temp").mkdir();
        }
        OutputStream os = new FileOutputStream("temp/system.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(os, properties);
    }
}
