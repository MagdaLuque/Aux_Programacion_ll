package excepciones_ej7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cliente con cuentas
        Cuenta[] cuentas = {
            new Cuenta("123", 500),
            new Cuenta("456", 1000)
        };
        Cliente cliente = new Cliente("Juan Perez", "123456", cuentas);

        System.out.print("Ingrese numero de cuenta: ");
        String numCuenta = sc.nextLine();
        Cuenta cuenta = cliente.buscarCuenta(numCuenta);

        try {
            if (cuenta == null) {
                // Provocar NullPointerException
                throw new NullPointerException("La cuenta no existe.");
            }
            int opcion;
            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Salir");
                System.out.print("Elija opcion: ");

                try {
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Monto a depositar: ");
                            double dep = sc.nextDouble();
                            cuenta.depositar(dep);
                            System.out.println("Deposito exitoso. Saldo: " + cuenta.getSaldo());
                            break;
                        case 2:
                            System.out.print("Monto a retirar: ");
                            double ret = sc.nextDouble();
                            cuenta.retirar(ret);
                            System.out.println("Retiro exitoso. Saldo: " + cuenta.getSaldo());
                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Error.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debe ingresar numeros.");
                    sc.nextLine(); // limpiar buffer
                    opcion = 0;
                } catch (DepositoInvalidoException | SaldoInsuficienteException e) {
                    System.out.println("Error: " + e.getMessage());
                    opcion = 0;
                }
            } while (opcion != 3);

        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
