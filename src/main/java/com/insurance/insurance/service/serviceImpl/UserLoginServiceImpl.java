package com.insurance.insurance.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.insurance.entity.UserLogin;
import com.insurance.insurance.repository.UserLoginRepository;
import com.insurance.insurance.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    private UserLoginRepository userLoginRepository;

    @Override
    public List<UserLogin> getAll() {
        return userLoginRepository.findAll();

    }

    @Override
    public UserLogin addUser(UserLogin user) {
       return userLoginRepository.save(user);
    }
    
}
