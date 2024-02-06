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
	

}
