// Ejercicio 4.1 C)
import java.util.Scanner;

public class Ejercicio41c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPositivos = 0;
        int totalNegativos = 0;
        int numero;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                totalPositivos += numero;
            } else if (numero < 0) {
                totalNegativos += numero;
            }

        } while (numero != 0); // Esto hace que termine de contar cuando el usuario ingresa 0)
        
        System.out.println("Total de números positivos: " + totalPositivos);
        System.out.println("Total de números negativos: " + totalNegativos);
        
        scanner.close();
    }
}
