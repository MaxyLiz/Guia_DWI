<%-- 
    Document   : cc
    Created on : 19/10/2018, 12:48:32 AM
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
        <title>CENTROS COMERCIALES</title>
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
                        <p class="titulo" >Real Plaza Centro Cívico</p>
                    </div>
                    <div class="info">
                        <p class="info">

                            Ubicado en:  Cercado de Lima<br>
                            Dirección: Av Inca Garcilaso de la Vega 1337<br>
                            El Centro Cívico se ubica en un área estratégica frente al Paseo de
                            los Héroes Navales, cuenta con más de 200 tiendas, un amplio patio 
                            de comidas.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Real Plaza Jesus María</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en:  Jesús María<br>
                            Dirección: Av. General Felipe Salaverry Nro. 2370<br>
                            El centro comecial cuenta con más de 200 marcas reunidas en lo que se hace 
                            llamar “El nuevo hábitat de la moda”, ademas tiene 4 sotanos. <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Plaza Norte</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Independencia<br>
                            Dirección: Tomas Valle<br>
                            Es uno de los centros comerciales más grandes del país con 200 mil metros
                            cuadrados, cuenta con tiendas comerciales, restaurantes, una iglesia,
                            un gimnasio, centro de convenciones, un teatro, oficinas gubernamentales, 
                            un canal de televisión (Willax) y un terminal terrestre.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Plaza Lima Sur</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en:  Chorrillos <br>
                            Dirección: Prolong. Paseo de la República s/n Urb<br>
                            Ubicado en el distrito de Chorrillos, este centro comercial cuenta 
                            con múltiples servicios, y es considerado como uno de los más grandes, 
                            modernos e importantes de Lima Metropolitana.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Real plaza Salaverry </p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en:  Jesús María <br>
                            Dirección: Prolong. Paseo de la República s/n Urb<br>
                            <br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
