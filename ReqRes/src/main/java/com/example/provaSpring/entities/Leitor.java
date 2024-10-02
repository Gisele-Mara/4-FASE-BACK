package com.example.provaSpring.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "leitor")
public class Leitor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_leitor")
    private Long id_leitor;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "leitor")
    private List <Emprestimos> emprestimos;

    @OneToOne(mappedBy = "leitor")
    private Endereco endereco;
  
    public Leitor() {
    }

    public Long getId_leitor() {
        return id_leitor;
    }

    public void setId_leitor(Long id_leitor) {
        this.id_leitor = id_leitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Emprestimos> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimos> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    
}
