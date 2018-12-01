<!DOCTYPE html>
<%@page import="entidad.Cliente"%>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
        <title>CRUD BD Cliente</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
        <link rel="stylesheet" type="text/css" href="css/mi_css.css" />
    </head>
    <body> 
        <div class="container" style="background: #428BCA; border-radius: 15px">
            <!--logo-->
            <a class="col-sm-3 col-md-2" href="redireccionadministrador.jsp">
                <img class="img-responsive" src="img/LogoGoPeru1.png" alt="LogoGoPerú" >
            </a>
            <h1 class="col-sm-7 col-md-10 text-center">Actualiza Clientes</h1>
        </div>
        <% Cliente a = (Cliente) request.getAttribute("data");%>

        <form action="cliente" method="post">
            <input type="hidden" name="metodo" value="actualiza">
            <input type="hidden" name="cod" value="<%= a.getCodCliente()%>">
            <div class="container">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover>
                           <tr>
                           <td>Nombre</td>
                           <td><input type="text" name="nombre" value="<%= a.getNombre()%>" ></td>     
                        </tr>
                        <tr>
                            <td>Servicio</td>
                            <td><input type="text" name="servicio" value="<%= a.getServicio()%>"></td>
                        </tr>
                        <tr>
                            <td>Correo</td>
                            <td><input type="text" name="correo" value="<%= a.getCorreo()%>"></td>
                        </tr>
                        <tr>
                            <td>Contraseña</td>
                            <td><input type="text" name="contraseña" value="<%= a.getContraseña()%>"></td>
                        </tr>

                        <tr>
                            <td>Nivel</td>
                            <td><input type="text" name="nivel" value="<%= a.getNivel()%>"></td>
                        </tr>

                        <tr>
                            <td><input type="submit" value="enviar"></td>
                            <td><input type="reset" value="borrar"></td>
                        </tr>						
                    </table>
                </div>
            </div>
                 <button type="submit" class="btn btn-danger">Enviar</button>
                 <button type="reset" class="btn btn-danger">Borrar</button>
        </form>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>