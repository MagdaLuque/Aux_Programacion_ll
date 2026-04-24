package agregacion_composicion1;
public class Libro {
    private String nombre;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }
    // Getters
    public String getNombre() { 
        return nombre; 
    }
    public String getAutor() { 
        return autor; 
    }
    public int getAnio() { 
        return anio; 
    }
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Libro: " + nombre + ", Autor: " + autor + ", Anio: " + anio);
    }
}
