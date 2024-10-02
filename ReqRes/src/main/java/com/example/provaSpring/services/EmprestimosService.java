package com.example.provaSpring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provaSpring.entities.Emprestimos;
import com.example.provaSpring.entities.Leitor;
import com.example.provaSpring.repositories.EmprestimosRepository;
import java.util.List;


@Service
public class EmprestimosService{
    
    @Autowired
    EmprestimosRepository emprestimosRepository;


    public Emprestimos createEmprestimo(Emprestimos entity, Long id){

        return emprestimosRepository.save(entity);
        

    }
    public List<Emprestimos> createManyEmprestimo(List<Emprestimos> entity, Long id){
        
        Leitor id_leitor = new Leitor();
        id_leitor.setId_leitor(id);
        entity.forEach( a -> {    
             a.setLeitor(id_leitor);
            emprestimosRepository.saveAll(entity);
        
        });

        return emprestimosRepository.saveAll(entity);

    }
}
