package com.vulture.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vulture.start.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

}
