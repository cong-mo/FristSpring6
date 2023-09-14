package com.slm.spring.iocxml.DI;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudents {

    @Test
    public void testsetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Students students = context.getBean("students", Students.class);

        System.out.println(students);

    }

    @Test
    public void testconstructor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Students students = context.getBean("students-con", Students.class);
        System.out.println(students);
    }
}
