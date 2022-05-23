/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: EnumCatalogoTipoServicio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.enums
 * Nombre del elemento: EnumCatalogoTipoServicio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.enums;

/**
 * Enumeracion para definir el grupo de constantes para Catalogo tipo servicio.
 * <br>
 * Enum que se usa como codigo de catalogo para consultar el catalogo desde base
 * de datos
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public enum EnumCatalogoTipoServicio implements ICatalogable {

	/**
	 * Constante de la enumeracion para definir el item: CREAR_CUENTA_CUPO.
	 */
	// Cuenta cupo
	CREAR_CUENTA_CUPO("CREACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: MODIFICACION_CUENTA_CUPO.
	 */
	MODIFICACION_CUENTA_CUPO("MODIFICACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: CANCELAR_CUENTA_CUPO.
	 */
	CANCELAR_CUENTA_CUPO("CANCELACION_CUENTA_CUPO"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_CANCELACION_CC.
	 */
	DOCUMENTO_CANCELACION_CC("CONSTANCIADECANCELACION"),

	/**
	 * Constante de la enumeracion para definir el item: ENTIDAD_ESPECIAL.
	 */
	// Entidad especial
	ENTIDAD_ESPECIAL("EECE"),

	/**
	 * Constante de la enumeracion para definir el item: DOCUMENTO_PODER.
	 */
	// Cargue poder
	DOCUMENTO_PODER("PODER"),

	/**
	 * Constante de la enumeracion para definir el item: ALERTA_TIERRAS.
	 */
	// Alerta tierras
	ALERTA_TIERRAS("ALERTA_TIERRAS"),

	/**
	 * Constante de la enumeracion para definir el item: INACTIVAR_ALERTA_TIERRAS.
	 */
	INACTIVAR_ALERTA_TIERRAS("INACTIVAR_ALERTA_TIERRAS"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_SERVICIO_REGISTRAL_CREAR.
	 */
	DEVOLUCION_SERVICIO_REGISTRAL_CREAR("DEVOLUCION_SERVICIO_REGISTRAL_CREAR"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CONSIGNACION_ERRADA.
	 */
	DEVOLUCION_CONSIGNACION_ERRADA("DEVOLUCION_CONSIGNACION_ERRADA"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CONSIGNACION_ERRADA_CREAR.
	 */
	DEVOLUCION_CONSIGNACION_ERRADA_CREAR("DEVOLUCION_CONSIGNACION_ERRADA_CREAR"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CUENTA_CUPO.
	 */
	DEVOLUCION_CUENTA_CUPO("DEVOLUCION_CUENTA_CUPO"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_CUENTA_CUPO_CREAR.
	 */
	DEVOLUCION_CUENTA_CUPO_CREAR("DEVOLUCION_CUENTA_CUPO_CREAR"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_SERVICIO_REGISTRAL_RECEPCION.
	 */
	DEVOLUCION_SERVICIO_REGISTRAL_RECEPCION("DEVOLUCION_SERVICIO_REGISTRAL_RECEPCION"),
	
	/**
	 * Constante de la enumeracion para definir el item: DEVOLUCION_SERVICIO_REGISTRAL_PRORROGA.
	 */
	DEVOLUCION_SERVICIO_REGISTRAL_PRORROGA("DEVOLUCION_SERVICIO_REGISTRAL_PRORROGA"),;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private final String is_codigo;
	
	private static final String CS_RECEPCION = "_RECEPCION";

	/**
	 * Construye una nueva instancia/objeto de la clase EnumCatalogoTipoServicio.
	 *
	 * @param as_codigo el parametro codigo
	 */
	private EnumCatalogoTipoServicio(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Metodo que se encarga de consultar segun el proceso para sacar el enum para recepcion
	 * 
	 * @param as_proceso cadena de caracteres con el valor de devolucion para realizar la recepcion
	 * @return EnumCatalogoTipoServicio enum de catalogo para consultar el detalle catalogo
	 */
	public static EnumCatalogoTipoServicio consultarEnumCatalogoRecepcion(String as_proceso) {
		for(EnumCatalogoTipoServicio lects_enumTipoServicio: EnumCatalogoTipoServicio.values())
			if(lects_enumTipoServicio.getIs_codigo().equals(as_proceso+CS_RECEPCION))
				return lects_enumTipoServicio;
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.common.enums.ICatalogable#
	 * getIs_codigo()
	 */
	@Override
	public String getIs_codigo() {
		return is_codigo;
	}

}
