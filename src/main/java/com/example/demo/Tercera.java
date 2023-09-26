package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tercera {
    @GetMapping("/tercera")
    public String tercera (){
        return "por fin ";

    }
}
