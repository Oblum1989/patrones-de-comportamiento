package strategy;

public class ProcesadorPago {
    private EstrategiaPago estrategiaPago;

    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
        System.out.println("Método de pago configurado: " + estrategiaPago.getClass().getSimpleName());
    }

    public boolean procesarPago(double monto) {
        if (estrategiaPago == null) {
            System.out.println("Error: No se ha configurado un método de pago");
            return false;
        }

        System.out.println("Iniciando procesamiento de pago por $" + monto);
        return estrategiaPago.pagar(monto);
    }
}