package services;

import models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.utils.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository CompanyRepository;

    public List<Company> getAllCompanies() {
        return CompanyRepository.findAll();
    }
}