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
 * @author Luisp
 */
public class Narrativa extends Observable implements Runnable {
    
    int DuracionDia;
    int tipoEmpresa;
    int DiasporGuion;
    Drive Carpeta;
    Semaphore Semaforo;

    public Narrativa(int duraciondia, Semaphore Semaforo, Drive Carpeta, int DiasporGuion) {
        this.DuracionDia = duraciondia * 1000;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
        this.DiasporGuion = DiasporGuion;
    }

    @Override
    public void run() {
        try{
        while(true){ 
            
            sleep(DuracionDia*DiasporGuion);    
            Semaforo.acquire();
            char guion = 'g';
            Carpeta.InsertarNarrativa(guion);
            Semaforo.release();
            }
        }catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}