import java.util.Scanner;
 
public class DulceAlgoritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de barras producidas en un día: ");
        int N = scanner.nextInt();
 
        final double COSTO_MATERIA_PRIMA = 2.50;
        final double COSTO_EMPAQUE = 0.50;
        final int BARRAS_POR_CAJA = 10;
        final double PORCENTAJE_GANANCIA = 0.30;
 
        double costoPorBarra = COSTO_MATERIA_PRIMA + COSTO_EMPAQUE;
        double costoTotalProduccion = N * costoPorBarra;
 
        double precioVentaPorBarra = costoPorBarra * (1 + PORCENTAJE_GANANCIA);
 
        double ingresoTotal = N * precioVentaPorBarra;
 
        int cajasCompletas = N / BARRAS_POR_CAJA;
        int barrasSueltas = N % BARRAS_POR_CAJA;
 
        System.out.println("\n---- Resultados ----");
        System.out.printf("Costo total de producción: $%.2f%n", costoTotalProduccion);
        System.out.printf("Precio de venta por barra: $%.2f%n", precioVentaPorBarra);
        System.out.printf("Ingreso total del día: $%.2f%n", ingresoTotal);
        System.out.println("Número de cajas completas: " + cajasCompletas);
        System.out.println("Barras sueltas: " + barrasSueltas);
 
        scanner.close();
    }
}
 