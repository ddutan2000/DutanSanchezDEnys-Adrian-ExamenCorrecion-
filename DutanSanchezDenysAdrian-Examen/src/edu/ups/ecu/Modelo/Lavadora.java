/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.Modelo;

/**
 *
 * @author Dutan2000
 */
public class Lavadora extends Electrodometstico{
    private int Carga;

    //constructores
    public Lavadora() {
    }

    public Lavadora(int codigo) {
        super(codigo);
    }
    
    
    
    //getters y setters
    public int getCarga() {
        return Carga;
    }

    public void setCarga(int Carga) {
        this.Carga = Carga;
    }

    //overide aumento de precio
    @Override
    public double obtenerPrecioFinal() {
        double aumento=0;
        if(Carga>30){
            aumento=super.precioBase+50;
        }
        return aumento;
    }
    
    
    @Override
    public String toString() {
        return "\nLavadora" + "Carga: " + Carga;
    }
    
    
    
}
