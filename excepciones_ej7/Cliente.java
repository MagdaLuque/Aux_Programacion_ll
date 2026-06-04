
package excepciones_ej7;
public class Cliente {
    private String nombre;
    private String ci;
    private Cuenta[] cuentas;

    public Cliente(String nombre, String ci, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.ci = ci;
        this.cuentas = cuentas;
    }

    public Cuenta buscarCuenta(String numero) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getNumeroCuenta().equals(numero)) {
                return cuentas[i];
            }
        }
        return null;
    }
}
