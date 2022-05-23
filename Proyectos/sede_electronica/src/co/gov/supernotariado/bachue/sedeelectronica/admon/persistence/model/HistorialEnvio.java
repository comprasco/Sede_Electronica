/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialEnvio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: HistorialEnvio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Historial envio</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_HISTORIAL_ENVIO</b> de la
 * base de datos.
 * 
 * <br>
 * <em>Nota:</em> En modelos de base de datos el nombre de las
 * variables/propiedades no aplican el estandar de nomenclatura de las demas
 * clases, porque es necesario el estandar clasico de java para el correcto
 * mapeo de los campos con base de datos y correcta serializacion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Entity
@Table(name="SDB_PGN_HISTORIAL_ENVIO")
@NamedQuery(name="HistorialEnvio.findAll", query="SELECT s FROM HistorialEnvio s")
public class HistorialEnvio implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	/**
	 * Atributo para definir la propiedad estereotipo creacion.
	 */
	@Column(name="ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	/**
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name="ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id usuario creacion.
	 */
	@Column(name="ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name="ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;

	/**
	 * Atributo para definir la propiedad ip creacion.
	 */
	@Column(name="IP_CREACION")
	private String ipCreacion;

	/**
	 * Atributo para definir la propiedad ip modificacion.
	 */
	@Column(name="IP_MODIFICACION")
	private String ipModificacion;

	/**
	 * Atributo para definir la propiedad plantilla llena envio.
	 */
	@Lob
	@Column(name="PLANTILLA_LLENA_ENVIO")
	private String plantillaLlenaEnvio;

	/**
	 * Atributo para definir la propiedad ultimo detalle.
	 */
	@Column(name="ULTIMO_DETALLE")
	private String ultimoDetalle;

	/**
	 * Atributo para definir la propiedad ultimo estado.
	 */
	@Column(name="ULTIMO_ESTADO")
	private String ultimoEstado;

	/**
	 * Atributo para definir la propiedad ultimo intento envio.
	 */
	@Column(name="ULTIMO_INTENTO_ENVIO")
	private String ultimoIntentoEnvio;

	/**
	 * Atributo para definir la propiedad parametrizacion plantilla.
	 */
	//bi-directional many-to-one association to ParametrizacionPlantilla
	@ManyToOne
	@JoinColumn(name="ID_PLANTILLA")
	private ParametrizacionPlantilla parametrizacionPlantilla;

	/**
	 * Construye una nueva instancia/objeto de la clase HistorialEnvio.
	 */
	public HistorialEnvio() {
		//Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param id el nuevo valor para la propiedad id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return this.estereotipoCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo creacion.
	 *
	 * @param estereotipoCreacion el nuevo valor para la propiedad estereotipo
	 *                            creacion
	 */
	public void setEstereotipoCreacion(String estereotipoCreacion) {
		this.estereotipoCreacion = estereotipoCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad estereotipo modificacion.
	 *
	 * @return El valor de la propiedad estereotipo modificacion
	 */
	public String getEstereotipoModificacion() {
		return this.estereotipoModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estereotipo modificacion.
	 *
	 * @param estereotipoModificacion el nuevo valor para la propiedad estereotipo
	 *                                modificacion
	 */
	public void setEstereotipoModificacion(String estereotipoModificacion) {
		this.estereotipoModificacion = estereotipoModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha creacion.
	 *
	 * @param fechaCreacion el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad fecha modificacion.
	 *
	 * @return El valor de la propiedad fecha modificacion
	 */
	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha modificacion.
	 *
	 * @param fechaModificacion el nuevo valor para la propiedad fecha modificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario creacion.
	 *
	 * @return El valor de la propiedad id usuario creacion
	 */
	public String getIdUsuarioCreacion() {
		return this.idUsuarioCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario creacion.
	 *
	 * @param idUsuarioCreacion el nuevo valor para la propiedad id usuario creacion
	 */
	public void setIdUsuarioCreacion(String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario modificacion.
	 *
	 * @return El valor de la propiedad id usuario modificacion
	 */
	public String getIdUsuarioModificacion() {
		return this.idUsuarioModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario modificacion.
	 *
	 * @param idUsuarioModificacion el nuevo valor para la propiedad id usuario
	 *                              modificacion
	 */
	public void setIdUsuarioModificacion(String idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip creacion.
	 *
	 * @return El valor de la propiedad ip creacion
	 */
	public String getIpCreacion() {
		return this.ipCreacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip creacion.
	 *
	 * @param ipCreacion el nuevo valor para la propiedad ip creacion
	 */
	public void setIpCreacion(String ipCreacion) {
		this.ipCreacion = ipCreacion;
	}

	/**
	 * Obtiene el valor para la propiedad ip modificacion.
	 *
	 * @return El valor de la propiedad ip modificacion
	 */
	public String getIpModificacion() {
		return this.ipModificacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ip modificacion.
	 *
	 * @param ipModificacion el nuevo valor para la propiedad ip modificacion
	 */
	public void setIpModificacion(String ipModificacion) {
		this.ipModificacion = ipModificacion;
	}

	/**
	 * Obtiene el valor para la propiedad plantilla llena envio.
	 *
	 * @return El valor de la propiedad plantilla llena envio
	 */
	public String getPlantillaLlenaEnvio() {
		return this.plantillaLlenaEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad plantilla llena envio.
	 *
	 * @param plantillaLlenaEnvio el nuevo valor para la propiedad plantilla llena
	 *                            envio
	 */
	public void setPlantillaLlenaEnvio(String plantillaLlenaEnvio) {
		this.plantillaLlenaEnvio = plantillaLlenaEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo detalle.
	 *
	 * @return El valor de la propiedad ultimo detalle
	 */
	public String getUltimoDetalle() {
		return this.ultimoDetalle;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo detalle.
	 *
	 * @param ultimoDetalle el nuevo valor para la propiedad ultimo detalle
	 */
	public void setUltimoDetalle(String ultimoDetalle) {
		this.ultimoDetalle = ultimoDetalle;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo estado.
	 *
	 * @return El valor de la propiedad ultimo estado
	 */
	public String getUltimoEstado() {
		return this.ultimoEstado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo estado.
	 *
	 * @param ultimoEstado el nuevo valor para la propiedad ultimo estado
	 */
	public void setUltimoEstado(String ultimoEstado) {
		this.ultimoEstado = ultimoEstado;
	}

	/**
	 * Obtiene el valor para la propiedad ultimo intento envio.
	 *
	 * @return El valor de la propiedad ultimo intento envio
	 */
	public String getUltimoIntentoEnvio() {
		return this.ultimoIntentoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ultimo intento envio.
	 *
	 * @param ultimoIntentoEnvio el nuevo valor para la propiedad ultimo intento
	 *                           envio
	 */
	public void setUltimoIntentoEnvio(String ultimoIntentoEnvio) {
		this.ultimoIntentoEnvio = ultimoIntentoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion plantilla.
	 *
	 * @return El valor de la propiedad parametrizacion plantilla
	 */
	public ParametrizacionPlantilla getParametrizacionPlantilla() {
		return this.parametrizacionPlantilla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion plantilla.
	 *
	 * @param parametrizacionPlantilla el nuevo valor para la propiedad
	 *                                 parametrizacion plantilla
	 */
	public void setParametrizacionPlantilla(ParametrizacionPlantilla parametrizacionPlantilla) {
		this.parametrizacionPlantilla = parametrizacionPlantilla;
	}

}