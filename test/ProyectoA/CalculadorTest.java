package ProyectoA;

import static org.junit.Assert.*;

import org.junit.Test;

import pruebasUnitarias.Calculadora;

public class CalculadorTest {

	@Test
	public void testSuma() {
		int resultado=Calculadora.suma(4, 3);
		int esperado=7;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testResta() {
		int resultado=Calculadora.resta(4, 3);
		int esperado=1;
		assertEquals(esperado, resultado);
	}
	@Test
	public void testFactorial() {
		int resultado=Calculadora.factorial(5);
		int esperado=120;
		assertEquals( esperado,resultado);
	}

}
