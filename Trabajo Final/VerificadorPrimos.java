import java.util.Scanner;

public class VerificadorPrimos {

    private int inicio;
    private int fin;
    private static Scanner sc = new Scanner(System.in);

    public VerificadorPrimos(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void contarPrimosEnRango() {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        System.out.println("La cantidad de números primos en el rango es de: " + contador);
    }

    public static int leerEntero(String mensaje) {
        int valor;
        System.out.print(mensaje);
        valor = sc.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int ini = leerEntero("Por favor ingrese el inicio del rango: ");
        int fin = leerEntero("Por favor ingrese el fin del rango: ");

        VerificadorPrimos verificador = new VerificadorPrimos(ini, fin);
        verificador.contarPrimosEnRango();

        sc.close();
    }
}
