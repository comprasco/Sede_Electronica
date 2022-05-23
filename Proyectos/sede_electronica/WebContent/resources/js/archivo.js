function descargarArchivo(contenidoEnBlob, nombreArchivo) {
	var reader = new FileReader();
	reader.onload = function(event) {
		var save = document.createElement('a');
		save.href = event.target.result;
		save.target = '_blank';
		save.download = nombreArchivo || 'archivo.dat';
		var clicEvent = new MouseEvent('click', {
			'view' : window,
			'bubbles' : true,
			'cancelable' : true
		});
		save.dispatchEvent(clicEvent);
		(window.URL || window.webkitURL).revokeObjectURL(save.href);
	};
	reader.readAsDataURL(contenidoEnBlob);
}

function botonDescargaArchivo(data, typeMIME, nombreArchivo) {
	var decodedData = window.atob(data);
	var byteNumbers = new Array(decodedData.length);
	for (var i = 0; i < decodedData.length; i++) {
		byteNumbers[i] = decodedData.charCodeAt(i);
	}
	var byteArray = new Uint8Array(byteNumbers);
	var blob = new Blob([ byteArray ], {
		type : typeMIME
	});
	if (window.navigator && window.navigator.msSaveOrOpenBlob) {
		showPDF(blob, nombreArchivo);
	}else{
		descargarArchivo(blob, nombreArchivo);
	}
}

//Metodo para edge
function showPDF (blob, fileName) {
	var newBlob = new Blob([blob], { type: 'application/ pdf'})
	window.navigator.msSaveOrOpenBlob(newBlob,fileName)
	return
}
