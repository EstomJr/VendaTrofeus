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
	
	@RequestMapping(value = "/painel-caixa",method = RequestMethod.GET)// PAINEL DO CAIXA
	public String realizaLogin(Login login) {
		return "painel-caixa";
	}
	
	@RequestMapping(value = "/painel-gerente",method = RequestMethod.GET) // PAINEL DO GERENTE
	public String painelGerente(Login login) {
		return "painel-gerente";
	}
	
	@RequestMapping(value = "/",method = RequestMethod.POST)
	public String verificaLogin(Login login) {
		for(Login lv:repository.findAll()) {
			System.out.println(lv.toString());
			if (lv.getUsuario().equals(login.getUsuario()) && lv.getSenha().equals(login.getSenha()) && lv.getCargo().equals("CAIXA")) {
				System.out.println(login.toString());
				return "redirect:/painel-caixa"; //GET nesse endpoint			
			}
		}
		return "redirect:/";
	}
}
