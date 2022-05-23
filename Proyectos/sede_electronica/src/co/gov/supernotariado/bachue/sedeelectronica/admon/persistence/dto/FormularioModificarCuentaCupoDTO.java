/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioModificarCuentaCupoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: FormularioModificarCuentaCupoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Formulario
 * modificar cuenta cupo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class FormularioModificarCuentaCupoDTO extends FormularioGenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * cuenta cupo.
	 */
	private String is_idCuentaCupo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor minimo permitido.
	 */
	private String is_valorMinimoPermitido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor maximo permitido.
	 */
	private String is_valorMaximoPermitido;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor minimo solicitado.
	 */
	private String is_valorMinimoSolicitado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor maximo solicitado.
	 */
	private String is_valorMaximoSolicitado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * motivo solicitud.
	 */
	private String is_motivoSolicitud;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * FormularioModificarCuentaCupoDTO.
	 */
	public FormularioModificarCuentaCupoDTO() {
		is_valorMinimoSolicitado = "";
		is_valorMaximoSolicitado = "";
		is_motivoSolicitud = "";
	}

	/**
	 * Obtiene el valor para la propiedad valor minimo solicitado.
	 *
	 * @return El valor de la propiedad valor minimo solicitado
	 */
	public String getIs_valorMinimoSolicitado() {
		return is_valorMinimoSolicitado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo solicitado.
	 *
	 * @param as_valorMinimoSolicitado el nuevo valor para la propiedad valor minimo
	 *                                 solicitado
	 */
	public void setIs_valorMinimoSolicitado(String as_valorMinimoSolicitado) {
		this.is_valorMinimoSolicitado = as_valorMinimoSolicitado;
	}

	/**
	 * Obtiene el valor para la propiedad valor maximo solicitado.
	 *
	 * @return El valor de la propiedad valor maximo solicitado
	 */
	public String getIs_valorMaximoSolicitado() {
		return is_valorMaximoSolicitado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo solicitado.
	 *
	 * @param as_valorMaximoSolicitado el nuevo valor para la propiedad valor maximo
	 *                                 solicitado
	 */
	public void setIs_valorMaximoSolicitado(String as_valorMaximoSolicitado) {
		this.is_valorMaximoSolicitado = as_valorMaximoSolicitado;
	}

	/**
	 * Obtiene el valor para la propiedad motivo solicitud.
	 *
	 * @return El valor de la propiedad motivo solicitud
	 */
	public String getIs_motivoSolicitud() {
		return is_motivoSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad motivo solicitud.
	 *
	 * @param as_motivoSolicitud el nuevo valor para la propiedad motivo solicitud
	 */
	public void setIs_motivoSolicitud(String as_motivoSolicitud) {
		this.is_motivoSolicitud = as_motivoSolicitud;
	}

	/**
	 * Obtiene el valor para la propiedad valor minimo permitido.
	 *
	 * @return El valor de la propiedad valor minimo permitido
	 */
	public String getIs_valorMinimoPermitido() {
		return is_valorMinimoPermitido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo permitido.
	 *
	 * @param as_valorMinimoPermitido el nuevo valor para la propiedad valor minimo
	 *                                permitido
	 */
	public void setIs_valorMinimoPermitido(String as_valorMinimoPermitido) {
		this.is_valorMinimoPermitido = as_valorMinimoPermitido;
	}

	/**
	 * Obtiene el valor para la propiedad valor maximo permitido.
	 *
	 * @return El valor de la propiedad valor maximo permitido
	 */
	public String getIs_valorMaximoPermitido() {
		return is_valorMaximoPermitido;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo permitido.
	 *
	 * @param as_valorMaximoPermitido el nuevo valor para la propiedad valor maximo
	 *                                permitido
	 */
	public void setIs_valorMaximoPermitido(String as_valorMaximoPermitido) {
		this.is_valorMaximoPermitido = as_valorMaximoPermitido;
	}

	/**
	 * Obtiene el valor para la propiedad id cuenta cupo.
	 *
	 * @return El valor de la propiedad id cuenta cupo
	 */
	public String getIs_idCuentaCupo() {
		return is_idCuentaCupo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id cuenta cupo.
	 *
	 * @param as_idCuentaCupo el nuevo valor para la propiedad id cuenta cupo
	 */
	public void setIs_idCuentaCupo(String as_idCuentaCupo) {
		this.is_idCuentaCupo = as_idCuentaCupo;
	}

}