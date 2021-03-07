
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
    document.getElementById('buscar-btn').classList.toggle('d-none')
}
document.getElementById('buscar-btn').onclick = function () {
    mostrarBuscador();
}
document.getElementById('mostrar-buscar').onclick = function () {
    mostrarBuscador();
}

