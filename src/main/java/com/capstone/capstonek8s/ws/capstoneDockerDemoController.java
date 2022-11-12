package com.capstone.capstonek8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class capstoneDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - capstone-k8s i Have updated the message";
    }
}
