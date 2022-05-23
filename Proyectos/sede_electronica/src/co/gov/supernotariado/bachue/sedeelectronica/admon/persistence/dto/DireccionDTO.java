/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DireccionDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DireccionDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDireccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoPredio;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DireccionDTO extends GenericoBaseDTO {
	
	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * complemento direccion.
	 */
	// --- Atributos
	private String is_idComplementoDireccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento direccion.
	 */
	private String is_complementoDireccion;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje principal.
	 */
	private String is_datoEjePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje secundario.
	 */
	private String is_datoEjeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje secundario 1.
	 */
	private String is_datoEjeSecundario1;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje principal.
	 */
	private String is_letraEjePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje secundario.
	 */
	private String is_letraEjeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje secundario 1.
	 */
	private String is_letraEjeSecundario1;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje principal.
	 */
	private String is_complementoEjePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje secundario.
	 */
	private String is_complementoEjeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje secundario 1.
	 */
	private String is_complementoEjeSecundario1;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje principal.
	 */
	private String is_coordenadaEjePrincipal;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje secundario.
	 */
	private String is_coordenadaEjeSecundario;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje secundario 1.
	 */
	private String is_coordenadaEjeSecundario1;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha desde.
	 */
	private Date id_fechaDesde;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha hasta.
	 */
	private Date id_fechaHasta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	private String is_idDepartamento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	private String is_idMunicipio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	private String is_idPais;
	
	/**
	 * Atributo de instancia tipo EnumTipoDireccion para definir la propiedad enum
	 * tipo direccion.
	 */
	private EnumTipoDireccion ietd_enumTipoDireccion;
	
	/**
	 * Atributo de instancia tipo EnumTipoPredio para definir la propiedad enum tipo
	 * predio.
	 */
	private EnumTipoPredio ietp_enumTipoPredio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre predio.
	 */
	private String is_nombrePredio;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad tipo eje.
	 */
	private TipoEjeDTO ite_tipoEjeDto;
	
	/**
	 * Atributo de instancia tipo TipoEjeDTO para definir la propiedad tipo eje uno.
	 */
	private TipoEjeDTO ite_tipoEjeUnoDto;
	
	/**
	 * Atributo de instancia tipo lista de DireccionDTO para definir la propiedad
	 * persona direcciones.
	 */
	private List<DireccionDTO> ild_personaDirecciones;
	
	/**
	 * Atributo de instancia tipo VeredaDTO para definir la propiedad vereda.
	 */
	private VeredaDTO iv_vereda;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * direccion completa.
	 */
	private String is_direccionCompleta;
	

	// Se agregan objectos para almacenar los datos y ser
	/**
	 * Atributo de instancia tipo PaisDTO para definir la propiedad pais.
	 */
	// mostrados en perfil de usuario.
	private PaisDTO ip_paisDto;
	
	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;
	
	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;

	/**
	 * Construye una nueva instancia/objeto de la clase DireccionDTO.
	 */
	// --- Constructor
	public DireccionDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad complemento direccion.
	 *
	 * @return El valor de la propiedad complemento direccion
	 */
	public String getIs_complementoDireccion() {
		if(this.is_complementoDireccion == null)
			return "";
		return this.is_complementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento direccion.
	 *
	 * @param as_complementoDireccion el nuevo valor para la propiedad complemento
	 *                                direccion
	 */
	public void setIs_complementoDireccion(String as_complementoDireccion) {
		this.is_complementoDireccion = as_complementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje principal.
	 *
	 * @return El valor de la propiedad dato eje principal
	 */
	public String getIs_datoEjePrincipal() {
		if(this.is_datoEjePrincipal == null)
			return "";
		return this.is_datoEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje principal.
	 *
	 * @param as_datoEjePrincipal el nuevo valor para la propiedad dato eje
	 *                            principal
	 */
	public void setIs_datoEjePrincipal(String as_datoEjePrincipal) {
		this.is_datoEjePrincipal = as_datoEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje secundario.
	 *
	 * @return El valor de la propiedad dato eje secundario
	 */
	public String getIs_datoEjeSecundario() {
		if(this.is_datoEjeSecundario == null)
			return "";
		return this.is_datoEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje secundario.
	 *
	 * @param as_datoEjeSecundario el nuevo valor para la propiedad dato eje
	 *                             secundario
	 */
	public void setIs_datoEjeSecundario(String as_datoEjeSecundario) {
		this.is_datoEjeSecundario = as_datoEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad fecha desde.
	 *
	 * @return El valor de la propiedad fecha desde
	 */
	public Date getId_fechaDesde() {
		return this.id_fechaDesde;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha desde.
	 *
	 * @param ad_fechaDesde el nuevo valor para la propiedad fecha desde
	 */
	public void setId_fechaDesde(Date ad_fechaDesde) {
		this.id_fechaDesde = ad_fechaDesde;
	}

	/**
	 * Obtiene el valor para la propiedad fecha hasta.
	 *
	 * @return El valor de la propiedad fecha hasta
	 */
	public Date getId_fechaHasta() {
		return this.id_fechaHasta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha hasta.
	 *
	 * @param ad_fechaHasta el nuevo valor para la propiedad fecha hasta
	 */
	public void setId_fechaHasta(Date ad_fechaHasta) {
		this.id_fechaHasta = ad_fechaHasta;
	}

	/**
	 * Obtiene el valor para la propiedad id departamento.
	 *
	 * @return El valor de la propiedad id departamento
	 */
	public String getIs_idDepartamento() {
		return this.is_idDepartamento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id departamento.
	 *
	 * @param as_idDepartamento el nuevo valor para la propiedad id departamento
	 */
	public void setIs_idDepartamento(String as_idDepartamento) {
		this.is_idDepartamento = as_idDepartamento;
	}

	/**
	 * Obtiene el valor para la propiedad id municipio.
	 *
	 * @return El valor de la propiedad id municipio
	 */
	public String getIs_idMunicipio() {
		return this.is_idMunicipio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id municipio.
	 *
	 * @param as_idMunicipio el nuevo valor para la propiedad id municipio
	 */
	public void setIs_idMunicipio(String as_idMunicipio) {
		this.is_idMunicipio = as_idMunicipio;
	}

	/**
	 * Obtiene el valor para la propiedad id pais.
	 *
	 * @return El valor de la propiedad id pais
	 */
	public String getIs_idPais() {
		return this.is_idPais;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id pais.
	 *
	 * @param as_idPais el nuevo valor para la propiedad id pais
	 */
	public void setIs_idPais(String as_idPais) {
		this.is_idPais = as_idPais;
	}

	/**
	 * Obtiene el valor para la propiedad tipo eje uno dto.
	 *
	 * @return El valor de la propiedad tipo eje uno dto
	 */
	public TipoEjeDTO getIte_tipoEjeUnoDto() {
		return ite_tipoEjeUnoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje uno dto.
	 *
	 * @param ate_tipoEjeUnoDto el nuevo valor para la propiedad tipo eje uno dto
	 */
	public void setIte_tipoEjeUnoDto(TipoEjeDTO ate_tipoEjeUnoDto) {
		this.ite_tipoEjeUnoDto = ate_tipoEjeUnoDto;
	}

	/**
	 * Obtiene el valor para la propiedad tipo eje dto.
	 *
	 * @return El valor de la propiedad tipo eje dto
	 */
	public TipoEjeDTO getIte_tipoEjeDto() {
		return this.ite_tipoEjeDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo eje dto.
	 *
	 * @param ate_tipoEjeDto el nuevo valor para la propiedad tipo eje dto
	 */
	public void setIte_tipoEjeDto(TipoEjeDTO ate_tipoEjeDto) {
		this.ite_tipoEjeDto = ate_tipoEjeDto;
	}

	/**
	 * Obtiene el valor para la propiedad persona direcciones.
	 *
	 * @return El valor de la propiedad persona direcciones
	 */
	public List<DireccionDTO> getIld_personaDirecciones() {
		if (this.ild_personaDirecciones == null) {
			this.ild_personaDirecciones = new java.util.ArrayList<>(1);
		}
		return this.ild_personaDirecciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad persona direcciones.
	 *
	 * @param ald_personaDirecciones el nuevo valor para la propiedad persona
	 *                               direcciones
	 */
	public void setIld_personaDirecciones(List<DireccionDTO> ald_personaDirecciones) {
		this.ild_personaDirecciones = ald_personaDirecciones;
	}

	/**
	 * Obtiene el valor para la propiedad departamento dto.
	 *
	 * @return El valor de la propiedad departamento dto
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return this.id_departamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento dto.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento dto
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad nombre predio.
	 *
	 * @return El valor de la propiedad nombre predio
	 */
	public String getIs_nombrePredio() {
		if(this.is_nombrePredio == null)
			return "";
		return is_nombrePredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre predio.
	 *
	 * @param as_nombrePredio el nuevo valor para la propiedad nombre predio
	 */
	public void setIs_nombrePredio(String as_nombrePredio) {
		this.is_nombrePredio = as_nombrePredio;
	}

	/**
	 * Obtiene el valor para la propiedad vereda.
	 *
	 * @return El valor de la propiedad vereda
	 */
	public VeredaDTO getIv_vereda() {
		return iv_vereda;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad vereda.
	 *
	 * @param av_vereda el nuevo valor para la propiedad vereda
	 */
	public void setIv_vereda(VeredaDTO av_vereda) {
		this.iv_vereda = av_vereda;
	}

	/**
	 * Obtiene el valor para la propiedad pais dto.
	 *
	 * @return El valor de la propiedad pais dto
	 */
	public PaisDTO getIp_paisDto() {
		return ip_paisDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pais dto.
	 *
	 * @param ap_paisDto el nuevo valor para la propiedad pais dto
	 */
	public void setIp_paisDto(PaisDTO ap_paisDto) {
		this.ip_paisDto = ap_paisDto;
	}

	/**
	 * Obtiene el valor para la propiedad direccion completa.
	 *
	 * @return El valor de la propiedad direccion completa
	 */
	public String getIs_direccionCompleta() {
		StringBuilder lsb_direccion = new StringBuilder();

		lsb_direccion.append((ietp_enumTipoPredio != null)?ietp_enumTipoPredio.getIs_valorString() + " ":"");
		lsb_direccion.append((ietd_enumTipoDireccion != null)?ietd_enumTipoDireccion.getIs_valorString() + " ":"");
		lsb_direccion.append((ip_paisDto != null)?ip_paisDto.getIs_nombre() + " ":""); 
		lsb_direccion.append((id_departamentoDto != null)?id_departamentoDto.getIs_nombre() + " ":""); 
		lsb_direccion.append((im_municipioDto != null)?im_municipioDto.getIs_nombre() + " ":""); 
		lsb_direccion.append((ite_tipoEjeDto != null)?ite_tipoEjeDto.getIs_nombre() + " ":""); 
		lsb_direccion.append((is_datoEjePrincipal != null)?is_datoEjePrincipal + " ":""); 
		lsb_direccion.append((is_letraEjePrincipal != null)?is_letraEjePrincipal + " ":""); 
		lsb_direccion.append((is_complementoEjePrincipal != null)?is_complementoEjePrincipal + " ":""); 
		lsb_direccion.append((is_coordenadaEjePrincipal != null)?is_coordenadaEjePrincipal + " ":""); 
		lsb_direccion.append((ite_tipoEjeUnoDto != null)?ite_tipoEjeUnoDto.getIs_nombre() + " ":""); 
		lsb_direccion.append((is_datoEjeSecundario != null)?is_datoEjeSecundario + " ":""); 
		lsb_direccion.append((is_letraEjeSecundario != null)?is_letraEjeSecundario + " ":""); 
		lsb_direccion.append((is_complementoEjeSecundario != null)?is_complementoEjeSecundario + " ":""); 
		lsb_direccion.append((is_coordenadaEjeSecundario != null)?is_coordenadaEjeSecundario + " ":""); 
		lsb_direccion.append((is_datoEjeSecundario1 != null)?is_datoEjeSecundario1 + " ":""); 
		lsb_direccion.append((is_letraEjeSecundario1 != null)?is_letraEjeSecundario1 + " ":""); 
		lsb_direccion.append((is_complementoEjeSecundario1 != null)?is_complementoEjeSecundario1 + " ":""); 
		lsb_direccion.append((is_coordenadaEjeSecundario1 != null)?is_coordenadaEjeSecundario1 + " ":""); 
		lsb_direccion.append((is_idComplementoDireccion != null)?is_idComplementoDireccion + " ":""); 
		lsb_direccion.append((is_complementoDireccion != null)?is_complementoDireccion + " ":""); 

		is_direccionCompleta = lsb_direccion.toString();
		return is_direccionCompleta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad direccion completa.
	 *
	 * @param as_direccionCompleta el nuevo valor para la propiedad direccion
	 *                             completa
	 */
	public void setIs_direccionCompleta(String as_direccionCompleta) {
		this.is_direccionCompleta = as_direccionCompleta;
	}

	/**
	 * Obtiene el valor para la propiedad dato eje secundario 1.
	 *
	 * @return El valor de la propiedad dato eje secundario 1
	 */
	public String getIs_datoEjeSecundario1() {
		return is_datoEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad dato eje secundario 1.
	 *
	 * @param as_datoEjeSecundario1 el nuevo valor para la propiedad dato eje
	 *                              secundario 1
	 */
	public void setIs_datoEjeSecundario1(String as_datoEjeSecundario1) {
		this.is_datoEjeSecundario1 = as_datoEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje principal.
	 *
	 * @return El valor de la propiedad letra eje principal
	 */
	public String getIs_letraEjePrincipal() {
		return is_letraEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje principal.
	 *
	 * @param as_letraEjePrincipal el nuevo valor para la propiedad letra eje
	 *                             principal
	 */
	public void setIs_letraEjePrincipal(String as_letraEjePrincipal) {
		this.is_letraEjePrincipal = as_letraEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje secundario.
	 *
	 * @return El valor de la propiedad letra eje secundario
	 */
	public String getIs_letraEjeSecundario() {
		return is_letraEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje secundario.
	 *
	 * @param as_letraEjeSecundario el nuevo valor para la propiedad letra eje
	 *                              secundario
	 */
	public void setIs_letraEjeSecundario(String as_letraEjeSecundario) {
		this.is_letraEjeSecundario = as_letraEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad letra eje secundario 1.
	 *
	 * @return El valor de la propiedad letra eje secundario 1
	 */
	public String getIs_letraEjeSecundario1() {
		return is_letraEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad letra eje secundario 1.
	 *
	 * @param as_letraEjeSecundario1 el nuevo valor para la propiedad letra eje
	 *                               secundario 1
	 */
	public void setIs_letraEjeSecundario1(String as_letraEjeSecundario1) {
		this.is_letraEjeSecundario1 = as_letraEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje principal.
	 *
	 * @return El valor de la propiedad complemento eje principal
	 */
	public String getIs_complementoEjePrincipal() {
		return is_complementoEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje principal.
	 *
	 * @param as_complementoEjePrincipal el nuevo valor para la propiedad
	 *                                   complemento eje principal
	 */
	public void setIs_complementoEjePrincipal(String as_complementoEjePrincipal) {
		this.is_complementoEjePrincipal = as_complementoEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje secundario.
	 *
	 * @return El valor de la propiedad complemento eje secundario
	 */
	public String getIs_complementoEjeSecundario() {
		return is_complementoEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje secundario.
	 *
	 * @param as_complementoEjeSecundario el nuevo valor para la propiedad
	 *                                    complemento eje secundario
	 */
	public void setIs_complementoEjeSecundario(String as_complementoEjeSecundario) {
		this.is_complementoEjeSecundario = as_complementoEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad complemento eje secundario 1.
	 *
	 * @return El valor de la propiedad complemento eje secundario 1
	 */
	public String getIs_complementoEjeSecundario1() {
		return is_complementoEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad complemento eje secundario 1.
	 *
	 * @param as_complementoEjeSecundario1 el nuevo valor para la propiedad
	 *                                     complemento eje secundario 1
	 */
	public void setIs_complementoEjeSecundario1(String as_complementoEjeSecundario1) {
		this.is_complementoEjeSecundario1 = as_complementoEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje principal.
	 *
	 * @return El valor de la propiedad coordenada eje principal
	 */
	public String getIs_coordenadaEjePrincipal() {
		return is_coordenadaEjePrincipal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje principal.
	 *
	 * @param as_coordenadaEjePrincipal el nuevo valor para la propiedad coordenada
	 *                                  eje principal
	 */
	public void setIs_coordenadaEjePrincipal(String as_coordenadaEjePrincipal) {
		this.is_coordenadaEjePrincipal = as_coordenadaEjePrincipal;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje secundario.
	 *
	 * @return El valor de la propiedad coordenada eje secundario
	 */
	public String getIs_coordenadaEjeSecundario() {
		return is_coordenadaEjeSecundario;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje secundario.
	 *
	 * @param as_coordenadaEjeSecundario el nuevo valor para la propiedad coordenada
	 *                                   eje secundario
	 */
	public void setIs_coordenadaEjeSecundario(String as_coordenadaEjeSecundario) {
		this.is_coordenadaEjeSecundario = as_coordenadaEjeSecundario;
	}

	/**
	 * Obtiene el valor para la propiedad coordenada eje secundario 1.
	 *
	 * @return El valor de la propiedad coordenada eje secundario 1
	 */
	public String getIs_coordenadaEjeSecundario1() {
		return is_coordenadaEjeSecundario1;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad coordenada eje secundario 1.
	 *
	 * @param as_coordenadaEjeSecundario1 el nuevo valor para la propiedad
	 *                                    coordenada eje secundario 1
	 */
	public void setIs_coordenadaEjeSecundario1(String as_coordenadaEjeSecundario1) {
		this.is_coordenadaEjeSecundario1 = as_coordenadaEjeSecundario1;
	}

	/**
	 * Obtiene el valor para la propiedad id complemento direccion.
	 *
	 * @return El valor de la propiedad id complemento direccion
	 */
	public String getIs_idComplementoDireccion() {
		return is_idComplementoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id complemento direccion.
	 *
	 * @param as_idComplementoDireccion el nuevo valor para la propiedad id
	 *                                  complemento direccion
	 */
	public void setIs_idComplementoDireccion(String as_idComplementoDireccion) {
		this.is_idComplementoDireccion = as_idComplementoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo direccion.
	 *
	 * @return El valor de la propiedad enum tipo direccion
	 */
	public EnumTipoDireccion getIetd_enumTipoDireccion() {
		return ietd_enumTipoDireccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo direccion.
	 *
	 * @param aetd_enumTipoDireccion el nuevo valor para la propiedad enum tipo
	 *                               direccion
	 */
	public void setIetd_enumTipoDireccion(EnumTipoDireccion aetd_enumTipoDireccion) {
		this.ietd_enumTipoDireccion = aetd_enumTipoDireccion;
	}

	/**
	 * Obtiene el valor para la propiedad enum tipo predio.
	 *
	 * @return El valor de la propiedad enum tipo predio
	 */
	public EnumTipoPredio getIetp_enumTipoPredio() {
		return ietp_enumTipoPredio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad enum tipo predio.
	 *
	 * @param aetp_enumTipoPredio el nuevo valor para la propiedad enum tipo predio
	 */
	public void setIetp_enumTipoPredio(EnumTipoPredio aetp_enumTipoPredio) {
		this.ietp_enumTipoPredio = aetp_enumTipoPredio;
	}

	/**
	 * Obtiene el valor para la propiedad municipio dto.
	 *
	 * @return El valor de la propiedad municipio dto
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio dto.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio dto
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}

}
