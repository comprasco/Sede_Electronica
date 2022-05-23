/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ColaEnvio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ColaEnvio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Cola envio</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_COLA_ENVIO</b> de la base
 * de datos.
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
@Table(name="SDB_PGN_COLA_ENVIO")
@NamedQueries( value= {
@NamedQuery(name="ColaEnvio.findAll", query="SELECT s FROM ColaEnvio s"),
@NamedQuery(name="ColaEnvio.consultarCorreosPendientes", query="SELECT s FROM ColaEnvio s WHERE s.cantidadIntentos <= :cantidadIntentos"),
@NamedQuery(name="ColaEnvio.consultarCorreosVencidos", query="SELECT s FROM ColaEnvio s WHERE s.cantidadIntentos > :cantidadIntentos")
})
public class ColaEnvio implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_PGN_COLA_ENVIO")
	@SequenceGenerator(sequenceName = "SEC_PGN_COLA_ENVIO", allocationSize = 1,  name = "SEC_PGN_COLA_ENVIO")
	private String id;

	/**
	 * Atributo para definir la propiedad cantidad intentos.
	 */
	@Column(name="CANTIDAD_INTENTOS")
	private String cantidadIntentos;

	/**
	 * Atributo para definir la propiedad detalle envio.
	 */
	@Column(name="DETALLE_ENVIO")
	private String detalleEnvio;

	/**
	 * Atributo para definir la propiedad estado envio.
	 */
	@Column(name="ESTADO_ENVIO")
	private String estadoEnvio;

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
	 * Atributo para definir la propiedad plantilla llena.
	 */
	@Lob
	@Column(name="PLANTILLA_LLENA")
	private String plantillaLlena;

	/**
	 * Atributo para definir la propiedad prioridad.
	 */
	private String prioridad;

	/**
	 * Atributo para definir la propiedad parametrizacion plantilla.
	 */
	//bi-directional many-to-one association to ParametrizacionPlantilla
	@ManyToOne
	@JoinColumn(name="ID_PLANTILLA")
	private ParametrizacionPlantilla parametrizacionPlantilla;

	/**
	 * Construye una nueva instancia/objeto de la clase ColaEnvio.
	 */
	public ColaEnvio() {
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
	 * Obtiene el valor para la propiedad cantidad intentos.
	 *
	 * @return El valor de la propiedad cantidad intentos
	 */
	public String getCantidadIntentos() {
		return this.cantidadIntentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad intentos.
	 *
	 * @param cantidadIntentos el nuevo valor para la propiedad cantidad intentos
	 */
	public void setCantidadIntentos(String cantidadIntentos) {
		this.cantidadIntentos = cantidadIntentos;
	}

	/**
	 * Obtiene el valor para la propiedad detalle envio.
	 *
	 * @return El valor de la propiedad detalle envio
	 */
	public String getDetalleEnvio() {
		return this.detalleEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle envio.
	 *
	 * @param detalleEnvio el nuevo valor para la propiedad detalle envio
	 */
	public void setDetalleEnvio(String detalleEnvio) {
		this.detalleEnvio = detalleEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad estado envio.
	 *
	 * @return El valor de la propiedad estado envio
	 */
	public String getEstadoEnvio() {
		return this.estadoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado envio.
	 *
	 * @param estadoEnvio el nuevo valor para la propiedad estado envio
	 */
	public void setEstadoEnvio(String estadoEnvio) {
		this.estadoEnvio = estadoEnvio;
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
	 * Obtiene el valor para la propiedad plantilla llena.
	 *
	 * @return El valor de la propiedad plantilla llena
	 */
	public String getPlantillaLlena() {
		return this.plantillaLlena;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad plantilla llena.
	 *
	 * @param plantillaLlena el nuevo valor para la propiedad plantilla llena
	 */
	public void setPlantillaLlena(String plantillaLlena) {
		this.plantillaLlena = plantillaLlena;
	}

	/**
	 * Obtiene el valor para la propiedad prioridad.
	 *
	 * @return El valor de la propiedad prioridad
	 */
	public String getPrioridad() {
		return this.prioridad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad prioridad.
	 *
	 * @param prioridad el nuevo valor para la propiedad prioridad
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	/**
	 * Obtiene el valor para la propiedad parametrizacion plantilla.
	 *
	 * @return El valor de la propiedad parametrizacion plantilla
	 */
	public ParametrizacionPlantilla getparametrizacionPlantilla() {
		return this.parametrizacionPlantilla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametrizacion plantilla.
	 *
	 * @param parametrizacionPlantilla el nuevo valor para la propiedad
	 *                                 parametrizacion plantilla
	 */
	public void setparametrizacionPlantilla(ParametrizacionPlantilla parametrizacionPlantilla) {
		this.parametrizacionPlantilla = parametrizacionPlantilla;
	}

}