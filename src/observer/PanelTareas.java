package observer;

public class PanelTareas implements ObservadorTarea {
    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("Panel de Tareas: Actualización de tarea " + tarea.getId() +
                " - " + tarea.getTitulo() + " (" + tarea.getEstado() + ")");
    }
}
