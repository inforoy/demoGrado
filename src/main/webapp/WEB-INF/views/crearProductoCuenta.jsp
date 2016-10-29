<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Registrar Producto Cuenta</title>

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
    <h1>Registrar Producto Cuenta</h1>
    
    <div class="container">
    	<form  id="formAgencia" class="form-horizontal" data-toggle="validator" role="form" action="" >
		  <div class="form-group">
		    <label for="descripcion" class="control-label col-xs-4">Descripcion</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="descripcion" placeholder="Descripcion" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="montoMinimo" class="control-label col-xs-4">Monto Minimo</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="montoMinimo" placeholder="Monto Minimo" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="montoMaximo" class="control-label col-xs-4">Monto Maximo</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="montoMaximo" placeholder="Monto Maximo" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="tasa" class="control-label col-xs-4">Tasa</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="tasa" placeholder="Tasa" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="btnRegistrarTipoCuenta" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnRegistrarTipoCuenta" type="button" class="btn btn-default">Registrar Tipo Cuenta</button>
		  	</div>
		  </div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <script src="static/core/js/jquery.validate.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredProductoCuenta.js"></script>
    <script src="static/core/js/required/validationProductoCuenta.js"></script>
    <script src="static/core/js/required/bootstrap-datetimepicker.min.js"></script>
  </body>
</html>