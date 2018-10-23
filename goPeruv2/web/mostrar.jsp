<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Busqueda de clientes</h1>
        
        <form  action="mostrar" method="post">
                Ingrese RUC del cliente:
                <input type="text" name="ruc"><br><br>
                <input type="submit" value="Enviar">
                <input type="reset" value="Borrar"> 
        </form>
        
        
        
    </body>
</html>
