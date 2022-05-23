/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IAsociacionesDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces
 * Nombre del elemento: IAsociacionesDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;

/**
 * Interface para definir operaciones que caracterizan objetos de transferencia
 * de datos (DTO). <br>
 * Permite definir operaciones para un tipo/forma especial de ver un DTO. <br>
 * Define operaciones para representar un DTO como un elemento Asociaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public interface IAsociacionesDTO {

	/**
	 * Metodo que carga el id del usuario.
	 *
	 * @return id usuario
	 */
	public UsuarioDTO getIu_usuarioDto();
	
	/**
	 * Metodo que carga la razon social.
	 *
	 * @return razon social
	 */
	public String getRazonSocial();
	
	/**
	 * Metodo que carga el tipo de documento.
	 *
	 * @return tipo de documento
	 */
	public String getTipoDocumento();

	/**
	 * Metodo que carga el numero de documento.
	 *
	 * @return numero de documento
	 */
	public String getNumeroDocumento();
}
