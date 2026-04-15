package herencia_ejercicio5;
public class Redondo extends Figura {

    private int radio;

    public Redondo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Redondo [radio=" + radio + ", color=" + color + "]";
    }
}
