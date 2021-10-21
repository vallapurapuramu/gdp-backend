package com.nwmsu.gdpbackend.service;

import com.nwmsu.gdpbackend.model.User;

public interface UserService {

	User checkUser(String email);

	void postUser(User user);

}
