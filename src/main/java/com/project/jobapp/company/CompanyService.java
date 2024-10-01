package com.project.jobapp.company;

import java.util.List;

public interface CompanyService {
    void addCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    Boolean updateCompany(Long id, Company updatedCompany);
    Boolean deleteCompany(Long id);


}
