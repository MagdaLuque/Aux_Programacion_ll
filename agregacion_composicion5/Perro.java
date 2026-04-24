package agregacion_composicion5;
public class Perro extends Animal{
    private boolean requiereBosal;
    private boolean ladraFuerte;

    // Constructor
    public Perro(String nombre, int edad, String nombreDueño, boolean requiereBosal, boolean ladraFuerte) {
        super(nombre, edad, nombreDueño);
        this.requiereBosal = requiereBosal;
        this.ladraFuerte = ladraFuerte;
    }
    // Getters
    public boolean RequiereBosal() { 
        return requiereBosal; 
    }
    public boolean LadraFuerte() { 
        return ladraFuerte; 
    }
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "requiereBosal=" + requiereBosal + ", ladraFuerte=" + ladraFuerte + '}';
    }
    
}
