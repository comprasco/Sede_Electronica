/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DocumentosCargadosOwcc.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: DocumentosCargadosOwcc
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Documentos cargados owcc</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_ACC_DOCUMENTOS_CARGADOS_OWCC</b> de la base de datos.
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
@Table(name = "SDB_ACC_DOCUMENTOS_CARGADOS_OWCC")
@NamedQueries(value = {
		@NamedQuery(name = "DocumentosCargadosOwcc.findAll", query = "SELECT s FROM DocumentosCargadosOwcc s"),
		@NamedQuery(name = "DocumentosCargadosOwcc.consultarPorNir", query = "SELECT c FROM DocumentosCargadosOwcc c WHERE c.nir = :nir"),
		@NamedQuery(name = "DocumentosCargadosOwcc.consultarFormularioCuentaCupo", query = "SELECT c FROM DocumentosCargadosOwcc c WHERE c.tipoDocumental = :tipoDocumental AND c.idUsuarioCreacion = :idUsuarioCreacion AND c.nir = :nir"), })
public class DocumentosCargadosOwcc implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@SequenceGenerator(sequenceName = "SEC_ACC_DOCUMENTOS_CARGADOS_OWCC", allocationSize = 1, name = "SEC_ACC_DOCUMENTOS_CARGADOS_OWCC_ID_GENERATOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_DOCUMENTOS_CARGADOS_OWCC_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad estereotipo creacion.
	 */
	@Column(name = "ESTEREOTIPO_CREACION")
	private String estereotipoCreacion;

	/**
	 * Atributo para definir la propiedad estereotipo modificacion.
	 */
	@Column(name = "ESTEREOTIPO_MODIFICACION")
	private String estereotipoModificacion;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id owcc.
	 */
	@Column(name = "ID_OWCC")
	private String idOwcc;

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
	 * Atributo para definir la propiedad nir.
	 */
	@Column(name = "NIR")
	private String nir;

	/**
	 * Atributo para definir la propiedad tipo documental.
	 */
	@Column(name = "TIPO_DOCUMENTAL")
	private String tipoDocumental;

	/**
	 * Atributo para definir la propiedad nombre documento.
	 */
	@Column(name = "NOMBRE_DOCUMENTO")
	private String nombreDocumento;
	
	/**
	 * Atributo para definir la propiedad observaciones.
	 */
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "NOMBRE_TIPO_DOCUMENTAL")
	private String nombreTipoDocumental;

	/**
	 * Construye una nueva instancia/objeto de la clase DocumentosCargadosOwcc.
	 */
	public DocumentosCargadosOwcc() {
		//
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public String getId() {
		return id;
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
	 * Obtiene el valor para la propiedad id owcc.
	 *
	 * @return El valor de la propiedad id owcc
	 */
	public String getIdOwcc() {
		return idOwcc;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id owcc.
	 *
	 * @param idOwcc el nuevo valor para la propiedad id owcc
	 */
	public void setIdOwcc(String idOwcc) {
		this.idOwcc = idOwcc;
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
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getNir() {
		return nir;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param nir el nuevo valor para la propiedad nir
	 */
	public void setNir(String nir) {
		this.nir = nir; 
	}

	/**
	 * Obtiene el valor para la propiedad tipo documental.
	 *
	 * @return El valor de la propiedad tipo documental
	 */
	public String getTipoDocumental() {
		return tipoDocumental;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documental.
	 *
	 * @param tipoDocumental el nuevo valor para la propiedad tipo documental
	 */
	public void setTipoDocumental(String tipoDocumental) {
		this.tipoDocumental = tipoDocumental;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento.
	 *
	 * @return El valor de la propiedad nombre documento
	 */
	public String getNombreDocumento() {
		return nombreDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento.
	 *
	 * @param nombreDocumento el nuevo valor para la propiedad nombre documento
	 */
	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getNombreTipoDocumental() {
		return nombreTipoDocumental;
	}

	public void setNombreTipoDocumental(String nombreTipoDocumental) {
		this.nombreTipoDocumental = nombreTipoDocumental;
	}
	
}