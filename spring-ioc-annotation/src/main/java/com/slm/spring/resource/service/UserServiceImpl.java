package com.slm.spring.resource.service;

import com.slm.spring.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MyUserServiceImpl")
public class UserServiceImpl implements UserService{

    @Resource(name = "MyUserDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("UserServiceImpl->add()");
        userDao.add();
    }
}
