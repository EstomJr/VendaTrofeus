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

}
