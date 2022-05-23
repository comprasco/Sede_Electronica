function alertar(mensaje, type) {
	alertify.set('notifier', 'position', 'top-center');
	switch (type) {
	case 'ERROR':
		alertify.error(mensaje, 5);
		break;
	case 'CONFIRMACION':
		alertify.success(mensaje, 5);
		break;
	case 'INFORMACION':
		alertify.notify(mensaje,'custom', 5);
		break;
	}
}