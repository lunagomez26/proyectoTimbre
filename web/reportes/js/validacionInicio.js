var correo = document.querySelector("#correo");
var formulario = document.querySelector("#formulario");
var password = document.querySelector("#password");

formulario.addEventListener("submit", function(){
   
    if(correo.value === "admin@admin.com"){
        if(password.value === "1234567"){
           swal("Bienvenido", "Administrador", "success");
           window.location.href = 'adm/adm.xhtml';
        }else{
            swal("Denegado", "Contraseña Incorrecta", "error");
            formulario.reset();
        }

    }else if (correo.value === "guardia@guardia.com"){
        if(password.value === "7654321" ){
            swal("Bienvenido", "Guardia", "success");
            window.location.href ='guardia/guardia.xhtml';
        }else{
            swal("Denegado", "Contraseña Incorrecta", "error");
            formulario.reset();
        }
    }else if(correo.value === "residente@residente.com"){
        if(password.value === "soyresidente"){
            swal("Bienvenido", "Residente", "success");
            window.location.href ='residente/residente.xhtml';
        }else{
            swal("Denegado", "Contraseña Incorrecta", "error");
            formulario.reset();
        }
    }else{
        swal("Denegado", "Su usuario no esta dentro del sistema", "error");
            formulario.reset();
    }
});
