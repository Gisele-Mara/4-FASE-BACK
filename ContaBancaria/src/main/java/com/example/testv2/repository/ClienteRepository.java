package com.example.testv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testv2.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

     
}