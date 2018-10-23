package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"> -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Slider CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilosfin.css\">\n");
      out.write("        <script src=\"javaScript/slider.js\"></script>\n");
      out.write("        <title>GoPerú</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"img/go.jpg\">\n");
      out.write("        <!-- Style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("        <!--fix for scroll spy active menu element-->\n");
      out.write("    <li style=\"display:none;\"><a href=\"#header\"></a></li>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand col-md-8 bg-light\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"img/go.jpg\" width=\"100\" height=\"100\" alt=\"\">\n");
      out.write("        </a>\n");
      out.write("        \n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp\">Inicio <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp#categorias\">Categorias <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp#lvisitas\">Libro de Visitas <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.jsp#contactanos\">Contactanos <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">Iinicar sesion <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand col-md-8 navbar-light bg-light\">\n");
      out.write("\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Búsqueda:</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Provincia\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Lima</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Distrito\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Agustino</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Barranco</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Cercado de Lima</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Chorrillos</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Independencia</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Jesús María</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">La Victoria</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Miraflores</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">San Borja</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">San Isidro</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">San Miguel</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Santa Anita</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">San Juan de Miraflores</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">San Juan de Lurigancho</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Categoría\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Centros Comerciales</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Cines</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Parques</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Discotecas</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Ingrese lugar...\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <!--buscador end-->       \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--slider start-->\n");
      out.write("    <div id=\"slider\" style=\"max-height: 400px; width: 90%; max-width: 960px; margin: 0 auto\" >\n");
      out.write("        <div class=\"slide\">\n");
      out.write("            <img src=\"\" alt=\"\" data-src-async=\"img/bembos.png\" class=\"formato-img-slider\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("            <img src=\"\" alt=\"\" data-src-async=\"img/kfc-sunny.jpg\" class=\"formato-img-slider\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slide\">\n");
      out.write("            <img src=\"\" alt=\"\" data-src-async=\"img/bembos.png\" class=\"formato-img-slider\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("     <!--slider end-->\n");
      out.write("     \n");
      out.write("    <!--Categorias start-->\n");
      out.write("    <section class=\"container-fluid\">\n");
      out.write("        <a name=\"categorias\"><h2>Categorias</h2></a>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 text-center hover\">\n");
      out.write("                <a href=\"discoteca.jsp\"><img src=\"http://lasentinella.gelocal.it/polopoly_fs/1.16109843.1510516871!/httpImage/image.JPG_gen/derivatives/detail_558/image.JPG\" class=\"formato-img-categorias\"></a>\n");
      out.write("                <div class=\"panel-body\" style=\"background-color: #1535E8\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <h3 style=\"color: whitesmoke; margin: 0\"><b>DISCOTECAS</b> </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 text-center hover\">\n");
      out.write("                <a href=\"cine.jsp\"><img src=\"https://www.elheraldo.co/sites/default/files/articulo/2017/12/30/salas.jpg\" class=\"formato-img-categorias\" ></a>\n");
      out.write("                <div class=\"panel-body\" style=\"background-color: #1535E8\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <h3 style=\"color: whitesmoke; margin: 0\"><b>CINES</b> </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 text-center hover\">\n");
      out.write("                <a href=\"parque.jsp\"><img src=\"http://www.municipalidaddesantiago.cl/wp-content/uploads/2016/backup/DSC_5633ss.jpg\" class=\"formato-img-categorias\"></a>\n");
      out.write("                <div class=\"panel-body\" style=\"background-color: #1535E8\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <h3 style=\"color: whitesmoke; margin: 0\"><b>PARQUES</b> </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 text-center hover\">\n");
      out.write("                <a href=\"cc.jsp\"><img src=\"https://elle.mx/wp-content/uploads/2016/09/DESTACADA-shoppingmalls.jpg\" class=\"formato-img-categorias\" ></a>\n");
      out.write("                <div class=\"panel-body\" style=\"background-color: #1535E8\">\n");
      out.write("                    <div class=\"pull-left\">\n");
      out.write("                        <h3 style=\"color: whitesmoke; margin: 0\"><b>C. COMERCIALES</b> </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <br>\n");
      out.write("    </section> \n");
      out.write("    <!--categorias end-->\n");
      out.write("    \n");
      out.write("    <!--libro de visitas start-->\n");
      out.write("    <section class=\"container-fluid\">\n");
      out.write("    <a name=\"lvisitas\"><h2>Libro de Visitas</h2></a>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    </section>\n");
      out.write("    <!--libros de visitas end-->\n");
      out.write("    \n");
      out.write("    <!--contactanos start-->\n");
      out.write("     <section class=\"container-fluid\">\n");
      out.write("    <a name=\"contactanos\"><h2>Contactanos</h2></a>\n");
      out.write("    <hr>\n");
      out.write("    <br>\n");
      out.write("    </section>\n");
      out.write("    <!--contactanos end-->\n");
      out.write("    \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var slider = new Slider(\"slider\", {\n");
      out.write("            play_icon: '<i class=\"fas fa-play\"></i>',\n");
      out.write("            pause_icon: '<i class=\"far fa-pause-circle\"></i>',\n");
      out.write("            prev_icon: '<i class=\"fas fa-angle-left\"></i>',\n");
      out.write("            next_icon: '<i class=\"fas fa-angle-right\"></i>'\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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