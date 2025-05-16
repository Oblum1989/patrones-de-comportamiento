package responsibility;

import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    private TipoDocumento tipo;
    private int importancia;  // Escala de 1-10, donde 10 es la máxima importancia
    private Date fechaCreacion;

    public Documento(String titulo, String contenido, TipoDocumento tipo, int importancia) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.tipo = tipo;
        this.importancia = importancia;
        this.fechaCreacion = new Date();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public int getImportancia() {
        return importancia;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "Documento '" + titulo + "' (Tipo: " + tipo + ", Importancia: " + importancia + ")";
    }
}
