public class Circulo {
    // Atributo
    private double radio;

    // Constructor de la clase: nos permite inicializar la clase
    public Circulo(double radio) {
        this.radio = radio; // 'this' es una autoreferencia al atributo de la clase
    }

    // Método para calcular el perímetro del círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}