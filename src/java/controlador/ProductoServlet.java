/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.ProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ProductoServicio;

/**
 *
 * @author zoek
 */
@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {

    @EJB
    private ProductoServicio servicio;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String btn = request.getParameter("btn");
        
        request.getSession().setAttribute("msg", "");
        request.getSession().setAttribute("msga", "");
        request.getSession().setAttribute("msgm", "");
        request.getSession().setAttribute("msge", "");
        
        switch(btn){
            case "Agregar":
                try{
                    int codProducto = Integer.parseInt(request.getParameter("codigo_producto"));
                    String nombre = request.getParameter("nombre");
                    String descripcion = request.getParameter("descripcion");
                    int precio = Integer.parseInt(request.getParameter("precio"));
                    ProductoDTO proDTOagregar = new ProductoDTO();
                    proDTOagregar.setCodProducto(codProducto);
                    proDTOagregar.setNombre(nombre);
                    proDTOagregar.setDescripcion(descripcion);
                    proDTOagregar.setPrecio(precio);
                    servicio.createProducto(proDTOagregar);
                    request.getSession().setAttribute("msga", "Producto agregado correctamente");
                    response.sendRedirect("mantenedor-producto.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msga", "No fue posible agregar el registro");
                    response.sendRedirect("mantenedor-producto.jsp");
                }break;
                
            case "Buscar":
                try{
                    int codProducto = Integer.parseInt(request.getParameter("codigo_producto"));
                    ProductoDTO proDTOleer = servicio.readProducto(codProducto);
                    String codigo_producto = request.getParameter("codigo_producto");
                    String nombre = proDTOleer.getNombre();
                    String descripcion = proDTOleer.getDescripcion();
                    String precio = String.valueOf(proDTOleer.getPrecio());
                    request.getSession().setAttribute("codigo_producto", codigo_producto);
                    request.getSession().setAttribute("nombre", nombre);
                    request.getSession().setAttribute("descripcion", descripcion);
                    request.getSession().setAttribute("precio", precio);
                    response.sendRedirect("mantenedor-producto1.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msg", "Producto no existe");
                    response.sendRedirect("mantenedor-producto.jsp");
                }break;
                
            case "Actualizar":
                try{
                    int codProducto = Integer.parseInt(request.getParameter("codigo_producto"));
                    String nombre = request.getParameter("nombre");
                    String descripcion = request.getParameter("descripcion");
                    int precio = Integer.parseInt(request.getParameter("precio"));
                    ProductoDTO proDTOactualizar = servicio.readProducto(codProducto);
                    proDTOactualizar.setNombre(nombre);
                    proDTOactualizar.setDescripcion(descripcion);
                    proDTOactualizar.setPrecio(precio);
                    servicio.updateProducto(proDTOactualizar);
                    request.getSession().setAttribute("msgm", "Producto actualizado éxitosamente");
                    response.sendRedirect("mantenedor-producto.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msgm", "No se pudo actualizar el registro");
                    response.sendRedirect("mantenedor-producto.jsp");
                }break;
                
            case "Eliminar":
                try{
                    int codProducto = Integer.parseInt(request.getParameter("codigo_producto"));
                    servicio.deleteProducto(codProducto);
                    request.getSession().setAttribute("msge", "Producto eliminado con éxito");
                    response.sendRedirect("mantenedor-producto.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msge", "No se pudo eliminar el registro");
                    response.sendRedirect("mantenedor-producto.jsp");
                }break;
                
            case "Comprar":
                try{
                    int codProducto = Integer.parseInt(request.getParameter("codigo_producto"));
                    ProductoDTO proDTOcomprar = servicio.readProducto(codProducto);
                    String codigo_producto = request.getParameter("codigo_producto");
                    String nombre = proDTOcomprar.getNombre();
                    int precio = proDTOcomprar.getPrecio();
                    int precioTarjeta = servicio.precioTarjeta(codProducto);
                    int precioEfectivo = servicio.precioEfectivo(codProducto);
                    request.getSession().setAttribute("codigo_producto", codigo_producto);
                    request.getSession().setAttribute("nombre", nombre);
                    request.getSession().setAttribute("precio", precio);
                    request.getSession().setAttribute("precioTarjeta", precioTarjeta);
                    request.getSession().setAttribute("precioEfectivo", precioEfectivo);
                    request.getRequestDispatcher("/resumen.jsp").forward(request, response);
                }catch(Exception e){
                    
                }
                
                
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
