package com.example.GJG.controller;

import com.example.GJG.exception.ResourceNotFoundException;
import com.example.GJG.model.User;
import com.example.GJG.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.jsonwebtoken.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

//created Rest API part for user Entity
@RestController
@RequestMapping("/user/")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    //get all users
    @GetMapping("/profile")
    public List<User> getAllUser(){
        return this.userRepository.getBySequence();
        //return  userRepository.findAll();
    }

    //get user by {userID}
    @GetMapping("/profile/{userID}")
    public ResponseEntity<User> getUserById(@PathVariable long userID){
        User user = userRepository.findById(userID)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id : "+userID));
        return ResponseEntity.ok(user);
    }

    //create user rest api
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        this.userRepository.getBySequence();
        return this.userRepository.save(user);

    }





}
