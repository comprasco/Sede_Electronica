/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ListaMensajesHitorialNotificacionesWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: ListaMensajesHitorialNotificacionesWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Lista mensajes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ListaMensajesHitorialNotificacionesWSDTO implements Serializable {

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
	 * turno.
	 */
	private String is_turno;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip.
	 */
	private String is_orip;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificadorEE.
	 */
	private String is_identificadorEE;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha envio.
	 */
	private Date id_fechaEnvio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo tramite en curso.
	 */
	private String is_tipoTramiteCurso;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * asunto.
	 */
	private String is_asunto;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cuerpo.
	 */
	private String is_cuerpo;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * para.
	 */
	private String is_para;

	/**
	 * Atributo de instancia tipo lista para definir la propiedad lista nombre tipo
	 * documento.
	 */
	private List<ListaTipoDocumentalWSDTO> illtd_listaTipoDocumentalWsDto;

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
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_nir el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}

	/**
	 * Obtiene el valor para la propiedad orip.
	 *
	 * @return El valor de la propiedad orip
	 */
	public String getIs_orip() {
		return is_orip;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad orip.
	 *
	 * @param as_orip el nuevo valor para la propiedad orip
	 */
	public void setIs_orip(String as_orip) {
		this.is_orip = as_orip;
	}

	/**
	 * Obtiene el valor para la propiedad identificador ee.
	 *
	 * @return El valor de la propiedad identificador ee
	 */
	public String getIs_identificadorEE() {
		return is_identificadorEE;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad identificador ee.
	 *
	 * @param as_identificadorEE el nuevo valor para la propiedad identificador ee
	 */
	public void setIs_identificadorEE(String as_identificadorEE) {
		this.is_identificadorEE = as_identificadorEE;
	}

	/**
	 * Obtiene el valor para la propiedad fecha envio.
	 *
	 * @return El valor de la propiedad fecha envio
	 */
	public Date getId_fechaEnvio() {
		return id_fechaEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha envio.
	 *
	 * @param ad_fechaEnvio el nuevo valor para la propiedad fecha envio
	 */
	public void setId_fechaEnvio(Date ad_fechaEnvio) {
		this.id_fechaEnvio = ad_fechaEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad tipo tramite en curso.
	 *
	 * @return El valor de la propiedad tipo tramite en curso
	 */
	public String getIs_tipoTramiteCurso() {
		return is_tipoTramiteCurso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo tramite en curso.
	 *
	 * @param as_tipoTramiteCurso el nuevo valor para la propiedad tipo tramite en
	 *                            curso
	 */
	public void setIs_tipoTramiteCurso(String as_tipoTramiteCurso) {
		this.is_tipoTramiteCurso = as_tipoTramiteCurso;
	}

	/**
	 * Obtiene el valor para la propiedad asunto.
	 *
	 * @return El valor de la propiedad asunto
	 */
	public String getIs_asunto() {
		return is_asunto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad asunto.
	 *
	 * @param as_asunto el nuevo valor para la propiedad asunto
	 */
	public void setIs_asunto(String as_asunto) {
		this.is_asunto = as_asunto;
	}

	/**
	 * Obtiene el valor para la propiedad cuerpo.
	 *
	 * @return El valor de la propiedad cuerpo
	 */
	public String getIs_cuerpo() {
		return is_cuerpo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cuerpo.
	 *
	 * @param as_cuerpo el nuevo valor para la propiedad cuerpo
	 */
	public void setIs_cuerpo(String as_cuerpo) {
		this.is_cuerpo = as_cuerpo;
	}

	/**
	 * Obtiene el valor para la propiedad para.
	 *
	 * @return El valor de la propiedad para
	 */
	public String getIs_para() {
		return is_para;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad para.
	 *
	 * @param as_para el nuevo valor para la propiedad para
	 */
	public void setIs_para(String as_para) {
		this.is_para = as_para;
	}

	/**
	 * Obtiene el valor para la propiedad lista mensaje tipo documental.
	 *
	 * @return El valor de la propiedad lista mensaje tipo documental
	 */
	public List<ListaTipoDocumentalWSDTO> getIlltd_listaTipoDocumentalWsDto() {
		return illtd_listaTipoDocumentalWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista mensaje tipo documental.
	 *
	 * @param alltd_listaTipoDocumentalWsDto el nuevo valor para la propiedad lista
	 *                                       mensaje tipo documental
	 */
	public void setIlltd_listaTipoDocumentalWsDto(List<ListaTipoDocumentalWSDTO> alltd_listaTipoDocumentalWsDto) {
		this.illtd_listaTipoDocumentalWsDto = alltd_listaTipoDocumentalWsDto;
	}

}
