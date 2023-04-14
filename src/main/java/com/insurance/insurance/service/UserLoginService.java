package com.insurance.insurance.service;

import java.util.List;

import com.insurance.insurance.entity.UserLogin;

public interface UserLoginService {
    
    public List<UserLogin> getAll();
    public UserLogin addUser(UserLogin user);
}
