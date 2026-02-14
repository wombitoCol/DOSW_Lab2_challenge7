package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Persianas;

public class SubirPersiana implements Comando {
    private Persianas persianas;
    private String usuario;

    public SubirPersiana(Persianas persianas, String usuario) {
        this.persianas = persianas;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        persianas.subir();
    }

    @Override
    public void deshacer() {
        persianas.bajar();
    }

    @Override
    public String getNombre() {
        return "Subir persiana";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
