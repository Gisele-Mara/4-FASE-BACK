package com.example.testsa.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "marinheiro")
public class Marinheiro {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marinheiro")
    private Long id_marinheiro;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "registromaritimo")
    private String registroMaritimo;

    @Column(name = "disponibilidade")
    private String disponibilidade;

    @Column(name = "anosexperiencia")
    private int anosExperiencia;

    // @OneToOne(mappedBy = "marinheiro", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("marinheiro")
    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private Usuario usuario;

    // public Marinheiro(MarinheiroDTO marinheiro) {
    // BeanUtils.copyProperties(marinheiro, this);
    // }

    public Long getId_marinheiro() {
        return id_marinheiro;
    }
    public Marinheiro(){

    }

    // public Marinheiro(Long id_marinheiro, String categoria, String registroMaritimo, String disponibilidade,
    //         int anosExperiencia, Usuario usuario) {
        
    //             this.id_marinheiro = id_marinheiro;
    //     this.categoria = categoria;
    //     this.registroMaritimo = registroMaritimo;
    //     this.disponibilidade = disponibilidade;
    //     this.anosExperiencia = anosExperiencia;
    //     this.usuario = usuario;
    // }

    public void setId_marinheiro(Long id_marinheiro) {
        this.id_marinheiro = id_marinheiro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRegistroMaritimo() {
        return registroMaritimo;
    }

    public void setRegistroMaritimo(String registroMaritimo) {
        this.registroMaritimo = registroMaritimo;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
