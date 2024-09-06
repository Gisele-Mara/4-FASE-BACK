package com.example.testsa.entities;

import java.sql.Date;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    
    @Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Ulid id;

   

	@Column(name = "nomeCompleto", length = 50, nullable = false)
	private String nomeCompleto;

    @Column(name = "cpf", length = 11, nullable = false)
	private String cpf;
	
	@Column(name = "dataNascimento")
	private Date dataNascimento;
	
    @Column(name = "genero")
	private String genero;

    @Column(name = "telefone")
	private String telefone;
	
    @Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "categoria")
	private String categoriaUsuario;
	
	public Usuario() {

	}

    public Ulid getId() {
        return id;
    }

    public void setId(Ulid id) {

        this.id = UlidCreator.getUlid();;
    }

    
}
