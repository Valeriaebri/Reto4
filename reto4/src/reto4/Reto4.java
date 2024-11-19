package reto4;

import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {
		// Parte de Bianca
		
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		System.out.println("Introduce un número para calcular la estatura máxima de tu hij@: "); // se introduce aquí un número para seleccionar en el men
		System.out.println("/n1 Tengo hijo /n2 Tengo hija n3/ Tengo hijo e hija /n4 Salir."); 
		numero = sc.nextInt(); // aqui se escanea el número introducido
		int opcion = funciones.dimeEntero("Eso no es un numero", sc); // en caso de error

		
		int madre = 0;
		int padre = 0;
		System.out.println("Introduce estatura de la madre: ");  // estatura de la madre en en cm
		madre=sc.nextInt();
		System.err.println("Introduce estatura del padre: "); // estatura del padre en cm
		padre = sc.nextInt(); 
		
		switch (opcion) {
		case 1:  {
			calcularHije(padre,madre); // calcula la estatura maxima del hijo
		}
		case 2: {
			
			calcularHija(padre,madre); // calcula la estatura maxima de la hija
		}
		case 3: {
			calcularAmbos(padre,madre); // calcula la estatura de ambos tanto hijo e hija
		}
		case 4: {
			System.out.println("Saliendo..."); // sale del menu.
		}
		default {
			break:
		}
		}
		
	}
	
	
	// Parte de Claudiu

	public static void calcularHije(int padre, int made) { // te imprime el calculo de la talla diana si es hijo sumandole + 6,5 cm por ser niño
		edadHijr=23;
		while(false) {
			if(edadhijr != 0) {
				int alturaHija = calculo(padre, made);
				System.out.println("La altura de la hija es: " alturaHija);
		}
		}
	}
	
	public static calcularHija(int pare, int mdre) { // te imprime el calculo de la talla diana si es hija restandole - 6,5 cm si es niña
		System.out.println("La edad de la hija es: "+(calculo(int padre, int mdre)-6.5));
	}
	public static void calcularAmbos(int prre, int madre) { // te imprime el calculo de si es hijo y tambien si es hija llamando a las otras dos funciones
		calcularHije
		calcularHija(madre, prre);
	}
	
	public static int calculo(int padre, int mdre) { // Esta calculadora utiliza la fórmula que los pediatras llaman “talla diana”: talla del padre + talla de la madre dividido entre 2 ( /).
		return (padre+mdre)/2;
	}
	
	
	
	

	
	
	
	
	
	
	

}
