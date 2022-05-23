/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: Parametro.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: Parametro
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.config.CacheIsolationType;

/**
 * Clase tipo entidad o modelo de datos de la capa de persistencia.<br>
 * Representa una entidad de persistencia para una tabla de la base de
 * datos.<br>
 * Esta clase representa la entidad <b>Parametro</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_PGN_PARAMETRO</b> de la base
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
@Cache(isolation=CacheIsolationType.ISOLATED) 
@Table(name = "SDB_PGN_PARAMETRO")
@NamedQueries(value = {
	@NamedQuery(name = "Parametro.findAll", query = "SELECT s FROM Parametro s"),
	@NamedQuery(name = "Parametro.consultarParametroCodigo", query = "SELECT s FROM Parametro s WHERE s.codigoParametro = :codigoParametro"),
	@NamedQuery(name = "Parametro.consultarParametroIdTipoProceso", query = "SELECT p FROM Parametro p WHERE p.tipoProceso.id = :idTipoProceso")
})
public class Parametro implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_PGN_PARAMETRO_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_PGN_PARAMETRO" , allocationSize = 1, name = "SEC_PGN_PARAMETRO_ID_GENERATOR")
	private String id;

	/**
	 * Atributo para definir la propiedad activo.
	 */
	@Column(name = "ACTIVO")
	private String activo;

	/**
	 * Atributo para definir la propiedad codigo parametro.
	 */
	@Column(name = "CODIGO_PARAMETRO")
	private String codigoParametro;

	/**
	 * Atributo para definir la propiedad descripcion.
	 */
	@Column(name = "DESCRIPCION")
	private String descripcion;

	/**
	 * Atributo para definir la propiedad editable.
	 */
	@Column(name = "EDITABLE")
	private String editable;

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
	 * Atributo para definir la propiedad texto ayuda.
	 */
	@Column(name = "TEXTO_AYUDA")
	private String textoAyuda;

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
	 * Atributo para definir la propiedad nombre.
	 */
	@Column(name = "NOMBRE")
	private String nombre;

	/**
	 * Atributo para definir la propiedad tipo variable.
	 */
	@Column(name = "TIPO_VARIABLE")
	private String tipoVariable;

	/**
	 * Atributo para definir la propiedad unidad parametro.
	 */
	@Column(name = "UNIDAD_PARAMETRO")
	private String unidadParametro;

	/**
	 * Atributo para definir la propiedad valor.
	 */
	@Lob
	@Column(name = "VALOR")
	private String valor;
     
	/**
	 * Atributo para definir la propiedad valor parametro defecto.
	 */
	@Lob
	@Column(name = "VALOR_PARAMETRO_DEFECTO")
	private String valorParametroDefecto;
	
	/**
	 * Atributo para definir la propiedad valor minimo.
	 */
	@Column(name = "VALOR_MIN")
	private BigInteger valorMinimo;
	
	/**
	 * Atributo para definir la propiedad valor maximo.
	 */
	@Column(name = "VALOR_MAX")
	private BigInteger valorMaximo;
	
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
	 * Atributo para definir la propiedad tipo proceso.
	 */
	// bi-directional many-to-one association to SdbPgnTipoProceso
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_PROCESO")
	private TipoProceso tipoProceso;

	/**
	 * Construye una nueva instancia/objeto de la clase Parametro.
	 */
	public Parametro() {
		//Metodo constructor vacio para modelo de persistencia 
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
	 * Obtiene el valor para la propiedad codigo parametro.
	 *
	 * @return El valor de la propiedad codigo parametro
	 */
	public String getCodigoParametro() {
		return this.codigoParametro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo parametro.
	 *
	 * @param codigoParametro el nuevo valor para la propiedad codigo parametro
	 */
	public void setCodigoParametro(String codigoParametro) {
		this.codigoParametro = codigoParametro;
	}

	/**
	 * Obtiene el valor para la propiedad editable.
	 *
	 * @return El valor de la propiedad editable
	 */
	public String getEditable() {
		return this.editable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad editable.
	 *
	 * @param editable el nuevo valor para la propiedad editable
	 */
	public void setEditable(String editable) {
		this.editable = editable;
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
	 * Obtiene el valor para la propiedad texto ayuda.
	 *
	 * @return El valor de la propiedad texto ayuda
	 */
	public String getTextoAyuda() {
		return textoAyuda;
	}
 
	/**
	 * Cambia/actualiza el valor para la propiedad texto ayuda.
	 *
	 * @param textoAyuda el nuevo valor para la propiedad texto ayuda
	 */
	public void setTextoAyuda(String textoAyuda) {
		this.textoAyuda = textoAyuda;
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
	 * Obtiene el valor para la propiedad tipo variable.
	 *
	 * @return El valor de la propiedad tipo variable
	 */
	public String getTipoVariable() {
		return this.tipoVariable;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo variable.
	 *
	 * @param tipoVariable el nuevo valor para la propiedad tipo variable
	 */
	public void setTipoVariable(String tipoVariable) {
		this.tipoVariable = tipoVariable;
	}

	/**
	 * Obtiene el valor para la propiedad unidad parametro.
	 *
	 * @return El valor de la propiedad unidad parametro
	 */
	public String getUnidadParametro() {
		return this.unidadParametro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad unidad parametro.
	 *
	 * @param unidadParametro el nuevo valor para la propiedad unidad parametro
	 */
	public void setUnidadParametro(String unidadParametro) {
		this.unidadParametro = unidadParametro;
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
	 * Obtiene el valor para la propiedad tipo proceso.
	 *
	 * @return El valor de la propiedad tipo proceso
	 */
	public TipoProceso getTipoProceso() {
		return this.tipoProceso;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo proceso.
	 *
	 * @param tipoProceso el nuevo valor para la propiedad tipo proceso
	 */
	public void setTipoProceso(TipoProceso tipoProceso) {
		this.tipoProceso = tipoProceso;
	}

	/**
	 * Obtiene el valor para la propiedad descripcion.
	 *
	 * @return El valor de la propiedad descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion.
	 *
	 * @param descripcion el nuevo valor para la propiedad descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Obtiene el valor para la propiedad valor parametro defecto.
	 *
	 * @return El valor de la propiedad valor parametro defecto
	 */
	public String getValorParametroDefecto() {
		return valorParametroDefecto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor parametro defecto.
	 *
	 * @param valorParametroDefecto el nuevo valor para la propiedad valor parametro
	 *                              defecto
	 */
	public void setValorParametroDefecto(String valorParametroDefecto) {
		this.valorParametroDefecto = valorParametroDefecto;
	}

	/**
	 * Obtiene el valor para la propiedad valor minimo.
	 *
	 * @return El valor de la propiedad valor minimo
	 */
	public BigInteger getValorMinimo() {
		return valorMinimo;
	}

	/**
	 * Obtiene el valor para la propiedad valor maximo.
	 *
	 * @return El valor de la propiedad valor maximo
	 */
	public BigInteger getValorMaximo() {
		return valorMaximo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor minimo.
	 *
	 * @param valorMinimo el nuevo valor para la propiedad valor minimo
	 */
	public void setValorMinimo(BigInteger valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor maximo.
	 *
	 * @param valorMaximo el nuevo valor para la propiedad valor maximo
	 */
	public void setValorMaximo(BigInteger valorMaximo) {
		this.valorMaximo = valorMaximo;
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