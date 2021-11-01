package com.nwmsu.gdpbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nwmsu.gdpbackend.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
