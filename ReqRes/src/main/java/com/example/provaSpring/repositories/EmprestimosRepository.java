package com.example.provaSpring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaSpring.entities.Emprestimos;

public interface EmprestimosRepository extends JpaRepository <Emprestimos, Long> {

    
} 