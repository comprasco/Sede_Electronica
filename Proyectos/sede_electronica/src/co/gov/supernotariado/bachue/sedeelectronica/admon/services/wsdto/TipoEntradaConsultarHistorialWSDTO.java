/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoEntradaConsultarOficinasOrigenTipoWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoEntradaConsultarOficinasOrigenTipoWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.math.BigInteger;
import java.util.Date;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo entrada
 * consultar historial notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoEntradaConsultarHistorialWSDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inicial.
	 */
	private Date id_fechaInicial;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha final.
	 */
	private Date id_fechaFinal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo id.
	 */
	private String is_tipoId;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * identificador.
	 */
	private String is_identificador;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * pagina.
	 */
	private String is_pagina;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo.
	 */
	private String is_direccionCorreoElectronicoDestinatario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * telefono.
	 */
	private BigInteger ibi_numeroTelefonoDestinatario;

	/**
	 * Obtiene el valor para la propiedad tipo fecha incial.
	 *
	 * @return El valor de la propiedad tipo fecha incial
	 */
	public Date getId_fechaInicial() {
		return id_fechaInicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha incial.
	 *
	 * @param ad_fechaInicial el nuevo valor para la propiedad fecha incial
	 */
	public void setId_fechaInicial(Date ad_fechaInicial) {
		this.id_fechaInicial = ad_fechaInicial;
	}

	/**
	 * Obtiene el valor para la propiedad fecha final.
	 *
	 * @return El valor de la propiedad fecha final
	 */
	public Date getId_fechaFinal() {
		return id_fechaFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha final.
	 *
	 * @param ad_fechaFinal el nuevo valor para la propiedad fecha final
	 */
	public void setId_fechaFinal(Date ad_fechaFinal) {
		this.id_fechaFinal = ad_fechaFinal;
	}

	/**
	 * Obtiene el valor para la propiedad tipo id.
	 *
	 * @return El valor de la propiedad tipo id
	 */
	public String getIs_tipoId() {
		return is_tipoId;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo id.
	 *
	 * @param as_tipoId el nuevo valor para la propiedad tipo id
	 */
	public void setIs_tipoId(String as_tipoId) {
		this.is_tipoId = as_tipoId;
	}

	/**
	 * Obtiene el valor para la propiedad identificador.
	 *
	 * @return El valor de la propiedad identificador
	 */
	public String getIs_identificador() {
		return is_identificador;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad identificador.
	 *
	 * @param as_identificador el nuevo valor para la propiedad identificador
	 */
	public void setIs_identificador(String as_identificador) {
		this.is_identificador = as_identificador;
	}

	/**
	 * Obtiene el valor para la propiedad pagina.
	 *
	 * @return El valor de la propiedad pagina
	 */
	public String getIs_pagina() {
		return is_pagina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pagina.
	 *
	 * @param as_pagina el nuevo valor para la propiedad pagina
	 */
	public void setIs_pagina(String as_pagina) {
		this.is_pagina = as_pagina;
	}

	/**
	 * Obtiene el valor para la propiedad correo.
	 *
	 * @return El valor de la propiedad correo
	 */
	public String getIs_direccionCorreoElectronicoDestinatario() {
		return is_direccionCorreoElectronicoDestinatario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo.
	 *
	 * @param as_direccionCorreoElectronicoDestinatario el nuevo valor para la
	 *                                                  propiedad correo
	 */
	public void setIs_direccionCorreoElectronicoDestinatario(String as_direccionCorreoElectronicoDestinatario) {
		this.is_direccionCorreoElectronicoDestinatario = as_direccionCorreoElectronicoDestinatario;
	}

	/**
	 * Obtiene el valor para la propiedad telefono.
	 *
	 * @return El valor de la propiedad telefono
	 */
	public BigInteger getIbi_numeroTelefonoDestinatario() {
		return ibi_numeroTelefonoDestinatario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad telefono.
	 *
	 * @param abi_numeroTelefonoDestinatario el nuevo valor para la propiedad
	 *                                      telefono
	 */
	public void setIbi_numeroTelefonoDestinatario(BigInteger abi_numeroTelefonoDestinatario) {
		this.ibi_numeroTelefonoDestinatario = abi_numeroTelefonoDestinatario;
	}

}
