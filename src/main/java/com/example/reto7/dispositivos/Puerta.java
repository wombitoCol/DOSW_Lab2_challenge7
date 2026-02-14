package com.example.reto7.dispositivos;

public class Puerta {
    private boolean abierta = true;

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta cerrada");
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta");
    }
}
