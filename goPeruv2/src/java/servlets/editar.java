package servlets;

import conexiones.miConexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "editar", urlPatterns = {"/editar"})
public class editar extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            miConexion consulta=new miConexion();
            ResultSet rs;
            
            rs=consulta.actualizar_obtener_datos(Integer.parseInt(request.getParameter("ruc")));
                       
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            while (rs.next()){
                out.println("<form action='actualizar' method='post'>");
                out.println("<h4> Nombre del cliente: <input type='text' name='nombre' readonly='' value="+rs.getString("nombre")+"></h4>");
                out.println("<h4>ruc del cliente: <input type='text' name='ruc' value="+rs.getInt("ruc")+"></h4>");
                out.println("<h4> correo del cliente:<input type='text' name='correo' value="+rs.getString("correo")+"></h4>");
                 out.println("<h4> contraseña del cliente:<input type='text' name='contraseña' value="+rs.getString("contra")+"></h4>");
                out.println("<h4>descripcion del auto: <textarea name='descripcion' cols='30' rows='5'>"+rs.getString("descripcion")+"</textarea></h4>");
               out.println("<input type='submit' value='ACTUALIZAR'>");  
               out.println("</form>");
            }
            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
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
