package com.BiblioSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerLogin {

	@RequestMapping("/Login")
	public String NuevoLogin(Model model) {
		// model.addAttribute("atributo", "atributo")
		return ("Login");
	}

}