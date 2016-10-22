$("#formUsuario").validate({
  rules: {
	  usuario: {
		  required: true,
	      minlength: 10
	  },
	  password: {
		  required: true,
		  minlength: 5
	  },
	  nombres: "required",
	  paterno: "required",
	  materno: "required"

  },
  messages: {
	  usuario: {
	      required: "* Usuario Obligatorio.",
	      minlength: "* Longitud minima 3"
	  },
	  password: {
	      required: "* Contrasenia Obligatoria.",
	      minlength: "* Longitud minima 3"
	  },
	  nombres: "* Nombre (s) Obligatorio (os).",
	  paterno: "* Apellido Paterno Obligatorio.",
	  materno: "* Apellido Materno Obligatorio."

  }
});