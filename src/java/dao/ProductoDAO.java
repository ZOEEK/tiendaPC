/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Producto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author zoek
 */
@Stateless
public class ProductoDAO {
    @PersistenceContext
    
    private EntityManager em;
    
    public void createProducto(Producto pro){
        em.persist(pro);
    }
    
    public Producto readProducto(int codProducto){
        Producto pro = em.find(Producto.class, codProducto);
        return pro;
    }
    
    public void updateProducto(Producto pro){
        em.merge(pro);
    }
    
    public void deleteProducto(int codProducto){
        em.remove(readProducto(codProducto));
    }
    
}
