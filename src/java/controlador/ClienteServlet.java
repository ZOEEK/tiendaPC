/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.ClienteDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ClienteServicio;

/**
 *
 * @author zoek
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {
    
    @EJB
    private ClienteServicio servicio;
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
            out.println("<title>Servlet ClienteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteServlet at " + request.getContextPath() + "</h1>");
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
        boolean edo = true;
        
        switch(btn){
            case "Registrar":
                try{
                        int rut = Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                        String contraseña = request.getParameter("pw");
                        ClienteDTO cliDTOagregar = new ClienteDTO();
                        cliDTOagregar.setRut(rut);
                        cliDTOagregar.setNombre(nombre);
                        cliDTOagregar.setApellido(apellido);
                        cliDTOagregar.setContraseña(contraseña);
                        servicio.createCliente(cliDTOagregar);
                }catch(Exception e){
                    request.getSession().setAttribute("msga", "No se pudo agregar cliente");
                    response.sendRedirect("registro.jsp");
                    edo = false;
                }
                if(edo == true){
                    request.getSession().setAttribute("msga", "Cliente registrado correctamente");
                    response.sendRedirect("registro.jsp");
                }
                break;
            
            case "Buscar":
                try{
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    ClienteDTO cliDTOleer = servicio.readCliente(rut);
                    String ruttxt = request.getParameter("rut");
                    String nombre = cliDTOleer.getNombre();
                    String apellido = cliDTOleer.getApellido();
                    String contraseña = cliDTOleer.getContraseña();
                    request.getSession().setAttribute("rut", ruttxt);
                    request.getSession().setAttribute("nombre", nombre);
                    request.getSession().setAttribute("apellido", apellido);
                    request.getSession().setAttribute("contraseña", contraseña);
                    response.sendRedirect("mantenedor-cliente1.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msg", "El rut ingresado no se encuentra registrado");
                    response.sendRedirect("mantenedor-cliente.jsp");
                }break;
                
            case "Actualizar":
                try{
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String contraseña = request.getParameter("pw");
                    ClienteDTO cliDTOactualizar = new ClienteDTO();
                    cliDTOactualizar.setRut(rut);
                    cliDTOactualizar.setNombre(nombre);
                    cliDTOactualizar.setApellido(apellido);
                    cliDTOactualizar.setContraseña(contraseña);
                    servicio.updateCliente(cliDTOactualizar);
                    request.getSession().setAttribute("msgm", "Cliente modificado con éxito");
                    response.sendRedirect("mantenedor-cliente.jsp");
                }catch(Exception e){
                    request.getSession().setAttribute("msgm", "No se pudo actualizar el registro");
                    response.sendRedirect("mantenedor-cliente.jsp");
                }break;
                
            case "Eliminar":
                try{
                        int rut = Integer.parseInt(request.getParameter("rut"));
                        servicio.deleteCliente(rut);
                        request.getSession().setAttribute("msge", "Usuario eliminado con éxito");
                        response.sendRedirect("mantenedor-cliente.jsp");
                        
                }catch(Exception e){
                    request.getSession().setAttribute("msge", "No fue posible eliminar el registro");
                }break;
            
            
            
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
