package com.example.springbootAnno.springbootannotations.service;

import org.springframework.stereotype.Component;

//@Component
public class SubjectService implements Subject{
    @Override
    public String getSubject(){
        return "Science Subject";
    }
}