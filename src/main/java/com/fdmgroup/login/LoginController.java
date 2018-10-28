package com.fdmgroup.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.login.LoginService;

@Controller
public class LoginController {

	LoginService service = new LoginService();
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String sohwLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginRquest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(!service.validateUser(name, password)) {
			model.put("errorMessage", "invalid Credentials");
			return "login";
		}
		
		model.put("password", password);
		model.put("name", name);
		return "welcome";
	}
}
