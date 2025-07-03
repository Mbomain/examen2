package com.example.demo.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stored {
    @GetMapping("/stored-int")
    public int stored() {
        return 42;
    }
}
