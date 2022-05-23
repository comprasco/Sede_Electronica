/**
 * Funcion que al clickear el link-ver en los campos tipo password muestra los
 * caracteres y viceversa.
 * 
 * @param idElement
 *            id del elemento al que se va aplicar la funcion.
 */
function verContrasena(idElement) {
	var elementToogle = document.getElementById(idElement);

	if (elementToogle.type === "password") {
		elementToogle.type = "text";
	} else {
		elementToogle.type = "password";
	}
}

/**
 * Metodo que permite cambiar url
 * 
 * @returns url limpia de parametros
 */
function limpiarPath() {
	history.pushState(null, null, window.location.pathname);
}

/**
 * Funcion que limpia el contenido de un campo al dar click sobre un icono y
 * adiciona estilo al componente span e input para ser ocultado y adicionar
 * border.
 * 
 * @param idElement
 *            id del elemento que se va limpiar y aplicar estilo.
 * @param idSpan
 *            id del elemento span que se va ocultar.
 */
function limpiarCampo(idElement, idSpan) {
	document.getElementById(idElement).value = '';
	document.getElementById(idSpan).classList.add('ocultar');
	document.getElementById(idElement).classList.add('border-completo');
}

/**
 * Funcion que muestra y oculta los iconos que permiten limpiar y ver en los
 * campos del formulario y aplicar estilos.
 * 
 * @param idInput
 *            id del input que se va limpiar y aplicar estilo.
 * @param idSpan
 *            id del span que se va ocultar o mostrar.
 */
function mostrarLimpiar(idInput, idSpan) {
	if (document.getElementById(idInput).value.length > 0) {
		document.getElementById(idSpan).classList.remove('ocultar');
		document.getElementById(idInput).classList.remove('border-completo');
	} else {
		document.getElementById(idSpan).classList.add('ocultar');
		document.getElementById(idInput).classList.add('border-completo');
	}
}

/**
 * Funcion que invoca la validacion para mostrar los iconos sea de persona
 * natural o persona juridica.
 */
function validarInputVaciosPersona() {
	ocultarTooltips();
	if (PF('tipoPersonaSelect').getSelectedLabel() === 'NATURAL') {
		validarCamposPersonaNatural();
	} else if (PF('tipoPersonaSelect').getSelectedLabel() === 'JURIDICA') {
		validarCamposPersonaJuridica();
	}
}

/**
 * Funcion que muestra u oculta el icono de limpiar al realizar un submit en el
 * formulario login de usuarios.
 */
function validarInputVaciosLogin() {
	var numeroDocumento = document.getElementById('numeroDocumento') != null ? document
			.getElementById('numeroDocumento')
			: document.getElementById('numeroDocumentoD');
	if (numeroDocumento.value.length > 0) {
		numeroDocumento.classList.remove('ocultar');
		numeroDocumento.classList.remove('border-completo');
	}
}

/**
 * Funcion que muestra u oculta el icono de limpiar al realizar un submit en el
 * formulario login de administradores.
 */
function validarInputVaciosLoginAdmin() {
	if (document.getElementById('username').value.length > 0) {
		document.getElementById('spanUserName').classList.remove('ocultar');
		document.getElementById('username').classList.remove('border-completo');
	}
}

/**
 * Funcion que muestra u oculta los iconos limpiar y ver al realizar un submit
 * en el formulario persona natural y saber donde renderizar los iconos.
 */
function validarCamposPersonaNatural() {
	if (document.getElementById('formCrearPersona:numeroDocumentoNatural').value.length > 0) {
		document.getElementById('spanNumeroDocumentoNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:numeroDocumentoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:numeroCelularNatural').value.length > 0) {
		document.getElementById('spanNumeroCelularNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:numeroCelularNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:primerNombreNatural').value.length > 0) {
		document.getElementById('spanPrimerNombreNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:primerNombreNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:segundoNombreNatural').value.length > 0) {
		document.getElementById('spanSegundoNombreNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:segundoNombreNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:primerApellidoNatural').value.length > 0) {
		document.getElementById('spanPrimerApellidoNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:primerApellidoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:segundoApellidoNatural').value.length > 0) {
		document.getElementById('spanSegundoApellidoNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:segundoApellidoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:telefonoFijoNatural').value.length > 0) {
		document.getElementById('spanTelefonoFijoNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:telefonoFijoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:direccionResidenciaNatural').value.length > 0) {
		document.getElementById('spanDireccionResidenciaNat').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:direccionResidenciaNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:correoNatural').value.length > 0) {
		document.getElementById('spanCorreoNat').classList.remove('ocultar');
		document.getElementById('formCrearPersona:correoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:confirmarCorreoNatural').value.length > 0) {
		document.getElementById('spanConfirmarCorreoNatural').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:confirmarCorreoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:confirmarCorreoNatural').value.length > 0) {
		document.getElementById('spanConfirmarCorreoNatural').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:confirmarCorreoNatural').classList
				.remove('border-completo');
	}
}

/**
 * Funcion que muestra u oculta los iconos limpiar y ver al realizar un submit
 * en el formulario persona juridica y saber donde renderizar los iconos.
 */
function validarCamposPersonaJuridica() {
	if (document.getElementById('formCrearPersona:nit').value.length > 0) {
		document.getElementById('spanNitJur').classList.remove('ocultar');
		document.getElementById('formCrearPersona:nit').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:razonSocial').value.length > 0) {
		document.getElementById('spanRazonSocial').classList.remove('ocultar');
		document.getElementById('formCrearPersona:razonSocial').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:celularJuridica').value.length > 0) {
		document.getElementById('spanCelularJur').classList.remove('ocultar');
		document.getElementById('formCrearPersona:celularJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:telefonoFijoJuridica').value.length > 0) {
		document.getElementById('spanTelefonoJur').classList.remove('ocultar');
		document.getElementById('formCrearPersona:telefonoFijoJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:direccionResidenciaJuridica').value.length > 0) {
		document.getElementById('spanDireccionJur').classList.remove('ocultar');
		document.getElementById('formCrearPersona:direccionResidenciaJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:representante').value.length > 0) {
		document.getElementById('spanRepresentanteJur').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:representante').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:correoJuridica').value.length > 0) {
		document.getElementById('spanCorreoJur').classList.remove('ocultar');
		document.getElementById('formCrearPersona:correoJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:confirmarCorreoJuridica').value.length > 0) {
		document.getElementById('spanConfirmarCorreoJur').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:confirmarCorreoJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:contrasenaJuridica').value.length > 0) {
		document.getElementById('spanContrasenaJur').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:contrasenaJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formCrearPersona:confirmarContrasenaJuridica').value.length > 0) {
		document.getElementById('spanConfirmarContrasenaJur').classList
				.remove('ocultar');
		document.getElementById('formCrearPersona:confirmarContrasenaJuridica').classList
				.remove('border-completo');
	}
}

/**
 * Funcion que invoca la validacion para mostrar los iconos para la modificacion
 * de usuarios sea de persona natural o persona juridica.
 */
function validarInputVaciosModificacionPersona() {
	if (PF('tipoPersonaSelect').getSelectedLabel() === 'NATURAL') {
		validarCamposModificacionPersonaNatural();
	} else if (PF('tipoPersonaSelect').getSelectedLabel() === 'JURIDICA') {
		validarCamposModificacionPersonaJuridica();
	}
}

/**
 * Funcion que muestra u oculta los iconos limpiar y ver al realizar un submit
 * en el formulario de modificacion persona natural y saber donde renderizar los
 * iconos.
 */
function validarCamposModificacionPersonaNatural() {

	if (document.getElementById('formEditarPersona:numeroCelularNatural').value.length > 0) {
		document.getElementById('spanNumeroCelularNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:numeroCelularNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:primerNombreNatural').value.length > 0) {
		document.getElementById('spanPrimerNombreNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:primerNombreNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:segundoNombreNatural').value.length > 0) {
		document.getElementById('spanSegundoNombreNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:segundoNombreNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:primerApellidoNatural').value.length > 0) {
		document.getElementById('spanPrimerApellidoNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:primerApellidoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:segundoApellidoNatural').value.length > 0) {
		document.getElementById('spanSegundoApellidoNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:segundoApellidoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:telefonoFijoNatural').value.length > 0) {
		document.getElementById('spanTelefonoFijoNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:telefonoFijoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:direccionResidenciaNatural').value.length > 0) {
		document.getElementById('spanDireccionResidenciaNat').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:direccionResidenciaNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:correoNatural').value.length > 0) {
		document.getElementById('spanCorreoNat').classList.remove('ocultar');
		document.getElementById('formEditarPersona:correoNatural').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:confirmarCorreoNatural').value.length > 0) {
		document.getElementById('spanConfirmarCorreoNatural').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:confirmarCorreoNatural').classList
				.remove('border-completo');
	}
}

/**
 * Funcion que muestra u oculta los iconos limpiar y ver al realizar un submit
 * en el formulario de modificacion persona juridica y saber donde renderizar
 * los iconos.
 */
function validarCamposModificacionPersonaJuridica() {

	if (document.getElementById('formEditarPersona:razonSocial').value.length > 0) {
		document.getElementById('spanRazonSocial').classList.remove('ocultar');
		document.getElementById('formEditarPersona:razonSocial').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:celularJuridica').value.length > 0) {
		document.getElementById('spanCelularJur').classList.remove('ocultar');
		document.getElementById('formEditarPersona:celularJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:telefonoFijoJuridica').value.length > 0) {
		document.getElementById('spanTelefonoJur').classList.remove('ocultar');
		document.getElementById('formEditarPersona:telefonoFijoJuridica').classList
				.remove('border-completo');
	}

	if (document
			.getElementById('formEditarPersona:direccionResidenciaJuridica').value.length > 0) {
		document.getElementById('spanDireccionJur').classList.remove('ocultar');
		document
				.getElementById('formEditarPersona:direccionResidenciaJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:representante').value.length > 0) {
		document.getElementById('spanRepresentanteJur').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:representante').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:correoJuridica').value.length > 0) {
		document.getElementById('spanCorreoJur').classList.remove('ocultar');
		document.getElementById('formEditarPersona:correoJuridica').classList
				.remove('border-completo');
	}

	if (document.getElementById('formEditarPersona:confirmarCorreoJuridica').value.length > 0) {
		document.getElementById('spanConfirmarCorreoJur').classList
				.remove('ocultar');
		document.getElementById('formEditarPersona:confirmarCorreoJuridica').classList
				.remove('border-completo');
	}
}

/**
 * Funcion encargada de generar el submit en caso de que no existan campos
 * vacios en el form asociado al login de usuarios.
 * 
 * @param form
 *            formulario asociado al login de usuarios.
 */
function generarSubmit(contextPath, form) {
	let tipoPesona = PF('tipoPersonaSelect'), tipoDocumento = PF('tipoDocumentoUsuarioSelect'), numDocD = document
			.getElementById('numeroDocumentoD'), numDoc = document
			.getElementById('numeroDocumento');
	let numeroDocumento
	if (tipoDocumento.getSelectedValue() !== 'PS'
			&& tipoDocumento.getSelectedValue() !== 'CE') {
		if (numDoc != null && numDoc.value.length > 0) {
			numeroDocumento = numDoc;
		}
	} else {
		if (numDocD != null && numDocD.value.length > 0) {
			numeroDocumento = numDocD;
		}
	}

	if (tipoPesona && tipoPesona.getSelectedValue() !== '' && tipoDocumento
			&& tipoDocumento.getSelectedValue() !== '' && numeroDocumento
			&& document.getElementById('username').value !== ''
			&& document.getElementById('password').value !== '') {
		form.action = contextPath + '/login';
	}
}

/**
 * Funcion encargada de generar el submit en caso de que no existan campos
 * vacios en el form asociado al login de administradores.
 * 
 * @param form
 *            formulario asociado al login de administradores.
 */
function generarSubmitAdmin(contextPath, form) {
	if (document.getElementById('username').value !== ''
			&& document.getElementById('password').value !== '') {
		form.action = contextPath + '/login';
	}
}

/**
 * Funcion encargada de generar el submit en caso de que no existan campos
 * vacios en el form asociado al login de entidades especiales.
 * 
 * @param form
 *            formulario asociado al login de entidad especial.
 */
function generarSubmitEntidadEspecial(contextPath, form) {
	if (document.getElementById('username').value !== ''
			&& document.getElementById('password').value !== '') {
		form.action = contextPath + '/login';
	}
}

/**
 * Funcion encargada de limpiar el campo de contrasena en el dialogo que
 * confirma la modificacion del usuario
 */
function limpiarCampoContrasenaConfirmacion() {
	document.getElementById('contrasenaValida').value = '';
}

/**
 * Funcion que permite eliminar los tooltips asociados a la contrasena en
 * persona juridica y natural.
 */
function ocultarTooltips() {
	var elementosClassName = document
			.getElementsByClassName('tooltip-contrasena');
	var cont = 0;
	while (elementosClassName[cont]) {
		elementosClassName[cont].removeAttribute("style");
		cont++;
	}
}

// Pendiente por revisar
function limpiarSelectMunicipioNat() {
	document.getElementById('municipioNatural').selectedIndex = 0;
}

// Pendiente por revisar
function limpiarSelectMunicipioJur() {
	document.getElementById('municipioJuridica').selectedIndex = 0;
}

function campoContrasena() {
	if (document.getElementById('contrasenaValida').value !== '') {
		PF('dlgSeguridad').hide();
		return false;
	}
	return true;
}

/**
 * Funcion que permite validar el tipo de documento seleccionado y aplicar un
 * maxlenght dinamico al componente inputtext de numero de documento.
 * 
 * @returns
 */
function asignarMaxCaracteres(form) {
	let numeroDocumentoJuridico = document
			.getElementById(`${form}:numeroDocumentoJuridico`);
	if (numeroDocumentoJuridico) {
		if (PF('tipoDocumentoSelect').getSelectedValue() === 'NIT') {
			numeroDocumentoJuridico.removeAttribute("maxlength");
			numeroDocumentoJuridico.setAttribute("maxlength", "15");
			numeroDocumentoJuridico.placeholder.replace(0, 5);
		} else {
			numeroDocumentoJuridico.removeAttribute("maxlength");
			numeroDocumentoJuridico.setAttribute("maxlength", "10");
			numeroDocumentoJuridico.placeholder.replace(5, 0);
			console.log(numeroDocumentoJuridico.placeholder)
		}
		limpiarCampo(`${form}:numeroDocumentoJuridico`, 'spanNitJur');
	}
}

/**
 * Funcion que permite validar el tipo de documento seleccionado y aplicar un
 * maxlenght dinamico al componente inputtext de numero de documento.
 * 
 * @returns
 */
function asignarMaxCaracteresRestablecerClave() {
	if (PF('tipoDocumentoSelect').getSelectedLabel() === 'NIT') {
		document.getElementById("formRestablecerClave:numeroDocumento")
				.removeAttribute("maxlength");
		document.getElementById("formRestablecerClave:numeroDocumento")
				.setAttribute("maxlength", "15");
		limpiarCampo('formRestablecerClave:numeroDocumento',
				'spanNumeroDocumento');
	} else {
		document.getElementById("formRestablecerClave:numeroDocumento")
				.removeAttribute("maxlength");
		document.getElementById("formRestablecerClave:numeroDocumento")
				.setAttribute("maxlength", "10");
		limpiarCampo('formRestablecerClave:numeroDocumento',
				'spanNumeroDocumento');
	}
}

/**
 * Funcion que permite validar el tipo de documento seleccionado y aplicar un
 * maxlenght dinamico al componente inputtext de numero de documento en la vista
 * login usuarios externos.
 * 
 * @returns
 */
function asignarMaxCaracteresLogin() {
	if (PF('tipoPersonaSelect').getSelectedValue() === 'J'
			&& PF('tipoDocumentoUsuarioSelect').getSelectedValue() === 'NIT') {
		document.getElementById("numeroDocumento").removeAttribute("maxlength");
		document.getElementById("numeroDocumento").setAttribute("maxlength",
				"15");
		limpiarCampo('numeroDocumento', 'spanNumeroDocumento');
	} else {
		document.getElementById("numeroDocumento").removeAttribute("maxlength");
		document.getElementById("numeroDocumento").setAttribute("maxlength",
				"10");
		limpiarCampo('numeroDocumento', 'spanNumeroDocumento');
	}
}

function limpiarLista(widgetVar) {
	PF(widgetVar).panel.find(".ui-selectonemenu-item:eq(0)").click();
}

function generarUsuarioAdministrador() {

	var inputNombreUsuario = document
			.getElementById("formCreacionUsuario:nombreUsuario");
	var inputCorreo = document
			.getElementById("formCreacionUsuario:correoUsuario").value;
	var partesCorreo = inputCorreo.split("@");
	var nombreUsuario = partesCorreo.length >= 1 ? partesCorreo[0] : "";

	inputNombreUsuario.value = nombreUsuario;

}

function irArriba() {

	$('body, html').animate({
		scrollTop : '0px'
	}, 300);
}

function validarFormulario(mensaje) {
	$('body, html').animate({
		scrollTop : '0px'
	}, 300);
	alertify.set('notifier', 'position', 'top-center');
	alertify.error(mensaje, 5);
}

function deshabilitarScrollModales() {
	window.scrollTo(0, 0);
}

window.addEventListener('scroll', deshabilitarScrollModales);

window.removeEventListener('scroll', deshabilitarScrollModales);