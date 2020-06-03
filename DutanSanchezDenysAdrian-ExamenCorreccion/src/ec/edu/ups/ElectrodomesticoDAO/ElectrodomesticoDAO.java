/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ElectrodomesticoDAO;
import ec.edu.ups.IElectrodomesticoDAO.IElectrodomestico;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Dutan2000
 */
public class ElectrodomesticoDAO implements IElectrodomestico{

        private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        lista= new TreeSet<>();
    }
        
        
                
    @Override
    public void crearTelevision(Television television) {
        lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Lavadora> listarLavadora() {
        List<Lavadora> listLavadora= new ArrayList<>();
        for (Electrodomestico electrodomestico : lista) {
            if(electrodomestico instanceof Lavadora){
                listLavadora.add((Lavadora)electrodomestico);
            }
        }
        
        return listLavadora;
    }

    @Override
    public List<Television> listarTelevision() {
        List<Television> listTelevision=new ArrayList<>();
        for(Electrodomestico electrodomestico: lista){
            if(electrodomestico instanceof Television){
                listTelevision.add((Television)electrodomestico);
            }
        }
        return listTelevision;
    }
    
}
