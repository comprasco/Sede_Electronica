/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BitacoraAud.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model
 * Nombre del elemento: BitacoraAud
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
 * Esta clase representa la entidad <b>Bitacora aud</b>, <br>
 * que permite la persistencia en la tabla <b>SDB_ACC_BITACORA_AUD</b> de la
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
@Table(name = "SDB_ACC_BITACORA_AUD")
@NamedQuery(name = "BitacoraAud.findAll", query = "SELECT s FROM BitacoraAud s")
public class BitacoraAud implements Serializable {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo para definir la propiedad id.
	 */
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_ACC_BITACORA_AUD_ID_GENERATOR")
	@SequenceGenerator(sequenceName = "SEC_ACC_BITACORA_AUD", allocationSize = 1, name = "SEC_ACC_BITACORA_AUD_ID_GENERATOR" )
	private String id;

	/**
	 * Atributo para definir la propiedad campo.
	 */
	@Column(name = "CAMPO")
	private String campo;

	/**
	 * Atributo para definir la propiedad fecha.
	 */
	@Column(name = "FECHA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

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
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	/**
	 * Atributo para definir la propiedad id accion.
	 */
	@Column(name = "ID_ACCION")
	private String idAccion;

	/**
	 * Atributo para definir la propiedad id usuario.
	 */
	@Column(name = "ID_USUARIO")
	private String idUsuario;

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
	 * Atributo para definir la propiedad llave 1.
	 */
	@Column(name = "LLAVE1")
	private String llave1;

	/**
	 * Atributo para definir la propiedad llave 2.
	 */
	@Column(name = "LLAVE2")
	private String llave2;

	/**
	 * Atributo para definir la propiedad llave 3.
	 */
	@Column(name = "LLAVE3")
	private String llave3;

	/**
	 * Atributo para definir la propiedad llave 4.
	 */
	@Column(name = "LLAVE4")
	private String llave4;

	/**
	 * Atributo para definir la propiedad llave 5.
	 */
	@Column(name = "LLAVE5")
	private String llave5;

	/**
	 * Atributo para definir la propiedad nombre tabla.
	 */
	@Column(name = "NOMBRE_TABLA")
	private String nombreTabla;

	/**
	 * Atributo para definir la propiedad valor final.
	 */
	@Column(name = "VALOR_FINAL")
	private String valorFinal;

	/**
	 * Atributo para definir la propiedad valor final blob.
	 */
	@Lob
	@Column(name = "VALOR_FINAL_BLOB")
	private byte[] valorFinalBlob;

	/**
	 * Atributo para definir la propiedad valor final clob.
	 */
	@Lob
	@Column(name = "VALOR_FINAL_CLOB")
	private String valorFinalClob;

	/**
	 * Atributo para definir la propiedad valor inicial.
	 */
	@Column(name = "VALOR_INICIAL")
	private String valorInicial;

	/**
	 * Atributo para definir la propiedad valor inicial blob.
	 */
	@Lob
	@Column(name = "VALOR_INICIAL_BLOB")
	private byte[] valorInicialBlob;

	/**
	 * Atributo para definir la propiedad valor inicial clob.
	 */
	@Lob
	@Column(name = "VALOR_INICIAL_CLOB")
	private String valorInicialClob;

	/**
	 * Atributo para definir la propiedad accion.
	 */
	// bi-directional many-to-one association to Accion
	@ManyToOne
	@JoinColumn(name = "ID_ACCION", insertable = false, updatable = false)
	private Accion accion;

	/**
	 * Atributo para definir la propiedad usuario.
	 */
	// bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
	private Usuario usuario;

	/**
	 * Construye una nueva instancia/objeto de la clase BitacoraAud.
	 */
	public BitacoraAud() {
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
	 * Obtiene el valor para la propiedad campo.
	 *
	 * @return El valor de la propiedad campo
	 */
	public String getCampo() {
		return this.campo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad campo.
	 *
	 * @param campo el nuevo valor para la propiedad campo
	 */
	public void setCampo(String campo) {
		this.campo = campo;
	}

	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param fecha el nuevo valor para la propiedad fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Obtiene el valor para la propiedad llave 1.
	 *
	 * @return El valor de la propiedad llave 1
	 */
	public String getLlave1() {
		return this.llave1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 1.
	 *
	 * @param llave1 el nuevo valor para la propiedad llave 1
	 */
	public void setLlave1(String llave1) {
		this.llave1 = llave1;
	}

	/**
	 * Obtiene el valor para la propiedad llave 2.
	 *
	 * @return El valor de la propiedad llave 2
	 */
	public String getLlave2() {
		return this.llave2;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 2.
	 *
	 * @param llave2 el nuevo valor para la propiedad llave 2
	 */
	public void setLlave2(String llave2) {
		this.llave2 = llave2;
	}

	/**
	 * Obtiene el valor para la propiedad llave 3.
	 *
	 * @return El valor de la propiedad llave 3
	 */
	public String getLlave3() {
		return this.llave3;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 3.
	 *
	 * @param llave3 el nuevo valor para la propiedad llave 3
	 */
	public void setLlave3(String llave3) {
		this.llave3 = llave3;
	}

	/**
	 * Obtiene el valor para la propiedad llave 4.
	 *
	 * @return El valor de la propiedad llave 4
	 */
	public String getLlave4() {
		return this.llave4;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 4.
	 *
	 * @param llave4 el nuevo valor para la propiedad llave 4
	 */
	public void setLlave4(String llave4) {
		this.llave4 = llave4;
	}

	/**
	 * Obtiene el valor para la propiedad llave 5.
	 *
	 * @return El valor de la propiedad llave 5
	 */
	public String getLlave5() {
		return this.llave5;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 5.
	 *
	 * @param llave5 el nuevo valor para la propiedad llave 5
	 */
	public void setLlave5(String llave5) {
		this.llave5 = llave5;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tabla.
	 *
	 * @return El valor de la propiedad nombre tabla
	 */
	public String getNombreTabla() {
		return this.nombreTabla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre tabla.
	 *
	 * @param nombreTabla el nuevo valor para la propiedad nombre tabla
	 */
	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	/**
	 * Obtiene el valor para la propiedad valor final.
	 *
	 * @return El valor de la propiedad valor final
	 */
	public String getValorFinal() {
		return this.valorFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final.
	 *
	 * @param valorFinal el nuevo valor para la propiedad valor final
	 */
	public void setValorFinal(String valorFinal) {
		this.valorFinal = valorFinal;
	}

	/**
	 * Obtiene el valor para la propiedad valor final blob.
	 *
	 * @return El valor de la propiedad valor final blob
	 */
	public byte[] getValorFinalBlob() {
		return this.valorFinalBlob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final blob.
	 *
	 * @param valorFinalBlob el nuevo valor para la propiedad valor final blob
	 */
	public void setValorFinalBlob(byte[] valorFinalBlob) {
		this.valorFinalBlob = valorFinalBlob;
	}

	/**
	 * Obtiene el valor para la propiedad valor final clob.
	 *
	 * @return El valor de la propiedad valor final clob
	 */
	public String getValorFinalClob() {
		return this.valorFinalClob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final clob.
	 *
	 * @param valorFinalClob el nuevo valor para la propiedad valor final clob
	 */
	public void setValorFinalClob(String valorFinalClob) {
		this.valorFinalClob = valorFinalClob;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial.
	 *
	 * @return El valor de la propiedad valor inicial
	 */
	public String getValorInicial() {
		return this.valorInicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial.
	 *
	 * @param valorInicial el nuevo valor para la propiedad valor inicial
	 */
	public void setValorInicial(String valorInicial) {
		this.valorInicial = valorInicial;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial blob.
	 *
	 * @return El valor de la propiedad valor inicial blob
	 */
	public byte[] getValorInicialBlob() {
		return this.valorInicialBlob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial blob.
	 *
	 * @param valorInicialBlob el nuevo valor para la propiedad valor inicial blob
	 */
	public void setValorInicialBlob(byte[] valorInicialBlob) {
		this.valorInicialBlob = valorInicialBlob;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial clob.
	 *
	 * @return El valor de la propiedad valor inicial clob
	 */
	public String getValorInicialClob() {
		return this.valorInicialClob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial clob.
	 *
	 * @param valorInicialClob el nuevo valor para la propiedad valor inicial clob
	 */
	public void setValorInicialClob(String valorInicialClob) {
		this.valorInicialClob = valorInicialClob;
	}

	/**
	 * Obtiene el valor para la propiedad accion.
	 *
	 * @return El valor de la propiedad accion
	 */
	public Accion getAccion() {
		return this.accion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad accion.
	 *
	 * @param accion el nuevo valor para la propiedad accion
	 */
	public void setAccion(Accion accion) {
		this.accion = accion;
	}

	/**
	 * Obtiene el valor para la propiedad usuario.
	 *
	 * @return El valor de la propiedad usuario
	 */
	public Usuario getUsuario() {
		return this.usuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario.
	 *
	 * @param usuario el nuevo valor para la propiedad usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	 * Obtiene el valor para la propiedad id accion.
	 *
	 * @return El valor de la propiedad id accion
	 */
	public String getIdAccion() {
		return idAccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id accion.
	 *
	 * @param idAccion el nuevo valor para la propiedad id accion
	 */
	public void setIdAccion(String idAccion) {
		this.idAccion = idAccion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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

}