/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.ClienteDAO;
import dao.ProductoDAO;
import dominio.Cliente;
import dto.ClienteDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author zoek
 */
@Stateless
public class ClienteServicio {//Clase que representa la capa de negocios pasa los datos de DTO a DAO.
    @EJB // Enterprise Java Bean
    
    private ClienteDAO clienteDAO; //Se invoca a la capa de datos
    private ProductoDAO productoDAO;
    
    public void createCliente(ClienteDTO cliDTO){
        Cliente cli = new Cliente();
        cli.setRut(cliDTO.getRut());
        cli.setNombre(cliDTO.getNombre());
        cli.setApellido(cliDTO.getApellido());
        cli.setContraseña(cliDTO.getContraseña());
        clienteDAO.createCliente(cli);
    }
    
    public ClienteDTO readCliente(int rut){
        Cliente cli = clienteDAO.readCliente(rut); //Invoca al comunicador para encontrar una entidad
       
        ClienteDTO cliDTO = new ClienteDTO();//Crea un DTO para mostrar datos
        cliDTO.setRut(cli.getRut());
        cliDTO.setNombre(cli.getNombre());
        cliDTO.setApellido(cli.getApellido());
        cliDTO.setContraseña(cli.getContraseña());
        return cliDTO;        
    }
    
    public void updateCliente(ClienteDTO cliDTO){
        Cliente cli = new Cliente();
        cli.setRut(cliDTO.getRut());
        cli.setNombre(cliDTO.getNombre());
        cli.setApellido(cliDTO.getApellido());
        cli.setContraseña(cliDTO.getContraseña());
        clienteDAO.updateCliente(cli);
    }
    
    public void deleteCliente(int rut){
        clienteDAO.deleteCliente(rut);
    }
    

    
    
}
