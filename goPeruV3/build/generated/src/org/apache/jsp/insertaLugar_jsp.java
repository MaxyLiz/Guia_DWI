package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertaLugar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    <title>CRUD BD Alumno</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("    <h1>Registro de Alumno</h1>\n");
      out.write("\n");
      out.write("    <form action=\"lugar\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"metodo\" value=\"registra\">\t\n");
      out.write("        <table>\n");
      out.write("             <tr>\n");
      out.write("                <td>Codigo</td>\n");
      out.write("                <td><input type=\"text\" name=\"codlugar\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombre</td>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Departamento</td>\n");
      out.write("                <td><input type=\"text\" name=\"departamento\" required></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Provincia</td>\n");
      out.write("                <td><input type=\"text\" name=\"provincia\" required></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Distrito</td>\n");
      out.write("                <td><input type=\"text\" name=\"distrito\" required></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Descripcion</td>\n");
      out.write("                <td><input type=\"text\" name=\"descripcion\" required></td>\n");
      out.write("            </tr>\n");
      out.write("               <tr>\n");
      out.write("                <td>Foto</td>\n");
      out.write("                <td><input type=\"text\" name=\"foto\" required></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \t\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"enviar\"></td>\n");
      out.write("                <td><input type=\"reset\" value=\"borrar\"></td>\n");
      out.write("            </tr>\t\t\t\t\t\t\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
