package com.vulture.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vulture.start.dao.EstoqueRepository;
import com.vulture.start.model.Estoque;
import com.vulture.start.model.Venda;

@Controller
public class EstoqueController {
	
	@Autowired
	private EstoqueRepository er;
	
	
	@RequestMapping(value = "/estoque-insuficiente",method = RequestMethod.GET)
	public String atualizaEstoque(Venda v) {
		Estoque estoque = new Estoque();
		estoque = er.getOne(1);
		int qntAtual = estoque.getQuantidade();
		if(qntAtual >= Integer.parseInt(v.getQuantidade())) {
			estoque.setQuantidade(qntAtual - Integer.parseInt(v.getQuantidade()));// Atualiza Estoque
			er.save(estoque);
			return "redirect:/painel-caixa";
		}
		return "estoque-invalido";
	}
}
