$(document).ready(function(){  
  console.log("corriendo: banquito.js");
  //Datemask dd/mm/yyyy
  $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
  //Money Euro
  $("[data-mask]").inputmask();


/*
  $('#ahorroDiario').val($(this).is(':checked'));
    
  $('#ahorroDiario').val("probando"); 

    $('#ahorroCheck').change(function() {
        if($(this).is(":checked")) {
            var returnVal = confirm("Are you sure?");
            $(this).attr("checked", returnVal);
        }
        $('#ahorroDiario').val($(this).is(':checked'));
    });


    $("[type=checkbox]").on("click", function(){
            if ($(this).attr("checked")==undefined) {
                      alert("asas");
                    $(this).attr("checked","checked");
                } else {
                  alert("asas");
                   $(this).attr("checked",false);
                }
        });
*/
}); 