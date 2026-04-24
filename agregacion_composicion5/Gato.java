package agregacion_composicion5;
public class Gato extends Animal {

    private boolean cazaRatones;
    private boolean tomaLeche;

    // Constructor
    public Gato(String nombre, int edad, String nombreDuenio, boolean cazaRatones, boolean tomaLeche) {
        super(nombre, edad, nombreDuenio);
        this.cazaRatones = cazaRatones;
        this.tomaLeche = tomaLeche;
    }
    
    // Getters
    public boolean CazaRatones() {
        return cazaRatones;
    }

    public boolean TomaLeche() {
        return tomaLeche;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "cazaRatones=" + cazaRatones + ", tomaLeche=" + tomaLeche + '}';
    }

}
