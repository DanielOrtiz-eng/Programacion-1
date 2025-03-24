import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double PrimerNumero = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double SegundoNumero = scanner.nextDouble();

        if (PrimerNumero > SegundoNumero) {
            System.out.println("El primer número es el mayor.");
        } else if (PrimerNumero < SegundoNumero) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
