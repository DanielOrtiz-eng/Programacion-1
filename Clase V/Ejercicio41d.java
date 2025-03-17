// Ejercicio 4.1 D)
import java.util.Scanner;

public class Ejercicio41d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        System.out.print("Ingrese el valor de z: ");
        int z = scanner.nextInt();

        if (x > y && z < 20) {
            System.out.print("Ingrese el valor de p: ");
            int p = scanner.nextInt();
            System.out.println("Valor de p ingresado: " + p);
        } else {
            System.out.println("No se requiere ingresar p.");
        }

        scanner.close();
    }
}