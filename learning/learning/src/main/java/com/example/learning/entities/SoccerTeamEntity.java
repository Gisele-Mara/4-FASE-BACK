package com.example.learning.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "time_futebol")
public class SoccerTeamEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome")
	private String nomeClube;
	
	@Column(name = "divisao")
	private String divisao;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "tem_estadio")
	private Boolean estadio;
	
	@Column(name = "tem_mundial")
	private Boolean mundial;
	// private LocalDate publishDate;

	// for JPA only, no use
	public SoccerTeamEntity() {

	}

	public SoccerTeamEntity(Long id, String nomeClube, String divisao, String pais, Boolean estadio, Boolean mundial) {
		this.id = id;
		this.nomeClube = nomeClube;
		this.divisao = divisao;
		this.pais = pais;
		this.estadio = estadio;
		this.mundial = mundial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeClube() {
		return nomeClube;
	}

	public void setNomeClube(String nomeClube) {
		this.nomeClube = nomeClube;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Boolean getEstadio() {
		return estadio;
	}

	public void setEstadio(Boolean estadio) {
		this.estadio = estadio;
	}

	public Boolean getMundial() {
		return mundial;
	}

	public void setMundial(Boolean mundial) {
		this.mundial = mundial;
	}

	

	// getters, setters and constructor
}