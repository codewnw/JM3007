package com.jm3007.learn.spring.web;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
public class UserController {

	@InitBinder
	public void preprocessWebData(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping(value = "/show-form", method = RequestMethod.GET)
	public String showUserRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("msg", "Hello How are you");
		return "user-registration";
	}

	@RequestMapping(value = "/process-user-registration", method = RequestMethod.POST)
	public String processUserRegistration(@Valid @ModelAttribute("user") User u, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "user-registration";

		}
		return "user-profile";
	}
}
