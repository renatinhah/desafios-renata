package com.challenge.desafio;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

public class CalculadorDeClasses implements Calculavel{

	@Override
	public BigDecimal somar(Class classe) {
		Field[] campos = classe.getDeclaredFields();
		int somaAtributos = 0;
		for (Field campo : campos) {
			if(campo.isAnnotationPresent(Somar.class)) {
				somaAtributos++;
			}
		}
		return new BigDecimal(somaAtributos);
	}

	@Override
	public BigDecimal subtrair(Class classe) {
		Field[] campos = classe.getDeclaredFields();
		int somaAtributos = 0;
		for (Field campo : campos) {
			if(campo.isAnnotationPresent(Subtrair.class)) {
				somaAtributos++;
			}
		}
		return new BigDecimal(somaAtributos);
	}

	@Override
	public void total(Class classeA, Class classeB) {
		Field[] camposClasseA = classeA.getDeclaredFields();
		Field[] camposClasseB = classeB.getDeclaredFields();
		
		int somaAtributosClasseA = 0;
		int somaAtributosClasseB = 0;
		
		for (Field campo : camposClasseA) {
			if(campo.isAnnotationPresent(Somar.class)) {
				somaAtributosClasseA++;
			}
		}
		for (Field campo : camposClasseB) {
			if(campo.isAnnotationPresent(Subtrair.class)) {
				somaAtributosClasseB++;
			}
		}
	    
		System.out.println(somaAtributosClasseA - somaAtributosClasseB);
		
	}
	
	

}
