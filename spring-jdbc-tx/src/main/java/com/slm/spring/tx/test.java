package com.slm.spring.tx;

import com.slm.spring.tx.dao.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class test {

    @Autowired
    private BookController bookController;

    @Test
    public void testBUyBook(){
        bookController.BuyBook(1,1);
    }
}
