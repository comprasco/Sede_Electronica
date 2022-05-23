/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BitacoraAudDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: BitacoraAudDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Bitacora aud.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BitacoraAudDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * campo.
	 */
	// --- Atributos
	private String is_campo;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha.
	 */
	private Date id_fecha;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * accion.
	 */
	private String is_idAccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * usuario.
	 */
	private String is_idUsuario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * llave 1.
	 */
	private String is_llave1;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * llave 2.
	 */
	private String is_llave2;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * llave 3.
	 */
	private String is_llave3;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * llave 4.
	 */
	private String is_llave4;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * llave 5.
	 */
	private String is_llave5;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tabla.
	 */
	private String is_nombreTabla;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor final.
	 */
	private String is_valorFinal;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad valor
	 * final blob.
	 */
	private byte[] ib_valorFinalBlob;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor final clob.
	 */
	private String is_valorFinalClob;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor inicial.
	 */
	private String is_valorInicial;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad valor
	 * inicial blob.
	 */
	private byte[] ib_valorInicialBlob;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor inicial clob.
	 */
	private String is_valorInicialClob;
	
	/**
	 * Atributo de instancia tipo AccionDTO para definir la propiedad accion.
	 */
	private AccionDTO ia_accionDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Construye una nueva instancia/objeto de la clase BitacoraAudDTO.
	 */
	// --- Constructor
	public BitacoraAudDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Obtiene el valor para la propiedad campo.
	 *
	 * @return El valor de la propiedad campo
	 */
	public String getIs_campo() {
		return is_campo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad campo.
	 *
	 * @param as_campo el nuevo valor para la propiedad campo
	 */
	public void setIs_campo(String as_campo) {
		this.is_campo = as_campo;
	}

	/**
	 * Obtiene el valor para la propiedad fecha.
	 *
	 * @return El valor de la propiedad fecha
	 */
	public Date getId_fecha() {
		return id_fecha;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha.
	 *
	 * @param ad_fecha el nuevo valor para la propiedad fecha
	 */
	public void setId_fecha(Date ad_fecha) {
		this.id_fecha = ad_fecha;
	}

	/**
	 * Obtiene el valor para la propiedad llave 1.
	 *
	 * @return El valor de la propiedad llave 1
	 */
	public String getIs_llave1() {
		return is_llave1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 1.
	 *
	 * @param as_llave1 el nuevo valor para la propiedad llave 1
	 */
	public void setIs_llave1(String as_llave1) {
		this.is_llave1 = as_llave1;
	}

	/**
	 * Obtiene el valor para la propiedad llave 2.
	 *
	 * @return El valor de la propiedad llave 2
	 */
	public String getIs_llave2() {
		return is_llave2;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 2.
	 *
	 * @param as_llave2 el nuevo valor para la propiedad llave 2
	 */
	public void setIs_llave2(String as_llave2) {
		this.is_llave2 = as_llave2;
	}

	/**
	 * Obtiene el valor para la propiedad llave 3.
	 *
	 * @return El valor de la propiedad llave 3
	 */
	public String getIs_llave3() {
		return is_llave3;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 3.
	 *
	 * @param as_llave3 el nuevo valor para la propiedad llave 3
	 */
	public void setIs_llave3(String as_llave3) {
		this.is_llave3 = as_llave3;
	}

	/**
	 * Obtiene el valor para la propiedad llave 4.
	 *
	 * @return El valor de la propiedad llave 4
	 */
	public String getIs_llave4() {
		return is_llave4;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 4.
	 *
	 * @param as_llave4 el nuevo valor para la propiedad llave 4
	 */
	public void setIs_llave4(String as_llave4) {
		this.is_llave4 = as_llave4;
	}

	/**
	 * Obtiene el valor para la propiedad llave 5.
	 *
	 * @return El valor de la propiedad llave 5
	 */
	public String getIs_llave5() {
		return is_llave5;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad llave 5.
	 *
	 * @param as_llave5 el nuevo valor para la propiedad llave 5
	 */
	public void setIs_llave5(String as_llave5) {
		this.is_llave5 = as_llave5;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tabla.
	 *
	 * @return El valor de la propiedad nombre tabla
	 */
	public String getIs_nombreTabla() {
		return is_nombreTabla;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre tabla.
	 *
	 * @param as_nombreTabla el nuevo valor para la propiedad nombre tabla
	 */
	public void setIs_nombreTabla(String as_nombreTabla) {
		this.is_nombreTabla = as_nombreTabla;
	}

	/**
	 * Obtiene el valor para la propiedad valor final.
	 *
	 * @return El valor de la propiedad valor final
	 */
	public String getIs_valorFinal() {
		return is_valorFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final.
	 *
	 * @param as_valorFinal el nuevo valor para la propiedad valor final
	 */
	public void setIs_valorFinal(String as_valorFinal) {
		this.is_valorFinal = as_valorFinal;
	}

	/**
	 * Obtiene el valor para la propiedad valor final blob.
	 *
	 * @return El valor de la propiedad valor final blob
	 */
	public byte[] getIb_valorFinalBlob() {
		return ib_valorFinalBlob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final blob.
	 *
	 * @param ab_valorFinalBlob el nuevo valor para la propiedad valor final blob
	 */
	public void setIb_valorFinalBlob(byte[] ab_valorFinalBlob) {
		this.ib_valorFinalBlob = ab_valorFinalBlob;
	}

	/**
	 * Obtiene el valor para la propiedad valor final clob.
	 *
	 * @return El valor de la propiedad valor final clob
	 */
	public String getIs_valorFinalClob() {
		return is_valorFinalClob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor final clob.
	 *
	 * @param as_valorFinalClob el nuevo valor para la propiedad valor final clob
	 */
	public void setIs_valorFinalClob(String as_valorFinalClob) {
		this.is_valorFinalClob = as_valorFinalClob;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial.
	 *
	 * @return El valor de la propiedad valor inicial
	 */
	public String getIs_valorInicial() {
		return is_valorInicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial.
	 *
	 * @param as_valorInicial el nuevo valor para la propiedad valor inicial
	 */
	public void setIs_valorInicial(String as_valorInicial) {
		this.is_valorInicial = as_valorInicial;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial blob.
	 *
	 * @return El valor de la propiedad valor inicial blob
	 */
	public byte[] getIb_valorInicialBlob() {
		return ib_valorInicialBlob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial blob.
	 *
	 * @param ab_valorInicialBlob el nuevo valor para la propiedad valor inicial
	 *                            blob
	 */
	public void setIb_valorInicialBlob(byte[] ab_valorInicialBlob) {
		this.ib_valorInicialBlob = ab_valorInicialBlob;
	}

	/**
	 * Obtiene el valor para la propiedad valor inicial clob.
	 *
	 * @return El valor de la propiedad valor inicial clob
	 */
	public String getIs_valorInicialClob() {
		return is_valorInicialClob;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor inicial clob.
	 *
	 * @param as_valorInicialClob el nuevo valor para la propiedad valor inicial
	 *                            clob
	 */
	public void setIs_valorInicialClob(String as_valorInicialClob) {
		this.is_valorInicialClob = as_valorInicialClob;
	}

	/**
	 * Obtiene el valor para la propiedad accion dto.
	 *
	 * @return El valor de la propiedad accion dto
	 */
	public AccionDTO getIa_accionDto() {
		return ia_accionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad accion dto.
	 *
	 * @param aa_accionDto el nuevo valor para la propiedad accion dto
	 */
	public void setIa_accionDto(AccionDTO aa_accionDto) {
		this.ia_accionDto = aa_accionDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad id accion.
	 *
	 * @return El valor de la propiedad id accion
	 */
	public String getIs_idAccion() {
		return is_idAccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id accion.
	 *
	 * @param as_idAccion el nuevo valor para la propiedad id accion
	 */
	public void setIs_idAccion(String as_idAccion) {
		this.is_idAccion = as_idAccion;
	}

	/**
	 * Obtiene el valor para la propiedad id usuario.
	 *
	 * @return El valor de la propiedad id usuario
	 */
	public String getIs_idUsuario() {
		return is_idUsuario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id usuario.
	 *
	 * @param as_idUsuario el nuevo valor para la propiedad id usuario
	 */
	public void setIs_idUsuario(String as_idUsuario) {
		this.is_idUsuario = as_idUsuario;
	}

}
