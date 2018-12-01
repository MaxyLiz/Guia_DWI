<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <title>CRUD BD Cliente</title>
     <!-- Favicon -->
    <link rel="icon" href="img/LogoGoPeru1.png">
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
        <div class="container" style="padding-top: 35px">
              <form action="cliente" method="post">
                <div>
                    <input type="hidden" name="metodo" value="registra">
                </div>
                    <div class="form-group">
                      <label for="codigo">Codigo:</label>
                      <input class="form-control" type="text" name="codcliente" placeholder="Codigo" required>
                    </div>
                    <div class="form-group">
                      <label for="nombre">Nombre:</label>
                      <input class="form-control" type="text" name="nombre" placeholder="Nombre" required>
                    </div>
                    <div class="form-group">
                      <label for="servicio">Servicio:</label>
                      <input class="form-control" type="text" name="servicio" placeholder="Servicio" required>
                    </div>
                    <div class="form-group">
                      <label for="correo">Correo:</label>
                      <input class="form-control" type="text" name="correo" placeholder="Email" required>
                    </div>
                    <div class="form-group">
                      <label for="contraseña">Contraseña:</label>
                      <input class="form-control" type="text" name="contraseña" placeholder="Contraseña" required>
                    </div>
                  
                    <div class="form-group">
                      <label for="nivel">Nivel:</label>
                      <input class="form-control" type="text" name="nivel" placeholder="Nivel" required>
                    </div>
                  
                      <button type="submit" class="btn btn-danger">Enviar</button>
                      <button type="reset" class="btn btn-danger">Borrar</button>
              </form>
        </div>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>