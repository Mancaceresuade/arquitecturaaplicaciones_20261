package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/nombres")
    public String addNombre(@RequestParam String nombre) {
        nombres.add(nombre);
        return "Nombre agregado: " + nombre;
    }

    @DeleteMapping("/nombres")
    public String deleteNombre(@RequestParam String nombre) {
        if (nombres.remove(nombre)) {
            return "Nombre eliminado: " + nombre;
        } else {
            return "Nombre no encontrado: " + nombre;
        }
    }

    @GetMapping("/hola")
    public String hola(@RequestParam(value = "name", defaultValue = "World") String name) {

        return "hola " + name;
    }
}