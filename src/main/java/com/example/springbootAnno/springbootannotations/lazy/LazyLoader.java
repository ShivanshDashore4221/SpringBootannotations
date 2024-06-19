package com.example.springbootAnno.springbootannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy   // so using this, object created on demand and not during starting itself.
public class LazyLoader {
    public LazyLoader() {
        System.out.println("Lazy Loading Constructor");
    }
}