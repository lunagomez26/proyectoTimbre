function mostrarUpbar() {
    document.getElementById('upbar').classList.toggle('upbar-hide');
    document.getElementById('upbar').classList.toggle('upbar-show');
}
function mostrarSidebar() {
    document.getElementById('sidebar').classList.toggle('sidebar-hide');
    document.getElementById('sidebar').classList.toggle('sidebar-show');
}
document.getElementById('collapse-upbar-boton').onclick = function () {
    mostrarUpbar();
    mostrarSidebar();
}

function mostrarBuscador() {
    document.getElementById('buscar-form').classList.toggle('d-none');
    document.getElementById('buscar-btn').classList.toggle('d-none');
}
document.getElementById('buscar-btn').onclick = function () {
    mostrarBuscador();
}
document.getElementById('mostrar-buscar').onclick = function () {
    mostrarBuscador();
}

function HideMenu(int){
    console.log("holi");
    if (int === 1) {
        document.getElementById('nav-item1').classList.toggle('d-none');
        document.getElementById('nav-item2').classList.toggle('d-none'); 
        document.getElementById('nav-item3').classList.toggle('d-none'); 
        document.getElementById('nav-item4').classList.toggle('d-none'); 
        document.getElementById('nav-item5').classList.toggle('d-none'); 
        document.getElementById('nav-item6').classList.toggle('d-none'); 
        document.getElementById('nav-item7').classList.toggle('d-none'); 
        document.getElementById('nav-item8').classList.toggle('d-none'); 
        document.getElementById('nav-item9').classList.toggle('d-none'); 
        document.getElementById('nav-item10').classList.toggle('d-none'); 
        document.getElementById('nav-item11').classList.toggle('d-none');
        document.getElementById('upton1').classList.toggle('d-none');
        document.getElementById('downton1').classList.toggle('d-none');
    }
    if (int === 2) {
        document.getElementById('nav-item12').classList.toggle('d-none'); 
        document.getElementById('nav-item13').classList.toggle('d-none'); 
        document.getElementById('nav-item14').classList.toggle('d-none'); 
        document.getElementById('nav-item15').classList.toggle('d-none'); 
        document.getElementById('nav-item16').classList.toggle('d-none');
        document.getElementById('upton2').classList.toggle('d-none');
        document.getElementById('downton2').classList.toggle('d-none');
    }
    if (int === 3) {
        document.getElementById('nav-item17').classList.toggle('d-none');
        document.getElementById('nav-item18').classList.toggle('d-none');
        document.getElementById('nav-item19').classList.toggle('d-none');
        document.getElementById('nav-item20').classList.toggle('d-none');
        document.getElementById('nav-item21').classList.toggle('d-none');
        document.getElementById('nav-item22').classList.toggle('d-none');
        document.getElementById('upton3').classList.toggle('d-none');
        document.getElementById('downton3').classList.toggle('d-none');
    }
    if (int === 4) {
        document.getElementById('nav-item23').classList.toggle('d-none'); 
        document.getElementById('nav-item24').classList.toggle('d-none'); 
        document.getElementById('nav-item25').classList.toggle('d-none'); 
        document.getElementById('nav-item26').classList.toggle('d-none'); 
        document.getElementById('nav-item27').classList.toggle('d-none');
        document.getElementById('upton4').classList.toggle('d-none');
        document.getElementById('downton4').classList.toggle('d-none');
    }
}