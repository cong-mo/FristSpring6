package com.slm.spring.iocxml.bean;

import com.slm.spring.iocxml.User;

public class PersonDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("PersonDaoImpl----run()");
    }
}
