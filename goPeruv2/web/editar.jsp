<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ACTUALIZAR Cliente</h1>
        
         <h2>Busque un cliente por numero de RUC para modificar</h2>
        
        <form  action="editar" method="post">
                Ingrese el RUC del cliente:
                <input type="text" name="ruc"><br><br>
                <input type="submit" value="Buscar">
                <input type="reset" value="Borrar"> 
                 <input type="button" value="Volver" onclick="location.href='index.jsp'"
        </form>
        
       
    </body>
</html>
