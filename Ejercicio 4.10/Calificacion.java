import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación numérica (0-100): ");
        double calificacion = sc.nextDouble();
        String letra;

        if (calificacion >= 90)
            letra = "A";
        else if (calificacion >= 80)
            letra = "B";
        else if (calificacion >= 70)
            letra = "C";
        else if (calificacion >= 69)
            letra = "D";
        else
            letra = "F";

        System.out.println("Su calificación en letra es: " + letra);
        sc.close();
    }
}
