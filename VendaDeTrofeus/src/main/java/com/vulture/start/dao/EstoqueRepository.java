package com.vulture.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vulture.start.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer>{

}
