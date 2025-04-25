public class EjecutarCirculo {
    public static void main(String[] args) {
        double r = 2.3; // Declaración y asignación del radio

        // Creación del objeto
        Circulo objcirculo1 = new Circulo(r);

        // Llamado a los métodos de la clase
        System.out.println("Perímetro: " + objcirculo1.calcularPerimetro());
        System.out.println("Área: " + objcirculo1.calcularArea());
    }
}
