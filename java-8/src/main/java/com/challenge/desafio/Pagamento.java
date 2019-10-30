package com.challenge.desafio;

import java.math.BigDecimal;

import com.challenge.annotation.Subtrair;

public class Pagamento {
	private String nomeFuncionario;
	@Subtrair
	private BigDecimal salario;
	@Subtrair
	private BigDecimal pnl;
	@Subtrair
	private BigDecimal descontos;
	@Subtrair
	private BigDecimal beneficios;
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public BigDecimal getPnl() {
		return pnl;
	}
	public void setPnl(BigDecimal pnl) {
		this.pnl = pnl;
	}
	public BigDecimal getDescontos() {
		return descontos;
	}
	public void setDescontos(BigDecimal descontos) {
		this.descontos = descontos;
	}
	public BigDecimal getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(BigDecimal beneficios) {
		this.beneficios = beneficios;
	}
	
	
}
