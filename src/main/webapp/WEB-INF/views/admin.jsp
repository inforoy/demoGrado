<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola Administrador</title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/extjs/4.2.1/resources/css/ext-all.css" rel="stylesheet" />

<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />

<script type="text/javascript">
Ext.namespace('Banquito');
Ext.create('Ext.form.Panel', {
    title: 'Simple Form',
    bodyPadding: 5,
    width: 350,

    // The form will submit an AJAX request to this URL when submitted
    url: 'save-form.php',

    // Fields will be arranged vertically, stretched to full width
    layout: 'anchor',
    defaults: {
        anchor: '100%'
    },

    // The fields
    defaultType: 'textfield',
    items: [{
        fieldLabel: 'First Name',
        name: 'first',
        allowBlank: false
    },{
        fieldLabel: 'Last Name',
        name: 'last',
        allowBlank: false
    }],

    // Reset and Submit buttons
    buttons: [{
        text: 'Reset',
        handler: function() {
            this.up('form').getForm().reset();
        }
    }, {
        text: 'Submit',
        formBind: true, //only enabled once the form is valid
        disabled: true,
        handler: function() {
            var form = this.up('form').getForm();
            if (form.isValid()) {
                form.submit({
                    success: function(form, action) {
                       Ext.Msg.alert('Success', action.result.msg);
                    },
                    failure: function(form, action) {
                        Ext.Msg.alert('Failed', action.result.msg);
                    }
                });
            }
        }
    }],
    renderTo: Ext.getBody()
});

</script>


</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">CredyUnion</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
	<br/>
	<p>
	Querido <strong>${user}</strong>, Bienvenido a la pAgina de Administrador
	</p>
	
	<p>
	<a class="btn btn-primary btn-lg" role="button" href="<c:url value="/logout" />">Logout</a>
	</p>
	
	</div>
</div>


<script src="https://cdnjs.cloudflare.com/ajax/libs/extjs/4.2.1/ext-all.js"></script>
<script src="/resources/core/js/jquery.min.js"></script>

<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
<script src="${bootstrapJs}"></script>

</body>
</html>