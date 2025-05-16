package observer;

public class ObserverDemo {
    public static void ejecutar() {
        System.out.println("\n=== DEMOSTRACIÓN DEL PATRÓN OBSERVER ===\n");

        // Crear el gestor de tareas (Subject)
        TareaManager gestor = new TareaManager();

        // Crear observadores
        ObservadorTarea panelTareas = new PanelTareas();
        ObservadorTarea notificacionEmail = new NotificacionEmail();
        ObservadorTarea calendarioApp = new CalendarioApp();

        // Registrar observadores
        gestor.agregarObservador(panelTareas);
        gestor.agregarObservador(notificacionEmail);
        gestor.agregarObservador(calendarioApp);

        // Crear una tarea
        Tarea tarea1 = new Tarea(1, "Implementar patrón Observer",
                "Crear un ejemplo funcional del patrón Observer");
        gestor.crearTarea(tarea1);

        System.out.println("\n--- Actualizando tarea ---");
        tarea1.setEstado(EstadoTarea.EN_PROGRESO);
        gestor.actualizarTarea(tarea1);

        System.out.println("\n--- Eliminando un observador ---");
        gestor.eliminarObservador(calendarioApp);

        System.out.println("\n--- Completando tarea ---");
        gestor.completarTarea(tarea1);

        System.out.println("\n--- Creando nueva tarea con menos observadores ---");
        Tarea tarea2 = new Tarea(2, "Revisar documentación",
                "Revisar la documentación del proyecto");
        gestor.crearTarea(tarea2);
    }
}
