package br.com.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssertArrayEquals() {

		byte[] esperado = "teste2".getBytes();
		byte[] atual = "teste2".getBytes();

		assertArrayEquals(esperado, atual);

	}

	@Test
	public void testAssertEquals() {
        assertEquals("texto","texto");
	}
	
	

}
