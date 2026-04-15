package herencia_ejercicio5;
public class Main {

    public static void main(String[] args) {
        // Instanciar 2 objetos de cada subclase
        Cuadrado c1 = new Cuadrado(4, "gris");
        Cuadrado c2 = new Cuadrado(6, "rojo");

        Triangulo t1 = new Triangulo(3, 4, 5, "azul");
        Triangulo t2 = new Triangulo(6, 8, 10, "violeta");

        Redondo r1 = new Redondo(3, "verde");
        Redondo r2 = new Redondo(5, "celeste");

        // Mostrar cada objeto con area y perimetro
        Figura[] figuras = {c1, c2, t1, t2, r1, r2};
        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.println("Area: " + f.obtenerArea());
            System.out.println("PerImetro: " + f.obtenerPerimetro());
            System.out.println("-------------------");
        }

        // Comparar area entre un cuadrado y un triangulo
        if (c1.obtenerArea() > t1.obtenerArea()) {
            System.out.println("El cuadrado tiene mayor area. Color: " + c1.getColor());
        } else {
            System.out.println("El triangulo tiene mayor area. Color: " + t1.getColor());
        }
    }
    
}
