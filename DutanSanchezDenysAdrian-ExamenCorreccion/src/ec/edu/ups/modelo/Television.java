/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Dutan2000
 */
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean puertoHDMI;
    
    //constructores
    public Television(int codigo) {
        super(codigo);
    }

    public Television() {
    }
    
    //GETTERS Y SETTERS 
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
    
    
    
    
    //hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.resolucion;
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
    
    //override metodos

    public double obtenerPrecioFinal() {
        double precioFinalPadre=super.obtenerPrecioFinal();
        double aumento=0;
        double aumento1=0;
        boolean hdmi=false;
        
        if(resolucion>40){
            aumento= super.getPrecioBase()*.03;
        }
        
        if(hdmi==true){
            aumento1=50;
        }
        
        return precioFinalPadre + aumento+ aumento1;
        
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTelevision" + "\nResolucion:" + resolucion + "\nPuerto HDMI:" + puertoHDMI + "\nPrecio Final: "+ obtenerPrecioFinal() ;
    }
    
    
 
    
}
