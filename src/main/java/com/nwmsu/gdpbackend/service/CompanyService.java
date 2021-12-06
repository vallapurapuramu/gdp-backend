package com.nwmsu.gdpbackend.service;

import java.util.List;

import com.nwmsu.gdpbackend.model.Company;



public interface CompanyService {

	void addCompany(Company company);

    List<Company> getCompanyList();
    Company getCompanyById(int id);
	
}
