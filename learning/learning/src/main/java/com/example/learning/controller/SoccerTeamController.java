package com.example.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.entities.SoccerTeamEntity;
import com.example.learning.service.SoccerTeamService;

@RestController
@RequestMapping("/soccer-team")
public class SoccerTeamController {

    @Autowired
    SoccerTeamService soccerTeamService;

    @GetMapping("/")
    public ResponseEntity<?> getTeam() {

        var teams = soccerTeamService.getAllTeams();
        return ResponseEntity.ok(teams);
    }

    @GetMapping("/a")
    public String getMethodName() {
        return "new String()";
    }

}
