<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Registrar Empresa</title>

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
    <h1>Registrar Empresa</h1>
    
    <div class="container">
    	<form  id="formEmpresa" class="form-horizontal" data-toggle="validator" role="form" action="" >
		  <div class="form-group">
		    <label for="empresa" class="control-label col-xs-4">Nombre de Empresa</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="empresa" placeholder="Nombre de Empresa" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="fechaCreacion" class="control-label col-xs-4">Fecha de Creacion</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="fechaCreacion" placeholder="Fecha de Creacion" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="btnEmpresa" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnEmpresa" type="button" class="btn btn-default">Registrar Empresa</button>
		  	</div>
		  </div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <script src="static/core/js/jquery.validate.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredEmpresa.js"></script>
    <script src="static/core/js/required/validationEmpresa.js"></script>
    <script src="static/core/js/required/bootstrap-datetimepicker.min.js"></script>
  </body>
</html>