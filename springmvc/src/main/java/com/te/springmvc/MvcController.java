package com.te.springmvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.model.Register;
import com.te.springmvc.services.MvcServices;

@Controller
public class MvcController {

	@RequestMapping("/spider")
	public String home() {
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	// public String log(HttpServletRequest req) {
	public String log(@RequestParam("user") String username, @RequestParam("pass") String password) {
//		String username = req.getParameter("user");
//		String password = req.getParameter("pass");
		if (username.isEmpty()) {
			return "failur";
		}
		return "success";
	}

	@GetMapping("/register")
	public String reg() {
		return "register";
	}

	@Autowired
	MvcServices services;

	@PostMapping("/register")
	public String register(Register reg, ModelMap map) {
//		System.out.println(reg.getName() + " " + reg.getEmail() + " " + reg.getAddress());
		map.addAttribute("details", reg);
		services.save(reg);
		return "success";
	}

}
