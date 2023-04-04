package com.insurance.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.insurance.entity.Applicant;
import com.insurance.insurance.service.ApplicantService;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class ApplicantController {
    
    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/users")
    public List<Applicant> getAllUsers(){
        return applicantService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Applicant getUser(@PathVariable long id){
        return applicantService.getUser(id);
    }

    @PostMapping("/users")
    public Applicant addUser(@RequestBody Applicant user){
        return applicantService.addUser(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<String> updateUser(@PathVariable long id, @RequestBody Applicant user){
        return new ResponseEntity<>("updated!",HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}") 
    public ResponseEntity<String> deleteUser(@PathVariable long id){
        return new ResponseEntity<>("deleted!",HttpStatus.OK);
    }

}
