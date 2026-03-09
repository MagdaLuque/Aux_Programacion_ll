package Ejercicio2;
/**
 * @author Magdalena
 */
public class Televisor {
    private String marca;
    private int resolucion;
    private String tipo;  //oled, ips, etc

    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }
    public Televisor() {
    }
    @Override
    public String toString() {
        return "Instrumento{" + "marca=" + marca + 
                ", resolucion=" + resolucion + 
                ", tipo=" + tipo + '}';
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getResolucion() {
        return resolucion;
    }
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
