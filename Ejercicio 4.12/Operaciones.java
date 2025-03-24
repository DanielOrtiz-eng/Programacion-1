import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número real: ");
        double PrimeroNumero = sc.nextDouble();
        
        System.out.print("Ingrese el segundo número real: ");
        double SegundoNumero = sc.nextDouble();
        
        System.out.print("Ingrese el código de selección (1: Suma, 2: Multiplicación, 3: División): ");
        int codigo = sc.nextInt();
        
        double resultado;
        if (codigo == 1) {
            resultado = PrimeroNumero + SegundoNumero;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (codigo == 2) {
            resultado = PrimeroNumero * SegundoNumero;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else if (codigo == 3) {
            if (SegundoNumero != 0) {
                resultado = PrimeroNumero / SegundoNumero;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("Error: División por cero.");
            }
        } else {
            System.out.println("Código de selección no válido.");
        }
        
        sc.close();
    }
}
