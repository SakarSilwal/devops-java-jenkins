package com.example.devops_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String index() {
        return "This is the TEST !!!!!!!!!!!!!!!.";
    }
}
