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
public class Electrodomestico implements Comparable<Electrodomestico> {

    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    //constructores
    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
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

    //override metodo
    @Override
    public int compareTo(Electrodomestico e) {
        return (int) (this.precioBase-e.precioBase);
    }
    
    //metodos
    public double obtenerPrecioFinal() {
        double precioE = 0;
        double precioP = 0;

        switch (consumoEnergetico) {
            case 'A':
                precioE = 100;
                break;
            case 'B':
                precioE = 80;
                break;
            case 'C':
                precioE = 60;
                break;
            case 'D':
                precioE = 50;
                break;
            case 'E':
                precioE = 30;
                break;
            case 'F':
                precioE = 10;
                break;
            default:
                break;
        }

        if (peso >= 0 && peso <= 19) {
            precioP = 10;
        } else if (peso >= 20 && peso <= 49) {
            precioP = 50;
        } else if (peso >= 50 && peso <= 79) {
            precioP = 80;
        } else if (peso >= 80) {
            precioP = 100;
        }

        double precioTotal = precioBase + precioE + precioP;

        return precioTotal;
    }
    
    //hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.codigo;
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
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "\nElectrodomesticos" + "\nCodigo: " + codigo + "\nDescripcion: " + descripcion + "\nPrecio base:" + precioBase + "\nColor: " + color + "\nConsumo energetico: " + consumoEnergetico + "\nPeso: " + peso ;
    }

}
