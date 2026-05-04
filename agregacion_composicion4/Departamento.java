package agregacion_composicion4;
public class Departamento {

    private int nroPuerta;
    private int nroHab;
    private int nroPiso;
    private Habitacion[] habs = new Habitacion[100];
    private int cantHab = 0;

    public Departamento(int nroPuerta, int nroPiso) {
        this.nroPuerta = nroPuerta;
        this.nroPiso = nroPiso;
    }
    public void agregarHabitacion(Habitacion h) {
        habs[cantHab++] = h;
    }
    public int getNroPuerta() {
        return nroPuerta;
    }
    public int getNroPiso() {
        return nroPiso;
    }
    public int getCantHab() {
        return cantHab;
    }
    public Habitacion[] getHabitaciones() {
        return habs;
    }
}
