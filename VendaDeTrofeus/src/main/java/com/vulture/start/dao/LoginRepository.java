package com.vulture.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vulture.start.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{

}
