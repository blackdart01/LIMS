package com.insurance.insurance.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.insurance.insurance.entity.Applicant;
import com.insurance.insurance.repository.ApplicantRepository;
import com.insurance.insurance.service.ApplicantService;


@Service
public class ApplicantServiceImpl implements ApplicantService{

    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public List<Applicant> getAllUsers() {
      return applicantRepository.findAll();
    }

    @Override
    public Applicant getUser(Long id) {
       return applicantRepository.findById(id).get();
    }

    @Override
    public Applicant addUser(Applicant user) {
        return applicantRepository.save(user);
    }

    @Override
    public ResponseEntity<String> updateUser(long id, Applicant user) {
        Applicant a = applicantRepository.findById(id).get();
        a.setDateOfBirth(null);
        a.setDependentCount(0);
        a.setEmail(null);
        a.setFirstName(null);
        a.setGender(null);
        a.setHasDiabetes(false);
        a.setHasExistingMedicalConditions(false);
        a.setHasFamilyHistoryOfIllness(false);
        a.setHasHistoryOfMentalIllness(false);
        a.setHeartPatient(false);
        a.setLastName(null);
        a.setMaritalStatus(null);
        a.setOccupation(null);
        a.setPhone(null);
        a.setPinCode(id);
        a.setSmoker(false);
        try {
            applicantRepository.save(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteUser(long id) {
        Applicant a = applicantRepository.findById(id).get();
        try {
            applicantRepository.delete(a);
        } catch (Exception e) {
            System.out.println(e);
        } 
       return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
