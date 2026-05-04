package agregacion_composicion4;

public class Main {

    // Funcion auxiliar para inciso f
    static boolean primo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // a. Instanciar un objeto Edificio y añadir un Parqueo
        Edificio e1 = new Edificio("Edificio LaTorre", 5000);
        Parqueo p1 = new Parqueo(2,10);
        e1.setParqueo(p1);

        // Crear departamentos
        Departamento d1 = new Departamento(101, 1);
        Departamento d2 = new Departamento(102, 1);
        e1.agregarDepartamento(d1);
        e1.agregarDepartamento(d2);

        // Agregar habitaciones
        d1.agregarHabitacion(new Habitacion("Sala", 20));
        d1.agregarHabitacion(new Habitacion("Dormitorio", 15));
        d2.agregarHabitacion(new Habitacion("Dormitorio", 18));

        // c. Agregar un mueble al departamento con puerta 101 del piso 1
        if (d1.getNroPuerta() == 101 && d1.getNroPiso() == 1) {
            d1.getHabitaciones()[0].agregarMueble(new Mueble("Silla", "Madera"));
        }

        // b. Mostrar al departamento que tenga mas habitaciones del piso Y
        int pisoY = 1;
        Departamento depMaxHab = null;
        for (Departamento d : e1.getDepartamentos()) {
            if (d != null && d.getNroPiso() == pisoY) {
                if (depMaxHab == null || d.getCantHab() > depMaxHab.getCantHab()) {
                    depMaxHab = d;
                }
            }
        }
        if (depMaxHab != null) {
            System.out.println("Departamento con mas habitaciones en piso " + pisoY + ": Puerta " + depMaxHab.getNroPuerta());
        }

        // d. Mostrar al departamento que tenga mas muebles (si hay varios, mostrar todos)
        int maxMuebles = 0;
        for (Departamento d : e1.getDepartamentos()) {
            if (d != null) {
                int totalMuebles = 0;
                for (Habitacion h : d.getHabitaciones()) {
                    if (h != null) totalMuebles += h.getCantMuebles();
                }
                if (totalMuebles > maxMuebles) maxMuebles = totalMuebles;
            }
        }
        for (Departamento d : e1.getDepartamentos()) {
            if (d != null) {
                int totalMuebles = 0;
                for (Habitacion h : d.getHabitaciones()) {
                    if (h != null) totalMuebles += h.getCantMuebles();
                }
                if (totalMuebles == maxMuebles) {
                    System.out.println("Departamento con mas muebles: Puerta " + d.getNroPuerta());
                }
            }
        }

        // e. Mostrar el nombre de la habitación con más muebles del piso Z
        int pisoZ = 1;
        Habitacion habMax = null;
        for (Departamento d : e1.getDepartamentos()) {
            if (d != null && d.getNroPiso() == pisoZ) {
                for (Habitacion h : d.getHabitaciones()) {
                    if (h != null) {
                        if (habMax == null || h.getCantMuebles() > habMax.getCantMuebles()) {
                            habMax = h;
                        }
                    }
                }
            }
        }
        if (habMax != null) {
            System.out.println("Habitacion con mas muebles en piso " + pisoZ + ": " + habMax.getNombre());
        }

        // f. Eliminar los departamentos que tengan una cantidad prima de habitaciones
        for (int i = 0; i < e1.getDepartamentos().length; i++) {
            Departamento d = e1.getDepartamentos()[i];
            if (d != null && primo(d.getCantHab())) {
                e1.getDepartamentos()[i] = null;
                System.out.println("Departamento puerta " + d.getNroPuerta() + " eliminado (cantidad prima de habitaciones).");
            }
        }

        // g. Agregar autos al parqueo (validando capacidad)
        e1.getParqueo().agregarAuto("123ABC");
        e1.getParqueo().agregarAuto("456DEF");
        e1.getParqueo().agregarAuto("789GHI"); //
    }
}
