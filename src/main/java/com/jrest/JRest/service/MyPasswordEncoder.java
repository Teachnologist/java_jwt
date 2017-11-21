package com.jrest.JRest.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyPasswordEncoder {

    public void MyPasswordEncoder2() {

        int i = 0;
        while (i < 10) {
            String password = "123456";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);

            System.out.println(hashedPassword);
            i++;
        }

    }
}