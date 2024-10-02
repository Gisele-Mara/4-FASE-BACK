package com.example.provaSpring.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.provaSpring.entities.Leitor;
import com.example.provaSpring.repositories.EmprestimosRepository;
import com.example.provaSpring.repositories.EnderecoRepository;
import com.example.provaSpring.repositories.LeitorRepository;

@Service
public class LeitorService {
    
    @Autowired
    LeitorRepository leitorRepository;

    public List <Leitor> getAllLeitor(){

        return leitorRepository.findAll();

    }

    public Leitor getLeitorById(Long id){
        
        Optional<Leitor> optinaLeitor = leitorRepository.findById(id);

        if (optinaLeitor.isPresent()){
            Leitor leitorPresent = optinaLeitor.get();
            return leitorPresent;
        }

        return null;
    }

    public Leitor createLeitor(Leitor leitor){
        Leitor a = new Leitor();
        a.setNome(leitor.getNome());
        return leitorRepository.save(a);
    }


}

