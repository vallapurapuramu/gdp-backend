package com.nwmsu.gdpbackend.serviceimplemnetation;

import java.util.List;

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

	@Override
	public List<Company> getCompanyList() {
		// TODO Auto-generated method stub
		return companyRepository.findAll();
	}
	@Override
	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyRepository.findById(id).get();
	}

	@Override
	public void deleteCompanyById(int id) {
		// TODO Auto-generated method stub
		companyRepository.deleteById(id);
		
	}
	

}
