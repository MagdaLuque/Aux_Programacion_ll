package agregacion_composicion5;
public class Main {
    public static void main(String[] args) {
        // Instanciar 2 centros veterinarios
        CentroVeterinario cv1 = new CentroVeterinario("Veterinaria Central");
        CentroVeterinario cv2 = new CentroVeterinario("Veterinaria Municipal");

        // Agregar al menos 2 perros y 2 gatos a cada centro
        cv1.agregarPerro(new Perro("Firulais", 5, "Pablo", true, true));
        cv1.agregarPerro(new Perro("Boby", 3, "Alan", false, true));
        cv1.agregarGato(new Gato("Michi", 2, "Pablo", true, true));
        cv1.agregarGato(new Gato("Puca", 4, "Alan", false, false));

        cv2.agregarPerro(new Perro("Toby", 6, "Jaime", true, false));
        cv2.agregarPerro(new Perro("Balto", 2, "Sofia", false, true));
        cv2.agregarGato(new Gato("Duqueza", 1, "Jaime", true, true));
        cv2.agregarGato(new Gato("Kity", 3, "Sofia", false, true));

        // b. Ordenar perros en cv1 y mostrarlos
        System.out.println("\n--- Perros ordenados en " + cv1.getNombre() + " ---");
        cv1.ordenarPerros();
        cv1.mostrarAnimales();

        // c. Ordenar gatos en cv2 y mostrarlos
        System.out.println("\n--- Gatos ordenados en " + cv2.getNombre() + " ---");
        cv2.ordenarGatos();
        cv2.mostrarAnimales();

        // d. Verificar dueños con mas de un animal en cv1
        System.out.println("\n--- Duenios con mas de un animal en " + cv1.getNombre() + " ---");
        cv1.verificarAnimalesPorDuenio();

        // d. Verificar dueños con mas de un animal en cv2
        System.out.println("\n--- Duenios con mas de un animal en " + cv2.getNombre() + " ---");
        cv2.verificarAnimalesPorDuenio();
    }
}