package com.insurance.insurance.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public void updateUser(long id, Applicant user) {
        user.setId(id);
        Applicant applicant = applicantRepository.findById(id).get();
        if(user.getFirstName()!=null)
            applicant.setFirstName(user.getFirstName());
        if(user.getLastName()!=null)
            applicant.setLastName(user.getLastName());
        if(user.getAnnualPremium()!=0L)
            applicant.setAnnualPremium(user.getAnnualPremium());
        if(user.getCoverage()!=0L)
            applicant.setCoverage(user.getCoverage());
        if(user.getDateOfBirth()!=null)
            applicant.setDateOfBirth(user.getDateOfBirth());
        if(user.getDateOfPurchase()!=null)
            applicant.setDateOfPurchase(user.getDateOfPurchase());
        if(user.getDependentCount()!=0L)
            applicant.setDependentCount(user.getDependentCount());
        if(user.getEmail()!=null)
            applicant.setEmail(user.getEmail());
        if(user.getGender()!=null)
            applicant.setGender(user.getGender());
        if(user.getMaritalStatus()!=null)
            applicant.setMaritalStatus(user.getMaritalStatus());
        if(user.getMaturityAge()!=0L)
            applicant.setMaturityAge(user.getMaturityAge());
        if(user.getMonthlyPremium()!=0L)
            applicant.setMonthlyPremium(user.getMonthlyPremium());
        if(user.getOccupation()!=null)
            applicant.setOccupation(user.getOccupation());
        if(user.getPackageVarient()!=0L)
            applicant.setPackageVarient(user.getPackageVarient());
        if(user.getPhone()!=null)
            applicant.setPhone(user.getPhone());
        if(user.getPinCode()!=0L)
            applicant.setPinCode(user.getPinCode());
        if(user.getCheckStatus()!=0L)
            applicant.setCheckStatus(user.getCheckStatus());
        applicantRepository.save(applicant);
    }
    // @Override
    // public void updateUser(long id, Applicant user) {
    //     user.setId(id);
    //     applicantRepository.save(user);
    // }

    @Override
    public void deleteUser(long id) {
        Applicant a = applicantRepository.findById(id).get();
        try {
            applicantRepository.delete(a);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    
}
