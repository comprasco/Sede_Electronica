var tiempoPasado, contador = 0,
string = window.location.pathname, 
nombreUsuario = document.getElementById("nombreUsuario").value, 
rolUsuario = document.getElementById("rolUsuario").value,
tiempoDeCierreSesion = document.getElementById("tiempoCierreSesion").value;

string = string.substring(string.indexOf("/"),string.indexOf("/",1));
function recargar() {
	let url = `${window.location.origin}${string}/appLogout?alerta=SI&nombreUsuario=${nombreUsuario}&rolUsuario=${rolUsuario}`;
	location.replace(url);
}
tiempoPasado = setTimeout(recargar, tiempoDeCierreSesion);

function reiniciarTiempo(){
    window.clearTimeout(tiempoPasado);
    tiempoPasado = setTimeout(recargar, tiempoDeCierreSesion);
    contador = 0;
}
window.onmousemove = reiniciarTiempo;
window.onkeydown = reiniciarTiempo;

