import java.util.Scanner;

public class SeleccionDeOperacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double PrimeroNumero = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double SegundoNumero = sc.nextDouble();
        System.out.print("Ingrese la operación a realizar (+, -, *, /): ");
        char seleccionOp = sc.next().charAt(0);
        
        double resultado;
        switch (seleccionOp) {
            case '+':
                resultado = PrimeroNumero + SegundoNumero;
                break;
            case '-':
                resultado = PrimeroNumero - SegundoNumero;
                break;
            case '*':
                resultado = PrimeroNumero * SegundoNumero;
                break;
            case '/':
                if (SegundoNumero != 0) {
                    resultado = PrimeroNumero / SegundoNumero;
                } else {
                    System.out.println("Error: División por cero.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                sc.close();
                return;
        }
        System.out.println("El resultado es: " + resultado);
        sc.close();
    }
}
