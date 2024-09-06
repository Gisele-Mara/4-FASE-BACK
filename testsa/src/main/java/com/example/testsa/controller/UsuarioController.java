package com.example.testsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testsa.service.UsuarioService;

@RestController
@RequestMapping
public class UsuarioController {
    
@Autowired

UsuarioService usuarioService;

}
