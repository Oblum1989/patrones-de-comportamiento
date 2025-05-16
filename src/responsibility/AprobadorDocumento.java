package responsibility;

public abstract class AprobadorDocumento {
    protected AprobadorDocumento siguiente;
    protected String nombre;

    public AprobadorDocumento(String nombre) {
        this.nombre = nombre;
    }

    public void setSiguiente(AprobadorDocumento siguiente) {
        this.siguiente = siguiente;
    }

    // Método principal que maneja la solicitud o la pasa al siguiente
    public boolean aprobar(Documento documento) {
        // Si este aprobador puede manejar la solicitud, lo hace
        if (puedeProcesar(documento)) {
            return procesarDocumento(documento);
        }
        // Si hay un siguiente aprobador en la cadena, le pasa la solicitud
        else if (siguiente != null) {
            System.out.println(nombre + " no puede aprobar este documento. Pasando al siguiente nivel.");
            return siguiente.aprobar(documento);
        }
        // Si no hay siguiente y no se puede manejar, la solicitud es rechazada
        else {
            System.out.println("El documento no puede ser aprobado por ningún nivel: " + documento);
            return false;
        }
    }

    // Método para determinar si este aprobador puede procesar el documento
    protected abstract boolean puedeProcesar(Documento documento);

    // Método para procesar efectivamente el documento
    protected abstract boolean procesarDocumento(Documento documento);
}
