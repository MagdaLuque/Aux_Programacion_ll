package herencia_ejercicio5;
public class Triangulo extends Figura {

    private int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double obtenerPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triangulo [lados=" + lado1 + "," + lado2 + "," + lado3 + ", color=" + color + "]";
    }
}
