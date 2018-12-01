<%-- 
    Document   : login
    Created on : 19/10/2018, 12:24:02 AM
    Author     : Lyzherg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>LoginGoPerú</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <!--Bootsrap 4 CDN-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <!--Fontawesome CDN-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

        <!--Custom styles-->
        <link rel="stylesheet" type="text/css" href="css/style_login.css">
    </head>
    <body background="img/fondo.jpg">
        <div class="container">
            <div class="d-flex justify-content-center h-100">
                <div class="card">
                    <div class="card-header">
                        <h3>Inicia Sesión</h3>
                    </div>
                    <div class="card-body">
                        <form action="Acceder" method="post">
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" name="txtusuario" class="form-control" placeholder="usuario">



                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" name="txtcontra" class="form-control" placeholder="contraseña">


                            </div>
                            <div class="row align-items-center remember">
                                <input type="checkbox">Recuerdáme
                            </div>
                            <div class="form-group">
                                <input type="submit" name="btnIniciar" value="Ingresar" class="btn float-right login_btn">


                            </div>
                        </form>
                        <%

                            HttpSession sesion = request.getSession();
                            int nivel = 0;
                            if (request.getAttribute("nivel") != null) {
                                nivel = (Integer) request.getAttribute("nivel");
                                if (nivel == 1) {
                                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                                    sesion.setAttribute("nivel", nivel);
                                    response.sendRedirect("cliente.jsp");
                                } else if (nivel == 2) {
                                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                                    sesion.setAttribute("nivel", nivel);
                                    response.sendRedirect("administrador.jsp");
                                }

                            }


                        %>

                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            No te has registrado?<a href="insertaCliente.jsp">Regístrate</a>
                        </div>
                        <div class="d-flex justify-content-center">
                            <a href="#">Olvidaste tu contraseña?</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
