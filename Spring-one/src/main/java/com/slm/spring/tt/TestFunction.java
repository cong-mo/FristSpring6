package com.slm.spring.tt;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFunction {
    @Test
    public void Testmethon(){
        ApplicationContext context = new ClassPathXmlApplicationContext("TestBean.xml");
        TestBean t1 = context.getBean("t1", TestBean.class);
        System.out.println(t1.toString());
    }
}
