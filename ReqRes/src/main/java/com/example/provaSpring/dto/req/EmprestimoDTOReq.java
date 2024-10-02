package com.example.provaSpring.dto.req;

public class EmprestimoDTOReq {
    
    private String livro;
   
    private String dataEmprestismo;

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getDataEmprestismo() {
        return dataEmprestismo;
    }

    public void setDataEmprestismo(String dataEmprestismo) {
        this.dataEmprestismo = dataEmprestismo;
    }

    
}
