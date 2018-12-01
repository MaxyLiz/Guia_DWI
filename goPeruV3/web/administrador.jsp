
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<%
HttpSession sesion = request.getSession();
if (sesion.getAttribute("nivel")==null) {
    response.sendRedirect("../login.jsp"); 
    }else {
String nivel=sesion.getAttribute("nivel").toString();
if(!nivel.equals("2")){
response.sendRedirect("../login.jsp");
}
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>AdminGoPerù</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
    </head>
    <body>
        <header>
            <!--navegaciòn-->
            <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-goPeru">
                            <span class="sr-only">Desplegar/oculrar Menu</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>

                    </div>
                    <!--Inicia menu-->
                    <div class="collapse navbar-collapse" id="navegacion-goPeru">
                        <ul class="nav navbar-nav">
                            <li class="" ><a href="perfil.jsp">Perfil</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">Nuestros Clientes<span class="caret"></span>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="listaCliente.jsp">Listar Clientes</a></li>
                                        <li class="divider"></li>
                                        <li><a href="insertaCliente.jsp">Insertar Clientes</a></li>
                                        <li class="divider"></li>
                                        <li><a href="actualizaCliente.jsp">Actualizar Clientes</a></li>
                                    </ul>
                                </a>
                            </li>
                            <li class=""><a href="#">Sistema de Lugares</a></li> 
                            <li class=""><a href="#">Sistemas de Ofertas</a></li>
                            <li class=""><a href="./login.jsp?cerrar=true">Cerrar sesión</a></li>
                        </ul>

                    </div>
                </div>  
            </nav>
        </header>
        <!--Jumbotron-->
        <section class="jumbotron" style="margin-top:0px">
            <div class="container">
                <!--logo-->
                <span class="col-md-2">
                    <img class="img-responsive" src="img/LogoGoPeru1.png" alt="LogoGoPerú" >
                </span>
                <p class=" col-md-10 arribaizquierda titulo-web">"Bienvenido Administrador!"</p>   
            </div>
        </section>
        
        <section class="container">
            <div class="row">
                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail" style="background-color:#F9D2D2">
                        <a href=""><img src="img/clientes.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>Clientes</strong></p>
                            <p class="text-center"><a href="listaCliente.jsp">Listar Clientes</a></p>
                
                            <p class="text-center"><a href="actualizaCliente.jsp">Actualizar Clientes</a></p>
                            <p class="text-center"><a href="">Eliminar Cliente</a></p>
                        </div>
                    </div>
                </div>
                

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail" style="background-color:#F9D2D2">
                        <a href=""><img src="img/lugares.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>Nuestros Lugares</strong></p>
                            <p class="text-center"><a href="listaLugar.jsp">Listar Lugares</a></p>
                            <p class="text-center"><a href="listaLugar.jsp" class="text-center">Insertar Lugar</a></p>
                            <p class="text-center"><a href="actualizaLugar.jsp">Actualizar Lugar</a></p>
                            <p class="text-center"><a href="listaLugar.jsp">Eliminar Lugar</a></p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail" style="background-color:#F9D2D2">
                        <a href=""><img src="img/oferta.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>Las Ofertas</strong></p>
                            <p class="text-center"><a href="">Listar Ofertas</a></p>
                            <p class="text-center"><a href="" class="text-center">Insertar Ofertas</a></p>
                            <p class="text-center"><a href="">Actualizar Ofertas</a></p>
                            <p class="text-center"><a href="">Eliminar Ofertas</a></p>
                        </div>
                    </div>
                </div> 
            </div>        
        </section>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
