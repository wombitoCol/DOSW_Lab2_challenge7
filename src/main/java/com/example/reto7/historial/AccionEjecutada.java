package com.example.reto7.historial;
import com.example.reto7.acciones.Comando;

public class AccionEjecutada {
    private Comando comando;
    private boolean deshecha;

    public AccionEjecutada(Comando comando) {
        this.comando = comando;
        this.deshecha = false;
    }

    public Comando getComando() {
        return comando;
    }

    public boolean isDeshecha() {
        return deshecha;
    }

    public void setDeshecha(boolean deshecha) {
        this.deshecha = deshecha;
    }
}