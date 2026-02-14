package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Musica;

public class AjustarVolumen implements Comando {
    private Musica musica;
    private String usuario;
    private int nuevoVolumen;
    private int volumenAnterior;

    public AjustarVolumen(Musica musica, String usuario, int nuevoVolumen) {
        this.musica = musica;
        this.usuario = usuario;
        this.nuevoVolumen = nuevoVolumen;
    }

    @Override
    public void ejecutar() {
        volumenAnterior = musica.getVolumen();
        musica.setVolumen(nuevoVolumen);
        System.out.println(usuario + " ajustó volumen a " + nuevoVolumen);
    }

    @Override
    public void deshacer() {
        musica.setVolumen(volumenAnterior);
        System.out.println(usuario + " deshizo: volumen a " + volumenAnterior);
    }

    @Override
    public String getNombre() {
        return "Ajustar volumen a " + nuevoVolumen;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
