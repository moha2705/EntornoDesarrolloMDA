package pruebasUnitarias;

public class Calculadora {

	public static void main(String[] args) {
		int num1 = 3, num2 = 2;
		int resul = suma(num1, num2);
		System.out.println("El resultado de sumar 3+2=" + resul);

	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int factorial(int num) {
		
		if(num==0||num==1)return 1;
		return num * factorial(num - 1);
	}
}
