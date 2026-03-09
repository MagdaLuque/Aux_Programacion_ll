package Ejercicio5;
/**
 * @author Magdalena
 */
public class Minecraft {
    /*private String dificultad;
    private String nombre;
    ArrayList<String> jugadores= new ArrayList();
    ArrayList<String> diamantes= new ArrayList();

    public Minecraft(String dificultad, String nombre) {
        this.dificultad = dificultad;
        this.nombre = nombre;
    }
    
    public void agregarJugador(String x){
        this.jugadores.add(x);
    }
    public void eliminar(String x){
        this.jugadores.remove(x);
    }
*/
    private String[] jugadores;
    private int[] diamantes;
    private int cantJugadores;

    public Minecraft() {
        this.jugadores = new String[10];
        this.diamantes = new int[10];
        this.cantJugadores = 0;
    }
    //a)Agregar un nuevo jugador al servidor
    public void nuevoJugador(String nom, int diamantes){
        if (this.cantJugadores >= 10) {
            System.out.println("Servidor lleno");
        } else {
            this.jugadores[cantJugadores] = nom;
            this.diamantes[cantJugadores] = diamantes;
            cantJugadores++;
            System.out.println("Se ha agregado al jugador ");
        }
        
    }
    //b)verifica stacks que tiene cada jugadoren el servidor
    public void nroStacks(){
        for (int i = 0; i < cantJugadores-1; i++) {
            int total = diamantes[i];
            int stack = total/64;
            int resto = total%64;
            System.out.println("El jugador "+jugadores[i]+" tiene "+stack+" stacks "+resto+" diamantes");
        }
    }
    //c)mostrar nomnre del jugador que tiene mas diamantes en el servidor
    public void mayorNroDiamantes(){
        int may=diamantes[0];
        int pos=0;
        for (int i = 1; i < cantJugadores; i++) {
            if (diamantes[i] > may) {
                may = diamantes[i];
                pos=i;
            }
        }
        System.out.println("El jugador con mas diamantes es "+jugadores[pos]+" con "+may+" diamantes");
    }
    //d)Mostrar el total de diamantes entre todos los jugadores
    public void totalDiamantes(){
        int total = 0;
        for (int i = 0; i < cantJugadores; i++) {
            total=total+diamantes[i];
        }
        System.out.println("Total de diamantes "+total);
    }//
   
    // --------------------------------------------------------------------------
    public static void main(String[] args) {
        Minecraft s1 = new Minecraft();
        s1.nuevoJugador("Alan", 65);
        s1.nuevoJugador("Maya", 120);
        s1.nroStacks();
        s1.mayorNroDiamantes();
        s1.totalDiamantes();

    }
}
