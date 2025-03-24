import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int PrimerNumero = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int SegundoNumero = sc.nextInt();
        
        if (PrimerNumero == 0 || SegundoNumero == 0) {
            System.out.println("No se puede dividir por cero.");
        } else if (SegundoNumero % PrimerNumero == 0) {
            System.out.println(PrimerNumero
 + " es divisor de " + SegundoNumero);
        } else if (PrimerNumero % SegundoNumero == 0) {
            System.out.println(SegundoNumero + " es divisor de " + PrimerNumero
);
        } else {
            System.out.println("Ninguno es divisor del otro.");
        }
        
        sc.close();
    }
}
