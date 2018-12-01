package controlador;

import entidad.Lugar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelLugar;

/**
 *
 * @author davquev
 */
@WebServlet(name = "lugar", urlPatterns = {"/lugar"})
public class lugar extends HttpServlet {

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
            String codlugar = request.getParameter("codlugar");
            String nombre = request.getParameter("nombre");
            String departamento = request.getParameter("departamento");
            String provincia = request.getParameter("provincia");
            String distrito = request.getParameter("distrito");
            String descripcion = request.getParameter("descripcion");
            String foto = request.getParameter("foto");

            //se Crea el objeto alumnos
            Lugar a = new Lugar();
            a.setCodlugar(Integer.parseInt(codlugar));
            a.setNombre(nombre);
            a.setDepartamento(departamento);
            a.setProvincia(provincia);
            a.setDistrito(distrito);
            a.setDescripcion(descripcion);
            a.setFoto(foto);
            

            //Se inserta a la BD el alumno
            ModelLugar model = new ModelLugar();
            model.insertaLugar(a);

            //Se lista todos los alumnos
            lista(request, response);	
    }

    protected void lista(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
            ModelLugar model = new ModelLugar();
            List<Lugar> data = model.listaLugar();

            //Se almacena en memoria llamada request
            request.setAttribute("data",data);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/listaLugar.jsp").forward(request, response);
    }

    protected void actualiza(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            int cod = Integer.parseInt(request.getParameter("cod"));
            String nombre = request.getParameter("nombre");
            String departamento = request.getParameter("departamento");
            String provincia = request.getParameter("provincia");
            String distrito = request.getParameter("distrito");
            String descripcion = request.getParameter("descripcion");
            String foto = request.getParameter("foto"); 
           


            //se Crea el objeto alumnos
            Lugar a = new Lugar();
            a.setCodlugar(cod);
            a.setNombre(nombre);
            a.setDepartamento(departamento);
            a.setProvincia(provincia);
            a.setDistrito(distrito);
            a.setDescripcion(descripcion);
            a.setFoto(foto);

            //Se inserta a la BD el alumno
            ModelLugar model = new ModelLugar();
            model.actualizaLugar(a);

            //Se lista todos los alumnos
            lista(request, response);				
    }

    protected void busca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String cod = request.getParameter("cod");

            //Se inserta a la BD el alumno
            ModelLugar model = new ModelLugar();
            Lugar a = model.buscaLugar(Integer.parseInt(cod));

            //Se almacena en memoria llamada request
            request.setAttribute("data",a);

            //Se reenvia el request(con los datos) al jsp listaAlumno.jsp
            request.getRequestDispatcher("/actualizaLugar.jsp").forward(request, response);				
    }

    protected void elimina(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Se obtiene los parametros
            String cod = request.getParameter("cod");

            //Se inserta a la BD el alumno
            ModelLugar model = new ModelLugar();
            model.eliminaLugar(Integer.parseInt(cod));

            //Se lista todos los alumnos
            lista(request, response);
    }
}