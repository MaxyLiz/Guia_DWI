<%-- 
    Document   : discoteca
    Created on : 19/10/2018, 12:47:39 AM
    Author     : Lyzherg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

        <title>DISCOTECAS</title>
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

        <!--discotecas start-->
        <div class="container">
            <div id="body">
                <div class="subapartado">			
                    <div class="titulo">
                        <p class="titulo" >Nebula Club Discoteca</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Miraflores<br>
                            Dirección: Jr. Gonzales Prada 194<br>
                            Diversion en pleno centro de Miraflores.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Aura</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: San Borja<br>
                            Dirección: Av. Angamos Este 2681<br>
                            Esta discoteca se encuentra ubicada dentro del Centro comercial Real Plaza de Angamos.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Sargento pimienta Rock Bar</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Barranco<br>
                            Dirección: Av. Francisco Bolognesi 757<br>
                            Discoteca y club nocturno en Barranco, Lima, Peru<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">La casa de la salsa</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: La Victoria<br>
                            Dirección: Jaime Bauzate Y Meza 169<br>
                            Sala de eventos y espectáculos en La Victoria.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Azucar</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en:  San Juan de Lurigancho <br>
                            Dirección: Av Gran Chimú<br>
                            <br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <!--discotecas end-->
    </body>
</html>
