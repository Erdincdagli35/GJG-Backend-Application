package com.example.GJG.controller;

import com.example.GJG.model.Score;
import com.example.GJG.model.User;
import com.example.GJG.repository.ScoreRepository;
import com.example.GJG.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score/")
public class ScoreController {
    @Autowired
    private ScoreRepository scoreRepository;

    //create score rest api
    @PostMapping("/submit")
    public Score submitScore(@RequestBody Score score){
        return scoreRepository.save(score);
    }

}
