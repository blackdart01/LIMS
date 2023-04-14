package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.insurance.entity.AdminLogin;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Long>{
    
}
