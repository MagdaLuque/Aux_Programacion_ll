package agregacion_composicion5;
import java.util.Arrays;
import java.util.Comparator;

public class CentroVeterinario {

    private String nombre;
    private int cantPerros;
    private Perro[] perros;
    private int cantGatos;
    private Gato[] gatos;

    // Constructor
    public CentroVeterinario(String nombre) {
        this.nombre = nombre;
        this.perros = new Perro[100];
        this.gatos = new Gato[100];
        this.cantPerros = 0;
        this.cantGatos = 0;
    }
    // Métodos para agregar animales
    public void agregarPerro(Perro perro) {
        if (cantPerros < perros.length) {
            perros[cantPerros++] = perro;
        }
    }
    public void agregarGato(Gato gato) {
        if (cantGatos < gatos.length) {
            gatos[cantGatos++] = gato;
        }
    }
    public void mostrarAnimales() {
        System.out.println("\nAnimales en " + nombre + ":\n");

        for (int i = 0; i < cantPerros; i++) {
            System.out.println(perros[i]); //invocando a toestring
        }
        for (int i = 0; i < cantGatos; i++) {
            System.out.println(gatos[i]);
        }
    }

    // b. Ordenar perros
    public void ordenarPerros() {
        Arrays.sort(perros, 0, cantPerros, new Comparator<Perro>() {
            @Override
            public int compare(Perro p1, Perro p2) {
                int cmp = Integer.compare(p1.getEdad(), p2.getEdad());
                if (cmp != 0) {
                    return cmp;
                }
                cmp = p1.getNombreDuenio().compareToIgnoreCase(p2.getNombreDuenio());
                if (cmp != 0) {
                    return cmp;
                }
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });
    }
    // c. Ordenar gatos
    public void ordenarGatos() {
        Arrays.sort(gatos, 0, cantGatos, new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                if (g1.TomaLeche() && !g2.TomaLeche()) {
                    return -1;
                }
                if (!g1.TomaLeche() && g2.TomaLeche()) {
                    return 1;
                }
                int cmp = Integer.compare(g2.getEdad(), g1.getEdad()); // descendente
                if (cmp != 0) {
                    return cmp;
                }
                return g1.getNombre().compareToIgnoreCase(g2.getNombre());
            }
        });
    }
    // d. Verificar animales por dueño (versión sin HashMap)
    public void verificarAnimalesPorDuenio() {
        for (int i = 0; i < cantPerros; i++) {
            String duenio = perros[i].getNombreDuenio();
            int contador = 0;

            for (int j = 0; j < cantPerros; j++) {
                if (perros[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }
            for (int j = 0; j < cantGatos; j++) {
                if (gatos[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }
            if (contador > 1) {
                System.out.println("El duenio " + duenio + " tiene " + contador + " animales.");
            }
        }
        for (int i = 0; i < cantGatos; i++) {
            String duenio = gatos[i].getNombreDuenio();
            int contador = 0;

            for (int j = 0; j < cantPerros; j++) {
                if (perros[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }
            for (int j = 0; j < cantGatos; j++) {
                if (gatos[j].getNombreDuenio().equalsIgnoreCase(duenio)) {
                    contador++;
                }
            }
            if (contador > 1) {
                System.out.println("El duenio " + duenio + " tiene " + contador + " animales.");
            }
        }
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getCantPerros() {
        return cantPerros;
    }
    public int getCantGatos() {
        return cantGatos;
    }
}
