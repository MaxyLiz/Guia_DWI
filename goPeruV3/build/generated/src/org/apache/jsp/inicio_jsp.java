package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slider.css\">\n");
      out.write("        <script src=\"javaScript/slider.js\"></script>\n");
      out.write("\n");
      out.write("        <title>GoPerù</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"img/LogoGoPeru1.png\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/galeria.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <!--navegaciòn-->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
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
      out.write("                            <li class=\"active\" ><a href=\"#\">Inicio</a></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">Categorias <span class=\"caret\"></span>\n");
      out.write("                                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                        <li><a href=\"parque.jsp\">Parques</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"cine.jsp\">Cines</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"cc.jsp\">Centro Comerciales</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"\"><a href=\"#\">Libro de Visitas</a></li> \n");
      out.write("                            <li class=\"\"><a href=\"#contactenos\">Contactenos</a></li>\n");
      out.write("                            <li class=\"\"><a href=\"login.jsp\">Ingresar</a></li>                         \n");
      out.write("                        </ul>\n");
      out.write("                        <form action=\"\" class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"buscar\">\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                            </button>                \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!--Jumbotron-->\n");
      out.write("        <section class=\"jumbotron\" style=\"margin-top:50px\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--logo-->\n");
      out.write("                <span class=\"col-md-2\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"img/LogoGoPeru1.png\" alt=\"LogoGoPerú\" >\n");
      out.write("                </span>\n");
      out.write("                <p class=\" col-md-10 arribaizquierda titulo-web\">\"Los mejores lugares aquí...\"</p>   \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--slider start-->\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <iframe src=\"slider.jsp\" height=\"450px\" width=\"100%\"></iframe>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--Gallery thumbnail-->\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <a name=\"\" id=\"categorias\"><h2 style=\"color: #EA503A\">Categorias</h2></a>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"discoteca.jsp\"><img src=\"img/discoteca.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>DISCOTECAS</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"cine.jsp\"><img src=\"img/cine.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>CINES</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"parque.jsp\"><img src=\"img/parques.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>PARQUES</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"restaurante.jsp\"><img src=\"img/restaurante.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>RESTAURANTES</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"cc.jsp\"><img src=\"img/centroComercial.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>CENTROS COMERCIALES</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                    <div class=\"thumbnail\">\n");
      out.write("                        <a href=\"karaoke.jsp\"><img src=\"img/karaoke.jpg\" alt=\"\" style=\"width: 300px; height: 200px;\"></a>\n");
      out.write("                        <div class=\"caption\">\n");
      out.write("                            <p class=\"text-primary text-center lead\" style=\"margin: 0\"><strong>KARAOKES</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--Formulario Contactanos-->\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <a name=\"#contactenos\" id=\"contactenos\"><h2 style=\"color: #EA503A\">Contactenos</h2></a>\n");
      out.write("            <hr>\n");
      out.write("            <p class=\"pb-0 mb-0\">Te invitamosa contactarnos, te respondemos en brevedad.</p>\n");
      out.write("            <p class=\"text-danger text-small pt-0 mt-0\">Todos los campos son obligatorios.</p>\n");
      out.write("            <form action=\"\" class=\"\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nombre\">Nombre:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nombre\">Correo Electrónico:</label>\n");
      out.write("                    <input class=\"form-control\" type=\"text\" id=\"correo\" placeholder=\"Correo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"mensaje\">Mensaje:</label>\n");
      out.write("                    <textarea class=\"form-control\" id=\"mensaje\" placeholder=\"Escribe tu mensaje\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-danger\">Enviar</button>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!--Pie de Pagina-->\n");
      out.write("        <iframe src=\"piePagina.jsp\" height=\"300px\" width=\"100%\"></iframe>\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
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
