/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: IntegracionEntradaDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: IntegracionEntradaDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Integracion
 * entrada.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class IntegracionEntradaDTO extends IntegracionTemporalDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad cantidad.
	 */
	private int ii_cantidad;
	
	/**
	 * Atributo de instancia tipo lista de SalidaMatriculaDTO para definir la
	 * propiedad lista salida matricula.
	 */
	private List<SalidaMatriculaDTO> ilsm_listaSalidaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo lista de CopiasDTO para definir la propiedad lista
	 * copias.
	 */
	private List<CopiasDTO> ilc_listaCopiasDto;
	
	/**
	 * Atributo de instancia tipo lista de DatosEntradaSolicitudConsultaDTO para
	 * definir la propiedad lista datos entrada solicitud consulta.
	 */
	private List<DatosEntradaSolicitudConsultaDTO> ildesc_listaDatosEntradaSolicitudConsultaDto;
	
	/**
	 * Atributo de instancia tipo TransaccionGenericaDTO para definir la propiedad
	 * transaccion generica.
	 */
	private TransaccionGenericaDTO itg_transaccionGenericaDto;
	
	/**
	 * Atributo de instancia tipo DetalleCatalogoDTO para definir la propiedad
	 * detalle catalogo.
	 */
	private DetalleCatalogoDTO idc_detalleCatalogoDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * estado migracion.
	 */
	private Boolean ib_estadoMigracion;
	
	/**
	 * Construye una nueva instancia/objeto de la clase IntegracionEntradaDTO.
	 *
	 * @param ait_integracionTemporalDto el parametro integracion temporal dto
	 */
	public IntegracionEntradaDTO(IntegracionTemporalDTO ait_integracionTemporalDto) {
		this.setIs_id(ait_integracionTemporalDto.getIs_id());
		this.setIs_idAsosiacion(ait_integracionTemporalDto.getIs_idAsosiacion());
		this.setIs_nir(ait_integracionTemporalDto.getIs_nir());
		this.setIs_modeloEntrada(ait_integracionTemporalDto.getIs_modeloEntrada());
		this.setIs_entrada(ait_integracionTemporalDto.getIs_entrada());
		this.setIs_salida(ait_integracionTemporalDto.getIs_salida());
		this.setIbd_valorTotalServicio(ait_integracionTemporalDto.getIbd_valorTotalServicio());
		this.setIs_operacion(ait_integracionTemporalDto.getIs_operacion());
		this.setIs_resultadoGeneral(ait_integracionTemporalDto.getIs_resultadoGeneral());
		this.setIs_codigoRespuesta(ait_integracionTemporalDto.getIs_codigoRespuesta());
		this.setIs_referenciaPago(ait_integracionTemporalDto.getIs_referenciaPago());
		this.setIs_activo(ait_integracionTemporalDto.getIs_activo());
		this.setIs_estereotipoCreacion(ait_integracionTemporalDto.getIs_estereotipoCreacion());
		this.setIs_idUsuarioCreacion(ait_integracionTemporalDto.getIs_idUsuarioCreacion());
		this.setId_fechaCreacion(ait_integracionTemporalDto.getId_fechaCreacion());
		this.setIs_ipCreacion(ait_integracionTemporalDto.getIs_ipCreacion());
		this.setIs_estereotipoModificacion(ait_integracionTemporalDto.getIs_estereotipoModificacion());
		this.setIs_idUsuarioModificacion(ait_integracionTemporalDto.getIs_idUsuarioModificacion());
		this.setId_fechaModificacion(ait_integracionTemporalDto.getId_fechaModificacion());
		this.setItp_tipoProcesoDto(ait_integracionTemporalDto.getItp_tipoProcesoDto());
		this.setIu_usuarioDto(ait_integracionTemporalDto.getIu_usuarioDto());
	}

	/**
	 * Obtiene el valor para la propiedad lista salida matricula dto.
	 *
	 * @return El valor de la propiedad lista salida matricula dto
	 */
	public List<SalidaMatriculaDTO> getIlsm_listaSalidaMatriculaDto() {
		return ilsm_listaSalidaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista salida matricula dto.
	 *
	 * @param alsm_listaSalidaMatriculaDto el nuevo valor para la propiedad lista
	 *                                     salida matricula dto
	 */
	public void setIlsm_listaSalidaMatriculaDto(List<SalidaMatriculaDTO> alsm_listaSalidaMatriculaDto) {
		this.ilsm_listaSalidaMatriculaDto = alsm_listaSalidaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad.
	 *
	 * @return El valor de la propiedad cantidad
	 */
	public int getIi_cantidad() {
		return ii_cantidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad.
	 *
	 * @param ai_cantidad el nuevo valor para la propiedad cantidad
	 */
	public void setIi_cantidad(int ai_cantidad) {
		this.ii_cantidad = ai_cantidad;
	}

	/**
	 * Obtiene el valor para la propiedad lista copias dto.
	 *
	 * @return El valor de la propiedad lista copias dto
	 */
	public List<CopiasDTO> getIlc_listaCopiasDto() {
		return ilc_listaCopiasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista copias dto.
	 *
	 * @param alc_listaCopiasDto el nuevo valor para la propiedad lista copias dto
	 */
	public void setIlc_listaCopiasDto(List<CopiasDTO> alc_listaCopiasDto) {
		this.ilc_listaCopiasDto = alc_listaCopiasDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista datos entrada solicitud consulta
	 * dto.
	 *
	 * @return El valor de la propiedad lista datos entrada solicitud consulta dto
	 */
	public List<DatosEntradaSolicitudConsultaDTO> getIldesc_listaDatosEntradaSolicitudConsultaDto() {
		return ildesc_listaDatosEntradaSolicitudConsultaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista datos entrada solicitud
	 * consulta dto.
	 *
	 * @param aldesc_listaDatosEntradaSolicitudConsultaDto el nuevo valor para la
	 *                                                     propiedad lista datos
	 *                                                     entrada solicitud
	 *                                                     consulta dto
	 */
	public void setIldesc_listaDatosEntradaSolicitudConsultaDto(
			List<DatosEntradaSolicitudConsultaDTO> aldesc_listaDatosEntradaSolicitudConsultaDto) {
		this.ildesc_listaDatosEntradaSolicitudConsultaDto = aldesc_listaDatosEntradaSolicitudConsultaDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion generica dto.
	 *
	 * @return El valor de la propiedad transaccion generica dto
	 */
	public TransaccionGenericaDTO getItg_transaccionGenericaDto() {
		return itg_transaccionGenericaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion generica dto.
	 *
	 * @param atg_transaccionGenericaDto el nuevo valor para la propiedad
	 *                                   transaccion generica dto
	 */
	public void setItg_transaccionGenericaDto(TransaccionGenericaDTO atg_transaccionGenericaDto) {
		this.itg_transaccionGenericaDto = atg_transaccionGenericaDto;
	}

	/**
	 * Obtiene el valor para la propiedad detalle catalogo dto.
	 *
	 * @return El valor de la propiedad detalle catalogo dto
	 */
	public DetalleCatalogoDTO getIdc_detalleCatalogoDto() {
		return idc_detalleCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle catalogo dto.
	 *
	 * @param adc_detalleCatalogoDto el nuevo valor para la propiedad detalle
	 *                               catalogo dto
	 */
	public void setIdc_detalleCatalogoDto(DetalleCatalogoDTO adc_detalleCatalogoDto) {
		this.idc_detalleCatalogoDto = adc_detalleCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad estado migracion.
	 *
	 * @return El valor de la propiedad estado migracion
	 */
	public Boolean getIb_estadoMigracion() {
		return ib_estadoMigracion;
	}
	
	/**
	 * Cambia/actualiza el valor para la propiedad estado migracion.
	 *
	 * @param adc_detalleCatalogoDto el nuevo valor para la propiedad
	 *                               estado migracion
	 */
	public void setIb_estadoMigracion(Boolean ab_estadoMigracion) {
		this.ib_estadoMigracion = ab_estadoMigracion;
	}
	

}
