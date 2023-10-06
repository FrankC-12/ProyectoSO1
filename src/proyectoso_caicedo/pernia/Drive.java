/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luisp
 */
public class Drive {
    
    char[] CarpetaNarrativa;
    int posicionNarrativa;
    char[] CarpetaNiveles;
    char[] CarpetaArtista;
    char[] CarpetaLogica;
    char[] CarpetaDLC;

    public Drive() {
        this.CarpetaNarrativa = new char[25] ;
        this.CarpetaNiveles = new char[20];
        this.CarpetaArtista = new char[55];
        this.CarpetaLogica = new char[35];
        this.CarpetaDLC = new char[10]; 
        this.posicionNarrativa = 0;
    }
    
    public void InsertarNarrativa(char g){
        if (posicionNarrativa==CarpetaNarrativa.length){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Drive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        CarpetaNarrativa[posicionNarrativa] = g;
        posicionNarrativa++;
    }
    
    
    
}
