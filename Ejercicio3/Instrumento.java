package Ejercicio3;
/**
 * @author Magdalena
 */
public class Instrumento {
    public String nombre;
    private String material;
    private String tipo; // cuerda, aire

    public Instrumento(String nombre, String material, String tipo) {
        this.nombre = nombre;
        this.material = material;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" + 
                "nombre=" + nombre + ", "
                + "material=" + material + 
                ", tipo=" + tipo + '}';
    }
    //
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
