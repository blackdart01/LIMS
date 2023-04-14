package com.insurance.insurance.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.insurance.entity.AdminLogin;
import com.insurance.insurance.repository.AdminLoginRepository;
import com.insurance.insurance.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

    @Autowired
    private AdminLoginRepository adminLoginRepository;

    @Override
    public List<AdminLogin> getAll() {
        return adminLoginRepository.findAll();
    }
}
