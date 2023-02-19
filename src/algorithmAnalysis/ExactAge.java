package algorithmAnalysis;

import java.time.LocalDate;

/**
 * Algorithm to get the almost exact age given a date in format dd-mm-yyyy
 * @author Jhonatan David Rico Echeverri
 */
public class ExactAge {

    public static void main(String[] args) {
        int birthDay = 10;
        int birthMonth = 6;
        int birthYear = 1985;
        
        int[] age = calculateAge(birthDay, birthMonth, birthYear);
        
        // Imprimir la edad en años meses y días
        System.out.printf("La edad es: %d años, %d meses y %d días\n", age[0], age[1], age[2]);
    }

    /**
     * Método encargado de calcular la edad en años, meses y días dado el años, mes y día de nacimiento de una persona
     * @param birthDay Día de nacimiento
     * @param birthMonth Mes de nacimiento
     * @param birthYear Año de nacimiento
     * @return Arreglo en formato [años, meses, dias]
     */
    public static int[] calculateAge(int birthDay, int birthMonth, int birthYear) {
        // Obtener la fecha actual
        LocalDate now = LocalDate.now();

        // Obtener la fecha de nacimiento como un objeto LocalDate
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // Calcular la edad obteniendo las diferencias en cada dato
        int years = now.getYear() - birthDate.getYear();
        int months = now.getMonthValue() - birthDate.getMonthValue();
        int days = now.getDayOfMonth() - birthDate.getDayOfMonth();

        // Ajustar la edad si aún no se ha cumplido años
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
            months = (months + 12) % 12;
            days = (days + birthDate.lengthOfMonth()) % birthDate.lengthOfMonth();
        }

        // Devolver la edad en años, meses y días
        return new int[] { years, months, days };
    }
}
