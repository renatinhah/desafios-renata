package com.challenge.desafio;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		CalculadorDeClasses calculador = new CalculadorDeClasses();
//		NotaFiscal nf = new NotaFiscal("nomeProduto", new BigDecimal(15), 3, new BigDecimal(45), new BigDecimal(20));
		System.out.println(calculador.somar(NotaFiscal.class));
		System.out.println(calculador.subtrair(Pagamento.class));
		calculador.total(Pagamento.class, NotaFiscal.class);

	}

}
