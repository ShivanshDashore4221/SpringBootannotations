package com.example.springbootAnno.springbootannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherContorller {

    @RequestMapping("/home")
    public String home(){
        return "home.jsp";
    }

}