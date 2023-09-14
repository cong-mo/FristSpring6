package com.slm.spring.function;

import com.slm.spring.validator.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class MycontrollerValidator {

    public String testParams(@NotNull @Valid people people){
        return people.toString();
    }

}
