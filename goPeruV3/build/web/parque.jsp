<%-- 
    Document   : parque
    Created on : 19/10/2018, 12:48:19 AM
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
        <title>PARQUES</title>
        <link rel="stylesheet" href="css/index_style.css">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
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
                        <p class="titulo" >Parquel El Olivar</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: San Isidro<br>
                            Dirección: Calle La Republica<br>
                            El Parque El Olivar es un hermoso parque tipo bosque en pleno distrito financiero 
                            de San Isidro, poblado con más de 1500 arboles de olivos. Este parque data del período
                            colonial, época en la cual comenzaron también a construirse casas alrededor del parque, 
                            por lo que hoy día podemos encontrar casonas que con el pasar de los años y en una Lima modera,
                            poseen aun una arquitectura de esa época.
                            <br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Parque de la Exposición</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Cercado de Lima<br>
                            Dirección: Av. 28 de Julio<br>
                            El Parque de la Exposición es uno de los parques más bellos de Lima, que acoge edificios
                            históricos, un anfiteatro y tres museos: el MALI - Museo de Arte de Lima, el Museo
                            Metropolitano de Lima y el Museo de Arte Italiano. El Parque de la Exposición está
                            ubicado en el centro de Lima, delimitado por las avenidas Paseo Colón, Inca Garcilaso 
                            de la Vega, Paseo de la República y 28 de Julio, en pleno barrio de Santa Beatriz. 
                            Dentro de su extensión se encuentra también la Escuela Nacional Superior de Arte Dramático.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Parque de la reserva</p>
                    </div>
                    <div class="info">
                        <p class="info">
                            Ubicado en: Cercado de Lima<br>
                            Dirección: Jr. Madre de Dios<br>
                            Icono de la ciudad de Lima y símbolo de la recuperación de los espacios públicos de Lima. 
                            Cuenta con trece fuentes cibernéticas, apoyadas con la más alta tecnología donde la música, 
                            el agua, el sonido y luces láser se mezclan para presentarnos espectáculos únicos e increíbles.<br>
                        </p>
                    </div>
                </div>

                <div class="subapartado">
                    <div class="titulo">
                        <p class="titulo">Parque de las leyendas</p>
                    </div>

                    <div class="info">
                        <p class="info">
                            Ubicado en:  San Miguel<br>
                            Dirección: Av. Las Leyendas 580<br>
                            Uno de los parques mas representativos del país, en ella encontraras el jardín botánico, 
                            arqueología, zoología, entre ellos animales internacionales y de nuestras 3 regiones.<br>
                        </p>
                    </div>
                </div>
                <div class="subapartado">

                    <div class="titulo">
                        <p class="titulo">Parque zonal huiracocha</p>
                    </div>

                    <div class="info">
                        <p class="info">
                            Ubicado en:  San Juan de Lurigancho <br>
                            Dirección: Av. Próceres de la Independencia Cuadra 12<br>
                            Esta ubicado en el distrito de San Juan de Lurigancho, que cuenta con su gran piscina 
                            recreativa y la patera para los niños. Es un excelente lugar para disfrutar buenos 
                            momentos con la familia.<br>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
