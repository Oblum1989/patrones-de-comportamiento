package strategy;

public class PagoPayPal implements EstrategiaPago {
    private String email;
    private String password;

    public PagoPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Conectando con servicios de PayPal...");
        System.out.println("Usuario: " + email);
        System.out.println("Autenticando...");
        System.out.println("Confirmando pago de $" + monto);

        // Simulación: la transacción tiene éxito si el monto es menor a 5000
        boolean exitoso = monto < 5000;
        System.out.println(exitoso ? "Pago con PayPal completado" : "Pago con PayPal rechazado: límite diario excedido");
        return exitoso;
    }
}
