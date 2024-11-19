package reto4;

import java.util.Scanner;

public class Reto4 {

	public static void main(String[] args) {
		// Parte de Bianca
		
		Scanner sc = new Scanner (System.out);
		int numero = 0;

		System.out.println("Introduce un número para calcular la estatura máxima de tu hij@: "); // se introduce aquí un número para seleccionar en el men
		
		System.out.println("/n1 Tengo hijo /n2 Tengo hija n3/ Tengo hijo e hija /n4 Salir."); 
		numero = sc.nextInt(); // aqui se escanea el número introducido
		
		int opcion = funciones.dimeEntero("Eso no es un numero", sc); // en caso de error

		if (opcion == 0){
		break;
		}
		
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
		
		
		
		// parte de Bianca
		
		
		
		
		
		
		
	}
	
	
	// Parte de Claudiu

	
	
	
	
	
	
	
	// parte de Bianca
	
	
	
	
	
	
	

}
