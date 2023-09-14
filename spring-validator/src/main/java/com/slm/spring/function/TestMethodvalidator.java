package com.slm.spring.function;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMethodvalidator {
    @Test
    public void tt(){
        ApplicationContext context = new AnnotationConfigApplicationContext(validatorConfig.class);
        MycontrollerValidator mycontrollerValidator = context.getBean(MycontrollerValidator.class);
        people people = new people();
        people.setAge(210);
        people.setName("llj");
        mycontrollerValidator.testParams(people);
        System.out.println(people.toString());
    }
}
