package com.example.testv2.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Embarcacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;

    @Column(name = "modelo")
    private String comprimento;

    @Column(name = "modelo")
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Embarcacao() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getComprimento() {
        return comprimento;
    }


    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

}

