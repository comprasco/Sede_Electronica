/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Municipio.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Municipio
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Municipio</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_MUNICIPIO</b> de la base
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
@Table(name="SDB_PGN_MUNICIPIO")
@NamedQueries(value = { 
		@NamedQuery(name = "Municipio.findAll", query = "SELECT s FROM Municipio s ORDER BY s.nombre ASC"),
		@NamedQuery(name = "Municipio.findAllIdDepartamento", query = "SELECT s FROM Municipio s WHERE s.id.idDepartamento = :idDepartamento ORDER BY s.nombre ASC"),
		@NamedQuery(name = "Municipio.findByIdDepIdMun", query = "SELECT s FROM Municipio s WHERE s.id.idDepartamento = :idDepartamento and s.id.idMunicipio= :idMunicipio ORDER BY s.nombre ASC")
})
public class Municipio implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@EmbeddedId
	private MunicipioPK id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	private String activo;

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
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
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
	 * Atributo para definir la propiedad nombre.
	 */
	private String nombre;

	/**
	 * Atributo para definir la propiedad alcaldia parametrizacions.
	 */
	//bi-directional many-to-one association to SdbPgnAlcaldiaParametrizacion
	@OneToMany(mappedBy="municipio")
	private List<AlcaldiaParametrizacion> alcaldiaParametrizacions;
	
	/**
	 * Atributo para definir la propiedad departamento.
	 */
	// bi-directional many-to-one association to SdbPgnDepartamento
	@ManyToOne
	@JoinColumns( value = { @JoinColumn(name = "ID_DEPARTAMENTO", referencedColumnName = "ID_DEPARTAMENTO"),
			@JoinColumn(name = "ID_PAIS", referencedColumnName = "ID_PAIS") })
	private Departamento departamento;	
	
	/**
	 * Atributo para definir la propiedad direccion.
	 */
	// bi-directional many-to-one association to SdbAccDireccion
	@OneToMany(mappedBy = "municipio")
	private List<Direccion> direccion;

	/**
	 * Construye una nueva instancia/objeto de la clase Municipio.
	 */
	public Municipio() {
		//Constructor vacio
	}

	/**
	 * Obtiene el valor para la propiedad id.
	 *
	 * @return El valor de la propiedad id
	 */
	public MunicipioPK getId() {
		return this.id;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id.
	 *
	 * @param id el nuevo valor para la propiedad id
	 */
	public void setId(MunicipioPK id) {
		this.id = id;
	}

	/**
	 * Obtiene el valor para la propiedad activo.
	 *
	 * @return El valor de la propiedad activo
	 */
	public String getActivo() {
		return this.activo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad activo.
	 *
	 * @param activo el nuevo valor para la propiedad activo
	 */
	public void setActivo(String activo) {
		this.activo = activo;
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
	 * Obtiene el valor para la propiedad nombre.
	 *
	 * @return El valor de la propiedad nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre.
	 *
	 * @param nombre el nuevo valor para la propiedad nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public Departamento getDepartamento() {
		return this.departamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param departamento el nuevo valor para la propiedad departamento
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * Obtiene el valor para la propiedad sdb pgn alcaldia parametrizacions.
	 *
	 * @return El valor de la propiedad sdb pgn alcaldia parametrizacions
	 */
	public List<AlcaldiaParametrizacion> getSdbPgnAlcaldiaParametrizacions() {
		return this.alcaldiaParametrizacions;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad sdb pgn alcaldia
	 * parametrizacions.
	 *
	 * @param sdbPgnAlcaldiaParametrizacions el nuevo valor para la propiedad sdb
	 *                                       pgn alcaldia parametrizacions
	 */
	public void setSdbPgnAlcaldiaParametrizacions(List<AlcaldiaParametrizacion> sdbPgnAlcaldiaParametrizacions) {
		this.alcaldiaParametrizacions = sdbPgnAlcaldiaParametrizacions;
	}

	/**
	 * Agrega el/la sdb pgn alcaldia parametrizacion.
	 *
	 * @param sdbPgnAlcaldiaParametrizacion el parametro sdb pgn alcaldia
	 *                                      parametrizacion
	 * @return Resultado para Agrega el/la sdb pgn alcaldia parametrizacion
	 *         retornado como AlcaldiaParametrizacion
	 */
	public AlcaldiaParametrizacion addSdbPgnAlcaldiaParametrizacion(AlcaldiaParametrizacion sdbPgnAlcaldiaParametrizacion) {
		getSdbPgnAlcaldiaParametrizacions().add(sdbPgnAlcaldiaParametrizacion);
		sdbPgnAlcaldiaParametrizacion.setMunicipio(this);

		return sdbPgnAlcaldiaParametrizacion;
	}

	/**
	 * Remueve el/la sdb pgn alcaldia parametrizacion.
	 *
	 * @param sdbPgnAlcaldiaParametrizacion el parametro sdb pgn alcaldia
	 *                                      parametrizacion
	 * @return Resultado para Remueve el/la sdb pgn alcaldia parametrizacion
	 *         retornado como AlcaldiaParametrizacion
	 */
	public AlcaldiaParametrizacion removeSdbPgnAlcaldiaParametrizacion(AlcaldiaParametrizacion sdbPgnAlcaldiaParametrizacion) {
		getSdbPgnAlcaldiaParametrizacions().remove(sdbPgnAlcaldiaParametrizacion);
		sdbPgnAlcaldiaParametrizacion.setMunicipio(null);

		return sdbPgnAlcaldiaParametrizacion;
	}

}