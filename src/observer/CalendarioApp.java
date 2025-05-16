package observer;

public class CalendarioApp implements ObservadorTarea {
    @Override
    public void actualizar(Tarea tarea) {
        if (tarea.getEstado() == EstadoTarea.COMPLETADA) {
            System.out.println("Calendario: Evento de tarea " + tarea.getId() +
                    " - " + tarea.getTitulo() + " marcado como completado en el calendario");
        } else if (tarea.getEstado() == EstadoTarea.PENDIENTE) {
            System.out.println("Calendario: Nueva tarea " + tarea.getId() +
                    " - " + tarea.getTitulo() + " agregada al calendario");
        }
    }
}
