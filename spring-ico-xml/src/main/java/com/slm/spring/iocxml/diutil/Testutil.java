package com.slm.spring.iocxml.diutil;

import com.slm.spring.iocxml.DIobj.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testutil {
    @Test
    public void Ttest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-diutil.xml");
        Students stu1 = (Students) context.getBean("stu1",Students.class);
        System.out.println(stu1.toString());


    }
}
