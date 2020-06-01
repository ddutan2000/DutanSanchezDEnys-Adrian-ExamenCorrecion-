/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.ElectrodomesticoDAO;

import edu.ups.ecu.IElectrodomesticoDAO.IElectrodomesticoDAO;
import edu.ups.ecu.Modelo.Lavadora;
import edu.ups.ecu.Modelo.Television;
import edu.ups.ecu.Modelo.Electrodometstico;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{

    private sortedSet<Electrodomestico> electrodomestico;
            
    @Override
    public void createTelevision(Television television) {
        electrodomestico.add(television);
    }

    @Override
    public void createLavadora(Lavadora lavadora) {
        electrodomestico.add(lavadora);
    }

    @Override
    public List<Lavadora> findLavadoras() {
        List<Lavadora> lavadoras=this.findLavadoras();
        return lavadoras;
    }

    @Override
    public List<Television> findTelevisiones() {
        List<Television> television=this.findTelevisiones();
        return television;
    }
    
}
