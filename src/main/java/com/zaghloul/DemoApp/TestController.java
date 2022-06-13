package com.zaghloul.DemoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/simplilearn")
    public String Test(){
        return "This is a dummy spring boot app";
    }
}
