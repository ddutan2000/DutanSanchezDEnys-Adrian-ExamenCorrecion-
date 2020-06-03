/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.IElectrodomesticoDAO.IElectrodomestico;
/**
 *
 * @author Dutan2000
 */
public class ControladorElectrodomestico {
    //vista
    private VistaElectrodomestico vista;
    //modelo
    private Electrodomestico modelo;
    //DAO
    private IElectrodomestico dao;
    
    //constructores

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomestico dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }
    
    public void registrarTelevision(){
        modelo=vista.ingresarTelevision();
        dao.crearTelevision((Television)modelo);
    }
    public void registrarLavadora(){
        modelo=vista.ingresarLavadora();
        dao.crearLavadora((Lavadora)modelo);
    }
    
    public void verLavadoras(){
        vista.mostrarLavadora(dao.listarLavadora());
    }
    
    public void verTelevision(){
        vista.mostrarTelvision(dao.listarTelevision());
    }
    
}
