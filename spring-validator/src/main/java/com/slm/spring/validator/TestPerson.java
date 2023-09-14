package com.slm.spring.validator;

import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestPerson {
    @Test
    public void  tt(){
        Person p = new Person();
        p.setName("llj");
        p.setAge(2010);

        DataBinder binder = new DataBinder(p);

        binder.setValidator(new PersionValidator());

        binder.validate();

        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult.getAllErrors());
        System.out.println(p.toString());
    }
}
