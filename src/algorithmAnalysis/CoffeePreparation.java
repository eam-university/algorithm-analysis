package algorithmAnalysis;

import java.util.Scanner;

/**
 * Algorithm to make some coffee
 * @author Jhonatan David Rico Echeverri
 */
public class CoffeePreparation {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Paso 1: Reunir los materiales necesarios:");
        System.out.println("\t- Café de tú preferencia.\n\t- Agua fresca.\n\t- Azúcar.\n\t- Crema.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 2: Llenar la cafetera con agua fresca.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 3: Colocar el filtro y añadir el café.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 4: Encender la cafetera y esperar a que se complete el ciclo de preparación.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 5: Verter el café en la taza.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 6: Agregar azúcar y crema al gusto.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 7: ¡Disfrutar del café recién hecho!");
    }
}
