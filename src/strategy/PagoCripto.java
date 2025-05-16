package strategy;

import java.util.HashMap;
import java.util.Map;

public class PagoCripto implements EstrategiaPago {
    private String direccionWallet;
    private String tipoCripto;

    public PagoCripto(String direccionWallet, String tipoCripto) {
        this.direccionWallet = direccionWallet;
        this.tipoCripto = tipoCripto;
    }

    @Override
    public boolean pagar(double monto) {
        System.out.println("Iniciando pago con criptomoneda " + tipoCripto + "...");
        System.out.println("Wallet destino: " + direccionWallet);
        System.out.println("Calculando tasa de conversión actual...");
        double tasaConversion = obtenerTasaConversion();
        double cantidadCripto = monto / tasaConversion;
        System.out.println("Monto a pagar: " + String.format("%.6f", cantidadCripto) + " " + tipoCripto);
        System.out.println("Enviando transacción a la blockchain...");

        // Simulación: la transacción tiene éxito siempre
        System.out.println("Pago con " + tipoCripto + " completado con éxito");
        return true;
    }

    private double obtenerTasaConversion() {
        // Simulación de tasas de conversión
        Map<String, Double> tasas = new HashMap<>();
        tasas.put("BTC", 50000.0);
        tasas.put("ETH", 3000.0);
        tasas.put("XRP", 1.2);

        return tasas.getOrDefault(tipoCripto, 1.0);
    }
}