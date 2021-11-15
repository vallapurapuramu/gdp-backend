package com.nwmsu.gdpbackend.service;

import java.util.List;

import com.nwmsu.gdpbackend.model.User;

public interface UserService {

	User checkUser(String email);

	void postUser(User user);

	List<User> getCompnayMemList();

}
