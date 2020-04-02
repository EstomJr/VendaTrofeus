package com.vulture.start.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vulture.start.dao.EstoqueRepository;
import com.vulture.start.dao.VendaRepository;
import com.vulture.start.model.Estoque;
import com.vulture.start.model.Venda;

@Controller
public class VendaController{

	@Autowired
	private VendaRepository repository;
	
	@Autowired
	private EstoqueRepository er;
	
	@GetMapping("/campos-invalidos")
	public String camposInvalidos() {
		return "/campos-invalidos";
	}
	
	@RequestMapping(value = "/cadastro-vendas",method = RequestMethod.GET)
	public String paginaVenda() {
		return "/venda";
	}
	
	@RequestMapping(value="/cadastro-vendas",method = RequestMethod.POST)
	public String cadastrarVenda(Venda v){
		Estoque q = er.findById(1).get();
		if(v.dadosPreenchidos()==true ){
			System.out.println("Entrou no 1 if da venda");
			Date d = new Date();
			v.setData(d);
			int qntVenda = v.getQuantidade();
			int qntAtual = q.getQuantidade();
			System.out.println("Venda: "+qntVenda+"\nEstoque: "+qntAtual);
			if(qntAtual>=qntVenda) {
				q.setQuantidade(qntAtual - qntVenda);
				repository.save(v);
				return "redirect:/painel-caixa";
			}
		}
		return "redirect:/campos-invalidos";
	}
	
	@RequestMapping("/estoque")
	public ModelAndView listaEstoque() {
		ModelAndView mv = new ModelAndView("estoque");
		Iterable<Venda> estoque = repository.findAll();
		mv.addObject("trofeus", estoque);
		return mv;
	}
	
	
}
