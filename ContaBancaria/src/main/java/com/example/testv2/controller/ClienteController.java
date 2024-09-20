package com.example.testv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testv2.service.ClienteService;
import com.example.testv2.service.EmbarcacaoService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;
    
    @Autowired
    EmbarcacaoService embarcacaoService;

    

    @GetMapping("/cliente/{id}/embarcacao")
    public ResponseEntity<?> getAllClienteEmbarcacao(@PathParam(value = "id") Long id) {
            
        // embarcacaoService.getAllEmbarcacaoById(id);

        return ResponseEntity.ok(embarcacaoService.getAllEmbarcacaoById(id));
        
    }
    
}
