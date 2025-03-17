// Ejercicio 4.1 A)
import java.util.Scanner;

public class Ejercicio41a {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un ángulo en grados: ");

        // Se declara la o las variables
        int angulo = leer.nextInt();

        // Se valida si el angulo ingresado es o no es un angulo recto (Condicional)
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto.");
        } else {
            System.out.println("El ángulo NO es un ángulo recto.");
        }

        leer.close(); 
    }
}
