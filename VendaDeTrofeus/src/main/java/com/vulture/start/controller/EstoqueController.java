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
		
	@RequestMapping(value = "/atualiza-estoque",method = RequestMethod.GET)
	public String atualizaEstoque(Venda v) {
		Estoque estoque = er.findById(1).get();
		int qntAtual = estoque.getQuantidade();
		int qntVenda = v.getQuantidade();
		if(qntAtual >= qntVenda) {
			System.out.println("\nENTROUU NO ATUALIZA!!\n\n");
			estoque.setQuantidade(qntAtual - v.getQuantidade());// Atualiza Estoque
			System.out.println("Estoque: "+estoque.getQuantidade());
			System.out.println("VENDA: "+v.getQuantidade());
			er.save(estoque);
			return "redirect:/painel-caixa";
		}
		return "painel-caixa";
	}
}
