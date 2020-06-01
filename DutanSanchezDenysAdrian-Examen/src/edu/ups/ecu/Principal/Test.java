/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.Principal;
import edu.ups.ecu.Controlador.*;
import edu.ups.ecu.ElectrodomesticoDAO.*;
import edu.ups.ecu.Modelo.Electrodometstico;
import edu.ups.ecu.Vista.VistaElectrodomestico;
import java.util.Scanner;
/**
 *
 * @author Dutan2000
 */
public class Test {
    public static final Scanner input = new Scanner(System.in);
    
    public static final ElectrodomesticoDAO electrodomesticoDAO= new ElectrodomesticoDAO();
    
    public static final VistaElectrodomestico vistaElectrodomestico=new VistaElectrodomestico();
    
    public static final Electrodometstico modeloElectrodomestico=new Electrodometstico();
    
    public static final ControladorElectrodomestico controladorElectrodomestico=new ControladorElectrodomestico(vistaElectrodomestico, modeloElectrodomestico, electrodomesticoDAO);
    
    public static void main (String[]args){
        int opcion;
        boolean salir=false;
        while(!salir){
            System.out.println("Menu");
            System.out.println("1.Ingresar electrodomestico");
            System.out.println("2.Mostrar Lavadoras");
            System.out.println("3.Mostar Televisiones");
            opcion=input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el codigo del electrodomestico");
                    int codigo=input.nextInt();
                    System.out.println("Ingrese la descripcion del electrodomestico");
                    String descripcion=input.next();
                    System.out.println("ingrese el precio base del electrodomestico");
                    double precioBase=input.nextDouble();
                    System.out.println("Ingrese el color del eelectrodomestico");
                    String color =input.next();
                    System.out.println("ingrese el consumo energetico");
                    String consumoEnergetico=input.next().toUpperCase();
                    char consEnergetico=consumoEnergetico.charAt(0);
                    System.out.println("Ingrese el peso");
                    int peso=input.nextInt();
                    
                    break;
                case 2:
                    System.out.println("Televisiones registradas");
                    controladorElectrodomestico.verTelevisiones();
                    break;
                    
                case 3:
                    System.out.println("Lavadora registrada");
                    controladorElectrodomestico.verLavadoras();
                    break;
                
                case 4:
                    salir =true;
                    break;
     
                    
                
            }
        }
    }
}
