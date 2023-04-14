package com.insurance.insurance.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/applicant")
public class ApplicantController {
    
    @Autowired
    private ApplicantService applicantService;
    
@GetMapping("/{id}")
    public Applicant getUser(@PathVariable long id) {
        return applicantService.getUser(id);
    }

    @PostMapping("/apply")
    public Applicant addUser(@RequestBody Applicant user){
        return applicantService.addUser(user);
    }

    // @PutMapping("/update/{id}")
    // public ResponseEntity<String> updateUser(@PathVariable long id, @RequestBody Applicant user){
    //     return new ResponseEntity<>("updated!",HttpStatus.OK);
    // }
    
    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable long id, @RequestBody Applicant user){
        applicantService.updateUser(id, user);
    }
}
