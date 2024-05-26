package com.chen.gradletutorial.app;

import com.chen.gradletutorial.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        log.info("call userService");
        UserService userService = new UserService();
        String name = userService.getName();
        // 中文乱码，暂时无法解决
        log.info("是不是乱码");
        System.out.println("用户名:" + name);
        System.out.println("username:" + name);
        Properties properties = System.getProperties();
        ObjectMapper objectMapper = new ObjectMapper();
        if (!new File("temp").exists()) {
            new File("temp").mkdir();
        }
        OutputStream os = new FileOutputStream("temp/system.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(os, properties);
        Properties p2 = new Properties();
        properties.keySet().forEach(k -> {
            if (k.toString().contains("encoding")) {
                p2.setProperty(k.toString(), properties.getProperty(k.toString()));
            }
        });
        OutputStream os2 = new FileOutputStream("temp/encoding.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(os2, p2);
    }
}
