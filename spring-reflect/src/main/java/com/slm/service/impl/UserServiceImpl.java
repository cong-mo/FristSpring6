package com.slm.service.impl;

import com.slm.anno.Bean;
import com.slm.anno.Di;
import com.slm.dao.UserDao;
import com.slm.service.UserService;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;
}
