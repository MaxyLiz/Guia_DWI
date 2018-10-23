<%-- 
    Document   : index
    Created on : 12/10/2018, 08:17:13 PM
    Author     : Maxy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

        <!-- Slider CSS -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link rel="stylesheet" href="css/slider.css">
        <link rel="stylesheet" href="css/estilosfin.css">
        <script src="javaScript/slider.js"></script>
        <title>GoPerú</title>
        <!-- Favicon -->
        <link rel="icon" href="img/go.jpg">
        <!-- Style CSS -->
        <link rel="stylesheet" href="css/style.css">

        <!--fix for scroll spy active menu element-->
    <li style="display:none;"><a href="#header"></a></li>
</head>


<body>

    <nav class="navbar navbar-expand col-md-8 bg-light">
        <a class="navbar-brand" href="#">
            <img src="img/go.jpg" width="100" height="100" alt="">
        </a>
        
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp#categorias">Categorias <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp#lvisitas">Libro de Visitas <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="index.jsp#contactanos">Contactanos <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="login.jsp">Iinicar sesion <span class="sr-only">(current)</span></a>
                </li>


            </ul>

        </div>
    </nav>

    <nav class="navbar navbar-expand col-md-8 navbar-light bg-light">

        <a class="navbar-brand" href="#">Búsqueda:</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Provincia
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Lima</a>


                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Distrito
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Agustino</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Barranco</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Cercado de Lima</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Chorrillos</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Independencia</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Jesús María</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">La Victoria</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Miraflores</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">San Borja</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">San Isidro</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">San Miguel</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Santa Anita</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">San Juan de Miraflores</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">San Juan de Lurigancho</a>

                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Categoría
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Centros Comerciales</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Cines</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Parques</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Discotecas</a>

                    </div>
                </li>

            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Ingrese lugar..." aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
            </form>
        </div>
    </nav>

    <br>
    <!--buscador end-->       


    <!--slider start-->
    <div id="slider" style="max-height: 400px; width: 90%; max-width: 960px; margin: 0 auto" >
        <div class="slide">
            <img src="" alt="" data-src-async="img/bembos.png" class="formato-img-slider">
        </div>
        <div class="slide">
            <img src="" alt="" data-src-async="img/kfc-sunny.jpg" class="formato-img-slider">
        </div>
        <div class="slide">
            <img src="" alt="" data-src-async="img/bembos.png" class="formato-img-slider">
        </div>

    </div>
    <br>
     <!--slider end-->
     
    <!--Categorias start-->
    <section class="container-fluid">
        <a name="categorias"><h2>Categorias</h2></a>
        <hr>
        <div class="row">
            <div class="col-md-3 text-center hover">
                <a href="discoteca.jsp"><img src="http://lasentinella.gelocal.it/polopoly_fs/1.16109843.1510516871!/httpImage/image.JPG_gen/derivatives/detail_558/image.JPG" class="formato-img-categorias"></a>
                <div class="panel-body" style="background-color: #1535E8">
                    <div class="pull-left">
                        <h3 style="color: whitesmoke; margin: 0"><b>DISCOTECAS</b> </h3>
                    </div>
                </div>
            </div>
            <div class="col-md-3 text-center hover">
                <a href="cine.jsp"><img src="https://www.elheraldo.co/sites/default/files/articulo/2017/12/30/salas.jpg" class="formato-img-categorias" ></a>
                <div class="panel-body" style="background-color: #1535E8">
                    <div class="pull-left">
                        <h3 style="color: whitesmoke; margin: 0"><b>CINES</b> </h3>
                    </div>
                </div>
            </div>
            <div class="col-md-3 text-center hover">
                <a href="parque.jsp"><img src="http://www.municipalidaddesantiago.cl/wp-content/uploads/2016/backup/DSC_5633ss.jpg" class="formato-img-categorias"></a>
                <div class="panel-body" style="background-color: #1535E8">
                    <div class="pull-left">
                        <h3 style="color: whitesmoke; margin: 0"><b>PARQUES</b> </h3>
                    </div>
                </div>
            </div>
            <div class="col-md-3 text-center hover">
                <a href="cc.jsp"><img src="https://elle.mx/wp-content/uploads/2016/09/DESTACADA-shoppingmalls.jpg" class="formato-img-categorias" ></a>
                <div class="panel-body" style="background-color: #1535E8">
                    <div class="pull-left">
                        <h3 style="color: whitesmoke; margin: 0"><b>C. COMERCIALES</b> </h3>
                    </div>
                </div>
            </div>
        </div> 
        <br>
    </section> 
    <!--categorias end-->
    
    <!--libro de visitas start-->
    <section class="container-fluid">
    <a name="lvisitas"><h2>Libro de Visitas</h2></a>
    <hr>
    <br>
    </section>
    <!--libros de visitas end-->
    
    <!--contactanos start-->
     <section class="container-fluid">
    <a name="contactanos"><h2>Contactanos</h2></a>
    <hr>
    <br>
    </section>
    <!--contactanos end-->
    
        



    <script>
        var slider = new Slider("slider", {
            play_icon: '<i class="fas fa-play"></i>',
            pause_icon: '<i class="far fa-pause-circle"></i>',
            prev_icon: '<i class="fas fa-angle-left"></i>',
            next_icon: '<i class="fas fa-angle-right"></i>'
        });
    </script>

</body>
</html>
