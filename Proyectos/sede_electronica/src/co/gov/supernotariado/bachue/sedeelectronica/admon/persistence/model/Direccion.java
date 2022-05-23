/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Direccion.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Direccion
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Direccion</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_DIRECCION</b> de la base
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
@Table(name="SDB_ACC_DIRECCION")
@NamedQuery(name="Direccion.findAll", query="SELECT s FROM Direccion s")
public class Direccion implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_DIRECCION")
	@SequenceGenerator(sequenceName = "SEC_ACC_DIRECCION", allocationSize = 1,  name = "SEC_ACC_DIRECCION")
	@Column(name="ID")
	private String id;

	/**
	 * Atributo para definir la propiedad tipo direccion.
	 */
	@Column(name="TIPO_DIRECCION")
	private String tipoDireccion;
	
	/**
	 * Atributo para definir la propiedad tipo predio.
	 */
	@Column(name="TIPO_PREDIO")
	private String tipoPredio;
	
	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name="ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad complemento direccion.
	 */
	@Column(name="COMPLEMENTO_DIRECCION")
	private String complementoDireccion;
	
	/**
	 * Atributo para definir la propiedad id complemento direccion.
	 */
	@Column(name="ID_COMPLEMENTO_DIRECCION")
	private String idComplementoDireccion;

	/**
	 * Atributo para definir la propiedad dato eje principal.
	 */
	@Column(name="DATO_EJE_PRINCIPAL")
	private String datoEjePrincipal;

	/**
	 * Atributo para definir la propiedad dato eje secundario.
	 */
	@Column(name="DATO_EJE_SECUNDARIO")
	private String datoEjeSecundario;
	
	/**
	 * Atributo para definir la propiedad dato eje secundario 1.
	 */
	@Column(name="DATO_EJE_SECUNDARIO_1")
	private String datoEjeSecundario1;
	
	/**
	 * Atributo para definir la propiedad letra eje principal.
	 */
	@Column(name="LETRA_EJE_PRINCIPAL")
	private String letraEjePrincipal;

	/**
	 * Atributo para definir la propiedad letra eje secundario.
	 */
	@Column(name="LETRA_EJE_SECUNDARIO")
	private String letraEjeSecundario;
	
	/**
	 * Atributo para definir la propiedad letra eje secundario 1.
	 */
	@Column(name="LETRA_EJE_SECUNDARIO_1")
	private String letraEjeSecundario1;
	
	/**
	 * Atributo para definir la propiedad complemento eje principal.
	 */
	@Column(name="COMPLEMENTO_EJE_PRINCIPAL")
	private String complementoEjePrincipal;

	/**
	 * Atributo para definir la propiedad complemento eje secundario.
	 */
	@Column(name="COMPLEMENTO_EJE_SECUNDARIO")
	private String complementoEjeSecundario;
	
	/**
	 * Atributo para definir la propiedad complemento eje secundario 1.
	 */
	@Column(name="COMPLEMENTO_EJE_SECUNDARIO_1")
	private String complementoEjeSecundario1;
	
	/**
	 * Atributo para definir la propiedad coordenada eje principal.
	 */
	@Column(name="COORDENADA_EJE_PRINCIPAL")
	private String coordenadaEjePrincipal;

	/**
	 * Atributo para definir la propiedad coordenada eje secundario.
	 */
	@Column(name="COORDENADA_EJE_SECUNDARIO")
	private String coordenadaEjeSecundario;
	
	/**
	 * Atributo para definir la propiedad coordenada eje secundario 1.
	 */
	@Column(name="COORDENADA_EJE_SECUNDARIO_1")
	private String coordenadaEjeSecundario1;

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
	 * Atributo para definir la propiedad fecha desde.
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_DESDE")
	private Date fechaDesde;

	/**
	 * Atributo para definir la propiedad fecha hasta.
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_HASTA")
	private Date fechaHasta;

	/**
	 * Atributo para definir la propiedad fecha modificacion.
	 */
	@Column(name="FECHA_MODIFICACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaModificacion;
	
	/**
	 * Atributo para definir la propiedad pais.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_PAIS")
	private Pais pais;

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
	 * Atributo para definir la propiedad nombre predio.
	 */
	@Column(name="NOMBRE_PREDIO")
	private String nombrePredio;

	/**
	 * Atributo para definir la propiedad tipo eje.
	 */
	// bi-directional many-to-one association to TipoEje
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_EJE")
	private TipoEje tipoEje;

	/**
	 * Atributo para definir la propiedad id tipo eje uno.
	 */
	// bi-directional many-to-one association to TipoEje
	@ManyToOne
	@JoinColumn(name="ID_TIPO_EJE1")
	private TipoEje idTipoEjeUno;
	
	/**
	 * Atributo para definir la propiedad municipio.
	 */
	//bi-directional many-to-one association to SdbPgnMunicipio
	@ManyToOne
	@JoinColumns(value ={
		@JoinColumn(name="ID_DEPARTAMENTO", referencedColumnName="ID_DEPARTAMENTO"),
		@JoinColumn(name="ID_MUNICIPIO", referencedColumnName="ID_MUNICIPIO"),
		@JoinColumn(name="ID_PAIS", referencedColumnName="ID_PAIS",insertable=false, updatable=false)
	})
	private Municipio municipio;

	/**
	 * Atributo para definir la propiedad persona direccions.
	 */
	//bi-directional many-to-one association to PersonaDireccion
	@OneToMany(mappedBy="direccion",cascade=CascadeType.REMOVE)
	private List<PersonaDireccion> personaDireccions;

	/**
	 * Construye una nueva instancia/objeto de la clase Direccion.
	 */
	public Direccion() {
		// Metodo constructor vacio para modelo de persistencia
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
	 * Obtiene el valor para la propiedad complemento direccion.
	 *
	 * @return El valor de la propiedad complemento direccion
	 */
	public String getComplementoDireccion() {
		return this.complementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento direccion.
	 *
	 * @param complementoDireccion el nuevo valor para la propiedad complemento
	 *                             direccion
	 */
	public void setComplementoDireccion(String complementoDireccion) {
		this.complementoDireccion = complementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje principal.
	 *
	 * @return El valor de la propiedad dato eje principal
	 */
	public String getDatoEjePrincipal() {
		return this.datoEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje principal.
	 *
	 * @param datoEjePrincipal el nuevo valor para la propiedad dato eje principal
	 */
	public void setDatoEjePrincipal(String datoEjePrincipal) {
		this.datoEjePrincipal = datoEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje secundario.
	 *
	 * @return El valor de la propiedad dato eje secundario
	 */
	public String getDatoEjeSecundario() {
		return this.datoEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje secundario.
	 *
	 * @param datoEjeSecundario el nuevo valor para la propiedad dato eje secundario
	 */
	public void setDatoEjeSecundario(String datoEjeSecundario) {
		this.datoEjeSecundario = datoEjeSecundario;
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
	 * @param date el nuevo valor para la propiedad fecha creacion
	 */
	public void setFechaCreacion(Date date) {
		this.fechaCreacion = date;
	}

	/**
	 * Obtiene el valor para la propiedad fecha desde.
	 *
	 * @return El valor de la propiedad fecha desde
	 */
	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha desde.
	 *
	 * @param fechaDesde el nuevo valor para la propiedad fecha desde
	 */
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	/**
	 * Obtiene el valor para la propiedad fecha hasta.
	 *
	 * @return El valor de la propiedad fecha hasta
	 */
	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha hasta.
	 *
	 * @param fechaHasta el nuevo valor para la propiedad fecha hasta
	 */
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
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
	 * @param date el nuevo valor para la propiedad fecha modificacion
	 */
	public void setFechaModificacion(Date date) {
		this.fechaModificacion = date;
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
	 * Obtiene el valor para la propiedad tipo direccion.
	 *
	 * @return El valor de la propiedad tipo direccion
	 */
	public String getTipoDireccion() {
		return this.tipoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo direccion.
	 *
	 * @param tipoDireccion el nuevo valor para la propiedad tipo direccion
	 */
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
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
	 * Obtiene el valor para la propiedad persona direccions.
	 *
	 * @return El valor de la propiedad persona direccions
	 */
	public List<PersonaDireccion> getPersonaDireccions() {
		return this.personaDireccions;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona direccions.
	 *
	 * @param personaDireccions el nuevo valor para la propiedad persona direccions
	 */
	public void setPersonaDireccions(List<PersonaDireccion> personaDireccions) {
		this.personaDireccions = personaDireccions;
	}

	/**
	 * Agrega el/la persona direccion.
	 *
	 * @param personaDireccion el parametro persona direccion
	 * @return Resultado para Agrega el/la persona direccion retornado como
	 *         PersonaDireccion
	 */
	public PersonaDireccion addPersonaDireccion(PersonaDireccion personaDireccion) {
		getPersonaDireccions().add(personaDireccion);
		personaDireccion.setDireccion(this);

		return personaDireccion;
	}

	/**
	 * Remueve el/la persona direccion.
	 *
	 * @param personaDireccion el parametro persona direccion
	 * @return Resultado para Remueve el/la persona direccion retornado como
	 *         PersonaDireccion
	 */
	public PersonaDireccion removePersonaDireccion(PersonaDireccion personaDireccion) {
		getPersonaDireccions().remove(personaDireccion);
		personaDireccion.setDireccion(null);

		return personaDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje.
	 *
	 * @param tipoEje el nuevo valor para la propiedad tipo eje
	 */
	public void setTipoEje(TipoEje tipoEje) {
		this.tipoEje = tipoEje;
	}

	/**
	 * Obtiene el valor para la propiedad tipo eje.
	 *
	 * @return El valor de la propiedad tipo eje
	 */
	public TipoEje getTipoEje() {
		return this.tipoEje;
	}
	
	/**
	 * Obtiene el valor para la propiedad id tipo eje uno.
	 *
	 * @return El valor de la propiedad id tipo eje uno
	 */
	public TipoEje getIdTipoEjeUno() {
		return idTipoEjeUno;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id tipo eje uno.
	 *
	 * @param idTipoEjeUno el nuevo valor para la propiedad id tipo eje uno
	 */
	public void setIdTipoEjeUno(TipoEje idTipoEjeUno) {
		this.idTipoEjeUno = idTipoEjeUno;
	}

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getNombrePredio() {
		return nombrePredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param nombrePredio el nuevo valor para la propiedad nombre predio
	 */
	public void setNombrePredio(String nombrePredio) {
		this.nombrePredio = nombrePredio;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public Municipio getMunicipio() {
		return municipio;
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
	 * Obtiene el valor para la propiedad pais.
	 *
	 * @return El valor de la propiedad pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais.
	 *
	 * @param pais el nuevo valor para la propiedad pais
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/**
	 * Obtiene el valor para la propiedad tipo predio.
	 *
	 * @return El valor de la propiedad tipo predio
	 */
	public String getTipoPredio() {
		return tipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo predio.
	 *
	 * @param tipoPredio el nuevo valor para la propiedad tipo predio
	 */
	public void setTipoPredio(String tipoPredio) {
		this.tipoPredio = tipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad id complemento direccion.
	 *
	 * @return El valor de la propiedad id complemento direccion
	 */
	public String getIdComplementoDireccion() {
		return idComplementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id complemento direccion.
	 *
	 * @param idComplementoDireccion el nuevo valor para la propiedad id complemento
	 *                               direccion
	 */
	public void setIdComplementoDireccion(String idComplementoDireccion) {
		this.idComplementoDireccion = idComplementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje secundario 1.
	 *
	 * @return El valor de la propiedad dato eje secundario 1
	 */
	public String getDatoEjeSecundario1() {
		return datoEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje secundario 1.
	 *
	 * @param datoEjeSecundario1 el nuevo valor para la propiedad dato eje
	 *                           secundario 1
	 */
	public void setDatoEjeSecundario1(String datoEjeSecundario1) {
		this.datoEjeSecundario1 = datoEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje principal.
	 *
	 * @return El valor de la propiedad letra eje principal
	 */
	public String getLetraEjePrincipal() {
		return letraEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje principal.
	 *
	 * @param letraEjePrincipal el nuevo valor para la propiedad letra eje principal
	 */
	public void setLetraEjePrincipal(String letraEjePrincipal) {
		this.letraEjePrincipal = letraEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje secundario.
	 *
	 * @return El valor de la propiedad letra eje secundario
	 */
	public String getLetraEjeSecundario() {
		return letraEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje secundario.
	 *
	 * @param letraEjeSecundario el nuevo valor para la propiedad letra eje
	 *                           secundario
	 */
	public void setLetraEjeSecundario(String letraEjeSecundario) {
		this.letraEjeSecundario = letraEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje secundario 1.
	 *
	 * @return El valor de la propiedad letra eje secundario 1
	 */
	public String getLetraEjeSecundario1() {
		return letraEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje secundario 1.
	 *
	 * @param letraEjeSecundario1 el nuevo valor para la propiedad letra eje
	 *                            secundario 1
	 */
	public void setLetraEjeSecundario1(String letraEjeSecundario1) {
		this.letraEjeSecundario1 = letraEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje principal.
	 *
	 * @return El valor de la propiedad complemento eje principal
	 */
	public String getComplementoEjePrincipal() {
		return complementoEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje principal.
	 *
	 * @param complementoEjePrincipal el nuevo valor para la propiedad complemento
	 *                                eje principal
	 */
	public void setComplementoEjePrincipal(String complementoEjePrincipal) {
		this.complementoEjePrincipal = complementoEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje secundario.
	 *
	 * @return El valor de la propiedad complemento eje secundario
	 */
	public String getComplementoEjeSecundario() {
		return complementoEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje secundario.
	 *
	 * @param complementoEjeSecundario el nuevo valor para la propiedad complemento
	 *                                 eje secundario
	 */
	public void setComplementoEjeSecundario(String complementoEjeSecundario) {
		this.complementoEjeSecundario = complementoEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje secundario 1.
	 *
	 * @return El valor de la propiedad complemento eje secundario 1
	 */
	public String getComplementoEjeSecundario1() {
		return complementoEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje secundario 1.
	 *
	 * @param complementoEjeSecundario1 el nuevo valor para la propiedad complemento
	 *                                  eje secundario 1
	 */
	public void setComplementoEjeSecundario1(String complementoEjeSecundario1) {
		this.complementoEjeSecundario1 = complementoEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje principal.
	 *
	 * @return El valor de la propiedad coordenada eje principal
	 */
	public String getCoordenadaEjePrincipal() {
		return coordenadaEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje principal.
	 *
	 * @param coordenadaEjePrincipal el nuevo valor para la propiedad coordenada eje
	 *                               principal
	 */
	public void setCoordenadaEjePrincipal(String coordenadaEjePrincipal) {
		this.coordenadaEjePrincipal = coordenadaEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje secundario.
	 *
	 * @return El valor de la propiedad coordenada eje secundario
	 */
	public String getCoordenadaEjeSecundario() {
		return coordenadaEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje secundario.
	 *
	 * @param coordenadaEjeSecundario el nuevo valor para la propiedad coordenada
	 *                                eje secundario
	 */
	public void setCoordenadaEjeSecundario(String coordenadaEjeSecundario) {
		this.coordenadaEjeSecundario = coordenadaEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje secundario 1.
	 *
	 * @return El valor de la propiedad coordenada eje secundario 1
	 */
	public String getCoordenadaEjeSecundario1() {
		return coordenadaEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje secundario 1.
	 *
	 * @param coordenadaEjeSecundario1 el nuevo valor para la propiedad coordenada
	 *                                 eje secundario 1
	 */
	public void setCoordenadaEjeSecundario1(String coordenadaEjeSecundario1) {
		this.coordenadaEjeSecundario1 = coordenadaEjeSecundario1;
	}

}