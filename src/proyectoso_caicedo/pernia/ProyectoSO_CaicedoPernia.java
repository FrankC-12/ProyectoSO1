/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoso_caicedo.pernia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Luisp
 */
public class ProyectoSO_CaicedoPernia {
    
    static boolean indicadorObjetosEmpresa = false;
    static EmpresaCapcom C1;
    static EmpresaBethesda B1;
    static int dias = 0;
    static Thread H1;
    static Thread H2;
    static Thread H3;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dashboard interfaz = new Dashboard();
        interfaz.setVisible(true);
        
        FileReader archivoLecturaC;
        FileReader archivoLecturaB;
        BufferedReader lector;
        BufferedReader lector2;
        
        
        try{
        
        archivoLecturaC = new FileReader("C:/Users/Luisp/OneDrive/Desktop/ArchivoTXTCapcom");
        if (archivoLecturaC.ready()){
        lector = new BufferedReader(archivoLecturaC);
        String cadena;
        String[] Capcom = new String[7];
        int i = 0;
        Capcom[0] = "Vacio";
        while((cadena = lector.readLine())!=null){
        Capcom[i] = cadena;
        i++;
        }
        if(!"Vacio".equals(Capcom[0])){
        C1 = new EmpresaCapcom(Integer.parseInt(Capcom[0]),Integer.parseInt(Capcom[1]),Integer.parseInt(Capcom[2]),Integer.parseInt(Capcom[3]),Integer.parseInt(Capcom[4]),Integer.parseInt(Capcom[5]));
        H1 = new Thread(C1);
        H1.start();
        }
        }

        archivoLecturaB = new FileReader("C:/Users/Luisp/OneDrive/Desktop/ArchivoTXTBethesda.txt");
        if (archivoLecturaB.ready()){
        lector2 = new BufferedReader(archivoLecturaB);
        String cadena1;
        String[] Bethesda = new String[7];
        int i1 = 0;
        Bethesda[0] = "Vacio";
        while((cadena1 = lector2.readLine())!=null){
        Bethesda[i1] = cadena1;
        i1++;
        }
        if(!"Vacio".equals(Bethesda[0])){
        B1 = new EmpresaBethesda(Integer.parseInt(Bethesda[0]),Integer.parseInt(Bethesda[1]),Integer.parseInt(Bethesda[2]),Integer.parseInt(Bethesda[3]),Integer.parseInt(Bethesda[4]),Integer.parseInt(Bethesda[5]));
        H2 = new Thread(B1);
        H2.start();
        indicadorObjetosEmpresa = true;
        Tiempo t1 = new Tiempo(Integer.parseInt(Bethesda[6]));
        H3 = new Thread(t1);
        H3.start();
        t1.addObserver(interfaz);
        }
        }
        }
        catch(Exception e){
            System.out.println("Error" + e);
}}
    }
    

