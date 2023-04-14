package com.observability.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    private final DemoService service;

    public RestController(DemoService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getGreeting() {
        return service.greet();
    }
}
