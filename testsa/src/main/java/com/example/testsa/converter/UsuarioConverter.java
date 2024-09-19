package com.example.testsa.converter;

import java.util.List;

import com.example.testsa.dto.UsuarioDTO;
import com.example.testsa.entities.Usuario;


public class UsuarioConverter {
    
    public UsuarioDTO transformEmDTO(Usuario usuario){
        return new UsuarioDTO(usuario.getNomeCompleto(), usuario.getCpf(),usuario.getDataNascimento(),usuario.getGenero(),usuario.getTelefone(),usuario.getEmail(),usuario.getSenha(),usuario.getCategoriaUsuario());
    }
   
}

// public static UsuarioRespostaDTO transformaEmDTO(Usuario usuario) {
//     return new UsuarioRespostaDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
// }