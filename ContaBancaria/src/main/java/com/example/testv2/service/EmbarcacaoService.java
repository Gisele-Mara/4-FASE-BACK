package com.example.testv2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testv2.entities.Embarcacao;
import com.example.testv2.repository.EmbarcacaoRepository;

@Service
public class EmbarcacaoService {
    
    @Autowired
    EmbarcacaoRepository embarcacaoRepository;

    public List <Embarcacao> getAllEmbarcacao() {  
       
        return embarcacaoRepository.findAll();
    }

    public List<Embarcacao> getAllEmbarcacaoById(Long id) {  

        Optional <Embarcacao> result =  embarcacaoRepository.findById(id);

        if(result.isPresent()){
            Embarcacao resultTo = result.get();
            
          
        }
    
    }



}
