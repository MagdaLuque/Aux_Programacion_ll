package ej4polimorfismo;
import java.util.Scanner;
/**
 * @author Magdalena
 */
public class Videojuego {

    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    // Constructor vacio
    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }
    // Constructor 2
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    // Constructor 3
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    // Motodo para mostrar informacion
    public void mostrar() {
        System.out.println("Videojuego: " + nombre
                + " , Plataforma: " + plataforma
                + " , Jugadores: " + cantidadJugadores);
    }
    // Sobrecarga 1: agregar un jugador
    public void agregarJugadores() {
        this.cantidadJugadores = cantidadJugadores + 1;
    }
    // Sobrecarga 2: agregar cantidad ingresada
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores = cantidadJugadores + cantidad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego v1 = new Videojuego("Planta vs zombie", "PlayStation", 2);
        Videojuego v2 = new Videojuego("Minecraft", "PC");

        v1.mostrar();
        v2.mostrar();

        // Usando sobrecarga de metodos
        v1.agregarJugadores(); // agrega 1 jugador
        v2.agregarJugadores(3); // agrega 3 jugadores

        System.out.println("\nDespues de agregar jugadores:");
        v1.mostrar();
        v2.mostrar();
    }

}
