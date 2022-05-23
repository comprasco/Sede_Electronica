/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCatalogo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: DetalleCatalogo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Detalle catalogo</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_DETALLE_CATALOGO</b> de la
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
@Table(name = "SDB_PGN_DETALLE_CATALOGO")
@NamedQueries( value ={	
	@NamedQuery(name = "DetalleCatalogo.findAll", query = "SELECT s FROM DetalleCatalogo s"),
	@NamedQuery(name = "DetalleCatalogo.findByCodigoServicio", query = "SELECT s FROM DetalleCatalogo s WHERE s.codigoServicio = :codigoServicio"),
	@NamedQuery(name = "DetalleCatalogo.findByIdCodigoServicio", query = "SELECT s FROM DetalleCatalogo s WHERE s.idCodigoServicio = :idCodigoServicio"),
	@NamedQuery(name = "DetalleCatalogo.findByCatalogo", query = "SELECT s FROM DetalleCatalogo s WHERE s.catalogo = :catalogo"),
	@NamedQuery(name = "DetalleCatalogo.findBySubServicio", query = "SELECT s FROM DetalleCatalogo s WHERE s.codigoSubServicio = :subServicio")
})
public class DetalleCatalogo implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad catalogo.
	 */
	// bi-directional one-to-one association to Persona
	@Id
	@OneToOne(cascade=CascadeType.ALL, optional=false)
	@JoinColumn(name = "ID_CATALOGO", unique=true, nullable=false)
	private Catalogo catalogo;

	/**
	 * Atributo para definir la propiedad codigo servicio.
	 */
	@Column(name = "CODIGO_SERVICIO")
	private String codigoServicio;

	/**
	 * Atributo para definir la propiedad codigo sub servicio.
	 */
	@Column(name = "CODIGO_SUB_SERVICIO")
	private String codigoSubServicio;

	/**
	 * Atributo para definir la propiedad codigo descripcion.
	 */
	@Column(name = "CODIGO_DESCRIPCION_SUB_SERVICIO")
	private String codigoDescripcion;

	/**
	 * Atributo para definir la propiedad id codigo servicio.
	 */
	@Column(name = "ID_CODIGO_SERVICIO")
	private String idCodigoServicio;

	/**
	 * Atributo para definir la propiedad id codigo sub servicio.
	 */
	@Column(name = "ID_CODIGO_SUB_SERVICIO")
	private String idCodigoSubServicio;
	
	/**
	 * Atributo para definir la propiedad especial.
	 */
	@Column(name = "ESPECIAL")
	private String especial;
	
	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id usuario creacion.
	 */
	@Column(name = "ID_USUARIO_CREACION")
	private String idUsuarioCreacion;

	/**
	 * Atributo para definir la propiedad id usuario modificacion.
	 */
	@Column(name = "ID_USUARIO_MODIFICACION")
	private String idUsuarioModificacion;
	
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
	 * Atributo para definir la propiedad ip creacion.
	 */
	@Column(name = "IP_CREACION")
	private String ipCreacion;

	/**
	 * Atributo para definir la propiedad ip modificacion.
	 */
	@Column(name = "IP_MODIFICACION")
	private String ipModificacion;

	/**
	 * Obtiene el valor para la propiedad catalogo.
	 *
	 * @return El valor de la propiedad catalogo
	 */
	public Catalogo getCatalogo() {
		return catalogo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad catalogo.
	 *
	 * @param catalogo el nuevo valor para la propiedad catalogo
	 */
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	/**
	 * Obtiene el valor para la propiedad codigo servicio.
	 *
	 * @return El valor de la propiedad codigo servicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo servicio.
	 *
	 * @param codigoServicio el nuevo valor para la propiedad codigo servicio
	 */
	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo sub servicio.
	 *
	 * @return El valor de la propiedad codigo sub servicio
	 */
	public String getCodigoSubServicio() {
		return codigoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo sub servicio.
	 *
	 * @param codigoSubServicio el nuevo valor para la propiedad codigo sub servicio
	 */
	public void setCodigoSubServicio(String codigoSubServicio) {
		this.codigoSubServicio = codigoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad codigo descripcion.
	 *
	 * @return El valor de la propiedad codigo descripcion
	 */
	public String getCodigoDescripcion() {
		return codigoDescripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo descripcion.
	 *
	 * @param codigoDescripcion el nuevo valor para la propiedad codigo descripcion
	 */
	public void setCodigoDescripcion(String codigoDescripcion) {
		this.codigoDescripcion = codigoDescripcion;
	}

	/**
	 * Obtiene el valor para la propiedad especial.
	 *
	 * @return El valor de la propiedad especial
	 */
	public String getEspecial() {
		return especial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad especial.
	 *
	 * @param especial el nuevo valor para la propiedad especial
	 */
	public void setEspecial(String especial) {
		this.especial = especial;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha creacion.
	 *
	 * @return El valor de la propiedad fecha creacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
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
		return fechaModificacion;
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
		return idUsuarioCreacion;
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
		return idUsuarioModificacion;
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
		return ipCreacion;
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
	 * Obtiene el valor para la propiedad id codigo servicio.
	 *
	 * @return El valor de la propiedad id codigo servicio
	 */
	public String getIdCodigoServicio() {
		return idCodigoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id codigo servicio.
	 *
	 * @param idCodigoServicio el nuevo valor para la propiedad id codigo servicio
	 */
	public void setIdCodigoServicio(String idCodigoServicio) {
		this.idCodigoServicio = idCodigoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad id codigo sub servicio.
	 *
	 * @return El valor de la propiedad id codigo sub servicio
	 */
	public String getIdCodigoSubServicio() {
		return idCodigoSubServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id codigo sub servicio.
	 *
	 * @param idCodigoSubServicio el nuevo valor para la propiedad id codigo sub
	 *                            servicio
	 */
	public void setIdCodigoSubServicio(String idCodigoSubServicio) {
		this.idCodigoSubServicio = idCodigoSubServicio;
	}

	/**
	 * Obtiene el valor para la propiedad ip modificacion.
	 *
	 * @return El valor de la propiedad ip modificacion
	 */
	public String getIpModificacion() {
		return ipModificacion;
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
	 * Obtiene el valor para la propiedad estereotipo creacion.
	 *
	 * @return El valor de la propiedad estereotipo creacion
	 */
	public String getEstereotipoCreacion() {
		return estereotipoCreacion;
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
		return estereotipoModificacion;
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

	
}
