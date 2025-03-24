import java.util.Scanner;

public class NumCentral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int PrimerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int SegundoNumero = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int TercerNumero = scanner.nextInt();

        int central;

        if ((PrimerNumero > SegundoNumero && PrimerNumero < TercerNumero) || (PrimerNumero > TercerNumero && PrimerNumero < SegundoNumero)) {
            central = PrimerNumero;
        } else if ((SegundoNumero > PrimerNumero && SegundoNumero < TercerNumero) || (SegundoNumero > TercerNumero && SegundoNumero < PrimerNumero)) {
            central = SegundoNumero;
        } else {
            central = TercerNumero;
        }

        System.out.println("El número central es: " + central);

        scanner.close();
    }
}
