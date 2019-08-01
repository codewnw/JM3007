package com.jm3007.learn.spring.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String processLogin(HttpServletRequest request) {
		String un = request.getParameter("username");
		String pass = request.getParameter("password");
		if (un.equalsIgnoreCase(pass)) {
			return "Welcome, " + un;
		}
		return "Login failed.";
	}

	@RequestMapping(value = "/loginSpringWay", method = RequestMethod.POST)
	public @ResponseBody String processLoginSpringWay(@RequestParam("username") String un,
			@RequestParam("password") String pass) {
		if (un.equalsIgnoreCase(pass)) {
			return "Welcome, " + un;
		}
		return "Login failed.";
	}

	@RequestMapping(value = "/loginSpringWay", method = RequestMethod.GET)
	public @ResponseBody String processLoginSpringWayGET(@RequestParam("username") String un,
			@RequestParam("password") String pass) {
		if (un.equalsIgnoreCase(pass)) {
			return "Welcome, " + un;
		}
		return "Login failed.";
	}

}
