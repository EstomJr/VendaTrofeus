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
	private double tamanho;
	private int quantidade;
	private double valorUnitario;
	private String formaDePagamento;
	private String nomeDoFuncionario;
	private Date data;
	
	public boolean dadosPreenchidos() {
		if(modeloTrofeu=="" || corTrofeu=="" || tipoTrofeu=="" || tamanho==0.0 || 
				valorUnitario==0.0 || formaDePagamento=="" || nomeDoFuncionario=="") return false;
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
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
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
