package com.example.demo.controller;

import com.example.demo.model.request.RegisterUser;
import com.example.demo.model.request.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/users")
    public Users getUsers() {
        return new Users();
    }
    @PostMapping("/register")
    public String registerUser(@RequestBody String payload){
        return "Registered";
    }
}
