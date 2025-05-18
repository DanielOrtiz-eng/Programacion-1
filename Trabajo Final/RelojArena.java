import java.util.Scanner;

public class RelojArena {

    private int segundos;
    private static Scanner sc = new Scanner(System.in);

    public RelojArena(int segundos) {
        this.segundos = segundos;
    }

    public void contar() {
        int actual = segundos;
        while (actual >= 0) {
            System.out.println("Tiempo restante: " + actual + " segundos");
            try {
                Thread.sleep(1000); // Espera 1 segundo real
            } catch (InterruptedException e) {
                System.out.println("Error durante la pausa del reloj.");
            }
            actual--;
        }
        System.out.println("El tiempo ha terminado.");
    }

    public static int leerEntero(String mensaje) {
        int valor;
        do {
            System.out.print(mensaje);
            while (!sc.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                sc.next(); // Descarta alguna entrada inválida
            }
            valor = sc.nextInt();
        } while (valor <= 0);
        return valor;
    }

    public static void main(String[] args) {
        int tiempo = leerEntero("Ingrese la cantidad de segundos para la cuenta regresiva: ");
        RelojArena reloj = new RelojArena(tiempo);
        reloj.contar();
        sc.close();
    }
}
