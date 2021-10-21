package com.nwmsu.gdpbackend.serviceimplemnetation;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwmsu.gdpbackend.model.User;
import com.nwmsu.gdpbackend.repository.UserRepository;
import com.nwmsu.gdpbackend.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public User checkUser(String email) {

		return repository.findByEmail(email);
	}

	@Override
	public void postUser(User user) {
		repository.save(user);

	}

}
