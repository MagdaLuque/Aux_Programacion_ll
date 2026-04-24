package agregacion_composicion1;
public class Biblioteca {
    private String nombre;
    private int cantLibros;
    private Libro[] libros; // relacion de agregacion

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[100]; // capacidad máxima
        this.cantLibros = 0;
    }
    // Agregar libro
    public void agregarLibro(Libro libro) {
        if (cantLibros < libros.length) {
            libros[cantLibros] = libro;
            cantLibros++;
        } else {
            System.out.println("La biblioteca esta llena.");
        }
    }
    // Verificar si un libro está en la biblioteca
    public void buscarLibro(String nombreLibro) {
        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getNombre().equalsIgnoreCase(nombreLibro)) {
                System.out.println("El libro esta en la biblioteca " + nombre);
                libros[i].mostrarDatos();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca " + nombre);
    }
    // Getter para cantidad de libros
    public int getCantLibros() { 
        return cantLibros; 
    }
    // Mostrar nombre de la biblioteca
    public String getNombre() { 
        return nombre; 
    } 
}
