<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>CRUD BD Alumno</title>
    </head>
    <body>  
    <h1>Registro de Alumno</h1>

    <form action="lugar" method="post">
        <input type="hidden" name="metodo" value="registra">	
        <table>
             <tr>
                <td>Codigo</td>
                <td><input type="text" name="codlugar" required></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" required></td>
            </tr>
            <tr>
                <td>Departamento</td>
                <td><input type="text" name="departamento" required></td>
            </tr>
             <tr>
                <td>Provincia</td>
                <td><input type="text" name="provincia" required></td>
            </tr>
             <tr>
                <td>Distrito</td>
                <td><input type="text" name="distrito" required></td>
            </tr>
             <tr>
                <td>Descripcion</td>
                <td><input type="text" name="descripcion" required></td>
            </tr>
               <tr>
                <td>Foto</td>
                <td><input type="text" name="foto" required></td>
            </tr>
            
            	
            <tr>
                <td><input type="submit" value="enviar"></td>
                <td><input type="reset" value="borrar"></td>
            </tr>						
        </table>
    </form>
    </body>
</html>