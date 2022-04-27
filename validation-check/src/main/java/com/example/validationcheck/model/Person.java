package com.example.validationcheck.model;

import javax.validation.constraints.Size;

public class Person {

    @Size(max = 10, message = "10자")
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
