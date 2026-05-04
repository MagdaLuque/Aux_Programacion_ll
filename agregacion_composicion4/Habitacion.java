package agregacion_composicion4;
public class Habitacion {

    private String nombre;
    private double tamanio;
    private Mueble[] muebles = new Mueble[100];
    private int cantMuebles = 0;

    public Habitacion(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    public void agregarMueble(Mueble m) {
        if (cantMuebles < muebles.length) {
            muebles[cantMuebles++] = m;
        }
    }
    public int getCantMuebles() {
        return cantMuebles;
    }
    public String getNombre() {
        return nombre;
    }
}
