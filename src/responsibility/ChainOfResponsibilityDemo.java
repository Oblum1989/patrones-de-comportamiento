package responsibility;

public class ChainOfResponsibilityDemo {
    public static void ejecutar() {
        System.out.println("\n=== DEMOSTRACIÓN DEL PATRÓN CHAIN OF RESPONSIBILITY ===\n");

        // Crear los manejadores
        AprobadorJefeDepartamento jefeDepartamento = new AprobadorJefeDepartamento("Carlos Gómez");
        AprobadorDirector director = new AprobadorDirector("Ana Ramírez");
        AprobadorPresidente presidente = new AprobadorPresidente("Miguel Torres");

        // Configurar la cadena
        jefeDepartamento.setSiguiente(director);
        director.setSiguiente(presidente);

        // Documentos de prueba con diferentes niveles de importancia
        Documento solicitudCompra = new Documento(
                "Solicitud de compra de equipos informáticos",
                "Solicitud para adquirir 10 laptops para el departamento de desarrollo",
                TipoDocumento.SOLICITUD_COMPRA,
                2);

        Documento contratoProveedor = new Documento(
                "Contrato con proveedor de servicios Cloud",
                "Contrato anual para servicios de AWS por $50,000",
                TipoDocumento.CONTRATO,
                6);

        Documento fusionEmpresas = new Documento(
                "Acuerdo de fusión empresarial",
                "Documento legal para la fusión con la empresa XYZ Corp",
                TipoDocumento.DOCUMENTO_LEGAL,
                9);

        Documento casoLegal = new Documento(
                "Demanda judicial urgente",
                "Documento de respuesta a demanda por patentes",
                TipoDocumento.DOCUMENTO_LEGAL,
                10);

        // Probar la cadena con diferentes documentos
        System.out.println("--- Procesando Solicitud de Compra (Importancia 2) ---");
        jefeDepartamento.aprobar(solicitudCompra);

        System.out.println("\n--- Procesando Contrato de Proveedor (Importancia 6) ---");
        jefeDepartamento.aprobar(contratoProveedor);

        System.out.println("\n--- Procesando Acuerdo de Fusión (Importancia 9) ---");
        jefeDepartamento.aprobar(fusionEmpresas);

        System.out.println("\n--- Procesando Demanda Judicial (Importancia 10) ---");
        jefeDepartamento.aprobar(casoLegal);
    }
}