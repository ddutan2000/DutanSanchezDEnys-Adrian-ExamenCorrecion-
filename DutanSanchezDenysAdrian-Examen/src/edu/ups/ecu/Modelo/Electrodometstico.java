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
public abstract class Electrodometstico {
   private int codigo;
   private String descripcion;
   double precioBase;
   private String color;
   private char consumoEnergetico;
   private int peso;
   
   //constructores
    public Electrodometstico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodometstico() {
    }

    public Electrodometstico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
   
    
    
    //getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //metodo de obtener precio
    public double obtenerPrecioFinal(){
        double precioE=0;
        double precioP=0;
        
        if(consumoEnergetico=='A'){
            precioE=100;
        }
        else if(consumoEnergetico=='B'){
            precioE=80;
        }
        else if(consumoEnergetico=='C'){
            precioE=60;
        }
        else if(consumoEnergetico=='D'){
            precioE=50;
        }
        else if(consumoEnergetico=='E'){
            precioE=30;  
        }
        else if(consumoEnergetico=='F'){
            precioE=10;
        }
        
        if(peso>=0 && peso<=19){
            precioP=10;
        }
        else if(peso>=20&& peso<=49){
            precioP=50;
        }
        else if(peso>=50 && peso<=79){
            precioP=80;
        }
        else if(peso>=80){
            precioP=100;
        }
        return precioBase+precioE+precioP;
    }


    
     

    @Override
    public String toString() {
        return "\nElectrodometstico" + "\nCodigo:" + codigo + "\nDescripcion:" + descripcion + "\nPrecio Base: " + precioBase + "\nColor:" + color + "\nConsumo energetico:" + consumoEnergetico + "\nPeso:" + peso ;
    }
    
    
    
   
}
