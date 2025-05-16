package responsibility;

public class AprobadorPresidente extends AprobadorDocumento {
    private static final int NIVEL_AUTORIZACION = 10;

    public AprobadorPresidente(String nombre) {
        super(nombre);
    }

    @Override
    protected boolean puedeProcesar(Documento documento) {
        // El Presidente puede aprobar documentos con importancia entre 8 y 10
        return documento.getImportancia() > 7 && documento.getImportancia() <= NIVEL_AUTORIZACION;
    }

    @Override
    protected boolean procesarDocumento(Documento documento) {
        // Para ciertos documentos muy importantes, podríamos agregar requisitos adicionales
        if (documento.getTipo() == TipoDocumento.DOCUMENTO_LEGAL && documento.getImportancia() == 10) {
            System.out.println("Presidente " + nombre + " requiere asesoría legal adicional para el documento: " + documento);
            System.out.println("   * Se ha programado una reunión con el departamento legal");
            System.out.println("   * El documento queda en revisión pendiente");
            return false;
        }

        System.out.println("Presidente " + nombre + " ha APROBADO el documento: " + documento);

        // Lógica específica según el tipo de documento
        if (documento.getTipo() == TipoDocumento.CONTRATO) {
            System.out.println("   * Se ha programado firma oficial del contrato");
        }

        return true;
    }
}