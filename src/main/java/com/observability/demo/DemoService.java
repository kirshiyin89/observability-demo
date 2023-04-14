package com.observability.demo;

import org.springframework.stereotype.Service;


import io.micrometer.observation.annotation.Observed;

@Observed(name = "demoService")
@Service
public class DemoService {

    public String greet() {
        return "Hello World!";
    }
}