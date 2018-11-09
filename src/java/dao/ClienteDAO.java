/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zoek
 */
@Stateless
public class ClienteDAO { //Clase encargada de la comunicación con la base de datos
    
    @PersistenceContext
    
    private EntityManager em ;
    
    public void createCliente(Cliente cli){
        em.persist(cli);
    }
    
    public Cliente readCliente(int rut){
        
        Cliente cli = em.find(Cliente.class, rut); //Busca una entidad de una clase por su primary key
        
        return cli;
    }
    
    public void updateCliente(Cliente cli){
        em.merge(cli);
    }
    
    public void deleteCliente(int rut){
        em.remove(readCliente(rut)); // Busca la entidad  y la remueve de la BD
    }
}
