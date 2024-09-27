package com.example.provaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaSpring.entities.Leitor;

public interface LeitorRepository extends JpaRepository<Leitor,Long> {
    
} 