/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelCliente;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "cliente", urlPatterns = {"/cliente"})
public class cliente extends HttpServlet {

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
            out.println("<title>Servlet cliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String metodo = request.getParameter("metodo");

            if(metodo.equals("registra")){
                    registra(request, response);
            }else if(metodo.equals("lista")){
                    lista(request, response);
            }else if(metodo.equals("actualiza")){
                    actualiza(request, response);
            }else if(metodo.equals("busca")){
                    busca(request, response);
            }else if(metodo.equals("elimina")){
                    elimina(request, response);
            }
    }

    protected void registra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            int codcliente = Integer.parseInt(request.getParameter("codcliente"));
            String nombre = request.getParameter("nombre");
            String servicio = request.getParameter("servicio");
            String correo = request.getParameter("correo");
            String contraseña = request.getParameter("contraseña");
            int nivel = Integer.parseInt(request.getParameter("nivel"));
           

            //se Crea el objeto alumnos
            Cliente a = new Cliente();
            a.setCodCliente(codcliente);
            a.setNombre(nombre);
            a.setServicio(servicio);
            a.setCorreo(correo);
            a.setContraseña(contraseña);
            a.setNivel(nivel);
            

            //Se inserta a la BD el alumno
            ModelCliente model = new ModelCliente();
            model.insertaCliente(a);

            //Se lista todos los alumnos
           request.getRequestDispatcher("/inicio.jsp").forward(request, response);
    }

    protected void lista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
            ModelCliente model = new ModelCliente();
            List<Cliente> data = model.listaCliente();

            //Se almacena en memoria llamada request
            request.setAttribute("data",data);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/listaCliente.jsp").forward(request, response);
    }

    protected void actualiza(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            int cod = Integer.parseInt(request.getParameter("cod"));
            String nombre = request.getParameter("nombre");
            String servicio = request.getParameter("servicio");
            String correo = request.getParameter("correo");
            String contraseña = request.getParameter("contraseña");
            int nivel = Integer.parseInt(request.getParameter("nivel"));
          

            //se Crea el objeto alumnos
            Cliente a = new Cliente();
            a.setCodCliente(cod);
            a.setNombre(nombre);
            a.setServicio(servicio);
            a.setCorreo(correo);
            a.setContraseña(contraseña);
            a.setNivel(nivel);

            //Se inserta a la BD el alumno
            ModelCliente model = new ModelCliente();
            model.actualizaCliente(a);

            //Se lista todos los alumnos
            lista(request, response);				
    }

    protected void busca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String cod = request.getParameter("cod");

            //Se inserta a la BD el alumno
            ModelCliente model = new ModelCliente();
            Cliente a = model.buscaCliente(Integer.parseInt(cod));

            //Se almacena en memoria llamada request
            request.setAttribute("data",a);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/actualizaCliente.jsp").forward(request, response);				
    }

    protected void elimina(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String cod = request.getParameter("cod");

            //Se inserta a la BD el alumno
            ModelCliente model = new ModelCliente();
            model.eliminaCliente(Integer.parseInt(cod));

            //Se lista todos los alumnos
            lista(request, response);
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
        processRequest(request, response);
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
