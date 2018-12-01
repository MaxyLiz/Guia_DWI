<!DOCTYPE html>
<%@page import="entidad.Lugar"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>CRUD BD Alumno</title>
    </head>
    <body>  
    <h1>Actualiza alumno</h1>
    
    <% Lugar a = (Lugar) request.getAttribute("data"); %>
    
    <form action="lugar" method="post">
        <input type="hidden" name="metodo" value="actualiza">
        <input type="hidden" name="cod" value="<%= a.getCodlugar()%>">	
        <table >
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" value="<%= a.getNombre()%>" ></td>     
            </tr>
            <tr>
                <td>Departamento</td>
                <td><input type="text" name="departamento" value="<%= a.getDepartamento()%>"></td>
            </tr>
              <tr>
                <td>Provincia</td>
                <td><input type="text" name="provincia" value="<%= a.getProvincia()%>"></td>
            </tr>
              <tr>
                <td>Distrito</td>
                <td><input type="text" name="distrito" value="<%= a.getDistrito()%>"></td>
            </tr>
              <tr>
                <td>Descripcion</td>
                <td><input type="text" name="descripcion" value="<%= a.getDescripcion()%>"></td>
            </tr>
            <tr>
                <td>Foto</td>
                <td><input type="text" name="foto" value="<%= a.getFoto()%>"></td>
            </tr>
            
            	
            <tr>
                <td><input type="submit" value="enviar"></td>
                <td><input type="reset" value="borrar"></td>
            </tr>						
        </table>
    </form>
    </body>
</html>