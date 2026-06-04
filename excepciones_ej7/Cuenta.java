package excepciones_ej7;
public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double monto) throws DepositoInvalidoException {
        if (monto < 1) {
            throw new DepositoInvalidoException("El deposito debe ser mayor a 1 Bs.");
        }
        saldo = saldo + monto;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto + " Bs.");
        }
        saldo = saldo - monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta='" + numeroCuenta + "', saldo=" + saldo + "}";
    }
    
}
