package com.insurance.insurance.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.insurance.insurance.entity.Applicant;

public interface ApplicantService {
 
    public List<Applicant> getAllUsers();

    public Applicant getUser(Long id);

    public Applicant addUser(Applicant user);

    public ResponseEntity<String> updateUser(long id, Applicant user);

    public ResponseEntity<String> deleteUser(long id);

}
