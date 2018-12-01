<%-- 
    Document   : cine
    Created on : 19/10/2018, 12:47:53 AM
    Author     : Lyzherg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <title>CINES</title>
        <link rel="stylesheet" href="css/index_style.css">
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
        <br>
        
        <div class="container">
            <div id="body">
                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo" >Cineplanet Centro Cívico</p>
                    </div>
                    <div class="info">
                        <p class="info">

                            Ubicado en:  Cercado de Lima<br>
                            Dirección: Real Plaza Centro Cívico, Av Inca Garcilaso de la Vega 1007<br>
                            <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">CineStar Jiron</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Cercado de Lima<br>
                            Dirección: Jirón de la Unión 798<br>
                            <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">UVK agustino</p>
                    </div>
                    <div class="info">
                        <p class="info">

                            Ubicado en: El Agustino <br>
                            Dirección: Jirón Ancash 2151,<br>
                            <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Cinepolis</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Santa Anita<br>
                            Dirección: Av. Nicolás Ayllón<br>
                            <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Movie time cedros de villa</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en:  Chorrillos <br>
                            Dirección: Av. Sur cdra 6 esquina con Alameda, Av Alameda San Marcos,<br>
                            <br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
