<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
    </head>
    <body>
        <div class="container" style="background: #428BCA; border-radius: 15px">
            <!--logo-->
            <a class="col-sm-3 col-md-2" href="#navegacion.html">
                <img class="img-responsive" src="img/LogoGoPeru1.png" alt="LogoGoPerú" >
            </a>
            <h1 class="col-sm-7 col-md-10 text-center">Se parte de lo mejor, bienvenido a GoPerú</h1>
        </div>
        
        <div class="container" style="margin-top: 50px">
            <ul class="nav nav-tabs">
                <li class="active"><a href="inicio.jsp">Inicio</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="galeria.jsp">Categorias <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="parque.jsp">Parques</a></li>
                        <li><a href="cine.jsp">Cines</a></li>
                        <li><a href="cc.jsp">Centro Comerciales</a></li>                        
                    </ul>
                </li>
                <li><a href="#">Libro de Visitas</a></li>
            </ul>
        </div>

    </body>
</html>