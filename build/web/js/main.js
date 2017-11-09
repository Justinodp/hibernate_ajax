/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function DatosPersonaNueva() {
    var nombre=document.getElementById("nombre").value;
    var paterno= document.getElementById("paterno").value;
    var materno=document.getElementById("materno").value;
    var telefono=document.getElementById("telefono").value;
    var idTipoPersona=document.getElementById("idTipoPersona").value;

    $.post("Registro",
            {
                nombre: nombre,
                paterno: paterno,
                materno: materno,
                telefono: telefono,
                idTipoPersona: idTipoPersona
            },
            function (data) {
                console.log("Data");
                console.log(data);
                if (data.resultado === true) {
                    window.alert("¡Exito "+nombre+"!");
                }
            }
    );
}

