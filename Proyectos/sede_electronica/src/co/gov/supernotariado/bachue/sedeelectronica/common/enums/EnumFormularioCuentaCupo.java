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
 * Enumeracion para definir el grupo de constantes para Formulario cuenta cupo.
 * <br>
 * Enum que contiene nombre de los campos de los formularios cuenta cupo
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumFormularioCuentaCupo {

	/**
	 * Constante de la enumeracion para definir el item: FECHA_DILIGENCIAMIENTO.
	 */
	// Creacion Cuenta Cupo
	FECHA_DILIGENCIAMIENTO("FECHA_DILIGENCIAMIENTO"),

	/**
	 * Constante de la enumeracion para definir el item: CIUDAD.
	 */
	CIUDAD("CIUDAD"),

	/**
	 * Constante de la enumeracion para definir el item: DIGITO_VERIFICACION.
	 */
	DIGITO_VERIFICACION("DIGITO_VERIFICACION"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * TIPO_DOCUMENTO_REPRESENTANTE_LEGAL.
	 */
	TIPO_DOCUMENTO_REPRESENTANTE_LEGAL("TIPO_DOCUMENTO_REPRESENTANTE_LEGAL"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL.
	 */
	NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL("NUMERO_DOCUMENTO_REPRESENTANTE_LEGAL"),

	/**
	 * Constante de la enumeracion para definir el item: OCUPACION_PROFESION.
	 */
	OCUPACION_PROFESION("OCUPACION_PROFESION"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * DESCRIPCION_ACTIVIDAD_ECONOMICA.
	 */
	DESCRIPCION_ACTIVIDAD_ECONOMICA("DESCRIPCION_ACTIVIDAD_ECONOMICA"),

	/**
	 * Constante de la enumeracion para definir el item: SERVICIO_SOLICITADO.
	 */
	SERVICIO_SOLICITADO("SERVICIO_SOLICITADO"),

	/**
	 * Constante de la enumeracion para definir el item: MONTO_SOLICITADO.
	 */
	MONTO_SOLICITADO("MONTO_SOLICITADO"),

	/**
	 * Constante de la enumeracion para definir el item: FRECUENCIA_RECARGA.
	 */
	FRECUENCIA_RECARGA("FRECUENCIA_RECARGA"),

	/**
	 * Constante de la enumeracion para definir el item: NECESIDAD_SOLICITUD.
	 */
	NECESIDAD_SOLICITUD("NECESIDAD_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: DECLARACION_JURAMENTADA.
	 */
	DECLARACION_JURAMENTADA("DECLARACION_JURAMENTADA"),

	/**
	 * Constante de la enumeracion para definir el item: VALOR_MINIMO_PERMITIDO.
	 */
	// Modificacion Cuenta Cupo
	VALOR_MINIMO_PERMITIDO("VALOR_MINIMO_PERMITIDO"),

	/**
	 * Constante de la enumeracion para definir el item: VALOR_MAXIMO_PERMITIDO.
	 */
	VALOR_MAXIMO_PERMITIDO("VALOR_MAXIMO_PERMITIDO"),

	/**
	 * Constante de la enumeracion para definir el item: VALOR_MINIMO_SOLICITADO.
	 */
	VALOR_MINIMO_SOLICITADO("VALOR_MINIMO_SOLICITADO"),

	/**
	 * Constante de la enumeracion para definir el item: VALOR_MAXIMO_SOLICITADO.
	 */
	VALOR_MAXIMO_SOLICITADO("VALOR_MAXIMO_SOLICITADO"),

	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_SOLICITUD.
	 */
	MOTIVO_SOLICITUD("MOTIVO_SOLICITUD"),

	/**
	 * Constante de la enumeracion para definir el item: CIUDAD_FORMULARIO.
	 */
	// Cancelacion Cuenta Cupo
	CIUDAD_FORMULARIO("CIUDAD_FORMULARIO"),

	/**
	 * Constante de la enumeracion para definir el item: MOTIVO_CANCELACION.
	 */
	MOTIVO_CANCELACION("MOTIVO_CANCELACION"),

	/**
	 * Constante de la enumeracion para definir el item: CORREO.
	 */
	CORREO("CORREO"),
	
	/**
	 * Constante de la enumeracion para definir el item: CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION.
	 */
	CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION("CODIGO_ENTIDAD_FINANCIERA_CONSIGNACION"),
	
	/**
	 * Constante de la enumeracion para definir el item: TIPO_CUENTA.
	 */
	TIPO_CUENTA("TIPO_CUENTA");

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
	private EnumFormularioCuentaCupo(String as_nombreCampo) {
		this.is_nombreCampo = as_nombreCampo;
	}

	/**
	 * Metodo encargado de obtener fomulario cuenta cupo.
	 *
	 * @return Resultado para obtener enum formulario cuenta cupo retornado como una
	 *         lista de EnumFormularioCuentaCupo
	 */
	public static List<EnumFormularioCuentaCupo> obtenerEnumFormularioCuentaCupo() {
		List<EnumFormularioCuentaCupo> llefcc_listaEnumFormularioCuentaCupo = new ArrayList<>();
		for (EnumFormularioCuentaCupo lefcc_enumFormularioCuentaCupo : EnumFormularioCuentaCupo.values()) {
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
