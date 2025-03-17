// Ejercicio 4.1 B)
import java.util.Scanner;

public class Ejercicio41b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la temperatura al usuario
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        // Verificar si está por encima o por debajo del punto de ebullición
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }

        scanner.close();
    }
}
