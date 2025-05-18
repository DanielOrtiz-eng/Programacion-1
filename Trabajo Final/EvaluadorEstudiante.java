import java.util.Scanner;

public class EvaluadorEstudiante {
    private double nota1;
    private double nota2;
    private double nota3;

    public EvaluadorEstudiante() {
        Scanner scanner = new Scanner(System.in);
        
        nota1 = leerNota(scanner, "Ingrese la nota 1 (30%): ");
        nota2 = leerNota(scanner, "Ingrese la nota 2 (30%): ");
        nota3 = leerNota(scanner, "Ingrese la nota 3 (40%): ");
    }

    private double leerNota(Scanner scanner, String mensaje) {
        double nota = -1;
        while (nota < 0.0 || nota > 5.0) {
            System.out.print(mensaje);
            nota = scanner.nextDouble();
            if (nota < 0.0 || nota > 5.0) {
                System.out.println("Recuerda que la nota debe estar entre 0.0 y 5.0. Intente de nuevo.");
            }
        }
        return nota;
    }

    public void evaluar() {
        double notaFinal = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
        System.out.println("Nota final: " + notaFinal);
        if (notaFinal >= 3.0) {
            System.out.println("El estudiante aprueba");
        } else {
            System.out.println("El estudiante reprueba.");
        }
    }

    public static void main(String[] args) {
        EvaluadorEstudiante estudiante = new EvaluadorEstudiante();
        estudiante.evaluar();
    }
}
