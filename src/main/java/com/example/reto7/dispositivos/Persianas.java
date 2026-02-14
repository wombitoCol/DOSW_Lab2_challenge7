package com.example.reto7.dispositivos;

public class Persianas {
    private int altura = 5; 

    public void subir() {
        if (altura < 10) altura++;
        System.out.println("Persianas subiendo: " + altura);
    }

    public void bajar() {
        if (altura > 0) altura--;
        System.out.println("Persianas bajando: " + altura);
    }

    public int getAltura() {
        return altura;
    }
}
