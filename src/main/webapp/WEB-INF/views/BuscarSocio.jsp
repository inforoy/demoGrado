<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Buscar Socio</title>

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
    <h1>Buscar Socio</h1>
    
    <div class="container">
    	<form  id="formBuscarSocio" class="form-horizontal" data-toggle="validator" role="form" action="" >
		  <div class="form-group">
		    <label for="dni" class="control-label col-xs-4">DNI</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="dni" placeholder="DNI">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="nombres" class="control-label col-xs-4">Nombres</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="nombres" placeholder="Nombres">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="paterno" class="control-label col-xs-4">Apellido Paterno</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="paterno" placeholder="Apellido Paterno">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="materno" class="control-label col-xs-4">Apellido Materno</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="materno" placeholder="Apellido Materno">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="btnBuscar" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnBuscar" type="button" class="btn btn-default">Buscar</button>
		  	</div>
		  </div>
		</form>
		
		
		
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <script src="static/core/js/jquery.validate.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredBuscarSocio.js"></script>
    <script src="static/core/js/required/validationBuscarSocio.js"></script>
    <script src="static/core/js/required/bootstrap-datetimepicker.min.js"></script>
  </body>
</html>