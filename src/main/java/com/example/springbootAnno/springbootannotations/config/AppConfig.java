package com.example.springbootAnno.springbootannotations.config;

import com.example.springbootAnno.springbootannotations.controller.SubjectController;
import com.example.springbootAnno.springbootannotations.service.MathSubject;
import com.example.springbootAnno.springbootannotations.service.Subject;
import com.example.springbootAnno.springbootannotations.service.SubjectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

// this is our main Config class in java-based configuration

@Configuration
public class AppConfig{

    @Bean
    @Lazy
    public Subject mathSubject(){
        return new MathSubject();
    }

    @Bean
    public Subject scienceSubject(){
        return new SubjectService();
    }
    // main controller here
    @Bean(initMethod = "initBean", destroyMethod = "destroyBean")
    public SubjectController subjectController(){
        return new SubjectController(scienceSubject());
    }
}