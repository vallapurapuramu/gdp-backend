package com.nwmsu.gdpbackend.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nwmsu.gdpbackend.dto.UserRequest;
import com.nwmsu.gdpbackend.model.User;
import com.nwmsu.gdpbackend.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {
	@Autowired
	UserService userservice;

	@GetMapping("/")
	public ResponseEntity<String> basic() {

		try {
			return new ResponseEntity<String>("Hello, Welcome from Connect Company", HttpStatus.NOT_FOUND);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Hello, Welcome to Connect Company", HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("login")
	public ResponseEntity<User> loginVerification(@RequestBody UserRequest userRequest) {

		try {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			User user = userservice.checkUser(userRequest.getEmail());
//			byte[] decodedBytes = Base64.getDecoder().decode(user.getPassword());
//			String decodedString = new String(decodedBytes);

			boolean isPasswordMatch = passwordEncoder.matches(userRequest.getPassword(), user.getPassword());

			if (user != null && isPasswordMatch)
				return new ResponseEntity<User>(user, HttpStatus.OK);
			else {
				return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
			}
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("register")
	public ResponseEntity<HttpStatus> Register(@RequestBody User user) {
		System.out.println(user);
		try {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//			user.setPassword(Base64.getEncoder().encodeToString(user.getPassword().getBytes()));
////			user.setRole("admin");
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userservice.postUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteCompanyMember/{id}")
	public ResponseEntity<HttpStatus> deleteCompanyMemberById(@PathVariable int id) {
		userservice.deleteCompanyMemberById(id);
		User e = userservice.getUserById(id);
		if (e == null) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

}
