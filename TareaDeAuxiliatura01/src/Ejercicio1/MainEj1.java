package Ejercicio1;
/**
 * @author Magdalena
 */
public class MainEj1 {
    public static void main(String[] args) {
        // objetos
        Anime naruto = new Anime("Naruto", "accion", 220);
        Anime buda = new Anime("shigarta", "Drama", 13);

        System.out.println("Anime 1: " + naruto.nombre + " - Genero: " + naruto.genero);
        System.out.println("Anime 2: " + buda.nombre + " - Genero: " + buda.genero);
    }
    
}
