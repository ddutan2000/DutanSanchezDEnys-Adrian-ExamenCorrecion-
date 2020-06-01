/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.Controlador;
import edu.ups.ecu.Modelo.*;
import edu.ups.ecu.Vista.*;
import edu.ups.ecu.IElectrodomesticoDAO.*;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorElectrodomestico {
    //vista
    private VistaElectrodomestico vistaElectrodomestico;
    //modelo
    private Electrodometstico electrodomestico;

    
    //objectDAO 
    private IElectrodomesticoDAO electrodomesticoDAO;

    //constructores
    public ControladorElectrodomestico() {
    }

    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, Electrodometstico electrodomestico, IElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomestico = electrodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }

    //metodos 
    public void registrarTelevision(){
        electrodomestico=vistaElectrodomestico.ingresarTelevision();
        electrodomesticoDAO.createTelevision((Television)electrodomestico);
    }
    
    public void registrarLavadora(){
        electrodomestico=vistaElectrodomestico.ingreseLavadora();
        electrodomesticoDAO.createLavadora((Lavadora)electrodomestico);
    }
    public void verLavadoras(){
        List<Electrodometstico> electrodomestico1;
        electrodomestico1=(electrodomestico)electrodomesticoDAO.findLavadoras();
        if(!electrodomestico1.isEmpty()){
            vistaElectrodomestico.mostrarLavadora();
        }
        else{
            System.out.println("No existen lavadoras");
        }
    }
    
    public void verTelevisiones(){
        List <Electrodometstico> electrodomestico1;
        electrodomestico1=(Television)electrodomesticoDAO.findTelevisiones();
        if(!electrodomestico1.isEmpty()){
            vistaElectrodomestico.mostrarTelevisiones(electrodomestico1);
            
        }
        
    }
    
}
