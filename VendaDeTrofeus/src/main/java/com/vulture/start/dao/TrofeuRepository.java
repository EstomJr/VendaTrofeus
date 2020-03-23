package com.vulture.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vulture.start.model.Trofeu;

@Repository
public interface TrofeuRepository extends JpaRepository<Trofeu, Integer>{
	
}
