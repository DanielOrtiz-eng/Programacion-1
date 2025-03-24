import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();

        int diasEnMes;
        if (mes == 2) {
            if ((año % 400 == 0) || (año % 4 == 0 && año % 100 != 0))
                diasEnMes = 29;
            else
                diasEnMes = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            diasEnMes = 30;
        else
            diasEnMes = 31;

        dia++;
        if (dia > diasEnMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        System.out.println("La fecha siguiente es: " + dia + "/" + mes + "/" + año);
        sc.close();
    }
}
