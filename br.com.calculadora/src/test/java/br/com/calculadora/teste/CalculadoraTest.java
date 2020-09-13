package br.com.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}

}
