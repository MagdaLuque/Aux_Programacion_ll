package herencia_ejercicio3;
//clase padre
public class Persona{
    protected String nombre;
    protected int carnet;
    protected int edad;

    public Persona(String nombre, int carnet, int edad) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", carnet=" + carnet + ", edad=" + edad + '}';
    }   
}
//clase Estudiante
class Estudiante extends Persona{
    private int matricula;
    private String carrera;

    public Estudiante(String nombre, int carnet, int edad,int matricula, String carrera) {
        super(nombre,carnet,edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    public String getCarrera(){
        return carrera;
    }
    @Override
    public String toString() {
        return super.toString()+ "Estudiante{" + "matricula=" + matricula + ", carrera=" + carrera + '}';
    }  
}
//clase Docente
class Docente extends Persona{
    private int antiguedad;
    private double sueldo;

    public Docente(String nombre, int carnet, int edad,int antiguedad, double sueldo) {
        super(nombre,carnet,edad);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return super.toString()+"Docente{" + "antiguedad=" + antiguedad + ", sueldo=" + sueldo + '}';
    }
}
//
class Main {
    // Método para verificar si dos estudiantes están en la misma carrera
    public static boolean mismaCarrera(Estudiante e1, Estudiante e2) {
        return e1.getCarrera().equalsIgnoreCase(e2.getCarrera());
    }
    public static void main(String[] args) {
        // b) instanciar dos estudiantes y un docente
        Estudiante e1 = new Estudiante("Alan", 12344, 21, 1878396, "Informatica");
        Estudiante e2 = new Estudiante("Hever", 24680, 27, 192450, "Estadistica");
        Docente d1 = new Docente("Pablo", 78945, 27, 3, 3000);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(d1);
        
        // c. Verificar si algún estudiante tiene la misma edad que el docente
        if (e1.getEdad() == d1.getEdad()) {
            System.out.println("El estudiante " + e1.nombre + " tiene la misma edad que el docente.");
        }
        if (e2.getEdad() == d1.getEdad()) {
            System.out.println("\nEl estudiante " + e2.nombre + " tiene la misma edad que el docente.\n");
        }

        // d. Verificar si dos estudiantes estan en la misma carrera
        if (mismaCarrera(e1, e2)) {
            System.out.println("Los estudiantes estan en la misma carrera.");
        } else {
            System.out.println("Los estudiantes estan en carreras diferentes.");
        }
    }
}
