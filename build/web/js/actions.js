function muestraAlert(element) {
  console.log("Aqui va todo");
  console.log(element);
  window.alert("click en el elemento con el id" +elemnt.id)
}

function muestraIngreso() {
  var text=document.getElementById("inputPro").value;
  window.alert(text+" esto ingreso")
}

function muestraDatos() {
 console.log("Nombre: "+document.getElementById("name").value);
 console.log("Correo Electronico: "+document.getElementById("email").value);
 console.log("Contraseña: "+document.getElementById("psw").value);
}
