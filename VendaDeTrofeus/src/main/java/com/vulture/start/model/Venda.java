package com.vulture.start.model;

import java.time.LocalDate;
import java.util.Calendar;

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
	private String horario;
	private String data;
	
	public String getHorario() {
		return horario();
	}
	
	public LocalDate getData() {
		return data();
	}
	
	public String horario() {
		int hora, min,seg;
		Calendar data = Calendar.getInstance();
		hora = data.get(Calendar.HOUR_OF_DAY);
		min = data.get(Calendar.MINUTE);
		seg = data.get(Calendar.SECOND);
		String horario = hora+":"+min+":"+seg;
		return horario;
	}
	
	public LocalDate data() {
		return java.time.LocalDate.now();
	}
	
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
	
	
}
