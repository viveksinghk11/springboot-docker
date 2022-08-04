package com.apex.redhill.controller;

import com.apex.redhill.entity.Beneficiary;
import com.apex.redhill.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/beneficiary")
public class BeneficiaryController {

    @Autowired
    BeneficiaryRepository beneficiaryRepository;

    @GetMapping("/all")
    public Iterable<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    @GetMapping("/{beneficiaryId}")
    public Optional<Beneficiary> getBeneficiaryById(@PathVariable("beneficiaryId") int beneficiaryId) {
        Optional<Beneficiary> beneficiary = beneficiaryRepository.findById(beneficiaryId);
        System.out.println("Beneficiary found: " + beneficiary.isPresent());
        return beneficiary;
    }

    @PostMapping("/add")
    public boolean addBeneficiary(@RequestBody Beneficiary beneficiary) {
        beneficiaryRepository.save(beneficiary);
        return true;
    }
}
