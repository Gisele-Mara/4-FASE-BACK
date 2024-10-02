package com.example.provaSpring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaSpring.entities.Emprestimos;

public interface EmprestimosRepository extends JpaRepository <Emprestimos, Long> {

    
} 