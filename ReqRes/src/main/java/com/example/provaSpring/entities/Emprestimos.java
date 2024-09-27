package com.example.provaSpring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "emprestimos")
public class Emprestimos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emprestimos")
    private Long id_emprestimos;

    @Column (name = "livro")
    private String livro;
   
    @Column (name = "dataEmprestimo")
    private String dataEmprestismo;

    @ManyToOne
    @JoinColumn(name = "id_leitor")
    private Leitor leitor;


    public Emprestimos() {
    }


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

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }


    public Long getId_emprestimos() {
        return id_emprestimos;
    }


    public void setId_emprestimos(Long id_emprestimos) {
        this.id_emprestimos = id_emprestimos;
    }

    


}
