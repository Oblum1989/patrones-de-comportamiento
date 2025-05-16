package responsibility;

public class AprobadorJefeDepartamento extends AprobadorDocumento {
    private static final int NIVEL_AUTORIZACION = 3;

    public AprobadorJefeDepartamento(String nombre) {
        super(nombre);
    }

    @Override
    protected boolean puedeProcesar(Documento documento) {
        // El Jefe de Departamento puede aprobar documentos con importancia <= 3
        return documento.getImportancia() <= NIVEL_AUTORIZACION;
    }

    @Override
    protected boolean procesarDocumento(Documento documento) {
        System.out.println("Jefe de Departamento " + nombre + " ha APROBADO el documento: " + documento);

        // Lógica específica según el tipo de documento
        if (documento.getTipo() == TipoDocumento.SOLICITUD_COMPRA) {
            System.out.println("   * Se ha enviado la orden al departamento de compras");
        } else if (documento.getTipo() == TipoDocumento.INFORME_GASTOS) {
            System.out.println("   * Se ha enviado el informe a contabilidad");
        }

        return true;
    }
}