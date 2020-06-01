/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.Vista;
import edu.ups.ecu.Modelo.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dutan2000
 */
public class VistaElectrodomestico {
    private Scanner input;
    
    //constructor

    public VistaElectrodomestico() {
        input=new Scanner (System.in);
    }
    
    //metodos 
    public Television ingresarTelevision(){
        boolean poseeHDMI;
        System.out.println("Ingresar Television");
        System.out.println("Ingrese la resolucion de la television");
        int resloucion=input.nextInt();
        System.out.println("el televisor tiene HDMI");
        System.out.println("1.Si\n2.No");
        int hdmi=input.nextInt();
        if(hdmi==1){
            poseeHDMI=true;
        }
        else{
            poseeHDMI=false;
        }
        
        return new Television(resloucion, poseeHDMI);
    }
    
    public Lavadora ingreseLavadora(){
          System.out.println("Ingresar Lavadora");
          System.out.println("ingrese la carga de la lavadora");
          int carga=input.nextInt();
          
          return new Lavadora(carga);
    }
    
    public void mostrarLavadora(List<Lavadora> lavadoras){
        int aux=0;
        for (Lavadora lavadora : lavadoras) {
            System.out.println("Lavadora # "+ aux+":");
            System.out.println("Datos de lavadora"+lavadora);
        }
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
        int aux =0;
        for (Television television : televisiones) {
            System.out.println("Television #"+ aux+ ":");
            System.out.println("Datos de televisor"+television);
        }
    }
}
