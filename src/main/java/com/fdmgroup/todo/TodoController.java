package com.fdmgroup.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

	// Set the login Service - Auto wiring
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String sohwLoginPage(ModelMap model) {
		
		model.addAttribute("todos", service.retrieveTodos("fdmLearning"));
		return "list-todos";
	}
	

}
