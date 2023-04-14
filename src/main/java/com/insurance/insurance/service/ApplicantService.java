package com.insurance.insurance.service;

import java.util.List;


import com.insurance.insurance.entity.Applicant;

public interface ApplicantService {
 
    public List<Applicant> getAllUsers();

    public Applicant getUser(Long id);

    public Applicant addUser(Applicant user);

    public void updateUser(long id, Applicant user);

    public void deleteUser(long id);

}
