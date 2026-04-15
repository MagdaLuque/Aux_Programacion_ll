package herencia_ejercicio5;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double obtenerArea();

    public abstract double obtenerPerimetro();

    @Override
    public String toString() {
        return "Figura [color=" + color + "]";
    }
}
