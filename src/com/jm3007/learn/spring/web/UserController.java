package com.jm3007.learn.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

	@RequestMapping(value = "/show-form", method = RequestMethod.GET)
	public String showUserRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("msg", "Hello How are you");
		return "user-registration";
	}

	@RequestMapping(value = "/process-user-registration", method = RequestMethod.POST)
	public String processUserRegistration(@ModelAttribute("user") User u) {
		return "user-profile";
	}
}
