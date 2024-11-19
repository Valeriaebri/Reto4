package reto4;

import java.util.Scanner;

public class funciones {

public static int dimeEntero (String intStart, Scanner scanner) {
		
		while (true) {
			System.out.println(intStart);
			String entrada = scanner.nextLine();
			try {
				int entero = Integer.parseInt(entrada);
				return entero;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error, número no reconocido.");	
			}
		}
	}
}
