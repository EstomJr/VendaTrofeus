package com.vulture.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.vulture.start.dao.FuncionarioRepository;
import com.vulture.start.model.Funcionario;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository repository;
	
	@RequestMapping(value = "/funcionarios", method = RequestMethod.GET)
	public String gerenciarFuncionario() {
		return "usuario/gerenciar-funcionario";
	}
	
	@RequestMapping(value = "/funcionarios",method = RequestMethod.POST)
	public String salvarNoBanco(Funcionario func) {
		if(repository.existsById(func.getId())==false) {
			repository.save(func);
		} else {
			return "redirect:/";
		}
		return "redirect:/funcionarios";
	}
	
	@RequestMapping(value="/funcionarios/cadastrar",method =RequestMethod.GET)
	public String salvarNoBanco() {
		return "usuario/addfunc";
	}
	
	@RequestMapping(value = "/funcionarios/listar",method = RequestMethod.GET)
	public String listarFuncionarios() {
		return "";						// Como listar? funcionarios eis a questao...
	}
}
