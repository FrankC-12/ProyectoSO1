/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;

import static java.lang.Thread.sleep;
import java.util.Observable;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frank Caicedo
 */
public class Artista extends Observable implements Runnable {
    int DuracionDia;
    int cantidadSSporDia;
    Drive Carpeta;
    Semaphore Semaforo;

    public Artista(int duraciondia,Semaphore Semaforo, Drive Carpeta, int cantidadSSporDia) {
        this.DuracionDia = duraciondia * 1000;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
        this.cantidadSSporDia = cantidadSSporDia;
    }

    @Override
    public void run() {
        try {
        while(true){
        sleep(DuracionDia);
        Semaforo.acquire();
        char artista = 'a';
        for (int i = 1; i <=cantidadSSporDia; i++) {
            Carpeta.InsertarArtistas(artista);
            
        }
        Semaforo.release();
        }
        } catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
