/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumConstantesDevoluciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumConstantesDevoluciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeracion para definir el grupo de constantes para devoluciones. <br>
 * Enum que contiene nombre de los campos de las constantes de devoluciones
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumConstantesDevoluciones {

	/**
	 * Constante de la enumeracion para definir el item:
	 * CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA("CIUDAD_DEVOLUCION_CONSIGNACION_ERRADA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * NUMERO_CUENTA_CONSIGNACION_ERRADA.
	 */
	NUMERO_CUENTA_CONSIGNACION_ERRADA("NUMERO_CUENTA_CONSIGNACION_ERRADA"),

	/**
	 * Constante de la enumeracion para definir el item: TIPO_PERSONA_SOLICITANTE.
	 */
	TIPO_PERSONA_SOLICITANTE("TIPO_PERSONA_SOLICITANTE"),

	// INFO DEVOLUCION CONSIGNACION ERRADA
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION.
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
	 * Constante de la enumeracion para definir el item: NUMERO_CUENTA_BANCARIA_CONSIGNACION.
	 */
	NUMERO_CUENTA_BANCARIA_CONSIGNACION("NUMERO_CUENTA_BANCARIA_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: SOLICITANTE_APODERADO.
	 */
	SOLICITANTE_APODERADO("SOLICITANTE_APODERADO"),
	
	// FIN INFO DEVOLUCION CONSIGNACION ERRADA
	
	// INFO GENERAL DEVOLUCIONES
	/**
	 * Constante de la enumeracion para definir el item: OBSERVACIONES.
	 */
	OBSERVACIONES("OBSERVACIONES"),
	
	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_SOLICITUD.
	 */
	MOTIVO_SOLICITUD("MOTIVO_SOLICITUD"),
	
	// FIN
	
	/**
	 * Constante de la enumeracion para definir el item: NIR.
	 */
	NIR("NIR"),
	
	// El siguiente bloque de datos referencia los datos de identificación del
	// solicitante si es una persona natural, el sistema evalua el siguiente bloque
	// de datos si el campo tipoPersona del xsd es igual a NÑ

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
	 * Constante de la enumeracion para definir el item:
	 * CORREO_ELECTRONICO.
	 */
	CORREO_ELECTRONICO("CORREO_ELECTRONICO"),
	
	// FIN

	// El siguiente bloque de datos referencia los datos de la cuenta bancaria en la
	// que se realizara la devolución del dinero
	
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
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_TIPO_DOCUMENTO.
	 */
	TITULAR_CUENTA_TIPO_DOCUMENTO("TITULAR_CUENTA_TIPO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_NUMERO_DOCUMENTO.
	 */
	TITULAR_CUENTA_NUMERO_DOCUMENTO("TITULAR_CUENTA_NUMERO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_PRIMER_NOMBRE.
	 */
	TITULAR_CUENTA_PRIMER_NOMBRE("TITULAR_CUENTA_PRIMER_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_SEGUNDO_NOMBRE.
	 */
	TITULAR_CUENTA_SEGUNDO_NOMBRE("TITULAR_CUENTA_SEGUNDO_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_PRIMER_APELLIDO.
	 */
	TITULAR_CUENTA_PRIMER_APELLIDO("TITULAR_CUENTA_PRIMER_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_SEGUNDO_APELLIDO.
	 */
	TITULAR_CUENTA_SEGUNDO_APELLIDO("TITULAR_CUENTA_SEGUNDO_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TITULAR_CUENTA_RAZON_SOCIAL.
	 */
	TITULAR_CUENTA_RAZON_SOCIAL("TITULAR_CUENTA_RAZON_SOCIAL"),
	
	// FIN
	
	// INFO DEVOLUCION SERVICIO REGISTRAL

	/**
	 * Constante de la enumeracion para definir el item: TURNO.
	 */
	TURNO("TURNO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * SOLICITANTE_INTERVINIENTE_REGISTRAL.
	 */
	SOLICITANTE_INTERVINIENTE("SOLICITANTE_INTERVINIENTE"),

	/**
	 * Constante de la enumeracion para definir el item: PROCESO.
	 */
	PROCESO("PROCESO"),
	
	// FIN

	// El siguiente bloque de datos referencia los datos de identificación del
	// solicitante si es una persona juridica, el sistema evalua el siguiente bloque
	// de datos si el campo tipoPersona del xsd es igual a J
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_TIPO_DOCUMENTO.
	 */
	EMPRESA_TIPO_DOCUMENTO("EMPRESA_TIPO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_NUMERO_DOCUMENTO.
	 */
	EMPRESA_NUMERO_DOCUMENTO("EMPRESA_NUMERO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_RAZON_SOCIAL.
	 */
	EMPRESA_RAZON_SOCIAL("EMPRESA_RAZON_SOCIAL"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_DIRECCION_CORRESPONDENCIA.
	 */
	EMPRESA_DIRECCION_CORRESPONDENCIA("EMPRESA_DIRECCION_CORRESPONDENCIA"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_TELEFONO_FIJO.
	 */
	EMPRESA_TELEFONO_FIJO("EMPRESA_TELEFONO_FIJO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_TELEFONO_MOVIL.
	 */
	EMPRESA_TELEFONO_MOVIL("EMPRESA_TELEFONO_MOVIL"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * EMPRESA_CORREO_ELECTRONICO.
	 */
	EMPRESA_CORREO_ELECTRONICO("EMPRESA_CORREO_ELECTRONICO"),
	
	// FIN
	
	// El siguiente bloque de datos referencia los datos del poderdante, el sistema
	// evalua el siguiente bloque de datos si el campo SOLICITANTE_APODERADO es
	// igual a S
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_TIPO_DOCUMENTO.
	 */
	PODERDANTE_TIPO_DOCUMENTO("PODERDANTE_TIPO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_NUMERO_DOCUMENTO.
	 */
	PODERDANTE_NUMERO_DOCUMENTO("PODERDANTE_NUMERO_DOCUMENTO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_PRIMER_NOMBRE.
	 */
	PODERDANTE_PRIMER_NOMBRE("PODERDANTE_PRIMER_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_SEGUNDO_NOMBRE.
	 */
	PODERDANTE_SEGUNDO_NOMBRE("PODERDANTE_SEGUNDO_NOMBRE"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_PRIMER_APELLIDO.
	 */
	PODERDANTE_PRIMER_APELLIDO("PODERDANTE_PRIMER_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_SEGUNDO_APELLIDO.
	 */
	PODERDANTE_SEGUNDO_APELLIDO("PODERDANTE_SEGUNDO_APELLIDO"),
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * PODERDANTE_RAZON_SOCIAL.
	 */
	PODERDANTE_RAZON_SOCIAL("PODERDANTE_RAZON_SOCIAL"),
	
	// FIN

	// El siguiente bloque de datos referencia los datos de identificación del
	// interviniente al que representa cuando el solicitante no es un interviniente,
	// es decir cuando el criterio SOLICITANTE_INTERVINIENTE es igual a N
	
	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_TIPO_DOCUMENTO.
	 */
	INTERVINIENTE_TIPO_DOCUMENTO("INTERVINIENTE_TIPO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_NUMERO_DOCUMENTO.
	 */
	INTERVINIENTE_NUMERO_DOCUMENTO("INTERVINIENTE_NUMERO_DOCUMENTO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_PRIMER_NOMBRE.
	 */
	INTERVINIENTE_PRIMER_NOMBRE("INTERVINIENTE_PRIMER_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_SEGUNDO_NOMBRE.
	 */
	INTERVINIENTE_SEGUNDO_NOMBRE("INTERVINIENTE_SEGUNDO_NOMBRE"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_PRIMER_APELLIDO.
	 */
	INTERVINIENTE_PRIMER_APELLIDO("INTERVINIENTE_PRIMER_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * INTERVINIENTE_SEGUNDO_APELLIDO.
	 */
	INTERVINIENTE_SEGUNDO_APELLIDO("INTERVINIENTE_SEGUNDO_APELLIDO"),

	/**
	 * Constante de la enumeracion para definir el item: INTERVINIENTE_RAZON_SOCIAL.
	 */
	INTERVINIENTE_RAZON_SOCIAL("INTERVINIENTE_RAZON_SOCIAL"),

	// FIN

	// El siguiente bloque de datos referencia los actos o certificados del turno
	// ingresado en el campo TURNO sobre el cual se realizara la devolución
	
	/**
	 * Constante de la enumeracion para definir el item: ACTOS_REGISTRAL.
	 */
	ACTOS("ACTOS"),

	/**
	 * Constante de la enumeracion para definir el item: CERTIFICADOS_REGISTRAL.
	 */
	CERTIFICADOS("CERTIFICADOS"),
	
	// FIN

	// INFO DEVOLUCION CUENTA CUPO
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_DEVOLUCION.
	 */
	TIPO_DEVOLUCION("TIPO_DEVOLUCION"),

	INTERVINO_TITULAR_CUENTA_BANCARIA("INTERVINO_TITULAR_CUENTA_BANCARIA_REGISTRAL"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_CUENTA_CUPO.
	 */
	CODIGO_CUENTA_CUPO("CODIGO_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: CODIGO_NOTA_CREDITO.
	 */
	CODIGO_NOTA_CREDITO("CODIGO_NOTA_CREDITO"),
	
	// FIN
	
	MOTIVO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL("MOTIVO_SOLICITUD_DEVOLUCION_SERVICIO_REGISTRAL");    	
	
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
	private EnumConstantesDevoluciones(String as_nombreCampo) {
		this.is_nombreCampo = as_nombreCampo;
	}

	/**
	 * Metodo encargado de obtener fomulario cuenta cupo.
	 *
	 * @return Resultado para obtener enum formulario cuenta cupo retornado como una
	 *         lista de EnumFormularioCuentaCupo
	 */

	public static List<EnumConstantesDevoluciones> obtenerEnumFormularioCuentaCupo() {
		List<EnumConstantesDevoluciones> llefcc_listaEnumFormularioCuentaCupo = new ArrayList<>();
		for (EnumConstantesDevoluciones lefcc_enumFormularioCuentaCupo : EnumConstantesDevoluciones.values()) {
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
