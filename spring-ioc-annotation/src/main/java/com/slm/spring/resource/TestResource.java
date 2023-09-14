package com.slm.spring.resource;

import com.slm.spring.resource.controller.Usercontroller;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResource {

    @Test
    public void tt(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Usercontroller bean = context.getBean(Usercontroller.class);
        bean.add();
    }
}
