package com.slm.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersionValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","NameEmptyError","名字不能为空！");
        Person p =(Person) target;
        if (p.getAge() < 0){
            errors.rejectValue("age","AgeNumError","年龄不能小于0！");
        }else if(p.getAge() > 200){
            errors.rejectValue("age","AgeNumError","年龄不能大于200！");
        }
    }
}
