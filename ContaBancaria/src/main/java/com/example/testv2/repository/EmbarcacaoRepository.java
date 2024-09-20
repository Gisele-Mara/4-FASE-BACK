package com.example.testv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testv2.entities.Embarcacao;

public interface EmbarcacaoRepository extends JpaRepository <Embarcacao, Long> {
    
}
