package com.slm.spring.iocxml.bean;

public class UserDaoImpl implements UserDao{


    @Override
    public void run() {
        System.out.println("UserDaoImpl------fun()");
    }
}
