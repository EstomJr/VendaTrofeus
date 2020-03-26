package com.vulture.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vulture.start.dao.EstoqueRepository;

@Controller
public class EstoqueController {
	
	@Autowired
	private EstoqueRepository er;
	
	
}
