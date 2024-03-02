package com.example.ec2test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheckController {

    @GetMapping("/")
    public ResponseEntity<Void> statusCheck() {
        return ResponseEntity.ok().build();
    }
}
