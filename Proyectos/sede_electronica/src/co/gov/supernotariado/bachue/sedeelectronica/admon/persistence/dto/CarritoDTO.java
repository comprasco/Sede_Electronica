/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CarritoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Carrito.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CarritoDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * uuid url carrito.
	 */
	private String is_uuidUrlCarrito;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo transaccion vigente.
	 */
	private String is_modeloTransaccionVigente;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo servicio.
	 */
	private String is_codigoTipoServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo tipo sub servicio.
	 */
	private String is_codigoTipoSubServicio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modo.
	 */
	private String is_modo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * asosiacion.
	 */
	private String is_idAsosiacion;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo TipoProcesoDTO para definir la propiedad tipo
	 * proceso.
	 */
	private TipoProcesoDTO itp_tipoProcesoDto;

	/**
	 * Obtiene el valor para la propiedad uuid url carrito.
	 *
	 * @return El valor de la propiedad uuid url carrito
	 */
	public String getIs_uuidUrlCarrito() {
		return is_uuidUrlCarrito;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uuid url carrito.
	 *
	 * @param as_uuidUrlCarrito el nuevo valor para la propiedad uuid url carrito
	 */
	public void setIs_uuidUrlCarrito(String as_uuidUrlCarrito) {
		this.is_uuidUrlCarrito = as_uuidUrlCarrito;
	}

	/**
	 * Obtiene el valor para la propiedad modelo transaccion vigente.
	 *
	 * @return El valor de la propiedad modelo transaccion vigente
	 */
	public String getIs_modeloTransaccionVigente() {
		return is_modeloTransaccionVigente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modelo transaccion vigente.
	 *
	 * @param as_modeloTransaccionVigente el nuevo valor para la propiedad modelo
	 *                                    transaccion vigente
	 */
	public void setIs_modeloTransaccionVigente(String as_modeloTransaccionVigente) {
		this.is_modeloTransaccionVigente = as_modeloTransaccionVigente;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo servicio.
	 *
	 * @return El valor de la propiedad codigo tipo servicio
	 */
	public String getIs_codigoTipoServicio() {
		return is_codigoTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo servicio.
	 *
	 * @param as_codigoTipoServicio el nuevo valor para la propiedad codigo tipo
	 *                              servicio
	 */
	public void setIs_codigoTipoServicio(String as_codigoTipoServicio) {
		this.is_codigoTipoServicio = as_codigoTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo tipo sub servicio.
	 *
	 * @return El valor de la propiedad codigo tipo sub servicio
	 */
	public String getIs_codigoTipoSubServicio() {
		return is_codigoTipoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo tipo sub servicio.
	 *
	 * @param as_codigoTipoSubServicio el nuevo valor para la propiedad codigo tipo
	 *                                 sub servicio
	 */
	public void setIs_codigoTipoSubServicio(String as_codigoTipoSubServicio) {
		this.is_codigoTipoSubServicio = as_codigoTipoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad modo.
	 *
	 * @return El valor de la propiedad modo
	 */
	public String getIs_modo() {
		return is_modo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad modo.
	 *
	 * @param as_modo el nuevo valor para la propiedad modo
	 */
	public void setIs_modo(String as_modo) {
		this.is_modo = as_modo;
	}

	/**
	 * Obtiene el valor para la propiedad tipo proceso dto.
	 *
	 * @return El valor de la propiedad tipo proceso dto
	 */
	public TipoProcesoDTO getItp_tipoProcesoDto() {
		return itp_tipoProcesoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso dto.
	 *
	 * @param atp_tipoProcesoDto el nuevo valor para la propiedad tipo proceso dto
	 */
	public void setItp_tipoProcesoDto(TipoProcesoDTO atp_tipoProcesoDto) {
		this.itp_tipoProcesoDto = atp_tipoProcesoDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad id asosiacion.
	 *
	 * @return El valor de la propiedad id asosiacion
	 */
	public String getIs_idAsosiacion() {
		return is_idAsosiacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id asosiacion.
	 *
	 * @param as_idAsosiacion el nuevo valor para la propiedad id asosiacion
	 */
	public void setIs_idAsosiacion(String as_idAsosiacion) {
		this.is_idAsosiacion = as_idAsosiacion;
	}
}
