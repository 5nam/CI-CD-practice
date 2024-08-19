package com.example.cicd_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/cicd")
    public ResponseEntity<String> getCicd() {
        return ResponseEntity.ok("Hello!");
    }

}
