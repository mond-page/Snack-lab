package com.example.validationcheck.controller;

import com.example.validationcheck.model.Person;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class PersonController {

    @PostMapping(value = "person")
    public Person savePerson(@Valid @RequestBody Person person) {
        System.out.println(person);
        return person;
    }
}
