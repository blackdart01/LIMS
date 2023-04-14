package com.insurance.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insurance.entity.UserLogin;
import com.insurance.insurance.service.UserLoginService;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class UserLoginController {
 
    @Autowired
    private UserLoginService userLoginService;

    @GetMapping("/user")
    public List<UserLogin> getAll(){
        return userLoginService.getAll();
    }

    @PostMapping("/user")
    public UserLogin addUser(@RequestBody UserLogin user){
        return userLoginService.addUser(user);
    }

}
