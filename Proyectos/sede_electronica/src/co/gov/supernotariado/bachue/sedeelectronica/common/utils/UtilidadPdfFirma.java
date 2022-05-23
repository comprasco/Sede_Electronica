/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadPdfFirma.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadPdfFirma
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import java.io.IOException;
import java.util.List;

import com.lowagie.text.pdf.AcroFields;
import com.lowagie.text.pdf.PdfReader;

/**
 * El elemento Class UtilidadPdfFirma.<br>
 * Representa un/una utilidad validar firma digital.<br>
 * Clase con la utilidad principal para validar firma digital, usa la clase
 * UtilidadPdfFirma
 * 
 * @see UtilidadPdfFirma
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadPdfFirma {

	/**
	 * Define la constante CS_FIRMA_NO_REGISTRADA.
	 */
	private static final String CS_FIRMA_NO_REGISTRADA = "El documento no tiene una firma registrada.";

	/**
	 * Construye una nueva instancia/objeto de la clase UtilidadPdfFirma.
	 */
	private UtilidadPdfFirma() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo encargado de verificar si existe una firma digital
	 * 
	 * @param ab_documentoPdf
	 * @return Boolean
	 */
	public static Boolean verificarExistenciaFirma(byte[] ab_documentoPdf) {
		PdfReader lpr_lectorPdf;
		Boolean lb_validacion = true;
		try {
			lpr_lectorPdf = new PdfReader(ab_documentoPdf);
			AcroFields laf_acroFields = lpr_lectorPdf.getAcroFields();
			List<?> ll_signatureNames = laf_acroFields.getSignatureNames();
			if (ll_signatureNames.isEmpty()) {
				GeneradorGrowlGenerico.generarMensajeError(CS_FIRMA_NO_REGISTRADA);
				return !lb_validacion;
			} else {
				return lb_validacion;
			}
		} catch (IOException aioe_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aioe_excepcion);
		}
		return lb_validacion;
	}

}
