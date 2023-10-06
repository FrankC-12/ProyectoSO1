/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;

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
        this.DuracionDia = duraciondia;
        this.tipoEmpresa = tipoEmpresa;
        this.Semaforo = Semaforo;
        this.Carpeta = Carpeta;
    }

    @Override
    public void run() {
        try {
        Semaforo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Narrativa.class.getName()).log(Level.SEVERE, null, ex);
        }
        char guion = 'g';
        Carpeta.InsertarNarrativa(guion);
        Semaforo.release();
    }
    
    
    
    
    
    
}
