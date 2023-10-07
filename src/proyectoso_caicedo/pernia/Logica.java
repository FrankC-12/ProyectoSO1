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
    int tipoEmpresa;
    Drive Carpeta;
    Semaphore Semaforo;

    public Logica(int duraciondia, int tipoEmpresa,Semaphore Semaforo, Drive Carpeta) {
        this.DuracionDia = duraciondia;
        this.tipoEmpresa = tipoEmpresa;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
    }

    @Override
    public void run() {
        //Capcom es 0
        while(true){
            if (tipoEmpresa == 0) {
            try {
                sleep(DuracionDia);
                Semaforo.acquire();
                char logica = 'l';
                for (int i = 1; i <=5; i++) {
                    Carpeta.InsertarLogicas(logica);
                }
                Semaforo.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                sleep(DuracionDia );
                Semaforo.acquire();
                char logica = 'l';
                for (int i = 1; i <=3; i++) {
                    Carpeta.InsertarLogicas(logica);
                }
                Semaforo.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        }
}
