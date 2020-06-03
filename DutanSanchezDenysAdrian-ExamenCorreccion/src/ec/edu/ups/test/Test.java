/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.ElectrodomesticoDAO.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.*;
import ec.edu.ups.controlador.*;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //modelo
        Electrodomestico elect = new Electrodomestico();
        //vista 
        VistaElectrodomestico vistaElectr = new VistaElectrodomestico();

        //DAO
        ElectrodomesticoDAO DAOelectro = new ElectrodomesticoDAO();
        //controlador
        ControladorElectrodomestico controladoraElectro = new ControladorElectrodomestico(vistaElectr, elect, DAOelectro);

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("***************************");
            System.out.println("1.Ingresar Lavadora");
            System.out.println("2.Ingresar Television");
            System.out.println("3.Ver Televisiones");
            System.out.println("4.Ver Lavadoras");
            System.out.println("5.Salir");
            System.out.println("***************************");

            try {
                System.out.println("Eliga una opcion");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        controladoraElectro.registrarLavadora();
                        System.out.println("Lavadora se ha registrado exitosamente");
                        break;
                    case 2:
                        controladoraElectro.registrarTelevision();
                        System.out.println("Television se ha registrado exitosamente");
                        break;
                    case 3:
                        controladoraElectro.verTelevision();
                        System.out.println();
                        break;
                    case 4:
                        controladoraElectro.verLavadoras();
                        System.out.println();
                        break;
                    case 5: 
                        salir =true;
                        break;
                         
                    default:
                        System.out.println("Solo numeros del 1-6 ");
                }

            } catch (InputMismatchException e) {
            }

        }

    }
}
