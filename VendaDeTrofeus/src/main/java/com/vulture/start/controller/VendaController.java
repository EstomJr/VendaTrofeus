package com.vulture.start.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vulture.start.dao.VendaRepository;
import com.vulture.start.model.Estoque;
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
		Estoque q = new Estoque();
		if(v.dadosPreenchidos()==true ){
			Date d = new Date();
			v.setData(d);
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
