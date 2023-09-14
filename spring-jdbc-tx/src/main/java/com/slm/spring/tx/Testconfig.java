package com.slm.spring.tx;

import com.slm.spring.config.MySpringConfig;
import com.slm.spring.tx.dao.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Testconfig {
    @Test
    public void tt(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        BookController bean = context.getBean(BookController.class);
        Object getDataSource = context.getBean("getDataSource");
        Object jdbcTemplate = context.getBean("jdbcTemplate");

        Field[] fields = getDataSource.getClass().getFields();
        Method[] methods = getDataSource.getClass().getMethods();

        for (Field f:fields
             ) {
                System.out.println(f);

        }


        //bean.BuyBook(1,1);

    }
}
