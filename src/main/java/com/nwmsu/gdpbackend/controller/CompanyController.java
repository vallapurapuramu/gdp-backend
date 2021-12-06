package com.nwmsu.gdpbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nwmsu.gdpbackend.model.Company;
import com.nwmsu.gdpbackend.model.User;
import com.nwmsu.gdpbackend.service.CompanyService;
import com.nwmsu.gdpbackend.service.UserService;

@RestController
@CrossOrigin
public class CompanyController {
	@Autowired
	CompanyService companyService;

	@Autowired
	UserService userService;

	@GetMapping("/companyMembersList")
	public ResponseEntity<List<User>> getCompnayMemList() {
		List<User> users = userService.getCompnayMemList();
		if (!users.isEmpty()) {
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(users, HttpStatus.NOT_FOUND);
		}

	}

@GetMapping("/companyList")
public ResponseEntity<List<Company>> getCompnayList() {
	List<Company> compnaies = companyService.getCompanyList();
	if (!compnaies.isEmpty()) {
		return new ResponseEntity<List<Company>>(compnaies, HttpStatus.OK);
	} else {
		return new ResponseEntity<List<Company>>(compnaies, HttpStatus.NOT_FOUND);
	}

}

@GetMapping("/company/{id}")
public ResponseEntity<Company> getCompanyById(@PathVariable int id) {
	Company company = companyService.getCompanyById(id);
	if (company != null) {
		return new ResponseEntity<Company>(company, HttpStatus.OK);
	} else {
		return new ResponseEntity<Company>(company, HttpStatus.NOT_FOUND);
	}

}
}