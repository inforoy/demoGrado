<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Registrar Agencia</title>

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
    <h1>Registrar Agencia</h1>
    
    <div class="container">
    	<form  id="formAgencia" class="form-horizontal" data-toggle="validator" role="form" action="" >
		  <div class="form-group">
		    <label for="agencia" class="control-label col-xs-4">Nombre de Agencia</label>
		    <div class="col-xs-8">
		    	<select name="agencia" class="form-control" id="agencia">
				  <option value="value1">Value 1</option> 
				  <option value="value2" selected>Value 2</option>
				  <option value="value3">Value 3</option>
				</select>
		    	
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="descripcion" class="control-label col-xs-4">Descripcion</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="descripcion" placeholder="Descripcion" required>
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="btnEmpresa" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnEmpresa" type="button" class="btn btn-default">Registrar Agencia</button>
		  	</div>
		  </div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <script src="static/core/js/jquery.validate.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredAgencia.js"></script>
    <script src="static/core/js/required/validationAgencia.js"></script>
    <script src="static/core/js/required/bootstrap-datetimepicker.min.js"></script>
  </body>
</html>