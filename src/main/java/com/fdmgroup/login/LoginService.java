package com.fdmgroup.login;

import org.springframework.stereotype.Service;

// new LoginService()
// this will be managed by spring
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("user") && password.equals("dummy");
	}

}