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
public class Lavadora extends Electrodomestico {
    private int carga;
    
    //constructor 

    public Lavadora(int codigo) {
        super(codigo);
    }
    
    public Lavadora() {
    }
    
    //getter y setters 

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    //hashCode y equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.carga;
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
        final Lavadora other = (Lavadora) obj;
        if (this.carga != other.carga) {
            return false;
        }
        return true;
    }
    
    
    
    //metodo override 
    public double obtenerPrecioFinal() {
        double precioFinalPadre= super.obtenerPrecioFinal();
        double aumento=0;
        
        if(carga>30){
            aumento=50;
        }
        
        return precioFinalPadre+ aumento;
        
    }

    @Override
    public String toString() {
        return super.toString()+ "\nLavadora" + "\nCarga:" + carga+ "\nPrecio Final: "+ obtenerPrecioFinal();
    }
    
    
    
   
}
