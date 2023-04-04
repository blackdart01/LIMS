package com.insurance.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.insurance.entity.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long>{
    
}
