package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
	
	private String descricao;
	
	private Double Valor;
	
	private MovimentacaoTipo tipo;
	
	private Integer idConta;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
}
