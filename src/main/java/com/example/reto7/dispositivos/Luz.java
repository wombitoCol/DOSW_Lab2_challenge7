package com.example.reto7.dispositivos;

public class Luz {
    private boolean encendida = false;

    public void encender() {
        encendida = true;
        System.out.println("Luz encendida");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Luz apagada");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
