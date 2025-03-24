import java.util.Scanner;

public class Ascensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pisoActual = 1;
        int opcion;

        while (true) {
            System.out.println("Piso actual: " + pisoActual);
            // Mostrar las opciones disponibles según el piso actual
            if (pisoActual == 1) {
                System.out.println("[1] SUBIR");
            } else if (pisoActual == 25) {
                System.out.println("[2] BAJAR");
            } else {
                System.out.println("[1] SUBIR");
                System.out.println("[2] BAJAR");
            }
            System.out.println("[0] SALIR");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo del ascensor...");
                break;
            }

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    if (pisoActual < 25) {
                        pisoActual++;
                    } else {
                        System.out.println("No se puede subir, ya está en el último piso.");
                    }
                    break;
                case 2:
                    if (pisoActual > 1) {
                        pisoActual--;
                    } else {
                        System.out.println("No se puede bajar, ya está en el primer piso.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente de nuevo.");
            }
            System.out.println();
        }
        sc.close();
    }
}
