import java.util.Scanner;

public class Metodos {
    
    // Método 1: Operador módulo
    public static boolean esParModulo(int n) {
        return n % 2 == 0;
    }

    // Método 2: Operador bit a bit
    public static boolean esParBitwise(int n) {
        return (n & 1) == 0;
    }

    // Método 3: Doble de la división entera
    public static boolean esParDivision(int n) {
        return (n / 2) * 2 == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Método 1: Módulo
        int resto = numero % 2;
        boolean parModulo = esParModulo(numero);
        System.out.println("\nUsando el operador módulo:");
        System.out.println("Calcular " + numero + " % 2 = " + resto);
        System.out.println("Si el resultado es 0, el número es par.");
        System.out.println("Resultado: El número " + numero + (parModulo ? " es par." : " no es par."));

        // Método 2: Operador Bitwise
        int bitwise = numero & 1;
        boolean parBitwise = esParBitwise(numero);
        System.out.println("\nUsando el operador bitwise:");
        System.out.println("Calcular " + numero + " & 1 = " + bitwise);
        System.out.println("Si el resultado es 0, el número es par.");
        System.out.println("Resultado: El número " + numero + (parBitwise ? " es par." : " no es par."));

        // Método 3: División Entera
        int division = numero / 2;
        int reconstruccion = division * 2;
        boolean parDivision = esParDivision(numero);
        System.out.println("\nUsando la división entera:");
        System.out.println("Calcular " + numero + " / 2 = " + division + " y luego " + division + " * 2 = " + reconstruccion);
        System.out.println("Si " + reconstruccion + " es igual a " + numero + ", el número es par.");
        System.out.println("Resultado: El número " + numero + (parDivision ? " es par." : " no es par."));

        scanner.close();
    }
}
