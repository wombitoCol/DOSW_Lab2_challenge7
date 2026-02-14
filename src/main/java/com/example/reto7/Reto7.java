package com.example.reto7;
import java.util.Scanner;

import com.example.reto7.acciones.AbrirPuerta;
import com.example.reto7.acciones.AjustarVolumen;
import com.example.reto7.acciones.Comando;
import com.example.reto7.acciones.EncenderLuz;
import com.example.reto7.acciones.ReproducirMusica;
import com.example.reto7.control.ControlRemoto;
import com.example.reto7.dispositivos.Luz;
import com.example.reto7.dispositivos.Musica;
import com.example.reto7.dispositivos.Puerta;

public class Reto7{
    
    private static Scanner scanner = new Scanner(System.in);
    private static ControlRemoto control = new ControlRemoto();
    
    private static Luz luz = new Luz();
    private static Puerta puerta = new Puerta();
    private static Musica musica = new Musica();

    public static void ejecutar() {
        System.out.println("CONTROL REMOTO MÁGICO\n");
        
        System.out.print("Número de acciones a registrar: ");
        int numAcciones = Integer.parseInt(scanner.nextLine());
        
        for (int i = 1; i <= numAcciones; i++) {
            System.out.println("\nAcción " + i + ":");
            procesarAccion();
        }
        
        System.out.println("\n" + "=".repeat(50));
        control.mostrarHistorial();
        control.mostrarResumenPorUsuario();
    }
    
    private static void procesarAccion() {
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.print("Seleccione: 1. Encender luz 2. Abrir puerta 3. Reproducir música 4. Ajustar volumen ");
        int opcion = Integer.parseInt(scanner.nextLine());
        
        Comando comando = null;
        
        switch (opcion) {
            case 1: 
                comando = new EncenderLuz(luz, usuario);
                break;
                
            case 2: 
                comando = new AbrirPuerta(puerta, usuario);
                break;
                
            case 3: 
                comando = new ReproducirMusica(musica, usuario);
                break;
                
            case 4:
                System.out.print("Ingrese valor (0-100): ");
                int valor = Integer.parseInt(scanner.nextLine());
                comando = new AjustarVolumen(musica, usuario, valor);
                break;
        }
        

        if (comando != null) {
            control.ejecutarComando(comando);
        }
        
        System.out.print("Deshacer acción? (si/no): ");
        String deshacer = scanner.nextLine();
        if (deshacer.equalsIgnoreCase("si")) {
            control.deshacer();
        }
    }
}
