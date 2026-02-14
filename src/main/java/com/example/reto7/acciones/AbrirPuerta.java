package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Puerta;

public class AbrirPuerta implements Comando {
    private Puerta puerta;
    private String usuario;

    public AbrirPuerta(Puerta puerta, String usuario) {
        this.puerta = puerta;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        puerta.abrir();
        System.out.println(usuario + " abrió la puerta");
    }

    @Override
    public void deshacer() {
        puerta.cerrar();
        System.out.println(usuario + " deshizo: cerrar puerta");
    }

    @Override
    public String getNombre() {
        return "Abrir puerta";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
