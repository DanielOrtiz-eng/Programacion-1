import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        if (numero < 0) {
            System.out.println("No se le puede calcular la raíz cuadrada a un número negativo.");
        } else {
            System.out.println("La raíz cuadrada es: " + Math.sqrt(numero));
        }
        scanner.close();
    }
}
