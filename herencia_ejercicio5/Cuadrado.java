package herencia_ejercicio5;
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return lado * lado;
    }

    @Override
    public double obtenerPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", color=" + color + "]";
    }
}
