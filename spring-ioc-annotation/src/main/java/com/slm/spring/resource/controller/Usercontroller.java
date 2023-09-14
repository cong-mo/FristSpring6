package com.slm.spring.resource.controller;


import com.slm.spring.resource.dao.UserDao;
import com.slm.spring.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("MyUsercontroller")
public class Usercontroller {

    @Resource(name = "MyUserServiceImpl")
    private UserService userService;

    public void add(){
        System.out.println("Usercontroller->add()");
        userService.add();
    }



}
