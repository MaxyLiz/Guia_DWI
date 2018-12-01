package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

HttpSession sesion = request.getSession();
if (sesion.getAttribute("nivel")==null) {
    response.sendRedirect("../login.jsp"); 
    }else {
String nivel=sesion.getAttribute("nivel").toString();
if(!nivel.equals("2")){
response.sendRedirect("../login.jsp");
}
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <title>ClienteGoPerù</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"img/LogoGoPeru1.png\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <!--navegaciòn-->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion-goPeru\">\n");
      out.write("                            <span class=\"sr-only\">Desplegar/oculrar Menu</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--Inicia menu-->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navegacion-goPeru\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"\" ><a href=\"perfilcliente.jsp\">Perfil</a></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">Nuestros Ofertas<span class=\"caret\"></span>\n");
      out.write("                                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                        <li><a href=\"\">Listar ofertas</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"\">Insertar ofertas</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"\">Actualizar ofertas</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"\"><a href=\"#\">Sistema de Lugares</a></li> \n");
      out.write("                            <li class=\"\"><a href=\"./login.jsp?cerrar=true\">Cerrar sesión</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!--Jumbotron-->\n");
      out.write("        <section class=\"jumbotron\" style=\"margin-top:0px\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--logo-->\n");
      out.write("                <span class=\"col-md-2\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"img/LogoGoPeru1.png\" alt=\"LogoGoPerú\" >\n");
      out.write("                </span>\n");
      out.write("                <p class=\" col-md-10 arribaizquierda titulo-web\">\"Bienvenido Cliente!\"</p>   \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                    <div class=\"thumbnail\" style=\"background-color:#F9D2D2\">\n");
      out.write("                        <a href=\"\"><img src=\"img/clientes.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>Ofertas</strong></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Listar Ofertas</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\" class=\"text-center\">Insertar Ofertas</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Actualizar Ofertas</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Eliminar Ofertas</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                    <div class=\"thumbnail\" style=\"background-color:#F9D2D2\">\n");
      out.write("                        <a href=\"\"><img src=\"img/lugares.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>Lugares</strong></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Listar Lugares</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\" class=\"text-center\">Insertar Lugar</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Actualizar Lugar</a></p>\n");
      out.write("                            <p class=\"text-center\"><a href=\"\">Eliminar Lugar</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>        \n");
      out.write("        </section>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
