package com.example.testv2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testv2.entities.Cliente;
import com.example.testv2.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;


    public List<Cliente> getAllCliente() {

        return clienteRepository.findAll();
    }

    

}
