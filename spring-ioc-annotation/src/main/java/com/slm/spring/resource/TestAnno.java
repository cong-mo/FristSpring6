package com.slm.spring.resource;

import com.slm.spring.config.SpringConfig;
import com.slm.spring.resource.controller.Usercontroller;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {
    @Test
    public void tt(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Usercontroller bean = context.getBean(Usercontroller.class);
        bean.add();
    }
}
