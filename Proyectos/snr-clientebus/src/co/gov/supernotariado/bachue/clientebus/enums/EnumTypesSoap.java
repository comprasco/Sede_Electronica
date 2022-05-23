/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: EnumTypesSoap.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.enums
 * Nombre del elemento: EnumTypesSoap
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.enums;

/**
 * Enumeracion para definir el grupo de constantes para Types soap. <br>
 * Enum que parametriza los Qname para consumo de servicios.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumTypesSoap {

	/**
	 * Constante de la enumeracion para definir el item: QNAME_ENTIDAD.
	 */
	QNAME_ENTIDAD("entidad"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_USUARIO.
	 */
	QNAME_USUARIO("usuario"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CLAVE.
	 */
	QNAME_CLAVE("clave"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CODIGO_DEPARTAMENTO.
	 */
	QNAME_CODIGO_DEPARTAMENTO("codigoDepartamento"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CODIGO_NOTARIA.
	 */
	QNAME_CODIGO_NOTARIA("codigoNotaria"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_REFERENCIA_CATASTRAL.
	 */
	QNAME_REFERENCIA_CATASTRAL("referenciaCatastral"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CHIP.
	 */
	QNAME_CHIP("chip"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_DIRECCION.
	 */
	QNAME_DIRECCION("direccion"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_IMPUESTO.
	 */
	QNAME_IMPUESTO("impuesto"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_PDF.
	 */
	QNAME_PDF("pdf"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_ID_PERSONA.
	 */
	QNAME_ID_PERSONA("idpersona"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_IP.
	 */
	QNAME_IP("ip"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_PARAMETRO.
	 */
	QNAME_PARAMETRO("parametro"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_NUMERO_MATRICULA.
	 */
	QNAME_NUMERO_MATRICULA("numeroMatricula"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CODIGO_COVENIO.
	 */
	QNAME_CODIGO_COVENIO("codigoConvenio"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_ORIP_SOLICITUD.
	 */
	QNAME_ORIP_SOLICITUD("oripSolicitud"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_PRIMER_APELLIDO_SOLICITANTE.
	 */
	QNAME_PRIMER_APELLIDO_SOLICITANTE("primerApellidoSolicitante"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_PRIMER_NOMBRE_SOLICITANTE.
	 */
	QNAME_PRIMER_NOMBRE_SOLICITANTE("primerNombreSolicitante"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_SEGUNDO_APELLIDO_SOLICITANTE.
	 */
	QNAME_SEGUNDO_APELLIDO_SOLICITANTE("segundoApellidoSolicitante"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_SEGUNDO_NOMBRE_SOLICITANTE.
	 */
	QNAME_SEGUNDO_NOMBRE_SOLICITANTE("segundoNombreSolicitante"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_SEGUNDO_NOMBRE_USUARIO.
	 */
	QNAME_SEGUNDO_NOMBRE_USUARIO("segundoNombreUsuario"),

	/**
	 * Constante de la enumeracion para definir el item:
	 * QNAME_SEGUNDO_APELLIDO_USUARIO.
	 */
	QNAME_SEGUNDO_APELLIDO_USUARIO("segundoApellidoUsuario"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_RAZON_SOCIAL.
	 */
	QNAME_RAZON_SOCIAL("razonSocial"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_FECHA_FINAL.
	 */
	QNAME_FECHA_FINAL("fechaFinal"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_TIPO_ID.
	 */
	QNAME_TIPO_ID("tipoID"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_IDENTIFICADOR.
	 */
	QNAME_IDENTIFICADOR("identificador"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_PAGINA.
	 */
	QNAME_PAGINA("pagina"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_TELEFONO.
	 */
	QNAME_TELEFONO("numeroTelefonoDestinatario"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CORREO.
	 */
	QNAME_CORREO("direccionCorreoElectronicoDestinatario"),

	/**
	 * Constante de la enumeracion para definir el item: QNAME_CRITERIO_BUSQUEDA.
	 */
	QNAME_CRITERIO_BUSQUEDA("criterioBusqueda");

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor.
	 */
	private String is_valor;

	/**
	 * Construye una nueva instancia/objeto de la clase EnumTypesSoap.
	 *
	 * @param as_valor el parametro valor
	 */
	private EnumTypesSoap(String as_valor) {
		this.is_valor = as_valor;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getIs_valor() {
		return is_valor;
	}

}
