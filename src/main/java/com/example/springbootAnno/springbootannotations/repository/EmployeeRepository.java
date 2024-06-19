package com.example.springbootAnno.springbootannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    // jpa use karna ho to JPA Repository ko extend karo and then override all find, save methods here.

    public String getEmployeeData(){
        return "Data from repository layer";
    }

}