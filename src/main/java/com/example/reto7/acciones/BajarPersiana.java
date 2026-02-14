package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Persianas;


public class BajarPersiana implements Comando {
    private Persianas persianas;
    private String usuario;

    public BajarPersiana(Persianas persianas, String usuario) {
        this.persianas = persianas;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        persianas.bajar();
        System.out.println(usuario + " bajó las persianas");
    }

    @Override
    public void deshacer() {
        persianas.subir();
        System.out.println(usuario + " deshizo: subir persianas");
    }

    @Override
    public String getNombre() {
        return "Bajar persiana";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
