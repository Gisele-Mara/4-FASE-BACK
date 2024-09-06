package com.example.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learning.entities.SoccerTeamEntity;
import com.example.learning.repository.SoccerTeamRepository;



@Service
public class SoccerTeamService {
    
    @Autowired
    
    SoccerTeamRepository soccerTeamRepository;

    public List<SoccerTeamEntity> getAllTeams(){
        return soccerTeamRepository.findAll();
    }

   
}
