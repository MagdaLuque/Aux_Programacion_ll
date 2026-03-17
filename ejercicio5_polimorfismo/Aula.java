package ej5polimorfismo;
/**
 * @author Magdalena
 */
public class Aula {

    private String nombreAula;
    private int piso;
    private String[] estudiantes;
    private int[] notas;

    // Constructor
    public Aula(String nombreAula, int piso, String[] estudiantes, int[] notas) {
        this.nombreAula = nombreAula;
        this.piso = piso;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }

    // Metodo 1: mostrar todos los datos
    public void mostrar() {
        System.out.println("Aula: " + nombreAula + " , Piso: " + piso);
        System.out.println("Estudiantes y notas:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " - " + notas[i]);
        }
    }

    // Metodo 2: mostrar con aprobado/reprobado
    public void mostrar(boolean conEstado) {
        System.out.println("Aula: " + nombreAula + " , Piso: " + piso);
        System.out.println("Estudiantes y estado:");
        for (int i = 0; i < estudiantes.length; i++) {
            String estado = (notas[i] >= 70) ? "APROBADO" : "REPROBADO";
            System.out.println(estudiantes[i] + " - Nota: " + notas[i] + " -> " + estado);
        }
    }

    public static void main(String[] args) {
        String[] nombres = {"Luis", "Aracely"};
        int[] notas = {67, 89};

        Aula a1 = new Aula("Laboratorio 1", 2, nombres, notas);

        // Mostrar todos los datos
        a1.mostrar();

        System.out.println("\nCon estado de aprobacion:");
        a1.mostrar(true);
    }

}
