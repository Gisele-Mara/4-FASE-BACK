package com.senai.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class BibliotecaController {

    String heyChangeMe = "S";
    
    @GetMapping("/bibli")
    public String findBiblioteca(){
        return "Teste";
    }

   
    @PostMapping("/bibli")
    public String postMethodName(@RequestBody String entity) {
        
        System.out.println(entity);
        return "Thank you! For posting";
    }
    
    @PutMapping("/path/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        heyChangeMe = entity;
        System.out.println("Hey it changed to" + heyChangeMe);
        return "Thank you! Put request accepted";
    }

    @PatchMapping ("/patchPath")
    public String patchMethodName(@RequestBody String entity) {
        //TODO: process PUT request
        heyChangeMe = entity;
        System.out.println("Hey it changed to" + heyChangeMe);
        return "Thank you! You change my pat(c)h :P";
    }
}
