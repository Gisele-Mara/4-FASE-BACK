package com.example.testsa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testsa.entities.Usuario;
import com.github.f4b6a3.ulid.Ulid;


public interface UsuarioRepository extends JpaRepository<Usuario, Ulid> {
    
}
