package strategy;

public class PagoTransferencia implements EstrategiaPago {
    private String numeroCuenta;
    private String banco;
    private String titular;

    public PagoTransferencia(String numeroCuenta, String banco, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
        this.titular = titular;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Iniciando transferencia bancaria...");
        System.out.println("Banco: " + banco);
        System.out.println("Cuenta destino: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Monto a transferir: $" + monto);
        System.out.println("Generando comprobante de transferencia...");

        // Simulación: la transferencia toma tiempo en procesarse
        System.out.println("Transferencia iniciada. Se completará en 24-48 horas hábiles.");
        return true;
    }
}
