package com.example.exempleTp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellospring")
    public String bienvenuSring(){
        return "Bienvenue au framework spring Boot";
    }
}
