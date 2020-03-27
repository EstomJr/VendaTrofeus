package com.vulture.start.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	@GeneratedValue
	private int id;
	private String usuario;
	private String senha;
	private String nome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "\n\n\n\n[id=" + id + ", usuario=" + usuario + ", senha=" + senha + ", nome=" + nome + "]\n\n\n\n\n";
	}
	
	
	
}
