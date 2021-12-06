package com.nwmsu.gdpbackend.serviceimplemnetation;

import java.util.List;

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
	UserRepository userRepository;

	@Override
	public User checkUser(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void postUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getCompnayMemList() {
		String s = "companymember";
		return userRepository.findByRole(s);
	}

	@Override
	public void deleteCompanyMemberById(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}
}
