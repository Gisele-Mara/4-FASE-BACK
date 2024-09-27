package com.example.provaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provaSpring.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
