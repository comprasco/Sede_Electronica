/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadDescargaPdf.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadDescargaPdf
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumDescargaPdf;

/**
 * El elemento Class UtilidadArchivos.<br>
 * Representa un/una utilidad archivos.<br>
 * Clase que contiene utilidad para generar datos basicos para generar un
 * documento pdf
 * 
 * @see ArchivoUtils
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadDescargaPdf {

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadArchivos.
	 */
	private UtilidadDescargaPdf() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo encargado de generar los datos basicos para la generacion de un pdf
	 * 
	 * @return llad_archivos
	 */
	public static List<ArchivosDinamicosDTO> generarDocumentoPdf(ResourceBundle arb_bundleImgGeneral) {

		List<ArchivosDinamicosDTO> llad_archivos = new ArrayList<>();

		String ls_minjusticialogo = arb_bundleImgGeneral.getString(EnumDescargaPdf.CS_MIN_JUSTICIA.getIs_nombreCampo());
		String ls_logonuevopais = arb_bundleImgGeneral.getString(EnumDescargaPdf.CS_LOGO_NUEVO_PAIS.getIs_nombreCampo());
		String ls_iso = arb_bundleImgGeneral.getString(EnumDescargaPdf.CS_ISO.getIs_nombreCampo());
		String ls_snrlogo = arb_bundleImgGeneral.getString(EnumDescargaPdf.CS_SNR_LOGO.getIs_nombreCampo());

		ArchivosDinamicosDTO lad_imagenNuevoPais = new ArchivosDinamicosDTO();
		lad_imagenNuevoPais.setIb_imagenBase64(ls_logonuevopais.getBytes());
		lad_imagenNuevoPais.setIs_extension(EnumDescargaPdf.CS_PNG.getIs_nombreCampo());
		lad_imagenNuevoPais.setIs_nombreArchivo(EnumDescargaPdf.CS_LOGO_NUEVO_PAIS.getIs_nombreCampo());

		ArchivosDinamicosDTO lad_imagenIso = new ArchivosDinamicosDTO();
		lad_imagenIso.setIb_imagenBase64(ls_iso.getBytes());
		lad_imagenIso.setIs_extension(EnumDescargaPdf.CS_PNG.getIs_nombreCampo());
		lad_imagenIso.setIs_nombreArchivo(EnumDescargaPdf.CS_ISO.getIs_nombreCampo());

		ArchivosDinamicosDTO lad_imagenSnrLogo = new ArchivosDinamicosDTO();
		lad_imagenSnrLogo.setIb_imagenBase64(ls_snrlogo.getBytes());
		lad_imagenSnrLogo.setIs_extension(EnumDescargaPdf.CS_PNG.getIs_nombreCampo());
		lad_imagenSnrLogo.setIs_nombreArchivo(EnumDescargaPdf.CS_SNR_LOGO.getIs_nombreCampo());

		ArchivosDinamicosDTO lad_imagenMinJusticia = new ArchivosDinamicosDTO();
		lad_imagenMinJusticia.setIb_imagenBase64(ls_minjusticialogo.getBytes());
		lad_imagenMinJusticia.setIs_extension(EnumDescargaPdf.CS_PNG.getIs_nombreCampo());
		lad_imagenMinJusticia.setIs_nombreArchivo(EnumDescargaPdf.CS_MIN_JUSTICIA.getIs_nombreCampo());

		llad_archivos.add(lad_imagenNuevoPais);
		llad_archivos.add(lad_imagenIso);
		llad_archivos.add(lad_imagenSnrLogo);
		llad_archivos.add(lad_imagenMinJusticia);

		return llad_archivos;
	}

}
