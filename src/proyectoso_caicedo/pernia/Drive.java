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
    
    char[] CarpetaNarrativaC;
    int posicionNarrativaC;
    int posicionNivelesC;
    int posicionArtistaC;
    int posicionLogicaC;
    int posicionDLCC;
    
    char[] CarpetaNarrativaB;
    int posicionNarrativaB;
    int posicionNivelesB;
    int posicionArtistaB;
    int posicionLogicaB;
    int posicionDLCB;
    
    char[] CarpetaNivelesC;
    char[] CarpetaArtistaC;
    char[] CarpetaLogicaC;
    char[] CarpetaDLCC;
    
    char[] CarpetaNivelesB;
    char[] CarpetaArtistaB;
    char[] CarpetaLogicaB;
    char[] CarpetaDLCB;

    public Drive() {
        this.CarpetaNarrativaC = new char[25] ;
        this.CarpetaNarrativaB = new char[25] ;

        this.CarpetaNiveles = new char[20];
        this.CarpetaArtista = new char[55];
        this.CarpetaLogica = new char[35];
        this.CarpetaDLC = new char[10]; 
        this.posicionNarrativa = 0;
        this.posicionNiveles = 0;
        this.posicionArtista = 0;
        this.posicionLogica = 0;


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
    
    public void InsertarNiveles(char g){
        if (posicionNiveles==CarpetaNiveles.length){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Drive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        CarpetaNarrativa[posicionNarrativa] = g;
        posicionNarrativa++;
    }
    
    public void InsertarArtistas(char g){
        if (posicionNiveles==CarpetaNiveles.length){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Drive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        CarpetaNarrativa[posicionNarrativa] = g;
        posicionNarrativa++;
    }
    
    public void InsertarLogicas(char g){
        if (posicionLogica==CarpetaLogica.length){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Drive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        CarpetaNarrativa[posicionNarrativa] = g;
        posicionNarrativa++;
    }
    
    public void InsertarDLC(char g){
        if (posicionDLC==CarpetaDLC.length){
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
