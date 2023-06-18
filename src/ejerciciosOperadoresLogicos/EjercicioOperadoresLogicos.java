package ejerciciosOperadoresLogicos;

public class EjercicioOperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Los operadores lógicos se utilizan para combinar valores booleanos y nos
		 * devuelven un resultado verdadero o falso
		 * 
		 *
		 * && and (Y) || or (O) ! not (no)
		 * 
		 */

		int a = 5;
		int b = 3;

		System.out.println(a == b && a > b);
		System.out.println(!(a == b) && a > b);
		System.out.println(a == b || a > b);

		// Ejercicio de número par

		// Determinar si un num es par

		int num = 7;

		boolean resultado = (num % 2 == 0);

		if (resultado) {
			System.out.println("el numero es par");

		} else {
			System.out.println("el numero no es par");
		}
		
	}

}
