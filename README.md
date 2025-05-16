# Patrones Estructurales: Taller 2

Este proyecto implementa soluciones a tres problemas comunes en aplicaciones empresariales, utilizando patrones de diseño para promover bajo acoplamiento, extensibilidad y mantenibilidad.

## Problema 1: Sistema de Notificaciones

**Descripción:**  
La aplicación debe notificar a varios módulos (panel de tareas, calendario, notificaciones, emails) cuando cambian las tareas del usuario, evitando acoplamiento fuerte entre componentes.

**Solución:**  
Se utiliza el **Patrón Observer**, que permite que múltiples módulos (Observers) se suscriban a los cambios de un objeto central (Subject), recibiendo notificaciones automáticamente. Esto facilita agregar nuevos tipos de notificaciones sin modificar el núcleo de la aplicación.

---

## Problema 2: Procesamiento de Pagos

**Descripción:**  
La plataforma de comercio electrónico requiere soportar múltiples métodos de pago, cada uno con su propio algoritmo, dificultando el mantenimiento al crecer el sistema.

**Solución:**  
Se aplica el **Patrón Strategy**, encapsulando cada método de pago en una clase separada con una interfaz común. Esto permite intercambiar algoritmos de pago dinámicamente y agregar nuevos métodos sin modificar el código existente.

---

## Problema 3: Flujo de Aprobación de Documentos

**Descripción:**  
El sistema de gestión documental necesita manejar diferentes niveles de aprobación según el tipo de documento, siguiendo una jerarquía compleja.

**Solución:**  
Se implementa el **Patrón Chain of Responsibility**, donde cada nivel de aprobación es un eslabón en una cadena. Los documentos pasan por la cadena hasta ser aprobados, permitiendo modificar la jerarquía sin afectar la lógica del cliente.

---

Cada solución demuestra cómo los patrones de diseño estructurales ayudan a construir sistemas flexibles y escalables.
