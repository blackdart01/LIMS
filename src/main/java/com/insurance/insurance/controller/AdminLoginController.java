package com.insurance.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insurance.entity.AdminLogin;
import com.insurance.insurance.service.AdminLoginService;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class AdminLoginController {
    
    @Autowired
    private AdminLoginService adminLoginService;

    @GetMapping("/admin")
    public List<AdminLogin> getAll() {
        return adminLoginService.getAll();
    }
}
