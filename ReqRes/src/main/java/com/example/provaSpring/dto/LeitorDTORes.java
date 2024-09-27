package com.example.provaSpring.dto;

import java.util.List;


public class LeitorDTORes {
        
    private Long id;
    private String nome;
    private EnderecoDTORes endereco;
    private List <EmprestimoDTORes> emprestimos;
 
   
       
    // public LeitorDTORes(Long id, String nome, Endereco endereco, List<Emprestimos> emprestimos) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.endereco = endereco;
    //     this.emprestimos = emprestimos;
    // }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

 
    public EnderecoDTORes getEndereco() {
        return endereco;
    }
    public void setEndereco(EnderecoDTORes endereco) {
        this.endereco = endereco;
    }
    public List<EmprestimoDTORes> getEmprestimos() {
        return emprestimos;
    }
    public void setEmprestimos(List<EmprestimoDTORes> emprestimos) {
        this.emprestimos = emprestimos;
    }

    
 
    


}
