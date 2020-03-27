package com.vulture.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vulture.start.dao.VendaRepository;
import com.vulture.start.model.Venda;

@Controller
public class VendaController{

	@Autowired
	private VendaRepository repository;
	
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
		if(v.dadosPreenchidos()==true) {
			repository.save(v);
			return "redirect:/cadastro-vendas";
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
