/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ParametrosDinamicosAlcaldia.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: ParametrosDinamicosAlcaldia
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Parametros dinamicos alcaldia</b>, <br>
 * que permite la persistencia en la tabla
 * <b>SDB_PGN_PARAMETROS_DINAMICOS_ALCALDIA</b> de la base de datos.
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
@Cache(isolation=CacheIsolationType.ISOLATED)
@Table(name="SDB_PGN_PARAMETROS_DINAMICOS_ALCALDIA")
@NamedQuery(name="ParametrosDinamicosAlcaldia.findAll", query="SELECT s FROM ParametrosDinamicosAlcaldia s ORDER BY s.constante DESC")

public class ParametrosDinamicosAlcaldia implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_PGN_PARAMETROS_DINAMICOS_ALCALDIA")
	@SequenceGenerator(sequenceName = "SEC_PGN_PARAMETROS_DINAMICOS_ALCALDIA", allocationSize = 1,  name = "SEC_PGN_PARAMETROS_DINAMICOS_ALCALDIA")
	@Column(name="ID")
	private String id;

	/**
	 * Atributo para definir la propiedad constante.
	 */
	@Column(name="CONSTANTE")
	private String constante;

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
	 * Atributo para definir la propiedad nombre.
	 */
	@Column(name = "NOMBRE")
	private String nombre;

	/**
	 * Atributo para definir la propiedad parametro aplicacion.
	 */
	@Column(name="PARAMETRO_APLICACION")
	private String parametroAplicacion;

	/**
	 * Atributo para definir la propiedad parametro ui.
	 */
	@Column(name="PARAMETRO_UI")
	private String parametroUi;

	/**
	 * Atributo para definir la propiedad nombre ui.
	 */
	@Column(name="NOMBRE_UI")
	private String nombreUi;

	/**
	 * Atributo para definir la propiedad descripcion ui.
	 */
	@Column(name="DESCRIPCION_UI")
	private String descripcionUi;

	/**
	 * Atributo para definir la propiedad administrable.
	 */
	@Column(name="ADMINISTRABLE")
	private String administrable;

	/**
	 * Atributo para definir la propiedad valor.
	 */
	@Column(name="VALOR")
	private String valor;

	/**
	 * Atributo para definir la propiedad alcaldia parametrizacion.
	 */
	//bi-directional many-to-one association to SdbPgnAlcaldiaParametrizacion
	@ManyToOne
	@JoinColumn(name="ID_ALCALDIA_PARAMETRIZACION")
	private AlcaldiaParametrizacion alcaldiaParametrizacion;


	/**
	 * Construye una nueva instancia/objeto de la clase ParametrosDinamicosAlcaldia.
	 */
	public ParametrosDinamicosAlcaldia() {
		//Metodo vacio
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
	 * Obtiene el valor para la propiedad constante.
	 *
	 * @return El valor de la propiedad constante
	 */
	public String getConstante() {
		return this.constante;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad constante.
	 *
	 * @param constante el nuevo valor para la propiedad constante
	 */
	public void setConstante(String constante) {
		this.constante = constante;
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
	 * Obtiene el valor para la propiedad parametro aplicacion.
	 *
	 * @return El valor de la propiedad parametro aplicacion
	 */
	public String getParametroAplicacion() {
		return this.parametroAplicacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro aplicacion.
	 *
	 * @param parametroAplicacion el nuevo valor para la propiedad parametro
	 *                            aplicacion
	 */
	public void setParametroAplicacion(String parametroAplicacion) {
		this.parametroAplicacion = parametroAplicacion;
	}

	/**
	 * Obtiene el valor para la propiedad parametro ui.
	 *
	 * @return El valor de la propiedad parametro ui
	 */
	public String getParametroUi() {
		return this.parametroUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad parametro ui.
	 *
	 * @param parametroUi el nuevo valor para la propiedad parametro ui
	 */
	public void setParametroUi(String parametroUi) {
		this.parametroUi = parametroUi;
	}

	/**
	 * Obtiene el valor para la propiedad nombre ui.
	 *
	 * @return El valor de la propiedad nombre ui
	 */
	public String getNombreUi() {
		return nombreUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre ui.
	 *
	 * @param nombreUi el nuevo valor para la propiedad nombre ui
	 */
	public void setNombreUi(String nombreUi) {
		this.nombreUi = nombreUi;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion ui.
	 *
	 * @return El valor de la propiedad descripcion ui
	 */
	public String getDescripcionUi() {
		return descripcionUi;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion ui.
	 *
	 * @param descripcionUi el nuevo valor para la propiedad descripcion ui
	 */
	public void setDescripcionUi(String descripcionUi) {
		this.descripcionUi = descripcionUi;
	}

	/**
	 * Obtiene el valor para la propiedad administrable.
	 *
	 * @return El valor de la propiedad administrable
	 */
	public String getAdministrable() {
		return administrable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad administrable.
	 *
	 * @param administrable el nuevo valor para la propiedad administrable
	 */
	public void setAdministrable(String administrable) {
		this.administrable = administrable;
	}

	/**
	 * Obtiene el valor para la propiedad valor.
	 *
	 * @return El valor de la propiedad valor
	 */
	public String getValor() {
		return this.valor;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor.
	 *
	 * @param valor el nuevo valor para la propiedad valor
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}	

	/**
	 * Obtiene el valor para la propiedad alcaldia parametrizacion.
	 *
	 * @return El valor de la propiedad alcaldia parametrizacion
	 */
	public AlcaldiaParametrizacion getAlcaldiaParametrizacion() {
		return this.alcaldiaParametrizacion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alcaldia parametrizacion.
	 *
	 * @param alcaldiaParametrizacion el nuevo valor para la propiedad alcaldia
	 *                                parametrizacion
	 */
	public void setAlcaldiaParametrizacion(AlcaldiaParametrizacion alcaldiaParametrizacion) {
		this.alcaldiaParametrizacion = alcaldiaParametrizacion;
	}

}