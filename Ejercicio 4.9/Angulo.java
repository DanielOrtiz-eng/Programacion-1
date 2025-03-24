import java.util.Scanner;

public class Angulo {
    public static void main(String[] args) {
        Scanner Angulo = new Scanner(System.in);
        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = Angulo.nextDouble();
        
        if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else {
            System.out.println("El ángulo es obtuso.");
        }
        Angulo.close();
    }
}
