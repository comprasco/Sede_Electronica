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

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Direccion.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DireccionDevolucionesDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo EnumTipoPredio para definir la propiedad enum tipo
	 * predio.
	 */
	@SerializedName("tipoPredio")
	private String is_tipoPredio;

	/**
	 * Atributo de instancia tipo EnumTipoDireccion para definir la propiedad enum
	 * tipo direccion.
	 */
	@SerializedName("tipoDireccion")
	private String is_tipoDireccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * pais.
	 */
	@SerializedName("pais")
	private String is_idPais;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * departamento.
	 */
	@SerializedName("departamento")
	private String is_idDepartamento;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * municipio.
	 */
	@SerializedName("municipio")
	private String is_idMunicipio;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje principal.
	 */
	@SerializedName("datoEjePrincipal")
	private String is_datoEjePrincipal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje principal.
	 */
	@SerializedName("letraEjePrincipal")
	private String is_letraEjePrincipal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje principal.
	 */
	@SerializedName("complementoEjePrincipal")
	private String is_complementoEjePrincipal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje principal.
	 */
	@SerializedName("coordenadaEjePrincipal")
	private String is_coordenadaEjePrincipal;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje secundario.
	 */
	@SerializedName("daroEjeSecundario")
	private String is_datoEjeSecundario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje secundario.
	 */
	@SerializedName("letraEjeSecundario")
	private String is_letraEjeSecundario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje secundario.
	 */
	@SerializedName("complementoEjeSecundario")
	private String is_complementoEjeSecundario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje secundario.
	 */
	@SerializedName("coordenadaEjeSecundario")
	private String is_coordenadaEjeSecundario;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * dato eje secundario 1.
	 */
	@SerializedName("dato2EjeSecundario")
	private String is_datoEjeSecundario1;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * letra eje secundario 1.
	 */
	@SerializedName("letra2EjeSecundario")
	private String is_letraEjeSecundario1;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento eje secundario 1.
	 */
	@SerializedName("complemento2EjeSecundario")
	private String is_complementoEjeSecundario1;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * coordenada eje secundario 1.
	 */
	@SerializedName("coordenada2EjeSecundario")
	private String is_coordenadaEjeSecundario1;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento direccion.
	 */
	@SerializedName("complementoDireccion")
	private String is_complementoDireccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * complemento descripcion.
	 */
	@SerializedName("complementoDescripcion")
	private String is_complementoDescripcion;

	/**
	 * Atributo de instancia tipo lista de DireccionDTO para definir la propiedad
	 * persona direcciones.
	 */
	private List<DireccionDevolucionesDTO> ild_personaDirecciones;

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
	public DireccionDevolucionesDTO() {
		// Metodo constructor vacio para modelo DTO
	}

	/**
	 * Metodo encargadoa de concatenar la direccion devoluciones
	 * 
	 * @param ad_direccionDto
	 */
	public DireccionDevolucionesDTO(DireccionDTO ad_direccionDto) {
		this.is_tipoPredio = ad_direccionDto.getIetp_enumTipoPredio().getIs_codigo();
		this.is_tipoDireccion = ad_direccionDto.getIetd_enumTipoDireccion().getIs_codigo();
		this.is_idPais = ad_direccionDto.getIp_paisDto().getIs_idPais();
		if (ad_direccionDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento() == null) {
			this.is_idDepartamento = "";
		} else {
			this.is_idDepartamento = ad_direccionDto.getId_departamentoDto().getIdp_idDto().getIs_idDepartamento();
		}
		if (ad_direccionDto.getIm_municipioDto().getImp_idDto().getIs_idMunicipio() == null) {
			this.is_idMunicipio = "";
		} else {
			this.is_idMunicipio = ad_direccionDto.getIm_municipioDto().getImp_idDto().getIs_idMunicipio();
		}
		this.is_datoEjePrincipal = ad_direccionDto.getIs_datoEjePrincipal();
		if (ad_direccionDto.getIs_letraEjePrincipal() == null) {
			this.is_letraEjePrincipal = "";
		} else {
			this.is_letraEjePrincipal = ad_direccionDto.getIs_letraEjePrincipal();
		}
		if (ad_direccionDto.getIs_complementoEjePrincipal() == null) {
			this.is_complementoEjePrincipal = "";
		} else {
			this.is_complementoEjePrincipal = ad_direccionDto.getIs_complementoEjePrincipal();
		}
		if (ad_direccionDto.getIs_coordenadaEjePrincipal() == null) {
			this.is_coordenadaEjePrincipal = "";
		} else {
			this.is_coordenadaEjePrincipal = ad_direccionDto.getIs_coordenadaEjePrincipal();
		}
		if (ad_direccionDto.getIs_datoEjeSecundario() == null) {
			this.is_datoEjeSecundario = "";
		} else {
			this.is_datoEjeSecundario = ad_direccionDto.getIs_datoEjeSecundario();
		}
		if (ad_direccionDto.getIs_letraEjeSecundario() == null) {
			this.is_letraEjeSecundario = "";
		} else {
			this.is_letraEjeSecundario = ad_direccionDto.getIs_letraEjeSecundario();
		}
		concatenarDireccionA(ad_direccionDto);
		concatenarDireccionB(ad_direccionDto);
	}

	/**
	 * Metodo encargadoa de concatenar la direccion devoluciones
	 * 
	 * @param ad_direccionDto
	 */
	public void concatenarDireccionA(DireccionDTO ad_direccionDto) {
		if (ad_direccionDto.getIs_complementoEjeSecundario() == null) {
			this.is_complementoEjeSecundario = "";
		} else {
			this.is_complementoEjeSecundario = ad_direccionDto.getIs_complementoEjeSecundario();
		}
		if (ad_direccionDto.getIs_coordenadaEjeSecundario() == null) {
			this.is_coordenadaEjeSecundario = "";
		} else {
			this.is_coordenadaEjeSecundario = ad_direccionDto.getIs_coordenadaEjeSecundario();
		}
		if (ad_direccionDto.getIs_datoEjeSecundario1() == null) {
			this.is_datoEjeSecundario1 = "";
		} else {
			this.is_datoEjeSecundario1 = ad_direccionDto.getIs_datoEjeSecundario1();
		}
		if (ad_direccionDto.getIs_letraEjeSecundario1() == null) {
			this.is_letraEjeSecundario1 = "";
		} else {
			this.is_letraEjeSecundario1 = ad_direccionDto.getIs_letraEjeSecundario1();
		}
	}

	/**
	 * Metodo encargadoa de concatenar la direccion devoluciones
	 * 
	 * @param ad_direccionDto
	 */
	public void concatenarDireccionB(DireccionDTO ad_direccionDto) {
		if (ad_direccionDto.getIs_complementoEjeSecundario1() == null) {
			this.is_complementoEjeSecundario1 = "";
		} else {
			this.is_complementoEjeSecundario1 = ad_direccionDto.getIs_complementoEjeSecundario1();
		}
		if (ad_direccionDto.getIs_coordenadaEjeSecundario1() == null) {
			this.is_coordenadaEjeSecundario1 = "";
		} else {
			this.is_coordenadaEjeSecundario1 = ad_direccionDto.getIs_coordenadaEjeSecundario1();
		}
		if (ad_direccionDto.getIs_idComplementoDireccion() == null) {
			this.is_complementoDireccion = "";
		} else {
			this.is_complementoDireccion = ad_direccionDto.getIs_idComplementoDireccion();
		}
		if (ad_direccionDto.getIs_complementoDireccion() == null) {
			this.is_complementoDescripcion = "";
		} else {
			this.is_complementoDescripcion = ad_direccionDto.getIs_complementoDireccion();
		}
	}

	// --- Getters-Setters

	/**
	 * Obtiene el valor para la propiedad complemento direccion.
	 *
	 * @return El valor de la propiedad complemento direccion
	 */
	public String getIs_complementoDireccion() {
		if (this.is_complementoDireccion == null)
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
		if (this.is_datoEjePrincipal == null)
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
		if (this.is_datoEjeSecundario == null)
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
	 * Obtiene el valor para la propiedad persona direcciones.
	 *
	 * @return El valor de la propiedad persona direcciones
	 */
	public List<DireccionDevolucionesDTO> getIld_personaDirecciones() {
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
	public void setIld_personaDirecciones(List<DireccionDevolucionesDTO> ald_personaDirecciones) {
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

	public String getIs_tipoPredio() {
		return is_tipoPredio;
	}

	public void setIs_tipoPredio(String as_tipoPredio) {
		this.is_tipoPredio = as_tipoPredio;
	}

	public String getIs_tipoDireccion() {
		return is_tipoDireccion;
	}

	public void setIs_tipoDireccion(String as_tipoDireccion) {
		this.is_tipoDireccion = as_tipoDireccion;
	}

	public String getIs_complementoDescripcion() {
		return is_complementoDescripcion;
	}

	public void setIs_complementoDescripcion(String as_complementoDescripcion) {
		this.is_complementoDescripcion = as_complementoDescripcion;
	}

}
