package com.insurance.insurance.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class Applicant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private long pinCode;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateOfBirth;


    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateOfPurchase;

    private String gender;

    private String occupation;

    private String maritalStatus;

    private int dependentCount;

    private boolean isSmoker;

    private boolean hasDiabetes;

    private boolean isHeartPatient;

    private boolean hasExistingMedicalConditions;

    private boolean hasHazardousOccupation;

    private boolean hasFamilyHistoryOfIllness;

    private boolean hasHistoryOfSubstanceAbuse;

    private boolean hasHistoryOfMentalIllness;

    private long annualPremium;

    private long monthlyPremium;

    private int packageVarient;

    private int checkStatus;

    private long coverage;

    private long maturityAge;

}
