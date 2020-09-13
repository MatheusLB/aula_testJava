package br.com.calculadora;

public class Calculadora {

	public int somar(String expressao) {
		
		int soma = 0;
		
		for(String valorSoma : expressao.split("\\+")) { 
			soma += Integer.valueOf(valorSoma);
			
		}			
		System.out.print(soma);
		
		return soma;
		
		
		
		
		
	}
	
}
