package strategy;

import java.time.LocalDate;

public class PagoTarjeta implements EstrategiaPago {
    private String numeroTarjeta;
    private String titular;
    private LocalDate fechaExpiracion;
    private String cvv;

    public PagoTarjeta(String numeroTarjeta, String titular, LocalDate fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito/débito...");
        System.out.println("Validando información de tarjeta: " + oscurecerNumeroTarjeta());
        System.out.println("Titular: " + titular);
        System.out.println("Verificando fondos suficientes...");
        System.out.println("Autorizando transacción de $" + monto);

        // Simulación: la transacción tiene éxito si el monto es menor a 10000
        boolean exitoso = monto < 10000;
        System.out.println(exitoso ? "Pago con tarjeta aprobado" : "Pago con tarjeta rechazado: fondos insuficientes");
        return exitoso;
    }

    private String oscurecerNumeroTarjeta() {
        if (numeroTarjeta.length() < 4) return "****";
        return "****-****-****-" + numeroTarjeta.substring(numeroTarjeta.length() - 4);
    }
}