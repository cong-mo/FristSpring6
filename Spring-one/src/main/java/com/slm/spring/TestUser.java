package com.slm.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        User user=(User) context.getBean("user");

        user.add();
    }

    @Test
    public void textUser2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cla=Class.forName("com.slm.spring.User");
        User user=(User) cla.getDeclaredConstructor().newInstance();
        user.add();
    }
}
