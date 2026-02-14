package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Luz;

public class EncenderLuz implements Comando {
    private Luz luz;
    private String usuario;

    public EncenderLuz(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }

    @Override
    public void deshacer() {
        luz.apagar();
    }

    @Override
    public String getNombre() {
        return "Encender luz";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
