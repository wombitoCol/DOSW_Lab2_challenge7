package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Puerta;

public class CerrarPuerta implements Comando {
    private Puerta puerta;
    private String usuario;

    public CerrarPuerta(Puerta puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        puerta.cerrar();
        System.out.println(usuario + " cerró la puerta");
    }

    @Override
    public void deshacer() {
        puerta.abrir();
        System.out.println(usuario + " deshizo: abrir puerta");
    }

    @Override
    public String getNombre() {
        return "Cerrar puerta";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
