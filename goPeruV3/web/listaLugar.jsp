<!DOCTYPE html>
<%@page import="entidad.Lugar"%>
<%@page import="java.util.List"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>CRUD BD Alumno</title>
    <link rel="stylesheet" type="text/css" href="css/mi_css.css" />

    </head>
    <body>
        <h1>Listado de Alumnos</h1>

        <a href="lugar?metodo=lista">Ver toda la BD</a>
        
        <br>
        <table>
            <caption class="grilla_titulo">Lista de Alumnos</caption>	

            <tr class="grilla_cabecera">
                <th>codigo</th><th>Nombre</th><th>Departamento</th><th>provincia</th><th>Distrito</th><th>Descripcion</th><th>Foto</th><th>Eliminar</th><th>Editar</th>
            </tr>
            
            <%
                List<Lugar> data = (List<Lugar>)request.getAttribute("data");
                if(data!= null)
                {
                    for(Lugar x: data)
                    {
                    %>
                        <tr class="grilla_campo"> 
                            <td><%= x.getCodlugar() %> </td>
                            <td><%= x.getNombre() %></td>
                            <td><%= x.getDepartamento() %></td>
                            <td><%= x.getProvincia() %></td>
                            <td><%= x.getDistrito() %></td>
                            <td><%= x.getDescripcion() %></td>
                            <td><%= x.getFoto() %></td>
                            <td>
                                <a href="lugar?metodo=elimina&cod=<%= x.getCodlugar()%>">
                                    <img alt="Elimina" src="images/Delete.gif">	
                                </a>		
                            </td>
                            <td>
                                <a href="lugar?metodo=busca&cod=<%= x.getCodlugar() %>">
                                    <img alt="Actualiza" src="images/Edit.gif">	
                                </a>		
                            </td>			  		
                        </tr>
                    <%
                    }
                }
	  %>
        </table>
    </body>
</html>