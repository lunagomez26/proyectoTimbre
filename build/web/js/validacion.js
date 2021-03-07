var formulario = document.getElementById("formulario");
var telefono = document.getElementById("telefono");
var Ndocumento = document.getElementById("Ndocumento");
var nombre = document.getElementById("nombre");
var apellido = document.getElementById("apellidos");

formulario.addEventListener("submit", function(){
    if((nombre.value === " " )|| (apellido.value === " ")|| (telefono.value === " ") || (Ndocumento.value === " ")){
        swal("Registro Denegado", "Todos los campos son obligatorios", "error");
    }
    else{
        swal("Registro Exitoso", "Todos los campos estan completos", "success");
        formulario.reset();
    };
});

console.log(nombre.value, apellido.value, telefono.value, Ndocumento.value);
console.log(nombre, apellido, telefono, Ndocumento, formulario);


