/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.Alumno;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelAlumno;

/**
 *
 * @author davquev
 */
@WebServlet(name = "alumno", urlPatterns = {"/alumno"})
public class alumno extends HttpServlet {

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
            out.println("<title>Servlet al2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet al2 at " + request.getContextPath() + "</h1>");
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
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String edad = request.getParameter("edad");

            //se Crea el objeto alumnos
            Alumno a = new Alumno();
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(Integer.parseInt(edad));

            //Se inserta a la BD el alumno
            ModelAlumno model = new ModelAlumno();
            model.insertaAlumno(a);

            //Se lista todos los alumnos
           
    }

    protected void lista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
            ModelAlumno model = new ModelAlumno();
            List<Alumno> data = model.listaAlumno();

            //Se almacena en memoria llamada request
            request.setAttribute("data",data);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/listaAlumno.jsp").forward(request, response);
    }

    protected void actualiza(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int edad = Integer.parseInt(request.getParameter("edad"));
            int id = Integer.parseInt(request.getParameter("id"));


            //se Crea el objeto alumnos
            Alumno a = new Alumno();
            a.setIdAlumno(id);
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(edad);

            //Se inserta a la BD el alumno
            ModelAlumno model = new ModelAlumno();
            model.actualizaAlumno(a);

            //Se lista todos los alumnos
            lista(request, response);				
    }

    protected void busca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String id = request.getParameter("id");

            //Se inserta a la BD el alumno
            ModelAlumno model = new ModelAlumno();
            Alumno a = model.buscaAlumno(Integer.parseInt(id));

            //Se almacena en memoria llamada request
            request.setAttribute("data",a);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/actualizaAlumno.jsp").forward(request, response);				
    }

    protected void elimina(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String id = request.getParameter("id");

            //Se inserta a la BD el alumno
            ModelAlumno model = new ModelAlumno();
            model.eliminaAlumno(Integer.parseInt(id));

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
