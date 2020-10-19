package br.com.calculadora.teste;

import static org.junit.Assert.*;

import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import br.com.calculadora.Person;

public class MatcherTest {

	@Test
	public void test() {
		Person p = new Person("matheus","jose");
		
		String str = p.toString();
		
		assertThat(p, HasToString.hasToString(str));
	}
	
	@Test
	public void bean_matcher() {

		Person p = new Person("matheus","jose");
		assertThat(p, HasProperty.hasProperty("nome"));
		
	}
}
