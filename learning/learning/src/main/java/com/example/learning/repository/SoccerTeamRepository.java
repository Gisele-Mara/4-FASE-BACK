package com.example.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning.entities.SoccerTeamEntity;

public interface SoccerTeamRepository extends JpaRepository<SoccerTeamEntity, Long> {


    
}
