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
public class Television extends Electrodometstico {
    private int resolucion;
    private boolean puertoHDMI;

    public Television() {
    }

    public Television(int codigo) {
        super(codigo);
    }

    public Television(int resolucion, boolean puertoHDMI) {
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }
    
    
    //getters y setters
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.resolucion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Television other = (Television) obj;
        if (this.resolucion != other.resolucion) {
            return false;
        }
        return true;
    }

    //overide aumento de precio
    @Override
    public double obtenerPrecioFinal() {
        double incremento=0;
        if(resolucion<=40 && puertoHDMI==true){
            incremento= (super.precioBase*.3)+ 50;
        }
        return incremento;
    }
    
    

    @Override
    public String toString() {
        return "\nTelevision" + "\nResolucion:" + resolucion + "\nPuerto HDMI:" + puertoHDMI ;
    }
    
    
}
