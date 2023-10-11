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
public class EmpresaBethesda extends Observable implements Runnable{
    
    int DuracionDia;
    
    int CantidadNivelesB;
    int CantidadNarrativaB;
    int CantidadLogicaB;
    int CantidadDLCB;
    int CantidadArtistaB;
    
    static Thread[] HilosNivelesB;
    static Thread[] HilosNarrativaB;
    static Thread[] HilosLogicaB;
    static Thread[] HilosDLCB;
    static Thread[] HilosArtistaB;
    
    Drive DriveBethesda;

    public EmpresaBethesda(int CantidadNiveles, int CantidadNarrativa, int CantidadLogica, int CantidadDLC, int CantidadArtista, int DuracionDia) {
        this.CantidadNivelesB = CantidadNiveles;
        this.CantidadNarrativaB = CantidadNarrativa;
        this.CantidadLogicaB = CantidadLogica;
        this.CantidadDLCB = CantidadDLC;
        this.CantidadArtistaB = CantidadArtista;
        EmpresaBethesda.HilosNivelesB = new Thread[CantidadNiveles];
        EmpresaBethesda.HilosNarrativaB = new Thread[CantidadNarrativa];
        EmpresaBethesda.HilosLogicaB = new Thread[CantidadLogica];
        EmpresaBethesda.HilosDLCB = new Thread[CantidadDLC];
        EmpresaBethesda.HilosArtistaB = new Thread[CantidadArtista];
        this.DriveBethesda = new Drive("DriveBethesda");
        this.DuracionDia = DuracionDia;
    }
        

    @Override
    public void run() {
        
        Semaphore SemaforoNarrativaB = new Semaphore(1);
        for(int i=0; i < HilosNarrativaB.length; i++){
            Narrativa c = new Narrativa(DuracionDia,SemaforoNarrativaB,DriveBethesda, 2);
            HilosNarrativaB[i] = new Thread(c);
            HilosNarrativaB[i].start();
        }
        
        Semaphore SemaforoNivelesB = new Semaphore(1);
        for(int i=0; i < HilosNivelesB.length; i++){
            Niveles b = new Niveles(DuracionDia,SemaforoNivelesB,DriveBethesda, 2);
            HilosNivelesB[i] = new Thread(b);
            HilosNivelesB[i].start();
        }
        
        Semaphore SemaforoArtistaB = new Semaphore(1);
        for(int i=0; i < HilosArtistaB.length; i++){
            Artista a = new Artista(DuracionDia,SemaforoArtistaB,DriveBethesda, 3);
            HilosArtistaB[i] = new Thread(a);
            HilosArtistaB[i].start();
        }
        
        Semaphore SemaforoLogicaB = new Semaphore(1);
        for(int i=0; i < HilosLogicaB.length; i++){
            Logica d = new Logica(DuracionDia,SemaforoLogicaB,DriveBethesda, 3);
            HilosLogicaB[i] = new Thread(d);
            HilosLogicaB[i].start();
        }
        
        Semaphore SemaforoDLCB = new Semaphore(1);
        for(int i=0; i < HilosDLCB.length; i++){
            DLC d = new DLC(DuracionDia,SemaforoDLCB,DriveBethesda, 3);
            HilosDLCB[i] = new Thread(d);
            HilosDLCB[i].start();
        }
    }
}