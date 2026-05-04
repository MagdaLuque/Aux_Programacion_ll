package agregacion_composicion4;

public class Parqueo {

    private int capacidad;
    private int cantAuto = 0;
    private String[] placas;
    private double precioH;

    public Parqueo(int capacidad, double precioH) {
        this.capacidad = capacidad;
        this.precioH = precioH;
        this.placas = new String[capacidad];
    }

    public void agregarAuto(String placa) {
        if (cantAuto < capacidad) {
            placas[cantAuto++] = placa;
            System.out.println("Auto " + placa + " agregado al parqueo.");
        } else {
            System.out.println("No hay capacidad disponible en el parqueo.");
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantAuto() {
        return cantAuto;
    }

    public double getPrecioH() {
        return precioH;
    }

    public String[] getPlacas() {
        return placas;
    }
}
