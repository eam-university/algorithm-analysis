package algorithmAnalysis;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Algorithm to get the almost exact age given a date in format dd-mm-yyyy
 * @author Jhonatan David Rico Echeverri
 */
public class ExactAge {

    public static void main(String[] args) {
    	
    	int[] userInput = getUserInput();
    
        int[] age = calculateAge(userInput[0], userInput[1], userInput[2]);
        
        // Imprimir la edad en a�os meses y d�as
        System.out.printf("La edad es: %d a�os, %d meses y %d d�as\n", age[0], age[1], age[2]);
    }

    /**
     * M�todo encargado de calcular la edad en a�os, meses y d�as dado el a�os, mes y d�a de nacimiento de una persona
     * @param birthDay D�a de nacimiento
     * @param birthMonth Mes de nacimiento
     * @param birthYear A�o de nacimiento
     * @return Arreglo en formato [a�os, meses, dias]
     */
    public static int[] calculateAge(int birthYear, int birthMonth, int birthDay) {
        // Obtener la fecha actual
        LocalDate now = LocalDate.now();

        // Obtener la fecha de nacimiento como un objeto LocalDate
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // Calcular la edad obteniendo las diferencias en cada dato
        int years = now.getYear() - birthDate.getYear();
        int months = now.getMonthValue() - birthDate.getMonthValue();
        int days = now.getDayOfMonth() - birthDate.getDayOfMonth();

        // Ajustar la edad si a�n no se ha cumplido a�os
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
            months = (months + 12) % 12;
            days = (days + birthDate.lengthOfMonth()) % birthDate.lengthOfMonth();
        }

        // Devolver la edad en a�os, meses y d�as
        return new int[] { years, months, days };
    }
    
    /**
     * M�todo encargado de solicitar la fecha de nacimiento de una persona en a�os, meses y d�as.
     * @return Arreglo en formato [a�o, mes, dia]
     */
    public static int[] getUserInput() {
        int day, month, year;
        // User input for the year, month and day
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su a�o de nacimiento (yyyy): ");
        year = scanner.nextInt();
        System.out.print("Ingrese su mes de nacimiento en n�mero (mm): ");
        month = scanner.nextInt();
        System.out.print("Ingrese su d�a de nacimiento (dd): ");
        day = scanner.nextInt();
        scanner.close();
        
        // Se devuelve la informaci�n que el usuario ha ingresado
    	return new int[] {year, month, day};
    }
}
