package observer;

import java.util.ArrayList;
import java.util.List;

public class TareaManager {
    private final List<ObservadorTarea> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorTarea observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
            System.out.println("Observador añadido: " + observador.getClass().getSimpleName());
        }
    }

    public void eliminarObservador(ObservadorTarea observador) {
        if (observador != null) {
            observadores.remove(observador);
            System.out.println("Observador eliminado: " + observador.getClass().getSimpleName());
        }
    }

    public void notificarCambios(Tarea tarea) {
        for (ObservadorTarea observador : observadores) {
            observador.actualizar(tarea);
        }
    }

    // Métodos para gestionar tareas
    public void crearTarea(Tarea tarea) {
        System.out.println("Tarea creada: " + tarea.getTitulo());
        notificarCambios(tarea);
    }

    public void actualizarTarea(Tarea tarea) {
        System.out.println("Tarea actualizada: " + tarea.getTitulo());
        notificarCambios(tarea);
    }

    public void completarTarea(Tarea tarea) {
        tarea.setEstado(EstadoTarea.COMPLETADA);
        System.out.println("Tarea completada: " + tarea.getTitulo());
        notificarCambios(tarea);
    }
}
