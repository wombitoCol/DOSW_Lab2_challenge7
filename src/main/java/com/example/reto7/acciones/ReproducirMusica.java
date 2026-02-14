package com.example.reto7.acciones;
import com.example.reto7.dispositivos.Musica;

public class ReproducirMusica implements Comando {
    private Musica musica;
    private String usuario;
    private boolean estabaSonando;

    public ReproducirMusica(Musica musica, String usuario) {
        this.musica = musica;
        this.usuario = usuario;
    }

    @Override
    public void ejecutar() {
        estabaSonando = musica.isReproduciendo();
        musica.reproducir();
        System.out.println(usuario + " reprodujo música");
    }

    @Override
    public void deshacer() {
        if (!estabaSonando) {
            musica.detener();
            System.out.println(usuario + " deshizo: detener música");
        }
    }

    @Override
    public String getNombre() {
        return "Reproducir música";
    }

    @Override
    public String getUsuario() {
        return usuario;
    }
}
