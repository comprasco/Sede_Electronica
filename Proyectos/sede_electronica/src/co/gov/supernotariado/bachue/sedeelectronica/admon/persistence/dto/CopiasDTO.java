/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CopiasDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: CopiasDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Copias.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CopiasDTO extends GenericoDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nir.
	 */
	@SerializedName("nirCopia")
	private String is_nir;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * turno.
	 */
	@SerializedName("turnoCopia")
	private String is_turno;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula.
	 */
	@SerializedName("matriculaCopia")
	private String is_matricula;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	@SerializedName("oripCopia")
	private CirculoRegistralDTO icr_circuloRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento.
	 */
	@SerializedName("tipoDocumentoCopia")
	private String is_tipoDocumento;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	@SerializedName("fechaDocumentoCopia")
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento.
	 */
	@SerializedName("numeroDocumentoCopia")
	private String is_numeroDocumento;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad folios.
	 */
	@SerializedName("cantFoliosCopia")
	private Integer ii_cantidadFolios;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo criterio.
	 */
	@SerializedName("tipoCriterioCopia")
	private String is_tipoCriterio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad d
	 * id.
	 */
	@SerializedName("dIdCopia")
	private String is_dId;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento nombre.
	 */
	@SerializedName("documentoNombre")
	private String is_documentoNombre;
	
	/**
	 * Atributo de instancia tipo numero real/decimal de gran magnitud para definir
	 * la propiedad valor copia.
	 */
	@SerializedName("ValorCopia")
	private BigDecimal ibd_valorCopia;
	
	/**
	 * Obtiene el valor para la propiedad nir.
	 *
	 * @return El valor de la propiedad nir
	 */
	public String getIs_nir() {
		return is_nir;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad nir.
	 *
	 * @param as_nir el nuevo valor para la propiedad nir
	 */
	public void setIs_nir(String as_nir) {
		this.is_nir = as_nir;
	}
	
	/**
	 * Obtiene el valor para la propiedad turno.
	 *
	 * @return El valor de la propiedad turno
	 */
	public String getIs_turno() {
		return is_turno;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad turno.
	 *
	 * @param as_turno el nuevo valor para la propiedad turno
	 */
	public void setIs_turno(String as_turno) {
		this.is_turno = as_turno;
	}
	
	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public String getIs_matricula() {
		return is_matricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param as_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIs_matricula(String as_matricula) {
		this.is_matricula = as_matricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad circulo registral.
	 *
	 * @return El valor de la propiedad circulo registral
	 */
	public CirculoRegistralDTO getIcr_circuloRegistral() {
		return icr_circuloRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral.
	 *
	 * @param acr_circuloRegistral el nuevo valor para la propiedad circulo
	 *                             registral
	 */
	public void setIcr_circuloRegistral(CirculoRegistralDTO acr_circuloRegistral) {
		this.icr_circuloRegistral = acr_circuloRegistral;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param as_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param ad_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad numero documento.
	 *
	 * @return El valor de la propiedad numero documento
	 */
	public String getIs_numeroDocumento() {
		return is_numeroDocumento;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad numero documento.
	 *
	 * @param as_numeroDocumento el nuevo valor para la propiedad numero documento
	 */
	public void setIs_numeroDocumento(String as_numeroDocumento) {
		this.is_numeroDocumento = as_numeroDocumento;
	}
	
	/**
	 * Obtiene el valor para la propiedad cantidad folios.
	 *
	 * @return El valor de la propiedad cantidad folios
	 */
	public Integer getIi_cantidadFolios() {
		return ii_cantidadFolios;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad cantidad folios.
	 *
	 * @param ai_cantidadFolios el nuevo valor para la propiedad cantidad folios
	 */
	public void setIi_cantidadFolios(Integer ai_cantidadFolios) {
		this.ii_cantidadFolios = ai_cantidadFolios;
	}
	
	/**
	 * Obtiene el valor para la propiedad tipo criterio.
	 *
	 * @return El valor de la propiedad tipo criterio
	 */
	public String getIs_tipoCriterio() {
		return is_tipoCriterio;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad tipo criterio.
	 *
	 * @param as_tipoCriterio el nuevo valor para la propiedad tipo criterio
	 */
	public void setIs_tipoCriterio(String as_tipoCriterio) {
		this.is_tipoCriterio = as_tipoCriterio;
	}
	
	/**
	 * Obtiene el valor para la propiedad d id.
	 *
	 * @return El valor de la propiedad d id
	 */
	public String getIs_dId() {
		return is_dId;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad d id.
	 *
	 * @param as_dId el nuevo valor para la propiedad d id
	 */
	public void setIs_dId(String as_dId) {
		this.is_dId = as_dId;
	}
	
	/**
	 * Obtiene el valor para la propiedad valor copia.
	 *
	 * @return El valor de la propiedad valor copia
	 */
	public BigDecimal getIbd_valorCopia() {
		return ibd_valorCopia;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad valor copia.
	 *
	 * @param abd_valorCopia el nuevo valor para la propiedad valor copia
	 */
	public void setIbd_valorCopia(BigDecimal abd_valorCopia) {
		this.ibd_valorCopia = abd_valorCopia;
	}
	
	/**
	 * Obtiene el valor para la propiedad documento nombre.
	 *
	 * @return El valor de la propiedad documento nombre
	 */
	public String getIs_documentoNombre() {
		return is_documentoNombre;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad documento nombre.
	 *
	 * @param as_documentoNombre el nuevo valor para la propiedad documento nombre
	 */
	public void setIs_documentoNombre(String as_documentoNombre) {
		this.is_documentoNombre = as_documentoNombre;
	}
}
