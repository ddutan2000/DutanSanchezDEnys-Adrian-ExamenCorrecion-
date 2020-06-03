/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.IElectrodomesticoDAO;
import java.util.List;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
/**
 *
 * @author Dutan2000
 */
public interface IElectrodomestico {
    public void crearTelevision(Television television);
    public void crearLavadora(Lavadora lavadora);
    public List<Lavadora> listarLavadora();
    public List<Television> listarTelevision();
    
}
