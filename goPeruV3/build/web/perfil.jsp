<%-- 
    Document   : perfil
    Created on : 29/11/2018, 01:53:50 PM
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil-Admin</title>
        <!-- Favicon -->
        <link rel="icon" href="img/LogoGoPeru1.png">
        <link rel="stylesheet" href="css/material-dashboard.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
     <header>
      <!--navegaciòn-->
      <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
        <div class="container">
          <div class="navbar-header">
             <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-goPeru">
               <span class="sr-only">Desplegar/oculrar Menu</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
             </button>
             
          </div>
          <!--Inicia menu-->
            <div class="collapse navbar-collapse" id="navegacion-goPeru">
              <ul class="nav navbar-nav">
                <li class="" ><a href="perfil.jsp">Perfil</a></li>
                <li class="" ><a href="administrador.jsp">Inicio</a></li>
                <li class=""><a href="listaCliente.jsp">Nuestros Clientes</a></li> 
                <li class=""><a href="#">Sistema de Lugares</a></li> 
                <li class=""><a href="#">Sistemas de Ofertas</a></li>
                <li class=""><a href="inicio.jsp">GoPerú</a></li>
              </ul>
              
            </div>
        </div>  
      </nav>
    </header>
        
        <div class="content">
        <div class="container-fluid">
          <div class="row">
              <div class="col-md-2"></div>  
            <div class="col-md-8">
              <div class="card">
                <div class="card-header card-header-icon card-header-rose">
                  <div class="card-icon">
                   
                  </div>
                  <h4 class="card-title">MI PERFIL</h4>
                </div>
                  
                  <div class="row justify-content-center">
                            <div class="col-md-4">
                                <br>
                                <div class=" card-profile">
                                    <div style="border-radius: 5%" class="card-avatar" id="img_div_id">
                                        <a>  
                            <img src="img/usuario.png" alt="" style="width: 200px; height: auto;">   </a>
                                    </div>
                                </div>
                            </div>
                  </div>
                
                <div class="card-body">
                  <form>
                    <div class="row justify-content-center">
                      <div class="col-md-5">
                          <div class="form-group" >
                          <label class="">Empresa</label>
                          <input type="text" class="form-control" value="Starbucks" disabled>
                        </div>
                      </div>
                     
                    </div>
                    <div class="row justify-content-center ">
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Primer nombre</label>
                            <input type="text" class="form-control" value="Maxy" disabled> 
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Apellido paterno</label>
                            <input type="text" class="form-control" value="Chávez" disabled>  
                        </div>
                      </div>
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Apellido materno</label>
                            <input type="text" class="form-control" value="Pérez" disabled>      
                        </div>
                      </div>
                    </div>
                      
                    <div class="row">
                      <div class="col-md-4">
                        <div class="form-group">
                          <label class="bmd-label-floating">Correo electrónico</label>
 <input type="text" class="form-control" value="maxy_chp@gmail.com" disabled>
                        </div>
                      </div>
                   
                      <div class="col-md-3">
                        <div class="form-group">
                          <label class="bmd-label-floating">Departamento</label>
                           <input type="text" class="form-control" value="Lima" disabled>
                        </div>
                      </div>
                      <div class="col-md-5">
                        <div class="form-group">
                          <label class="bmd-label-floating">Dirección:</label>
                           <input type="text" class="form-control" value="Avenida Perú 1001" disabled>
                        </div>
                      </div>
                      
                    </div>
                   
                    <div class="row justify-content-center ">
                    <input type="submit" name="btnModificar" value="Actualiza Datos" class="btn btn-rose" style="align-content: center" onclick="enviar('actualizaCliente.jsp')">
                    </div>
                  </form>
                </div>
              </div>
            </div>
               <div class="col-md-2"></div>
            
          </div>
        </div>
      </div>
      
    </div>

    </body>
    
     <div class="modal fade" id="miModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">IMPORTANTE</h4>
			</div>
			<div class="modal-body">
				Los datos visualizados han sido declarados por la empresa, es por ello que no se puede modificar desde aquí ya que es considerado información importante. Si es el representante, porfavor comuniquese con nuestra central para ACTUALIZAR LOS DATOS. Muchas Gracias
			</div>
		</div>
	</div>
    </div>
   
</html>

<script language="javascript" type="text/javascript">
function enviar(pagina){
document.nombreDelFormulario.action = pagina;
document.nombreDelFormulario.submit();

}
</script>