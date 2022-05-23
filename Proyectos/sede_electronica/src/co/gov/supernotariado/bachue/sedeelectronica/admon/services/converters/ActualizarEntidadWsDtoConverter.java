/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ActualizarEntidadWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: ActualizarEntidadWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEmpresaAEIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoEntradaActualizarEntidadVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoRepresentanteLegalAEIVO;
import co.gov.supernotariado.bachue.clientebus.vo.gestioncuentacupos.TipoSalidaActualizarEntidadVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEmpresaAEIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaActualizarEntidadWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoRepresentanteLegalAEIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaActualizarEntidadWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Actualizar
 * entidad ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ActualizarEntidadWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ActualizarEntidadWsDtoConverter.
	 */
	private ActualizarEntidadWsDtoConverter() {
		// Constructor vacio de la clase
	}
	
	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoSalidaActualizarEntidadVO <b>a</b>
	 * TipoSalidaActualizarEntidadWSDTO, <br>
	 * En otras palabras, <b>de</b> Tipo salida actualizar entidad objeto con
	 * valores de servicio <b>a</b> Tipo salida actualizar entidad web service dto.
	 *
	 * @param atsae_tipoSalidaActualizarEntidadvo el parametro tipo salida
	 *                                            actualizar entidadvo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como TipoSalidaActualizarEntidadWSDTO
	 */
	public static TipoSalidaActualizarEntidadWSDTO entidadAWSDTO(TipoSalidaActualizarEntidadVO atsae_tipoSalidaActualizarEntidadvo)
	{
		TipoSalidaActualizarEntidadWSDTO ltsae_tipoSalidaActualizarEntidadWsDto = new TipoSalidaActualizarEntidadWSDTO();
		ltsae_tipoSalidaActualizarEntidadWsDto.setIbi_codigoMensaje(atsae_tipoSalidaActualizarEntidadvo.getIbi_codigoMensaje());
		ltsae_tipoSalidaActualizarEntidadWsDto.setIs_descripcionMensaje(atsae_tipoSalidaActualizarEntidadvo.getIs_descripcionMensaje());
		return ltsae_tipoSalidaActualizarEntidadWsDto;
	}
	
	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEntradaActualizarEntidadWSDTO
	 * <b>a</b> TipoEntradaActualizarEntidadVO, <br>
	 * En otras palabras, <b>de</b> Tipo entrada actualizar entidad web service dto
	 * <b>a</b> Tipo entrada actualizar entidad objeto con valores de servicio.
	 *
	 * @param ateae_tipoEntradaActualizarEntidadWsDto el parametro tipo entrada
	 *                                                actualizar entidad ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEntradaActualizarEntidadVO
	 */
	public static TipoEntradaActualizarEntidadVO voAEntidad(TipoEntradaActualizarEntidadWSDTO ateae_tipoEntradaActualizarEntidadWsDto)
	{
		TipoEntradaActualizarEntidadVO lteae_tipoEntradaActualizarEntidadVo = new TipoEntradaActualizarEntidadVO();
		lteae_tipoEntradaActualizarEntidadVo.setIte_empresaAeiVo(empresaWsDtoAEmpresaVo(ateae_tipoEntradaActualizarEntidadWsDto.getIte_empresaAeiVo()));
		lteae_tipoEntradaActualizarEntidadVo.setIs_modulo(ateae_tipoEntradaActualizarEntidadWsDto.getIs_modulo());
		lteae_tipoEntradaActualizarEntidadVo.setItrl_representanteLegalAerrVo(reprentanteAVoRepresentante(ateae_tipoEntradaActualizarEntidadWsDto.getItrl_representanteLegalAerrVo()));
		return lteae_tipoEntradaActualizarEntidadVo;
	}
	
	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoEmpresaAEIWSDTO <b>a</b>
	 * TipoEmpresaAEIVO, <br>
	 * En otras palabras, <b>de</b> Tipo empresa AEIWSDTO <b>a</b> Tipo empresa
	 * AEIVO.
	 *
	 * @param atea_tipoEmpresaAeiWsDto el parametro tipo empresa aei ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoEmpresaAEIVO
	 */
	private static TipoEmpresaAEIVO empresaWsDtoAEmpresaVo(TipoEmpresaAEIWSDTO atea_tipoEmpresaAeiWsDto)
	{
		TipoEmpresaAEIVO ltea_tipoEmpresaAeiVo = new TipoEmpresaAEIVO();
		ltea_tipoEmpresaAeiVo.setIs_actividadEconomica(atea_tipoEmpresaAeiWsDto.getIs_actividadEconomica());
		ltea_tipoEmpresaAeiVo.setIs_departamentoEmpresa(atea_tipoEmpresaAeiWsDto.getIs_departamentoEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_municipioEmpresa(atea_tipoEmpresaAeiWsDto.getIs_municipioEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_numeroDocumentoEmpresa(atea_tipoEmpresaAeiWsDto.getIs_numeroDocumentoEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_paisEmpresa(atea_tipoEmpresaAeiWsDto.getIs_paisEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_razonSocialEmpresa(atea_tipoEmpresaAeiWsDto.getIs_razonSocialEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_telefonoEmpresa(atea_tipoEmpresaAeiWsDto.getIs_telefonoEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_tipoDocumentoEmpresa(atea_tipoEmpresaAeiWsDto.getIs_tipoDocumentoEmpresa());
		ltea_tipoEmpresaAeiVo.setIs_tipoEntidadEmpresa(atea_tipoEmpresaAeiWsDto.getIs_tipoEntidadEmpresa());
		return ltea_tipoEmpresaAeiVo;
	}
	
	/**
	 * Metodo que convierte de WSDTO a VO ( De Objeto de Transferencia de Datos de
	 * Servicio Web, a Objeto de valores de Servicio).<br>
	 * Se usa para convertir un objeto WSDTO manipulado en la capa de negocio, en
	 * una entrada de datos para consumir una operacion de un servicio(objeto VO).
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> TipoRepresentanteLegalAEIWSDTO <b>a</b>
	 * TipoRepresentanteLegalAEIVO, <br>
	 * En otras palabras, <b>de</b> Tipo representante legal AEIWSDTO <b>a</b> Tipo
	 * representante legal AEIVO.
	 *
	 * @param atrla_tipoRepresentanteLegalAeiWsDto el parametro tipo representante
	 *                                             legal aei ws dto
	 * @return Resultado para convertir web service dto a objeto de valores de
	 *         servicio, retornado como TipoRepresentanteLegalAEIVO
	 */
	private static TipoRepresentanteLegalAEIVO reprentanteAVoRepresentante(TipoRepresentanteLegalAEIWSDTO atrla_tipoRepresentanteLegalAeiWsDto)
	{
		TipoRepresentanteLegalAEIVO ltrla_tipoRepresentanteLegalAeiVo = new TipoRepresentanteLegalAEIVO();
		ltrla_tipoRepresentanteLegalAeiVo.setIs_correoElectronicoCorporativoUsuario(atrla_tipoRepresentanteLegalAeiWsDto.getIs_correoElectronicoCorporativoUsuario());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_departamentoEmpresa(atrla_tipoRepresentanteLegalAeiWsDto.getIs_departamentoEmpresa());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_numeroDocumentoRepresentanteLegal(atrla_tipoRepresentanteLegalAeiWsDto.getIs_numeroDocumentoRepresentanteLegal());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_primerApellido(atrla_tipoRepresentanteLegalAeiWsDto.getIs_primerApellido());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_primerNombre(atrla_tipoRepresentanteLegalAeiWsDto.getIs_primerNombre());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_segundoApellido(atrla_tipoRepresentanteLegalAeiWsDto.getIs_segundoApellido());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_segundoNombre(atrla_tipoRepresentanteLegalAeiWsDto.getIs_segundoNombre());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_telefono(atrla_tipoRepresentanteLegalAeiWsDto.getIs_telefono());
		ltrla_tipoRepresentanteLegalAeiVo.setIs_tipoDocumentoRepresentanteLegal(atrla_tipoRepresentanteLegalAeiWsDto.getIs_tipoDocumentoRepresentanteLegal());
		return ltrla_tipoRepresentanteLegalAeiVo;
	}
}
