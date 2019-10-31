package com.challenge.desafio;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

public class CalculadorDeClasses implements Calculavel{

	@Override
	public BigDecimal somar(Object classe) throws IllegalAccessException {
		Field[] campos = classe.getClass().getDeclaredFields();
		int somaAtributos = 0;
		for (Field campo : campos) {
			if(campo.isAnnotationPresent(Somar.class)) {
				somaAtributos++;
			}
		}
		return new BigDecimal(somaAtributos);
	}

	@Override
	public BigDecimal subtrair(Object classe) throws IllegalAccessException{
		Field[] campos = classe.getClass().getDeclaredFields();
		int somaAtributos = 0;
		for (Field campo : campos) {
			if(campo.isAnnotationPresent(Subtrair.class)) {
				somaAtributos++;
			}
		}
		return new BigDecimal(somaAtributos);
	}

	@Override
	public BigDecimal totalizar(Object classe) throws IllegalAccessException{
		Field[] campos = classe.getClass().getDeclaredFields();
		
		int somaAnnotationSoma = 0;
		int somaAnnotationSubtrai = 0;
		
		for (Field campo : campos) {
			if(campo.isAnnotationPresent(Somar.class)) {
				somaAnnotationSoma++;
			} else if(campo.isAnnotationPresent(Somar.class)) {
				somaAnnotationSubtrai++;
			}
		}
		return new BigDecimal(somaAnnotationSoma - somaAnnotationSubtrai);
	}

}
