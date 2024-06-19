package com.example.springbootAnno.springbootannotations.service;

import org.springframework.stereotype.Component;

//@Component
public class MathSubject implements Subject{

    @Override
    public String getSubject() {
        return "Mathematics subject";
    }
}