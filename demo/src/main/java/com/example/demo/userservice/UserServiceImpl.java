package com.example.demo.userservice;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public void test() {
        System.out.println("test");
    }

}
