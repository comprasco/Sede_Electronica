/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlcaldiaParametrizacion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: AlcaldiaParametrizacion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.eclipse.persistence.config.CacheIsolationType;
import org.eclipse.persistence.annotations.Cache;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Alcaldia parametrizacion</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_PGN_ALCALDIA_PARAMETRIZACION</b> de la base de datos.
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
@Cache(isolation = CacheIsolationType.ISOLATED)
@Table(name = "SDB_PGN_ALCALDIA_PARAMETRIZACION")
@NamedQueries(value = {
		@NamedQuery(name = "AlcaldiaParametrizacion.findAll", query = "SELECT s FROM AlcaldiaParametrizacion s"),
		@NamedQuery(name = "AlcaldiaParametrizacion.consultarMunicipio", query = "SELECT s FROM AlcaldiaParametrizacion s WHERE s.municipio.id.idMunicipio = :idMunicipio AND s.municipio.id.idDepartamento = :idDepartamento AND s.municipio.id.idPais = :idPais"),
		@NamedQuery(name = "AlcaldiaParametrizacion.consultarPazYSalvo", query = "SELECT s FROM AlcaldiaParametrizacion s WHERE s.municipio = :municipio"),
		@NamedQuery(name = "AlcaldiaParametrizacion.consultarId", query = "SELECT s FROM AlcaldiaParametrizacion s WHERE s.id = :idAlcaldia") })
public class AlcaldiaParametrizacion implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_PGN_ALCALDIA_PARAMETRIZACION")
	@SequenceGenerator(sequenceName = "SEC_PGN_ALCALDIA_PARAMETRIZACION", allocationSize = 1, name = "SEC_PGN_ALCALDIA_PARAMETRIZACION")
	@Column(name = "ID")
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
	 * Atributo para definir la propiedad nombre entidad.
	 */
	@Column(name = "NOMBRE_ENTIDAD")
	private String nombreEntidad;

	/**
	 * Atributo para definir la propiedad fecha creacion.
	 */
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name = "FECHA_MODIFICACION")
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
	 * Atributo para definir la propiedad tipo parametrizacion.
	 */
	@Column(name = "TIPO_PARAMETRIZACION")
	private String tipoParametrizacion;

	/**
	 * Atributo para definir la propiedad url.
	 */
	@Column(name = "URL")
	private String url;

	/**
	 * Atributo para definir la propiedad municipio.
	 */
	// bi-directional many-to-one association to SdbPgnMunicipio
	@ManyToOne
	@JoinColumns(value = { @JoinColumn(name = "ID_DEPARTAMENTO", referencedColumnName = "ID_DEPARTAMENTO"),
			@JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID_MUNICIPIO"),
			@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID_PAIS") })
	private Municipio municipio;

	/**
	 * Atributo para definir la propiedad parametros dinamicos alcaldias.
	 */
	// bi-directional many-to-one association to SdbPgnParametrosDinamicosAlcaldia
	@OneToMany(mappedBy = "alcaldiaParametrizacion")
	private List<ParametrosDinamicosAlcaldia> parametrosDinamicosAlcaldias;

	/**
	 * Construye una nueva instancia/objeto de la clase AlcaldiaParametrizacion.
	 */
	public AlcaldiaParametrizacion() {
		// Metodo constructor vacio
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
	 * Obtiene el valor para la propiedad tipo parametrizacion.
	 *
	 * @return El valor de la propiedad tipo parametrizacion
	 */
	public String getTipoParametrizacion() {
		return this.tipoParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo parametrizacion.
	 *
	 * @param tipoParametrizacion el nuevo valor para la propiedad tipo
	 *                            parametrizacion
	 */
	public void setTipoParametrizacion(String tipoParametrizacion) {
		this.tipoParametrizacion = tipoParametrizacion;
	}

	/**
	 * Obtiene el valor para la propiedad url.
	 *
	 * @return El valor de la propiedad url
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad url.
	 *
	 * @param url el nuevo valor para la propiedad url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public Municipio getMunicipio() {
		return this.municipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param municipio el nuevo valor para la propiedad municipio
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad parametros dinamicos alcaldias.
	 *
	 * @return El valor de la propiedad parametros dinamicos alcaldias
	 */
	public List<ParametrosDinamicosAlcaldia> getParametrosDinamicosAlcaldias() {
		return this.parametrosDinamicosAlcaldias;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametros dinamicos alcaldias.
	 *
	 * @param sdbPgnParametrosDinamicosAlcaldias el nuevo valor para la propiedad
	 *                                           parametros dinamicos alcaldias
	 */
	public void setParametrosDinamicosAlcaldias(List<ParametrosDinamicosAlcaldia> sdbPgnParametrosDinamicosAlcaldias) {
		this.parametrosDinamicosAlcaldias = sdbPgnParametrosDinamicosAlcaldias;
	}

	/**
	 * Agrega el/la parametros dinamicos alcaldia.
	 *
	 * @param parametrosDinamicosAlcaldia el parametro parametros dinamicos alcaldia
	 * @return Resultado para Agrega el/la parametros dinamicos alcaldia retornado
	 *         como ParametrosDinamicosAlcaldia
	 */
	public ParametrosDinamicosAlcaldia addParametrosDinamicosAlcaldia(
			ParametrosDinamicosAlcaldia parametrosDinamicosAlcaldia) {
		getParametrosDinamicosAlcaldias().add(parametrosDinamicosAlcaldia);
		parametrosDinamicosAlcaldia.setAlcaldiaParametrizacion(this);

		return parametrosDinamicosAlcaldia;
	}

	/**
	 * Remueve el/la parametros dinamicos alcaldia.
	 *
	 * @param parametrosDinamicosAlcaldia el parametro parametros dinamicos alcaldia
	 * @return Resultado para Remueve el/la parametros dinamicos alcaldia retornado
	 *         como ParametrosDinamicosAlcaldia
	 */
	public ParametrosDinamicosAlcaldia removeParametrosDinamicosAlcaldia(
			ParametrosDinamicosAlcaldia parametrosDinamicosAlcaldia) {
		getParametrosDinamicosAlcaldias().remove(parametrosDinamicosAlcaldia);
		parametrosDinamicosAlcaldia.setAlcaldiaParametrizacion(null);

		return parametrosDinamicosAlcaldia;
	}

}