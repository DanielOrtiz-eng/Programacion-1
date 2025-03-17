// Ejercicio 4.1 E)
import java.util.Scanner;

public class CEjercicio 4.1E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de distancia
        System.out.print("Ingrese la distancia (en km): ");
        double distancia = scanner.nextDouble();

        // Verificar si la distancia está en el rango requerido
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese el tiempo (en horas): ");
            double tiempo = scanner.nextDouble();

            // Calcular la velocidad
            double velocidad = distancia / tiempo;
            System.out.println("La velocidad calculada es: " + velocidad + " km/h");
        } else {
            System.out.println("La distancia no está en el rango requerido. No se solicita el tiempo.");
        }

        scanner.close();
    }
}
