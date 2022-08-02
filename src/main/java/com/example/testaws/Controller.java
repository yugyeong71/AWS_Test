package com.example.testaws;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/sign-up")
    public String signUp() {
        return "sign-up";
    }

}
