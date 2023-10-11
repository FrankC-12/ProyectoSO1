/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;


/**
 *
 * @author Luisp
 */
public class Drive {
    
    String nombre;
    
    char[] CarpetaNarrativa;
    int posicionNarrativa;
    int posicionNiveles;
    int posicionArtista;
    int posicionLogica;
    int posicionDLC;
 
    char[] CarpetaNiveles;
    char[] CarpetaArtista;
    char[] CarpetaLogica;
    char[] CarpetaDLC;
    

    public Drive(String nombre) {
        this.nombre = nombre;
        this.CarpetaNarrativa = new char[25] ;
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
        }
        else{
        CarpetaNarrativa[posicionNarrativa] = g;
        posicionNarrativa++;
        }
    }
    
    public void InsertarNiveles(char g){
        if (posicionNiveles==CarpetaNiveles.length){
        }
        else{
        CarpetaNiveles[posicionNiveles] = g;
        posicionNiveles++;
        }
    }
    
    public void InsertarArtistas(char g){
        if (posicionArtista==CarpetaArtista.length){
        } 
        else{
        CarpetaArtista[posicionArtista] = g;
        posicionArtista++;
        }
    }
    
    public void InsertarLogicas(char g){
        if (posicionLogica==CarpetaLogica.length){
        } 
        else{
        CarpetaLogica[posicionLogica] = g;
        posicionLogica++;
        System.out.println("Se agrega s " + nombre);
        }
    }
    
    public void InsertarDLC(char g){
        if (posicionDLC==CarpetaDLC.length){
        }else{
        CarpetaDLC[posicionDLC] = g;
        posicionDLC++;
        }
    }
    
    
    
    
}
