const form = document.querySelector('#formulario');
const correo = document.querySelector('#correo');

form.addEventListener("submit", function(){
    swal('Verifique su correo electronico', 'Se ha enviado un link para la recuperación de su contraseña', 'success');
    
})