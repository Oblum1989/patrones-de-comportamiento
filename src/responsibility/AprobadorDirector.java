package responsibility;

public class AprobadorDirector extends AprobadorDocumento {
    private static final int NIVEL_AUTORIZACION = 7;

    public AprobadorDirector(String nombre) {
        super(nombre);
    }

    @Override
    protected boolean puedeProcesar(Documento documento) {
        // El Director puede aprobar documentos con importancia entre 4 y 7
        return documento.getImportancia() > 3 && documento.getImportancia() <= NIVEL_AUTORIZACION;
    }

    @Override
    protected boolean procesarDocumento(Documento documento) {
        System.out.println("Director " + nombre + " ha APROBADO el documento: " + documento);

        // Lógica específica según el tipo de documento
        if (documento.getTipo() == TipoDocumento.CONTRATO) {
            System.out.println("   * El contrato ha sido sellado y enviado al departamento legal");
        } else if (documento.getTipo() == TipoDocumento.DOCUMENTO_LEGAL) {
            System.out.println("   * El documento legal ha sido revisado y autorizado");
        }

        return true;
    }
}