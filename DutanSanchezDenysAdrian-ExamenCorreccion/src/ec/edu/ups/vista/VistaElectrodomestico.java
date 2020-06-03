/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Dutan2000
 */
public class VistaElectrodomestico {
    private Scanner input;
    
    //constructor

    public VistaElectrodomestico() {
        input=new Scanner (System.in);
    }
    
    //metodos
    public Television ingresarTelevision(){
        Television tele=new Television();
        boolean poseeHDMI;
        System.out.println("Ingrese el codigo del electrodomestico");
        tele.setCodigo(input.nextInt());
        System.out.println("Ingrese la descripcion del electrodomestico");
        tele.setDescripcion(input.next());
        System.out.println("Ingrese el precio base del electrodomestico");
        tele.setPrecioBase(input.nextDouble());
        System.out.println("Ingrese el color del electrodomestico");
        tele.setColor(input.next());
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        String consumoEnergtico=input.next().toUpperCase();
        tele.setConsumoEnergetico(consumoEnergtico.charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        tele.setPeso(input.nextInt());
        
        
        System.out.println("Ingrese la resolucion de la television ");
        tele.setResolucion(input.nextInt());
        System.out.println("Ingrese \n1.si la television posee HDMI \n2.Si televisor no posee HDMI");
        int opcion=input.nextInt();
        if(opcion==1){
            poseeHDMI=true;
        }
        else{
            poseeHDMI=false;
        }
        tele.setPuertoHDMI(poseeHDMI);
        
        return tele;
        
    }
    
    public Lavadora ingresarLavadora(){
        Lavadora lava=new Lavadora();
        System.out.println("Ingrese el codigo del electrodomestico");
        lava.setCodigo(input.nextInt());
        System.out.println("Ingrese la descripcion del electrodomestico");
        lava.setDescripcion(input.next());
        System.out.println("Ingrese el precio base del electrodomestico");
        lava.setPrecioBase(input.nextDouble());
        System.out.println("Ingrese el color del electrodomestico");
        lava.setColor(input.next());
        System.out.println("Ingrese el consumo energetico del electrodomestico");
        String consumoEnergtico=input.next().toUpperCase();
        lava.setConsumoEnergetico(consumoEnergtico.charAt(0));
        System.out.println("Ingrese el peso del electrodomestico");
        lava.setPeso(input.nextInt());
        
        System.out.println("Ingrese la carga de la lavadora");
        lava.setCarga(input.nextInt());
        
        return lava; 
    }
    
    public void mostrarLavadora(List<Lavadora> lista){
        int numero=1;
        for (Lavadora lavadora : lista) {
            System.out.println("Datos de la lavadora #" +numero+ "\n"+lavadora);
            numero++;
        }
                
    }
    
    public void mostrarTelvision(List<Television> lista){
        int numero=1;
        for (Television television : lista) {
            System.out.println("Datos de television #"+ numero+"\n"+ television);
            numero++;
        }
        
    }
}
