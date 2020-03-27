package com.vulture.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vulture.start.dao.LoginRepository;
import com.vulture.start.model.Login;

@Controller
public class LoginController {

	@Autowired
	private LoginRepository repository;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String telaLogin() {
		return "login";
	}
	
//	@RequestMapping(value = "/realiza-login",method = RequestMethod.GET)
//	public String realizaLogin(Login login) {
//		return "index";
//	}
	
	@RequestMapping(value = "/",method = RequestMethod.POST)
	public String verificaLogin(Login login) {
		System.out.println(login.getSenha() instanceof String); // true
		
		for(Login lv:repository.findAll()) {
			System.out.println(lv.toString());
			if (lv.getUsuario().equals(login.getUsuario()) || lv.getSenha().equals(login.getSenha())) {
				System.out.println(lv.getUsuario() instanceof String);
				return "index";				
			}
		}
		return "redirect:/";
	}
}
