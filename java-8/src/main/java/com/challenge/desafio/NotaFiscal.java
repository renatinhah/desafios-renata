package com.challenge.desafio;

import java.math.BigDecimal;

import com.challenge.annotation.Somar;

public class NotaFiscal {

	private String nomeProduto;
	@Somar
	private BigDecimal valorUnitario;
	private int quantidadeProduto;
	@Somar
	private BigDecimal valorTotal;
	@Somar
	private BigDecimal imposto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public BigDecimal getImposto() {
		return imposto;
	}
	public void setImposto(BigDecimal imposto) {
		this.imposto = imposto;
	}
}
