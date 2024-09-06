package com.example.testsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testsa.entities.Usuario;
import com.example.testsa.repositories.UsuarioRepository;
import com.github.f4b6a3.ulid.Ulid;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario createUsuario(Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    
}
