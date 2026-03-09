package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {
    static ArrayList<String> nombres = new ArrayList<>();
    public HelloController() {
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Marta");
    }
    @GetMapping("/nombres")
    public ArrayList<String> getNombres() {
        return nombres;
    }

    @GetMapping("/hola")
    public String hola() {
        return "hola mundo";
    }
}
