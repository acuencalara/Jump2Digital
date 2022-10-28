package com.example.jump2digital.controller;

import com.example.jump2digital.model.Company;
import com.example.jump2digital.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyController {


    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies/")
    public List<Company> findByOrderBySizeAsc(){
        return companyService.findByOrderBySizeAsc();
    }

    @GetMapping("/companies/year/")
    public List<Company> findByOrderByFoundedAsc(){
        return companyService.findByOrderByFoundedAsc();
    }

    @GetMapping("/companies/companiesbyindustry/")
    public List<Object[]> findNumberCompaniesInEachIndustry(){
        return companyService.findNumberCompaniesInEachIndustry();
    }

    @GetMapping("/companies/companiesbysize/")
    public List<Object[]> findNumberCompaniesBySize(){
        return companyService.findNumberCompaniesBySize();
    }

    @GetMapping("/companies/companiesbyyear/")
    public List<Object[]> findNumberCompaniesByFoundedYear(){
        return companyService.findNumberCompaniesByFoundedYear();
    }
}
