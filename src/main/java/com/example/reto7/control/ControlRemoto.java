package com.example.reto7.control;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.example.reto7.acciones.Comando;
import com.example.reto7.historial.AccionEjecutada;

public class ControlRemoto {
    private Stack<AccionEjecutada> historial = new Stack<>();
    private List<AccionEjecutada> todasLasAcciones = new ArrayList<>();

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        AccionEjecutada accion = new AccionEjecutada(comando);
        historial.push(accion);
        todasLasAcciones.add(accion);
    }

    public void deshacer() {
        if (!historial.isEmpty()) {
            AccionEjecutada ultima = historial.pop();
            ultima.getComando().deshacer();
            ultima.setDeshecha(true);
        } else {
            System.out.println("No hay acciones para deshacer");
        }
    }

    public void mostrarHistorial() {
        System.out.println("\nHISTORIAL COMPLETO:");
        todasLasAcciones.stream()
                .map(accion -> {
                    String estado = accion.isDeshecha() ? " (DESHECHA)" : "";
                    return "• " + accion.getComando().getNombre() +
                            " - Usuario: " + accion.getComando().getUsuario() + estado;
                })
                .forEach(System.out::println);
    }

    public void mostrarResumenPorUsuario() {
        System.out.println("\nRESUMEN POR USUARIO:");
        todasLasAcciones.stream()
                .filter(a -> !a.isDeshecha())
                .map(a -> a.getComando().getUsuario())
                .distinct()
                .forEach(usuario -> {
                    long count = todasLasAcciones.stream()
                            .filter(a -> !a.isDeshecha() && a.getComando().getUsuario().equals(usuario))
                            .count();
                    System.out.println("• " + usuario + ": " + count + " acción(es)");
                });
    }
}
