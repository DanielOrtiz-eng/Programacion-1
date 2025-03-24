import java.util.Scanner;

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un mes (1 para Enero, 2 para Febrero, …): ");
        if (!sc.hasNextInt()) {
            System.out.println("Advertencia: El mes debe ser un número entero (no se aceptan decimales).");
            sc.close();
            return;
        }
        int mes = sc.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Advertencia: El número introducido no es válido como mes.");
            sc.close();
            return;
        }

        System.out.print("Introduzca un día del mes: ");
        if (!sc.hasNextInt()) {
            System.out.println("Advertencia: El día debe ser un número entero (no se aceptan decimales).");
            sc.close();
            return;
        }
        int dia = sc.nextInt();

        int diasEnMes;
        if (mes == 2) {
            diasEnMes = 29; 
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasEnMes = 30;
        } else {
            diasEnMes = 31;
        }

        if (dia < 1 || dia > diasEnMes) {
            System.out.println("Advertencia: El día ingresado no es válido para el mes seleccionado.");
        } else {
            System.out.println("Fecha ingresada correctamente: " + dia + "/" + mes);
        }
        
        sc.close();
    }
}
