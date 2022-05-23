package com.bachue.snr.formularios.factory;

import com.bachue.snr.formularios.dto.comun.FormularioGenericoDTO;
import com.bachue.snr.formularios.dto.comun.GenericoParametrosJasperDTO;
import com.bachue.snr.formularios.dto.comun.ISalidaGenericaDocumentoDTO;
import com.bachue.snr.formularios.dto.comun.SalidaGenericaDocumentoDTO;
import com.bachue.snr.formularios.enums.EnumExtensiones;
import com.bachue.snr.formularios.enums.EnumFormulario;
import com.bachue.snr.formularios.utils.UtilidadFormulario;

import net.sf.jasperreports.engine.JRException;

/**
 * 
 * @version 1.0
 * @author Smartsoft Solutions S.A.S
 * 
 */
public class DocumentosFactory {

	private DocumentosFactory() {
		//Metodo constructor
	}

	/**
	 * Metodo que permite generar un arreglo de bytes
	 * @param afg_formulario dto del formuario que se quiere generar
	 * @return  byte[] del archivo generado
	 * @throws JRException 
	 */
	public static ISalidaGenericaDocumentoDTO generarFormulario(FormularioGenericoDTO afg_formulario) throws JRException {

		byte[] lb_archivoByte = null;
		SalidaGenericaDocumentoDTO lisgd_salidaGenericaDocumento = new SalidaGenericaDocumentoDTO();
		
		if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_CREACION_CUENTA_CUPO.getIs_nombreFormulario())) {
			FormularioCreacionCuentaCupoImpl lfccc_implementacionFormulario = new FormularioCreacionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfccc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_CREACION_CUENTA_CUPO.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_MODIFICACION_CUENTA_CUPO.getIs_nombreFormulario())) {
			FormularioModificacionCuentaCupoImpl lfccc_implementacionFormulario = new FormularioModificacionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfccc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_MODIFICACION_CUENTA_CUPO.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_CANCELACION_CUENTA_CUPO.getIs_nombreFormulario())) {
			FormularioCancelacionCuentaCupoImpl lfccc_implementacionFormulario = new FormularioCancelacionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfccc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_CANCELACION_CUENTA_CUPO.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.ASUNTO_HISTORIAL_NOTIFICACIONES.getIs_nombreFormulario())) {
			AsuntoHistorialNotificacionesImpl lahn_asuntoHistorialNotificacionesImpl = new AsuntoHistorialNotificacionesImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lahn_asuntoHistorialNotificacionesImpl.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.ASUNTO_HISTORIAL_NOTIFICACIONES.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_NIT.getIs_nombreFormulario())) {
			FormularioDevolucionCuentaCupoImpl lfdcc_implementacionFormulario = new FormularioDevolucionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfdcc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_NIT.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_CC.getIs_nombreFormulario())) {
			FormularioDevolucionCuentaCupoImpl lfdcc_implementacionFormulario = new FormularioDevolucionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfdcc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_NOTACREDITO_CC.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_NIT.getIs_nombreFormulario())) {
			FormularioDevolucionCuentaCupoImpl lfdcc_implementacionFormulario = new FormularioDevolucionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfdcc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_NIT.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_CC.getIs_nombreFormulario())) {
			FormularioDevolucionCuentaCupoImpl lfdcc_implementacionFormulario = new FormularioDevolucionCuentaCupoImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfdcc_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_DEVOLUCION_CUENTA_CUPO_CANCELACIONCUENTACUPO_CC.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_PRORROGA_NATURAL.getIs_nombreFormulario())) {
			FormularioProrrogaImpl lfp_implementacionFormulario = new FormularioProrrogaImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfp_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_PRORROGA_NATURAL.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		else if (afg_formulario.getLs_nombreFormulario().equals(EnumFormulario.FORMULARIO_PRORROGA_JURIDICO.getIs_nombreFormulario())) {
			FormularioProrrogaImpl lfp_implementacionFormulario = new FormularioProrrogaImpl();
			GenericoParametrosJasperDTO lgpj_parametrosJasper = lfp_implementacionFormulario.generarGenericoParametros(afg_formulario);
			lb_archivoByte = UtilidadFormulario.generarPdf(EnumFormulario.FORMULARIO_PRORROGA_JURIDICO.getIs_nombreArchivo(), lgpj_parametrosJasper);
			lisgd_salidaGenericaDocumento.setIb_documentoGenerado(lb_archivoByte);
			lisgd_salidaGenericaDocumento.setIs_extension(EnumExtensiones.PDF.getIs_representacion());
			return lisgd_salidaGenericaDocumento;
		}
		return lisgd_salidaGenericaDocumento;

	}

}
