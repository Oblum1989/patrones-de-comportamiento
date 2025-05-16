package observer;

public class NotificacionEmail implements ObservadorTarea {
    @Override
    public void actualizar(Tarea tarea) {
        if (tarea.getEstado() == EstadoTarea.COMPLETADA) {
            System.out.println("Notificación Email: ¡La tarea " + tarea.getId() +
                    " - " + tarea.getTitulo() + " ha sido completada!");
        } else {
            System.out.println("Notificación Email: La tarea " + tarea.getId() +
                    " - " + tarea.getTitulo() + " ha sido actualizada. Estado: " + tarea.getEstado());
        }
    }
}
