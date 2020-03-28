package com.vulture.start.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue
	private int id;
	private String modeloTrofeu;
	private String corTrofeu;
	private String tipoTrofeu;
	private String tamanho;
	private String quantidade;
	private String valorUnitario;
	private String formaDePagamento;
	private String nomeDoFuncionario;
	private Date data;
	
	public boolean dadosPreenchidos() {
		if(modeloTrofeu=="" || corTrofeu=="" || tipoTrofeu=="" || tamanho=="" || 
				valorUnitario=="" || formaDePagamento=="" || nomeDoFuncionario=="") return false;
		return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModeloTrofeu() {
		return modeloTrofeu;
	}
	public void setModeloTrofeu(String modeloTrofeu) {
		this.modeloTrofeu = modeloTrofeu;
	}
	public String getCorTrofeu() {
		return corTrofeu;
	}
	public void setCorTrofeu(String corTrofeu) {
		this.corTrofeu = corTrofeu;
	}
	public String getTipoTrofeu() {
		return tipoTrofeu;
	}
	public void setTipoTrofeu(String tipoTrofeu) {
		this.tipoTrofeu = tipoTrofeu;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}
	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date d) {
		this.data = d;
	}
	
}
