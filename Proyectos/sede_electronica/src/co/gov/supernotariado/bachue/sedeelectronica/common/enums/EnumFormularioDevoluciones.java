/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumFormularioCuentaCupo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumFormularioCuentaCupo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para Formulario devoluciones.
 * <br>
 * Enum que contiene nombre de los campos de los formularios devoluciones
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumFormularioDevoluciones {
	
	//Devolucion Consignacion Errada

	/**
	 * Constante de la enumeracion para definir el item: CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA("CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CUENTA_CONSIGNACION_ERRADA.
	 */
	NUMERO_CUENTA_CONSIGNACION_ERRADA("NUMERO_CUENTA_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	MOTIVO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA("MOTIVO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA_SOLICITANTE.
	 */
	TIPO_PERSONA_SOLICITANTE("TIPO_PERSONA_SOLICITANTE"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION.
	 */
	CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION("CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_CONSIGNACION.
	 */
	TIPO_CONSIGNACION("TIPO_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_TIPO_CONSIGNACION.
	 */
	NUMERO_TIPO_CONSIGNACION("NUMERO_TIPO_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: VALOR_CONSIGNACION.
	 */
	VALOR_CONSIGNACION("VALOR_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: FECHA_CONSIGNACION.
	 */
	FECHA_CONSIGNACION("FECHA_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITANTE_CALIDAD_ACTUA.
	 */
	SOLICITANTE_CALIDAD_ACTUA("SOLICITANTE_CALIDAD_ACTUA"),
	
	/**
	 * Constante de la enumeracion para definir el item: NIR_REGISTRAL.
	 */
	NIR_REGISTRAL("NIR_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO.
	 */
	TIPO_DOCUMENTO("TIPO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO.
	 */
	NUMERO_DOCUMENTO("NUMERO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_NOMBRE.
	 */
	PRIMER_NOMBRE("PRIMER_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_NOMBRE.
	 */
	SEGUNDO_NOMBRE("SEGUNDO_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_APELLIDO.
	 */
	PRIMER_APELLIDO("PRIMER_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_APELLIDO.
	 */
	SEGUNDO_APELLIDO("SEGUNDO_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: GENERO.
	 */
	GENERO("GENERO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TELEFONO_FIJO.
	 */
	TELEFONO_FIJO("TELEFONO_FIJO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TELEFONO_MOVIL.
	 */
	TELEFONO_MOVIL("TELEFONO_MOVIL"),
	
	/**
	 * Constante de la enumeracion para definir el item: CORREO_ELECTRONICO.
	 */
	CORREO_ELECTRONICO("CORREO_ELECTRONICO"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TIPO_DOCUMENTO.
	 */
	EMPRESA_TIPO_DOCUMENTO("EMPRESA_TIPO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_NUMERO_DOCUMENTO.
	 */
	EMPRESA_NUMERO_DOCUMENTO("EMPRESA_NUMERO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_RAZON_SOCIAL.
	 */
	EMPRESA_RAZON_SOCIAL("EMPRESA_RAZON_SOCIAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_DIRECCION_CORRESPONDENCIA.
	 */
	EMPRESA_DIRECCION_CORRESPONDENCIA("EMPRESA_DIRECCION_CORRESPONDENCIA"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TELEFONO_FIJO.
	 */
	EMPRESA_TELEFONO_FIJO("EMPRESA_TELEFONO_FIJO"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TELEFONO_MOVIL.
	 */
	EMPRESA_TELEFONO_MOVIL("EMPRESA_TELEFONO_MOVIL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_CORREO_ELECTRONICO.
	 */
	EMPRESA_CORREO_ELECTRONICO("EMPRESA_CORREO_ELECTRONICO"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_ENTIDAD_FINANCIERA.
	 */
	CODIGO_ENTIDAD_FINANCIERA("CODIGO_ENTIDAD_FINANCIERA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_CUENTA.
	 */
	TIPO_CUENTA("TIPO_CUENTA"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CUENTA.
	 */
	NUMERO_CUENTA("NUMERO_CUENTA"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_TIPO_DOCUMENTO.
	 */
	TITULAR_CUENTA_TIPO_DOCUMENTO("TITULAR_CUENTA_TIPO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_NUMERO_DOCUMENTO.
	 */
	TITULAR_CUENTA_NUMERO_DOCUMENTO("TITULAR_CUENTA_NUMERO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_PRIMER_NOMBRE.
	 */
	TITULAR_CUENTA_PRIMER_NOMBRE("TITULAR_CUENTA_PRIMER_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_SEGUNDO_NOMBRE.
	 */
	TITULAR_CUENTA_SEGUNDO_NOMBRE("TITULAR_CUENTA_SEGUNDO_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_PRIMER_APELLIDO.
	 */
	TITULAR_CUENTA_PRIMER_APELLIDO("TITULAR_CUENTA_PRIMER_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_SEGUNDO_APELLIDO.
	 */
	TITULAR_CUENTA_SEGUNDO_APELLIDO("TITULAR_CUENTA_SEGUNDO_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_RAZON_SOCIAL.
	 */
	TITULAR_CUENTA_RAZON_SOCIAL("TITULAR_CUENTA_RAZON_SOCIAL"),
	
	TIPO_DEVOLUCION_CUENTA_CUPO("TIPO_DEVOLUCION_CUENTA_CUPO"),
	CODIGO_ENTIDAD_FINANCIERA_DEVOLUCION_CUENTA_CUPO("CODIGO_ENTIDAD_FINANCIERA_DEVOLUCION_CUENTA_CUPO"),
	TIPO_CUENTA_DEVOLUCION_CUENTA_CUPO("TIPO_CUENTA_DEVOLUCION_CUENTA_CUPO"),
	NUMERO_CUENTA_DEVOLUCION_CUENTA_CUPO("NUMERO_CUENTA_DEVOLUCION_CUENTA_CUPO"),
	TITULAR_TIPO_DOCUMENTO_DEVOLUCION_CUENTA_CUPO("TITULAR_TIPO_DOCUMENTO_DEVOLUCION_CUENTA_CUPO"),
	TITULAR_NUMERO_TITULAR_DEVOLUCION_CUENTA_CUPO("TITULAR_NUMERO_TITULAR_DEVOLUCION_CUENTA_CUPO"),
	TITULAR_NUMERO_DOCUMENTO_DEVOLUCION_CUENTA_CUPO("TITULAR_NUMERO_DOCUMENTO_DEVOLUCION_CUENTA_CUPO"),
	MOTIVO_SOLICITUD_DEVOLUCION_CUENTA_CUPO("MOTIVO_SOLICITUD_DEVOLUCION_CUENTA_CUPO"),
	
	TITULAR_CUENTA_PRIMER_NOMBRE_CUENTA_CUPO("TITULAR_CUENTA_PRIMER_NOMBRE_CUENTA_CUPO"),
	TITULAR_CUENTA_SEGUNDO_NOMBRE_CUENTA_CUPO("TITULAR_CUENTA_SEGUNDO_NOMBRE_CUENTA_CUPO"),
	TITULAR_CUENTA_PRIMER_APELLIDO_CUENTA_CUPO("TITULAR_CUENTA_PRIMER_APELLIDO_CUENTA_CUPO"),
	TITULAR_CUENTA_SEGUNDO_APELLIDO_CUENTA_CUPO("TITULAR_CUENTA_SEGUNDO_APELLIDO_CUENTA_CUPO"),
	TITULAR_CUENTA_RAZON_SOCIAL_CUENTA_CUPO("TITULAR_CUENTA_RAZON_SOCIAL_CUENTA_CUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINO_TITULAR_CUENTA_BANCARIA.
	 */
	INTERVINO_TITULAR_CUENTA_BANCARIA("INTERVINO_TITULAR_CUENTA_BANCARIA"),
	
	// Devolucion Servicio Registral
	
	/**
	 * Constante de la enumeracion para definir el item: TURNO_REGISTRAL.
	 */
	TURNO_REGISTRAL("TURNO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITANTE_INTERVINIENTE_REGISTRAL.
	 */
	SOLICITANTE_INTERVINIENTE_REGISTRAL("SOLICITANTE_INTERVINIENTE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA_SOLICITANTE_REGISTRAL.
	 */
	TIPO_PERSONA_SOLICITANTE_REGISTRAL("TIPO_PERSONA_SOLICITANTE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: PROCESO_REGISTRAL.
	 */
	PROCESO_REGISTRAL("PROCESO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: OBSERVACION_REGISTRAL.
	 */
	OBSERVACION_REGISTRAL("OBSERVACION_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DOCUMENTO_REGISTRAL.
	 */
	TIPO_DOCUMENTO_REGISTRAL("TIPO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_DOCUMENTO_REGISTRAL.
	 */
	NUMERO_DOCUMENTO_REGISTRAL("NUMERO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_NOMBRE_REGISTRAL.
	 */
	PRIMER_NOMBRE_REGISTRAL("PRIMER_NOMBRE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_NOMBRE_REGISTRAL.
	 */
	SEGUNDO_NOMBRE_REGISTRAL("SEGUNDO_NOMBRE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: PRIMER_APELLIDO_REGISTRAL.
	 */
	PRIMER_APELLIDO_REGISTRAL("PRIMER_APELLIDO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: SEGUNDO_APELLIDO_REGISTRAL.
	 */
	SEGUNDO_APELLIDO_REGISTRAL("SEGUNDO_APELLIDO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: GENERO_REGISTRAL.
	 */
	GENERO_REGISTRAL("GENERO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: GENERO_REGISTRAL.
	 */
	CIUDAD_REGISTRAL("CIUDAD_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: DIGITO_VERIFICACION_REGISTRAL.
	 */
	DIGITO_VERIFICACION_REGISTRAL("DIGITO_VERIFICACION_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TELEFONO_FIJO_REGISTRAL.
	 */
	TELEFONO_FIJO_REGISTRAL("TELEFONO_FIJO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TELEFONO_MOVIL_REGISTRAL.
	 */
	TELEFONO_MOVIL_REGISTRAL("TELEFONO_MOVIL_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: CORREO_ELECTRONICO_REGISTRAL.
	 */
	CORREO_ELECTRONICO_REGISTRAL("CORREO_ELECTRONICO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TIPO_DOCUMENTO_REGISTRAL.
	 */
	EMPRESA_TIPO_DOCUMENTO_REGISTRAL("EMPRESA_TIPO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_NUMERO_DOCUMENTO_REGISTRAL.
	 */
	EMPRESA_NUMERO_DOCUMENTO_REGISTRAL("EMPRESA_NUMERO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_RAZON_SOCIAL_REGISTRAL.
	 */
	EMPRESA_RAZON_SOCIAL_REGISTRAL("EMPRESA_RAZON_SOCIAL_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_DIRECCION_CORRESPONDENCIA_REGISTRAL.
	 */
	EMPRESA_DIRECCION_CORRESPONDENCIA_REGISTRAL("EMPRESA_DIRECCION_CORRESPONDENCIA_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TELEFONO_FIJO_REGISTRAL.
	 */
	EMPRESA_TELEFONO_FIJO_REGISTRAL("EMPRESA_TELEFONO_FIJO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_TELEFONO_MOVIL_REGISTRAL.
	 */
	EMPRESA_TELEFONO_MOVIL_REGISTRAL("EMPRESA_TELEFONO_MOVIL_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: EMPRESA_CORREO_ELECTRONICO_REGISTRAL.
	 */
	EMPRESA_CORREO_ELECTRONICO_REGISTRAL("EMPRESA_CORREO_ELECTRONICO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_TIPO_DOCUMENTO.
	 */
	INTERVINIENTE_TIPO_DOCUMENTO("INTERVINIENTE_TIPO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_NUMERO_DOCUMENTO.
	 */
	INTERVINIENTE_NUMERO_DOCUMENTO("INTERVINIENTE_NUMERO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_PRIMER_NOMBRE.
	 */
	INTERVINIENTE_PRIMER_NOMBRE("INTERVINIENTE_PRIMER_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_SEGUNDO_NOMBRE.
	 */
	INTERVINIENTE_SEGUNDO_NOMBRE("INTERVINIENTE_SEGUNDO_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_PRIMER_APELLIDO.
	 */
	INTERVINIENTE_PRIMER_APELLIDO("INTERVINIENTE_PRIMER_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_SEGUNDO_APELLIDO.
	 */
	INTERVINIENTE_SEGUNDO_APELLIDO("INTERVINIENTE_SEGUNDO_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_RAZON_SOCIAL.
	 */
	INTERVINIENTE_RAZON_SOCIAL("INTERVINIENTE_RAZON_SOCIAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_ENTIDAD_FINANCIERA_REGISTRAL.
	 */
	CODIGO_ENTIDAD_FINANCIERA_REGISTRAL("CODIGO_ENTIDAD_FINANCIERA_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_CUENTA_REGISTRAL.
	 */
	TIPO_CUENTA_REGISTRAL("TIPO_CUENTA_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: NUMERO_CUENTA_REGISTRAL.
	 */
	NUMERO_CUENTA_REGISTRAL("NUMERO_CUENTA_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_TIPO_DOCUMENTO_REGISTRAL.
	 */
	TITULAR_CUENTA_TIPO_DOCUMENTO_REGISTRAL("TITULAR_CUENTA_TIPO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_NUMERO_DOCUMENTO_REGISTRAL.
	 */
	TITULAR_CUENTA_NUMERO_DOCUMENTO_REGISTRAL("TITULAR_CUENTA_NUMERO_DOCUMENTO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_PRIMER_NOMBRE_REGISTRAL.
	 */
	TITULAR_CUENTA_PRIMER_NOMBRE_REGISTRAL("TITULAR_CUENTA_PRIMER_NOMBRE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_SEGUNDO_NOMBRE_REGISTRAL.
	 */
	TITULAR_CUENTA_SEGUNDO_NOMBRE_REGISTRAL("TITULAR_CUENTA_SEGUNDO_NOMBRE_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_PRIMER_APELLIDO_REGISTRAL.
	 */
	TITULAR_CUENTA_PRIMER_APELLIDO_REGISTRAL("TITULAR_CUENTA_PRIMER_APELLIDO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_SEGUNDO_APELLIDO_REGISTRAL.
	 */
	TITULAR_CUENTA_SEGUNDO_APELLIDO_REGISTRAL("TITULAR_CUENTA_SEGUNDO_APELLIDO_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: TITULAR_CUENTA_RAZON_SOCIAL_REGISTRAL.
	 */
	TITULAR_CUENTA_RAZON_SOCIAL_REGISTRAL("TITULAR_CUENTA_RAZON_SOCIAL_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: ACTOS_REGISTRAL.
	 */
	ACTOS_REGISTRAL("ACTOS_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADOS_REGISTRAL.
	 */
	CERTIFICADOS_REGISTRAL("CERTIFICADOS_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL.
	 */
	INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL("INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL"),
	
	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_SOLICITUD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	MOTIVO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL("MOTIVO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL"),;
	
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre campo.
	 */
	private final String is_nombreCampo;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumFormularioCuentaCupo.
	 *
	 * @param as_nombreCampo el parametro nombre campo
	 */
	private EnumFormularioDevoluciones(String as_nombreCampo) {
		this.is_nombreCampo = as_nombreCampo;
	}

	/**
	 * Metodo encargado de obtener fomulario cuenta cupo.
	 *
	 * @return Resultado para obtener enum formulario cuenta cupo retornado como una
	 *         lista de EnumFormularioCuentaCupo
	 */
	
	public static List<EnumFormularioDevoluciones> obtenerEnumFormularioCuentaCupo() {
		List<EnumFormularioDevoluciones> llefcc_listaEnumFormularioCuentaCupo = new ArrayList<>();
		for (EnumFormularioDevoluciones lefcc_enumFormularioCuentaCupo : EnumFormularioDevoluciones.values()) {
			llefcc_listaEnumFormularioCuentaCupo.add(lefcc_enumFormularioCuentaCupo);
		}
		return llefcc_listaEnumFormularioCuentaCupo;
	}

	/**
	 * Obtiene el valor para la propiedad nombre campo.
	 *
	 * @return El valor de la propiedad nombre campo
	 */
	public String getIs_nombreCampo() {
		return is_nombreCampo;
	}

}
