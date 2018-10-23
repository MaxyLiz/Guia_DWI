<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Insertar autos</h2>
        
        <form action="insertar" method="post" name="mi_form">
            Ingrese nombre del cliente: <input type="text" name="nombre">
            <br>
            Ingrese RUC del cliente:<input type="text" name="ruc">
            <br>
            Ingrese correo del cliente:<input type="text" name="correo">
            <br>
            Ingrese contraseña:<input type="text" name="contra">
            <br>
            Ingrese descripcion del cliente: <textarea name="descripcion" cols="50" rows="5"></textarea>
            <br
            
            <p>
                <input type="submit" value="Grabar">
                <input type="reset" value="Borrar">
        </form>
        <br>
        <input type="button" value="Volver" onclick="location.href='index.jsp'"
    </body>
</html>
