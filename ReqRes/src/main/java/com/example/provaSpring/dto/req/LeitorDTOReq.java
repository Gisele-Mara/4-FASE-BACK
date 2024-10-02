package com.example.provaSpring.dto.req;

import java.util.List;


public class LeitorDTOReq {
    
    private Long id;

    private String nome;
   
    private EnderecoDTOReq endereco;
    
    private List <EmprestimoDTOReq> emprestimos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoDTOReq getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTOReq endereco) {
        this.endereco = endereco;
    }

    public List<EmprestimoDTOReq> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<EmprestimoDTOReq> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 


    
}
