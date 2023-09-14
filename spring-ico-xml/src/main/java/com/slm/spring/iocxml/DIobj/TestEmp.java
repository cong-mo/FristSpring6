package com.slm.spring.iocxml.DIobj;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

    @Test
    public void Testobj(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diobj.xml");
        Emp emp = context.getBean("emp3", Emp.class);
        //emp.work();

        Dept dept5 = context.getBean("dept5", Dept.class);
        dept5.dept_info();



    }
}
