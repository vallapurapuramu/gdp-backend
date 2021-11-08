package com.nwmsu.gdpbackend.serviceimplemnetation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwmsu.gdpbackend.model.Company;
import com.nwmsu.gdpbackend.repository.CompanyRepository;
import com.nwmsu.gdpbackend.service.CompanyService;

@Service
@Transactional
public class CompanyServicelmpl implements CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

	@Override
	public void addCompany(Company company) {
		companyRepository.save(company);
	}

}
