/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DireccionDatosBasicosDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: DireccionDatosBasicosDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Direccion datos
 * basicos.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class DireccionDatosBasicosDTO extends DireccionDTO{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * circulo registral.
	 */
	private String is_circuloRegistral;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * matricula.
	 */
	private String is_idMatricula;

	/**
	 * Construye una nueva instancia/objeto de la clase DireccionDatosBasicosDTO.
	 */
	public DireccionDatosBasicosDTO() {}
	
	/**
	 * Construye una nueva instancia/objeto de la clase DireccionDatosBasicosDTO.
	 *
	 * @param ad_direccionDto el parametro direccion dto
	 */
	public DireccionDatosBasicosDTO(DireccionDTO ad_direccionDto)
	{
		setId_departamentoDto(ad_direccionDto.getId_departamentoDto());
		setIs_id(ad_direccionDto.getIs_id());
		setIs_activo(ad_direccionDto.getIs_activo());
		setIs_complementoDireccion(ad_direccionDto.getIs_complementoDireccion());
		setIs_datoEjePrincipal(ad_direccionDto.getIs_datoEjePrincipal());
		setIs_datoEjeSecundario(ad_direccionDto.getIs_datoEjeSecundario());
		setIs_datoEjeSecundario1(ad_direccionDto.getIs_datoEjeSecundario1());
		setIs_letraEjePrincipal(ad_direccionDto.getIs_letraEjePrincipal());
		setIs_letraEjeSecundario(ad_direccionDto.getIs_letraEjeSecundario());
		setIs_letraEjeSecundario1(ad_direccionDto.getIs_letraEjeSecundario1());
		setIs_complementoEjePrincipal(ad_direccionDto.getIs_complementoEjePrincipal());
		setIs_complementoEjeSecundario(ad_direccionDto.getIs_complementoEjeSecundario());
		setIs_complementoEjeSecundario1(ad_direccionDto.getIs_complementoEjeSecundario1());
		setIs_coordenadaEjePrincipal(ad_direccionDto.getIs_coordenadaEjePrincipal());
		setIs_coordenadaEjeSecundario(ad_direccionDto.getIs_coordenadaEjeSecundario());
		setIs_coordenadaEjeSecundario1(ad_direccionDto.getIs_coordenadaEjeSecundario1());
		setId_fechaCreacion(ad_direccionDto.getId_fechaCreacion());
		setId_fechaDesde(ad_direccionDto.getId_fechaDesde());
		setId_fechaHasta(ad_direccionDto.getId_fechaHasta());
		setId_fechaModificacion(ad_direccionDto.getId_fechaModificacion());
		setIs_idUsuarioCreacion(ad_direccionDto.getIs_idUsuarioCreacion());
		setIs_idUsuarioModificacion(ad_direccionDto.getIs_idUsuarioModificacion());
		setIs_ipCreacion(ad_direccionDto.getIs_ipCreacion());
		setIs_ipModificacion(ad_direccionDto.getIs_ipModificacion());
		setIs_nombrePredio(ad_direccionDto.getIs_nombrePredio());
		setIs_idComplementoDireccion(ad_direccionDto.getIs_idComplementoDireccion());
		if(ad_direccionDto.getIte_tipoEjeDto() != null) {			
			setIte_tipoEjeDto(ad_direccionDto.getIte_tipoEjeDto());
		}
		if(ad_direccionDto.getIte_tipoEjeUnoDto() != null) {			
			setIte_tipoEjeUnoDto(ad_direccionDto.getIte_tipoEjeUnoDto());
		}
		if(ad_direccionDto.getIm_municipioDto() != null) {
			setIm_municipioDto(ad_direccionDto.getIm_municipioDto());
			setId_departamentoDto(getIm_municipioDto().getId_departamentoDto());
		}
		if(ad_direccionDto.getIp_paisDto() != null) {
			setIp_paisDto(ad_direccionDto.getIp_paisDto());
		}
		if(ad_direccionDto.getIetd_enumTipoDireccion() != null) {
			setIetd_enumTipoDireccion(ad_direccionDto.getIetd_enumTipoDireccion());
		}
		if(ad_direccionDto.getIetp_enumTipoPredio() != null) {
			setIetp_enumTipoPredio(ad_direccionDto.getIetp_enumTipoPredio());
		}
	}
	
	/**
	 * Obtiene el valor para la propiedad id matricula.
	 *
	 * @return El valor de la propiedad id matricula
	 */
	public String getIs_idMatricula() {
		return is_idMatricula;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad id matricula.
	 *
	 * @param as_idMatricula el nuevo valor para la propiedad id matricula
	 */
	public void setIs_idMatricula(String as_idMatricula) {
		this.is_idMatricula = as_idMatricula;
	}
	
	/**
	 * Obtiene el valor para la propiedad circulo registral.
	 *
	 * @return El valor de la propiedad circulo registral
	 */
	public String getIs_circuloRegistral() {
		return is_circuloRegistral;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral.
	 *
	 * @param as_circuloRegistral el nuevo valor para la propiedad circulo registral
	 */
	public void setIs_circuloRegistral(String as_circuloRegistral) {
		this.is_circuloRegistral = as_circuloRegistral;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tipo eje.
	 *
	 * @return El valor de la propiedad nombre tipo eje
	 */
	public String getIs_nombreTipoEje() {
		if(getIte_tipoEjeDto() != null)
			return getIte_tipoEjeDto().getIs_nombre();
		return "";
	}

	/**
	 * Obtiene el valor para la propiedad nombre tipo eje uno.
	 *
	 * @return El valor de la propiedad nombre tipo eje uno
	 */
	public String getIs_nombreTipoEjeUno() {
		if(getIte_tipoEjeUnoDto() != null)
			return getIte_tipoEjeUnoDto().getIs_nombre();
		return "";
	}
	
}
