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
public class Logica extends Observable implements Runnable {
    
    int DuracionDia;
    Drive Carpeta;
    Semaphore Semaforo;
    int cantidadSporDia;

    public Logica(int duraciondia,Semaphore Semaforo, Drive Carpeta, int cantidadSporDia) {
        this.DuracionDia = duraciondia * 1000;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
        this.cantidadSporDia = cantidadSporDia;
    }

    @Override
    public void run() {
        try {
        while(true){
        sleep(DuracionDia);
        Semaforo.acquire();
        char sistemas = 's';
        for (int i = 1; i <=cantidadSporDia; i++) {
            Carpeta.InsertarLogicas(sistemas);
        }
        Semaforo.release();
        }
        } catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
