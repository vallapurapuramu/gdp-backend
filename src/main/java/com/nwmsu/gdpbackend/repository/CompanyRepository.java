package com.nwmsu.gdpbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nwmsu.gdpbackend.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
