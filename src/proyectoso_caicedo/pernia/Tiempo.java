/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luisp
 */
public class Tiempo extends Observable implements Runnable{
    
    int duraciondias;
    int dias;

    public Tiempo(int duraciondias) {
        this.duraciondias = duraciondias*1000;
        this.dias = 0;
    }

    @Override
    public void run() {
    while(true){
        try {
            Thread.sleep(duraciondias);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    dias++;
    this.setChanged();
    this.notifyObservers(dias);
    this.clearChanged();
    }   
    
    }
    
    
    
    }
    

