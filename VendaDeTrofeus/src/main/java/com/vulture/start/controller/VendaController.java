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
		return "campos-invalidos";
	}
	
	@RequestMapping(value = "/cadastro-vendas",method = RequestMethod.GET)
	public String paginaVenda() {
		return "/venda";
	}
	
	@RequestMapping(value="/cadastro-vendas",method = RequestMethod.POST)
	public String cadastrarVenda(Venda v){
		Estoque q = er.findById(1).get();
		if(v.dadosPreenchidos()==true ){
			Date d = new Date(); 
			v.setData(d); // Pegando data atual
			double total = Integer.parseInt(v.getQuantidade())*Double.parseDouble(v.getValorUnitario());
			v.setTotal(String.valueOf(total)); // Total da compra em R$
			int qntVenda = Integer.parseInt(v.getQuantidade());
			int qntAtual = q.getQuantidade();
			if(qntAtual>=qntVenda) {
				q.setQuantidade(qntAtual - qntVenda);
				repository.save(v);
				return "redirect:/painel-caixa";
			} else {
				return "estoque-invalido";
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
