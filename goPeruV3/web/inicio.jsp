<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/slider.css">
        <script src="javaScript/slider.js"></script>

        <title>GoPerù</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link rel="stylesheet" type="text/css" href="css/galeria.css">
    </head>

    <body>
        <header>
            <!--navegaciòn-->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
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
                            <li class="active" ><a href="#">Inicio</a></li>
                            <li class="dropdown">
                                <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button">Categorias <span class="caret"></span>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="parque.jsp">Parques</a></li>
                                        <li class="divider"></li>
                                        <li><a href="cine.jsp">Cines</a></li>
                                        <li class="divider"></li>
                                        <li><a href="cc.jsp">Centro Comerciales</a></li>
                                    </ul>
                                </a>
                            </li>
                            <li class=""><a href="#">Libro de Visitas</a></li> 
                            <li class=""><a href="#contactenos">Contactenos</a></li>
                            <li class=""><a href="login.jsp">Ingresar</a></li>                         
                        </ul>
                        <form action="" class="navbar-form navbar-right" role="search">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="buscar">
                            </div>
                            <button type="submit" class="btn btn-primary">
                                <span class="glyphicon glyphicon-search"></span>
                            </button>                
                        </form>
                    </div>
                </div>  
            </nav>
        </header>
        <!--Jumbotron-->
        <section class="jumbotron" style="margin-top:50px">
            <div class="container">
                <!--logo-->
                <span class="col-md-2">
                    <img class="img-responsive" src="img/LogoGoPeru1.png" alt="LogoGoPerú" >
                </span>
                <p class=" col-md-10 arribaizquierda titulo-web">"Los mejores lugares aquí..."</p>   
            </div>
        </section>
        <!--slider start-->
        <section class="container">
            <iframe src="slider.jsp" height="450px" width="100%"></iframe>
        </section>

        <!--Gallery thumbnail-->
        <section class="container">
            <a name="" id="categorias"><h2 style="color: #EA503A">Categorias</h2></a>
            <hr>
            <div class="row">
                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="discoteca.jsp"><img src="img/discoteca.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>DISCOTECAS</strong></p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="cine.jsp"><img src="img/cine.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>CINES</strong></p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="parque.jsp"><img src="img/parques.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>PARQUES</strong></p>
                        </div>
                    </div>
                </div> 
            </div>

            <div class="row">
                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="restaurante.jsp"><img src="img/restaurante.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>RESTAURANTES</strong></p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="cc.jsp"><img src="img/centroComercial.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>CENTROS COMERCIALES</strong></p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-6 col-md-4">
                    <div class="thumbnail">
                        <a href="karaoke.jsp"><img src="img/karaoke.jpg" alt="" style="width: 300px; height: 200px;"></a>
                        <div class="caption">
                            <p class="text-primary text-center lead" style="margin: 0"><strong>KARAOKES</strong></p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!--Formulario Contactanos-->
        <section class="container">
            <a name="#contactenos" id="contactenos"><h2 style="color: #EA503A">Contactenos</h2></a>
            <hr>
            <p class="pb-0 mb-0">Te invitamosa contactarnos, te respondemos en brevedad.</p>
            <p class="text-danger text-small pt-0 mt-0">Todos los campos son obligatorios.</p>
            <form action="" class="">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input class="form-control" type="text" id="nombre" placeholder="Nombre">
                </div>
                <div class="form-group">
                    <label for="nombre">Correo Electrónico:</label>
                    <input class="form-control" type="text" id="correo" placeholder="Correo">
                </div>
                <div class="form-group">
                    <label for="mensaje">Mensaje:</label>
                    <textarea class="form-control" id="mensaje" placeholder="Escribe tu mensaje"></textarea>
                </div>
                <button class="btn btn-danger">Enviar</button>
            </form>
        </section>
        <br>
        <br>
        <!--Pie de Pagina-->
        <iframe src="piePagina.jsp" height="300px" width="100%"></iframe>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>