/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionSolicitudModeloDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionSolicitudModeloDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * solicitud modelo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionSolicitudModeloDTO extends GenericoBaseDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado transaccion.
	 */
	private String is_estadoTransaccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * modelo transaccion vigente.
	 */
	private String is_modeloTransaccionVigente;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad id usuario.
	 */
	private UsuarioDTO iu_idUsuario;
	
	/**
	 * Atributo de instancia tipo TipoProcesoDTO para definir la propiedad tipo
	 * proceso.
	 */
	private TipoProcesoDTO itp_tipoProcesoDto;

	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}

	/**
	 * Obtiene el valor para la propiedad estado transaccion.
	 *
	 * @return El valor de la propiedad estado transaccion
	 */
	public String getIs_estadoTransaccion() {
		return is_estadoTransaccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado transaccion.
	 *
	 * @param as_estadoTransaccion el nuevo valor para la propiedad estado
	 *                             transaccion
	 */
	public void setIs_estadoTransaccion(String as_estadoTransaccion) {
		this.is_estadoTransaccion = as_estadoTransaccion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public UsuarioDTO getIu_idUsuario() {
		return iu_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param au_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIu_idUsuario(UsuarioDTO au_idUsuario) {
		this.iu_idUsuario = au_idUsuario;
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

}