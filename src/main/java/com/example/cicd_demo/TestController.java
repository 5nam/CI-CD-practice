package com.example.cicd_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> getCicd() {
        return ResponseEntity.ok("TEAM PROJECT CI/CD PRACTICE 8081");
    }

}
