/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ups.ecu.IElectrodomesticoDAO;
import edu.ups.ecu.Modelo.Lavadora;
import edu.ups.ecu.Modelo.Television;
import java.util.List;
/**
 *
 * @author Dutan2000
 */
public interface IElectrodomesticoDAO {
    public void createTelevision(Television television);
    public void createLavadora(Lavadora lavadora);
    public List<Lavadora> findLavadoras();
    public List<Television> findTelevisiones();
}
