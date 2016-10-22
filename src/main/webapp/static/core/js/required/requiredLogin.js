$(document).on("ready", init);

function init(){
	$("span.help-block").hide();
	$("#btnLogin").click(function(){
		var isValid = datosObligatorios(); 
		if(  isValid ){
			
		} else {
			alert("KO");
		}
	});
	$("#usuario").keyup(datosObligatorios);
	$("#password").keyup(datosObligatorios);
}

function datosObligatorios(){
	var isValid = true;
	var usuario = $("#usuario").val();
	if(usuario === null || usuario.length === 0 || usuario.trim() === '' ){
		$("#iconoUsuario").remove();
		$("#usuario").parent().parent().attr("class", "form-group has-error has-feedback");
		$("#usuario").parent().children("span").text("* Usuario Obligatorio.").show();
		$("#usuario").parent().append("<span id='iconoUsuario' class='glyphicon glyphicon-remove form-control-feedback' ></span>");
		isValid = false;
	} else {
		$("#usuario").parent().parent().attr("class", "form-group has-success has-feedback");
		$("#usuario").parent().children("span").text("").hide();
		$("#usuario").parent().append("<span id='iconoUsuario' class='glyphicon glyphicon-ok form-control-feedback' ></span>");
		isValid = true;
	}
	
	var contrasenia = $("#password").val();
	if(contrasenia === null || contrasenia.length === 0 || contrasenia.trim() === '' ){
		$("#iconoPassword").remove();
		$("#password").parent().parent().attr("class", "form-group has-error has-feedback");
		$("#password").parent().children("span").text("* Contrasenia Obligatoria.").show();
		$("#password").parent().append("<span id='iconoPassword' class='glyphicon glyphicon-remove form-control-feedback' ></span>");
		isValid = false;
	} else {
		$("#password").parent().parent().attr("class", "form-group has-success has-feedback");
		$("#password").parent().children("span").text("").hide();
		$("#password").parent().append("<span id='iconoPassword' class='glyphicon glyphicon-ok form-control-feedback' ></span>");
		isValid = true;
	}
	
	return isValid;
	
}
