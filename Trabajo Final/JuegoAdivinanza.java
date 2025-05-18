import java.util.Scanner;

public class JuegoAdivinanza {
    private int numeroSecreto;

    public JuegoAdivinanza(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intento = -1;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Adivina el número secreto:");

        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }
        }

        scanner.close(); // Cerramos el Scanner al final del juego
    }

    public static void main(String[] args) {
        // Por ejemplo, el número secreto es 7
        JuegoAdivinanza juego = new JuegoAdivinanza(7);
        juego.jugar();
    }
}
