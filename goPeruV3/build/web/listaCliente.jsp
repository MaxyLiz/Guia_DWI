<!DOCTYPE html>
<%@page import="entidad.Cliente"%>
<%@page import="java.util.List"%>
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
            <h1 class="col-sm-7 col-md-10 text-center">Listado de Clientes</h1>
        </div>
        <br>
        <div class="container ">
            <a href="cliente?metodo=lista" class="btn btn-primary">Ver toda la BD</a>
        </div>
        <br>
        <div class="container">
            <div class="table-responsive">
                <table class="table table-bordered table-hover">
                    <caption class="grilla_titulo">Lista de Clientes</caption>	

                    <tr class="grilla_cabecera">
                        <th>Codigo</th><th>Nombre</th><th>Servicio</th><th>Correo</th><th>Contraseña</th><th>Eliminar</th><th>Editar</th>
                    </tr>

                    <%
                        List<Cliente> data = (List<Cliente>) request.getAttribute("data");
                        if (data != null) {
                            for (Cliente x : data) {
                    %>
                    <tr class="grilla_campo"> 
                        <td><%= x.getCodCliente()%> </td>
                        <td><%= x.getNombre()%></td>
                        <td><%= x.getServicio()%></td>
                        <td><%= x.getCorreo()%></td>
                        <td><%= x.getContraseña()%></td>
                        <td>
                            <a href="cliente?metodo=elimina&cod=<%= x.getCodCliente()%>">
                                <img alt="Elimina" src="img/Delete.gif">	
                            </a>		
                        </td>
                        <td>
                            <a href="cliente?metodo=busca&cod=<%= x.getCodCliente()%>">
                                <img alt="Actualiza" src="img/Edit.gif">	
                            </a>		
                        </td>			  		
                    </tr>
                    <%
                            }
                        }
                    %>
                </table>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>