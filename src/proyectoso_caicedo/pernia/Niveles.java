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
public class Niveles extends Observable implements Runnable {
    
    int DuracionDia;
    Drive Carpeta;
    int DiasporNivel;
    Semaphore Semaforo;

    public Niveles(int duraciondia,Semaphore Semaforo, Drive Carpeta, int DiasporNivel) {
        this.DuracionDia = duraciondia * 1000;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
        this.DiasporNivel = DiasporNivel;
    }

    @Override
    public void run() {
        try{
        while(true){ 
            sleep(DuracionDia*DiasporNivel);    
            Semaforo.acquire();
            char nivel = 'n';
            Carpeta.InsertarNiveles(nivel);
            Semaforo.release();
            }
        }catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    
}
