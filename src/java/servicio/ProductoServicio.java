/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.ProductoDAO;
import dominio.Producto;
import dto.ProductoDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author zoek
 */
@Stateless
public class ProductoServicio {
    @EJB
    
    private ProductoDAO productoDAO;
    
    public void createProducto(ProductoDTO proDTO){
        Producto pro = new Producto();
        pro.setCodProducto(proDTO.getCodProducto());
        pro.setNombre(proDTO.getNombre());
        pro.setDescripcion(proDTO.getDescripcion());
        pro.setPrecio(proDTO.getPrecio());
        productoDAO.createProducto(pro);
    }
    
    public ProductoDTO readProducto(int codProducto){
        Producto pro = productoDAO.readProducto(codProducto);
        
        ProductoDTO proDTO = new ProductoDTO();
        
        proDTO.setCodProducto(pro.getCodProducto());
        proDTO.setNombre(pro.getNombre());
        proDTO.setDescripcion(pro.getDescripcion());
        proDTO.setPrecio(pro.getPrecio());
        
        return proDTO;
    }
    
    public void updateProducto(ProductoDTO proDTO){
        Producto pro = new Producto();
        pro.setCodProducto(proDTO.getCodProducto());
        pro.setNombre(proDTO.getNombre());
        pro.setDescripcion(proDTO.getDescripcion());
        pro.setPrecio(proDTO.getPrecio());
        productoDAO.updateProducto(pro);
    }
    
    public void deleteProducto(int codProducto){
        productoDAO.deleteProducto(codProducto);
    }
    
    public int precioTarjeta(int codProducto) {
        int precioTarjeta;
        Producto pro = productoDAO.readProducto(codProducto);
        precioTarjeta = ((pro.getPrecio() * 3) / 100) + pro.getPrecio();
        return precioTarjeta;
    }
    
    public int precioEfectivo(int codProducto){
        int precioEfectivo;
        Producto pro = productoDAO.readProducto(codProducto);
        precioEfectivo = pro.getPrecio() - ((pro.getPrecio()*5)/100);
        return precioEfectivo;
    }
    
    
}
