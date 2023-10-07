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
    Drive Carpeta;
    Semaphore Semaforo;

    public Narrativa(int duraciondia, int tipoEmpresa,Semaphore Semaforo, Drive Carpeta) {
        this.DuracionDia = duraciondia * 1000;
        this.tipoEmpresa = tipoEmpresa;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
    }

    @Override
    public void run() {
        while(true){
            try{
            if (tipoEmpresa == 0) {
                try {
                    sleep(DuracionDia * 4);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    sleep(DuracionDia * 2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Semaforo.acquire();
            }catch (InterruptedException ex) {Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
        }
        char guion = 'g';
        Carpeta.InsertarNarrativa(guion);
        Semaforo.release();
    }
        }
}
