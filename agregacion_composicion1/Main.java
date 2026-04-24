package agregacion_composicion1;
public class Main {
    public static void main(String[] args) {
        // b) Instanciar 2 bibliotecas
        Biblioteca b1 = new Biblioteca("Central");
        Biblioteca b2 = new Biblioteca("Municipal");

        // Agregar libros a cada biblioteca
        b1.agregarLibro(new Libro("Cien Anios de Soledad", "Gabriel Garcia Marquez", 1967));
        b1.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605));

        b2.agregarLibro(new Libro("1984", "George Orwell", 1949));
        b2.agregarLibro(new Libro("Ficciones", "Jorge Luis Borges", 1944));

        // Buscar un libro en la biblioteca
        b1.buscarLibro("El Quijote");
        b2.buscarLibro("Cien Años de Soledad");

        // Mostrar la biblioteca con más libros
        if (b1.getCantLibros() > b2.getCantLibros()) {
            System.out.println("La biblioteca con mas libros es: " + b1.getNombre());
        } else if (b2.getCantLibros() > b1.getCantLibros()) {
            System.out.println("La biblioteca con mas libros es: " + b2.getNombre());
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de libros.");
        }
    }
    
}
