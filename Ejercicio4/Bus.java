package Ejercicio4;

/**
 * @author Magdalena
 */
public class Bus {

    private int capacidad;
    private int pasajeros;
    private double caja;

    // Constructor
    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.caja = 0.0;
    }

    // a) Metodo para subir pasajeros
    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros = pasajeros + cantidad;
            System.out.println(cantidad + " pasajeros subieron al bus.");
        } else {
            int disponibles = capacidad - pasajeros;
            pasajeros = capacidad;
            System.out.println("Solo pudieron subir " + disponibles + " pasajeros. El bus esta lleno.");
        }
    }

    // b) Metodo para cobrar pasaje
    public void cobrarPasaje() {
        double costo = 1.50;
        caja = caja + pasajeros * costo;
        System.out.println("Se cobro Bs. " + (pasajeros * costo) + " en total.");
    }

    // c) Metodo para mostrar asientos disponibles
    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    // d) Mostrar estado del bus
    public void mostrarEstado() {
        System.out.println("Pasajeros actuales: " + pasajeros);
        System.out.println("Asientos disponibles: " + asientosDisponibles());
        System.out.println("Caja acumulada: Bs. " + caja);
    }

// Clase principal para probar
    public static void main(String[] args) {
        Bus miBus = new Bus(40); // capacidad de 40 asientos

        miBus.subirPasajeros(25);   // suben 25 pasajeros
        miBus.cobrarPasaje();       // se cobra pasaje
        miBus.mostrarEstado();      // muestra estado del bus

        miBus.subirPasajeros(20);   // intentan subir 20 más
        miBus.cobrarPasaje();       // se cobra pasaje
        miBus.mostrarEstado();      // muestra estado final
    }
}
