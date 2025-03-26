package controllers;

import models.Company;
import services.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    private CompanyService CompanyService;

    @GetMapping
    Companies() {
        return CompanyService.getAllCompanies();
    }
}