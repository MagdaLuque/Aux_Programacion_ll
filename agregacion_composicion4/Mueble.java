package agregacion_composicion4;
public class Mueble {

    private String tipo;
    private String material;

    public Mueble(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMaterial() {
        return material;
    }
}
