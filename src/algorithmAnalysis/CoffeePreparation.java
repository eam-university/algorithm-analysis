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
        System.out.println("\t- Caf� de t� preferencia.\n\t- Agua fresca.\n\t- Az�car.\n\t- Crema.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 2: Llenar la cafetera con agua fresca.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 3: Colocar el filtro y a�adir el caf�.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 4: Encender la cafetera y esperar a que se complete el ciclo de preparaci�n.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 5: Verter el caf� en la taza.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 6: Agregar az�car y crema al gusto.");
        scanner.nextLine(); // Espera al usuario a presionar Enter
        
        System.out.println("Paso 7: �Disfrutar del caf� reci�n hecho!");
    }
}
