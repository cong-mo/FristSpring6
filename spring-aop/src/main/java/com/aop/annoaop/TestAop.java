package com.aop.annoaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void tt(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator cal = context.getBean(Calculator.class);
        cal.add(1,2);
    }
}
