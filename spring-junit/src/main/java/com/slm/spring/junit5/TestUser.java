package com.slm.spring.junit5;

import com.slm.spring.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestUser {

    @Autowired
    private User user;

    @Test
    public void tt(){
        System.out.println(user);
        user.run();
    }
}
