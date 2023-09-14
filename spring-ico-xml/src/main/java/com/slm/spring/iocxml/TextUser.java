package com.slm.spring.iocxml;

import com.slm.spring.iocxml.bean.UserDao;
import com.slm.spring.iocxml.bean.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextUser {

    @Test
    public void textfunction(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

//        User user1 = (User) context.getBean("user");
//
//        User user2 = context.getBean(User.class);
//
//        User user3 = context.getBean("user", User.class);

        UserDao userdao = context.getBean(UserDao.class);
        System.out.println(userdao);
        userdao.run();

    }

}
