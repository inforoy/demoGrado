<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Registrar Socio</title>

    <!-- Bootstrap -->
    <link href="static/core/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/core/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <h1>Registrar Socio</h1>
    
    <div class="container">
    	<form  id="formAgencia" class="form-horizontal" data-toggle="validator" role="form" action="" >
		  <div class="form-group">
		    <label for="dni" class="control-label col-xs-4">DNI</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="dni" placeholder="Numero de DNI" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="paterno" class="control-label col-xs-4">Apellido Paterno</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="paterno" placeholder="Apellido Paterno" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="materno" class="control-label col-xs-4">Apellido Materno</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="materno" placeholder="Apellido Materno" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="nombres" class="control-label col-xs-4">Nombres</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="nombres" placeholder="Nombres" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="agencia" class="control-label col-xs-4">Agencia</label>
		    <div class="col-xs-8">
		    	<select name="agencia" class="form-control" id="agencia">
				  <option value="">Seleccione</option> 
				  <option value="value2" >Ayacucho</option>
				  <option value="value3">Lima</option>
				</select>
		    	
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="fechaIngreso" class="control-label col-xs-4">Fecha de Ingreso</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="fechaIngreso" placeholder="Fecha de Ingreso" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="fechaNacimiento" class="control-label col-xs-4">Fecha de Nacimiento</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="fechaNacimiento" placeholder="Fecha de Nacimiento" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="email" class="control-label col-xs-4">Correo Electronico</label>
		    <div class="col-xs-8">
		    	<input type="email" class="form-control" id="email" placeholder="Correo Electronico">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="telefonoFijo" class="control-label col-xs-4">Telefono Fijo</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="telefonoFijo" placeholder="Telefono Fijo">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="telefonoMovil" class="control-label col-xs-4">Telefono Movil</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="telefonoMovil" placeholder="Telefono Movil">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
		  <label for="btnCancelarSocio" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnCancelarSocio" type="button" class="btn btn-default">Salir</button>
		  	</div>
		  	<label for="btnRegistrarSocio" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnRegistrarSocio" type="button" class="btn btn-default">Registrar Socio</button>
		  	</div>
		  </div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <script src="static/core/js/jquery.validate.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredSocio.js"></script>
    <script src="static/core/js/required/validationSocio.js"></script>
    <script src="static/core/js/required/bootstrap-datetimepicker.min.js"></script>
  </body>
</html>