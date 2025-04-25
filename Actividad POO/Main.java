public class Main {
    public static void main(String[] args) {
        OperacionesMatematicas op = new OperacionesMatematicas();

        int a = 10;
        int b = 5;

        System.out.println("Suma: " + op.sumar(a, b));
        System.out.println("Resta: " + op.restar(a, b));
        System.out.println("Multiplicación: " + op.multiplicar(a, b));
        System.out.println("División: " + op.dividir(a, b));
    }
}
