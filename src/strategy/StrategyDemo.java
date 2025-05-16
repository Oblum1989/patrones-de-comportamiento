package strategy;

import java.time.LocalDate;

public class StrategyDemo {
    public static void ejecutar() {
        System.out.println("\n=== DEMOSTRACIÓN DEL PATRÓN STRATEGY ===\n");

        // Crear el procesador de pagos (Context)
        ProcesadorPago procesador = new ProcesadorPago();

        // Escenario 1: Pago con tarjeta
        System.out.println("\n--- Escenario 1: Pago con tarjeta ---");
        procesador.setEstrategiaPago(
                new PagoTarjeta("1234567890123456", "Juan Pérez",
                        LocalDate.of(2027, 5, 30), "123")
        );
        procesador.procesarPago(1500.0);

        // Escenario 2: Pago con PayPal
        System.out.println("\n--- Escenario 2: Pago con PayPal ---");
        procesador.setEstrategiaPago(
                new PagoPayPal("juan.perez@example.com", "contraseña123")
        );
        procesador.procesarPago(2800.0);

        // Escenario 3: Pago con criptomoneda
        System.out.println("\n--- Escenario 3: Pago con criptomoneda ---");
        procesador.setEstrategiaPago(
                new PagoCripto("0x742d35Cc6634C0532925a3b844Bc454e4438f44e", "ETH")
        );
        procesador.procesarPago(450.0);

        // Escenario 4: Pago por transferencia bancaria
        System.out.println("\n--- Escenario 4: Pago por transferencia ---");
        procesador.setEstrategiaPago(
                new PagoTransferencia("ES12 3456 7890 1234 5678", "Banco Nacional", "Juan Pérez")
        );
        procesador.procesarPago(3200.0);

        // Escenario 5: Intento de pago con tarjeta que excede límite
        System.out.println("\n--- Escenario 5: Pago con tarjeta que excede límite ---");
        procesador.setEstrategiaPago(
                new PagoTarjeta("9876543210987654", "Juan Pérez",
                        LocalDate.of(2026, 8, 15), "456")
        );
        procesador.procesarPago(12000.0);
    }
}
