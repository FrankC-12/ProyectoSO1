/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso_caicedo.pernia;

import java.util.Observable;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Luisp
 */
public class EmpresaCapcom extends Observable implements Runnable{
    
    int DuracionDia;
    
    int CantidadNiveles;
    int CantidadNarrativa;
    int CantidadLogica;
    int CantidadDLC;
    int CantidadArtista;
    
    static Thread[] HilosNiveles;
    static Thread[] HilosNarrativa;
    static Thread[] HilosLogica;
    static Thread[] HilosDLC;
    static Thread[] HilosArtista;
    
    Drive DriveCapcom;

    public EmpresaCapcom(int CantidadNiveles, int CantidadNarrativa, int CantidadLogica, int CantidadDLC, int CantidadArtista, int DuracionDia) {
        this.CantidadNiveles = CantidadNiveles;
        this.CantidadNarrativa = CantidadNarrativa;
        this.CantidadLogica = CantidadLogica;
        this.CantidadDLC = CantidadDLC;
        this.CantidadArtista = CantidadArtista;
        EmpresaCapcom.HilosNiveles = new Thread[CantidadNiveles];
        EmpresaCapcom.HilosNarrativa = new Thread[CantidadNarrativa];
        EmpresaCapcom.HilosLogica = new Thread[CantidadLogica];
        EmpresaCapcom.HilosDLC = new Thread[CantidadDLC];
        EmpresaCapcom.HilosArtista = new Thread[CantidadArtista];
        this.DriveCapcom = new Drive("DriveCapcom");
        this.DuracionDia = DuracionDia;
    }
        

    @Override
    public void run() {
        
        Semaphore SemaforoNarrativa = new Semaphore(1);
        for(int i=0; i < HilosNarrativa.length; i++){
            Narrativa c = new Narrativa(DuracionDia,SemaforoNarrativa,DriveCapcom, 4);
            HilosNarrativa[i] = new Thread(c);
            HilosNarrativa[i].start();
        }
        
        Semaphore SemaforoNiveles = new Semaphore(1);
        for(int i=0; i < HilosNiveles.length; i++){
            Niveles b = new Niveles(DuracionDia,SemaforoNiveles,DriveCapcom, 4);
            HilosNiveles[i] = new Thread(b);
            HilosNiveles[i].start();
        }
        
        Semaphore SemaforoArtista = new Semaphore(1);
        for(int i=0; i < HilosArtista.length; i++){
            Artista a = new Artista(DuracionDia,SemaforoArtista,DriveCapcom, 1);
            HilosArtista[i] = new Thread(a);
            HilosArtista[i].start();
        }
        
        Semaphore SemaforoLogica = new Semaphore(1);
        for(int i=0; i < HilosLogica.length; i++){
            Logica d = new Logica(DuracionDia,SemaforoLogica,DriveCapcom, 5);
            HilosLogica[i] = new Thread(d);
            HilosLogica[i].start();
        }
        
        Semaphore SemaforoDLC = new Semaphore(1);
        for(int i=0; i < HilosDLC.length; i++){
            DLC d = new DLC(DuracionDia,SemaforoDLC,DriveCapcom, 2);
            HilosDLC[i] = new Thread(d);
            HilosDLC[i].start();
        }
    }
}
