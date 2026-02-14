# DOSW_Lab2_challenge7
Codigo completo del reto 7 control magico laboratorio 2-3
# RETO #7: El control remoto Mágico

## Patrón de Diseño
- **Categoría:** Comportamiento
- **Patrón Utilizado:** Command

## Justificación
El patrón Command permite encapsular cada acción como un objeto, facilitando:
- Deshacer acciones fácilmente
- Registrar quién ejecutó cada acción
- Mantener un historial completo
- Agregar nuevas acciones sin modificar código existente

## Cómo lo aplico
1. **Interfaz `Comando`** con métodos `ejecutar()`, `deshacer()`, `getNombre()` y `getUsuario()`
2. **Comandos concretos:** `EncenderLuz`, `AbrirPuerta`, `ReproducirMusica`, `AjustarVolumen`
3. **Receptores:** Clases `Luz`, `Puerta`, `Musica` (dispositivos reales)
4. **Invocador:** `ControlRemoto` que ejecuta comandos y guarda historial
5. **Cliente:** Lee input del usuario y crea los comandos correspondientes

## Principios SOLID aplicados
- **S:** Cada clase tiene una única responsabilidad
- **O:** Podemos agregar nuevos comandos sin modificar clases existentes
- **L:** Todos los comandos implementan `Comando` y son intercambiables
- **I:** La interfaz `Comando` es específica y pequeña
- **D:** `ControlRemoto` depende de la abstracción `Comando`, no de implementaciones concretas

## Uso de Streams
```java
// Historial de acciones
todasLasAcciones.stream()
    .map(a -> "• " + a.getComando().getNombre() + " - " + a.getComando().getUsuario())
    .forEach(System.out::println);

// Resumen por usuario
todasLasAcciones.stream()
    .filter(a -> !a.isDeshecha())
    .collect(Collectors.groupingBy(a -> a.getComando().getUsuario(), Collectors.counting()))
    .forEach((user, count) -> System.out.println("• " + user + ": " + count + " acción(es)"));
