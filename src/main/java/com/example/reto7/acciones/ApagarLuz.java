package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Luz;

public class ApagarLuz implements Comando {
    private Luz luz;
    private String usuario;

    public ApagarLuz(Luz luz, String usuario) {
        this.luz = luz;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }

    @Override
    public void deshacer() {
        luz.encender();
    }

    @Override
    public String getNombre() {
        return "Apagar luz";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
