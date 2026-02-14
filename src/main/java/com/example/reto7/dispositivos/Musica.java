package com.example.reto7.dispositivos;

public class Musica {
    private int volumen = 50; // volumen inicial
    private boolean reproduciendo = false;

    public void subirVolumen() {
        if (volumen < 100) volumen++;
        System.out.println("Volumen: " + volumen);
    }

    public void bajarVolumen() {
        if (volumen > 0) volumen--;
        System.out.println("Volumen: " + volumen);
    }
    
    public void setVolumen(int nuevoVolumen) {
        if (nuevoVolumen >= 0 && nuevoVolumen <= 100) {
            this.volumen = nuevoVolumen;
        }
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    public void reproducir() {
        reproduciendo = true;
        System.out.println("Música reproduciéndose");
    }
    
    public void detener() {
        reproduciendo = false;
        System.out.println("Música detenida");
    }
    
    public boolean isReproduciendo() {
        return reproduciendo;
    }
}
