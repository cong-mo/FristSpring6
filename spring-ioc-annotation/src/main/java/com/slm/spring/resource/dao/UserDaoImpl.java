package com.slm.spring.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("MyUserDaoImpl")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("USerDaoImpl->add()");
    }
}
