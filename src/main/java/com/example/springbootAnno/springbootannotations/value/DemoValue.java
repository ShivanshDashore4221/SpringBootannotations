package com.example.springbootAnno.springbootannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoValue {
    private String employee;
    @Value("${db.url}")
    private String dbUrl;

    public String getString(){
        return dbUrl;
    }
}