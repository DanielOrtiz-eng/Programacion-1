import java.util.Scanner;

public class ContadorDigitosPares {
    private int numero;

    public ContadorDigitosPares(int numero) {
        this.numero = numero;
    }

    public void contarDigitosPares() {
        int copia = numero;
        int contador = 0;
        int digito;

        while (copia > 0) {
            digito = copia % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            copia = copia / 10;
        }
        System.out.println("Cantidad de dígitos pares: " + contador);
    }

    public static int leerEnteroPositivo(Scanner sc) {
        int num;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = sc.nextInt();
        } while (num <= 0);
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = leerEnteroPositivo(sc);
        sc.close();  // Cerramos el Scanner
        ContadorDigitosPares contador = new ContadorDigitosPares(numero);
        contador.contarDigitosPares();
    }
}
