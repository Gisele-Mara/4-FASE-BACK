package com.example.provaSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaSpring.entities.Endereco;
import com.example.provaSpring.entities.Leitor;
import com.example.provaSpring.repositories.EnderecoRepository;

@Service
public class EnderecoService {
            
    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco createEndereco(Endereco endereco){
        
        return enderecoRepository.save(endereco);
    }
}
