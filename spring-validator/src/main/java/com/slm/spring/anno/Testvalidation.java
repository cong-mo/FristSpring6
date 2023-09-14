package com.slm.spring.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testvalidation {
    @Test
    public void tt(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyvalidatorConfig.class);
        Myvalidation bean = context.getBean(Myvalidation.class);
        User user = new User("llj",250);

        boolean b = bean.validatorBuUser(user);
        System.out.println(b);
    }
}
