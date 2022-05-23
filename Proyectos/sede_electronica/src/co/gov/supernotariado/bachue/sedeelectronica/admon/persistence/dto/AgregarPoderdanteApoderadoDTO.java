/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AgregarPoderdanteApoderadoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: AgregarPoderdanteApoderadoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Agregar poderdante
 * apoderado.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AgregarPoderdanteApoderadoDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id.
	 */
	private String is_id;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	private String is_tipoDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	private String is_numeroDocumento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * primer nombre.
	 */
	private String is_nombre;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tarjeta profesional.
	 */
	private String is_tarjetaProfesional;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha creacion.
	 */
	private Date id_fechaCreacion;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad tipo.
	 */
	private Boolean ib_tipo;
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * seleccion.
	 */
	private Boolean ib_seleccion;
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * solicitante.
	 */
	private Boolean ib_solicitante;
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * reconocimiento.
	 */
	private Boolean ib_reconocimiento;
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad estado.
	 */
	private String is_estado;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AgregarPoderdanteApoderadoDTO.
	 */
	public AgregarPoderdanteApoderadoDTO() {
		is_tarjetaProfesional = "-";
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getIs_nombre() {
		return is_nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param as_nombre el nuevo valor para la propiedad nombre
	 */
	public void setIs_nombre(String as_nombre) {
		this.is_nombre = as_nombre;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getId_fechaCreacion() {
		return id_fechaCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param ad_fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setId_fechaCreacion(Date ad_fechaCreacion) {
		this.id_fechaCreacion = ad_fechaCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad tipo.
	 *
	 * @return El valor de la propiedad tipo
	 */
	public Boolean getIb_tipo() {
		return ib_tipo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo.
	 *
	 * @param ab_tipo el nuevo valor para la propiedad tipo
	 */
	public void setIb_tipo(Boolean ab_tipo) {
		this.ib_tipo = ab_tipo;
	}

	/**
	 * Obtiene el valor para la propiedad tarjeta profesional.
	 *
	 * @return El valor de la propiedad tarjeta profesional
	 */
	public String getIs_tarjetaProfesional() {
		return is_tarjetaProfesional;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tarjeta profesional.
	 *
	 * @param as_tarjetaProfesional el nuevo valor para la propiedad tarjeta
	 *                              profesional
	 */
	public void setIs_tarjetaProfesional(String as_tarjetaProfesional) {
		this.is_tarjetaProfesional = as_tarjetaProfesional;
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getIs_id() {
		return is_id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param as_id el nuevo valor para la propiedad id
	 */
	public void setIs_id(String as_id) {
		this.is_id = as_id;
	}

	/**
	 * Obtiene el valor para la propiedad solicitante.
	 *
	 * @return El valor de la propiedad solicitante
	 */
	public Boolean getIb_solicitante() {
		return ib_solicitante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad solicitante.
	 *
	 * @param as_id el nuevo valor para la propiedad solicitante
	 */
	public void setIb_solicitante(Boolean ab_solicitante) {
		this.ib_solicitante = ab_solicitante;
	}

	/**
	 * Obtiene el valor para la propiedad reconocimiento.
	 *
	 * @return El valor de la propiedad reconocimiento
	 */
	public Boolean getIb_reconocimiento() {
		return ib_reconocimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad reconocimiento.
	 *
	 * @param as_id el nuevo valor para la propiedad reconocimiento
	 */
	public void setIb_reconocimiento(Boolean ab_reconocimiento) {
		this.ib_reconocimiento = ab_reconocimiento;
	}

	/**
	 * Obtiene el valor para la propiedad seleccion.
	 *
	 * @return El valor de la propiedad seleccion
	 */
	public Boolean getIb_seleccion() {
		return ib_seleccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad seleccion.
	 *
	 * @param as_id el nuevo valor para la propiedad seleccion
	 */
	public void setIb_seleccion(Boolean ab_seleccion) {
		this.ib_seleccion = ab_seleccion;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_id el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

}
