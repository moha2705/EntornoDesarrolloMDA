package ProyectoA;

import static org.junit.Assert.*;

import org.junit.Test;

import pruebasUnitarias.Cuenta;

public class PruebaCuenta {

	@Test
	public void testRetirar() {
		Cuenta cuenta=new Cuenta("Moha","12345",2000.00,0);
	
	try {
		cuenta.retirar(500.00);
	}catch(Exception e) {
		e.printStackTrace();
	}
	double resultado=cuenta.estado();
	double esperado=1500.00;
	assertEquals(esperado, resultado,0);
	
	
	}
	
	@Test 
	public void testIngresar(){
		Cuenta cuenta=new Cuenta("moha","12345",2000.00,3);
		try {
			cuenta.retirar(500.00);
		}catch(Exception e) {
			e.printStackTrace();
		}
		double resultado=cuenta.estado();
		double esperado=2515.00;
		assertEquals(esperado, resultado,0);
	}
	
	

}
