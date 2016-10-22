<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>

    <!-- Bootstrap -->
    <link href="static/core/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <h1>Login!</h1>
    
    <div class="container">
    	<form action="" role="form" class="form-horizontal">
		  <div class="form-group has-feedback">
		    <label for="usuario" class="control-label col-xs-4">Nombre de Usuario</label>
		    <div class="col-xs-8">
		    	<input type="text" class="form-control" id="usuario" placeholder="Nombre de Usuario">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group has-feedback">
		    <label for="password" class="control-label col-xs-4">Contrasenia</label>
		    <div class="col-xs-8">
		    	<input type="password" class="form-control" id="password" placeholder="Contrasenia">
		    	<span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		  	<label for="btnLogin" class="control-label col-xs-4"></label>
		  	<div class="col-xs-8">
		  		<button id="btnLogin" type="button" class="btn btn-default">Iniciar Sesion</button>
		  	</div>
		  	
		  </div>
		</form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="static/core/js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/core/js/bootstrap.min.js"></script>
    <script src="static/core/js/required/requiredLogin.js"></script>
  </body>
</html>