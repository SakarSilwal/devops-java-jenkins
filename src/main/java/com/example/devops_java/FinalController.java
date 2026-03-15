package com.example.devops_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinalController {
    @GetMapping("/final")
    public String index() {
        return "FINAL DEPLOY !!!!!!!!!!!!!!!.";
    }
}