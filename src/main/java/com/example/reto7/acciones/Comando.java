package com.example.reto7.acciones;

public interface Comando {
    void ejecutar();
    void deshacer();
    String getNombre();
    String getUsuario();
}

