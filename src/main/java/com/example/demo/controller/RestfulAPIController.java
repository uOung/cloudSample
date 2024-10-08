package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulAPIController {

    @GetMapping("/api/v1/user")
    public String home() {
        return "82240977";
    }
}
