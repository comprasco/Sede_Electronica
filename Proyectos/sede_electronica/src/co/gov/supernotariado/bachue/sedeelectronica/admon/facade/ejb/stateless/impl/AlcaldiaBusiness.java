/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlcaldiaBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: AlcaldiaBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoEntradaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.clientebus.vo.consultapazysalvotributario.TipoSalidaConsultarPazySalvoTributarioVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametrosDinamicosAlcaldiaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IAlcaldiaDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.AlcaldiaParametrizacionHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters.PazySalvoWsDtoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarPazySalvoTributarioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumOperacionesWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumServiciosWs;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesAlcaldiaParametrizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadBusCliente;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadHistoricoConsulta;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Alcaldia.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "AlcaldiaBusiness", mappedName = "AlcaldiaBusiness")
@LocalBean
public class AlcaldiaBusiness implements IAlcaldiaBusiness {

	/**
	 * Atributo de instancia tipo IAlcaldiaDAO para definir la propiedad alcadia
	 * dao.
	 */
	@EJB
	private IAlcaldiaDAO iia_alcadiaDao;

	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(AlcaldiaBusiness.class);
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness#consultarAlcaldiasParametrizadas()
	 */
	@Override
	public List<AlcaldiaParametrizacionDTO> consultarAlcaldiasParametrizadas() {
		List<AlcaldiaParametrizacion> llap_alcaldias;
		List<AlcaldiaParametrizacionDTO> llap_alcaldiasDto = new ArrayList<>();
		llap_alcaldias = iia_alcadiaDao.consultarAlcaldiasParametrizadas();

		if (llap_alcaldias.isEmpty()) {
			return llap_alcaldiasDto;
		}else {
			llap_alcaldiasDto = AlcaldiaParametrizacionHelper.listaentidadADtoCompleto(llap_alcaldias);
			return llap_alcaldiasDto;
		}		
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness#consultarAlcaldia(java.lang.String)
	 */
	@Override
	public AlcaldiaParametrizacionDTO consultarAlcaldia(String as_idAlcaldia) {
		AlcaldiaParametrizacionDTO lap_alcadiaDto;
		AlcaldiaParametrizacion lap_alcadia = iia_alcadiaDao.consultarAlcaldiaParametrizada(as_idAlcaldia);

		if (Objects.isNull(lap_alcadia)) {
			return null;
		}else {
			lap_alcadiaDto = AlcaldiaParametrizacionHelper.entidadADtoCompleto(lap_alcadia);
			return lap_alcadiaDto;
		}	
	}


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness#consultarAlcaldias(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<AlcaldiaParametrizacionDTO> consultarAlcaldias(String as_idPais, String as_idDepartamento, String as_municipio) {

		List<AlcaldiaParametrizacion> llap_alcadia = iia_alcadiaDao.consultarAlcaldiaParametrizada(as_idPais, as_idDepartamento, as_municipio);
		List<AlcaldiaParametrizacionDTO> llap_alcadiaDto;
		llap_alcadiaDto = AlcaldiaParametrizacionHelper.listaentidadADtoCompleto(llap_alcadia);
		return llap_alcadiaDto;
	}	


	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness#actualizarAlcadia(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlcaldiaParametrizacionDTO, java.util.Map)
	 */
	@Override
	public Boolean actualizarAlcadia(AlcaldiaParametrizacionDTO aap_alcaldiaParametrizacionDto, Map<String, String> amss_parametros) {
		AlcaldiaParametrizacion lap_alcadiaParametrizada;
		aap_alcaldiaParametrizacionDto = (AlcaldiaParametrizacionDTO) UtilidadAuditoria.adicionarDatosModificacion(aap_alcaldiaParametrizacionDto);
		Boolean lb_estadoTransaccion = false;
		try {

			for (ParametrosDinamicosAlcaldiaDTO lpda_parametros: aap_alcaldiaParametrizacionDto.getIlpda_parametrosDinamicos()) 
			{ 
				if(Objects.nonNull(amss_parametros.get(lpda_parametros.getIs_nombre())) && !amss_parametros.get(lpda_parametros.getIs_nombre()).equals(lpda_parametros.getIs_valor()))
				{
					UtilidadAuditoria.adicionarDatosModificacion(lpda_parametros);
				}
			}
			
			lap_alcadiaParametrizada = AlcaldiaParametrizacionHelper.dtoAEntidadCompleto(aap_alcaldiaParametrizacionDto, new AlcaldiaParametrizacion());
			lb_estadoTransaccion = iia_alcadiaDao.actualizarAlcaldia(lap_alcadiaParametrizada);		
			return lb_estadoTransaccion;
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(),ae_excepcion);
			return lb_estadoTransaccion;
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlcaldiaBusiness#consultarPazySalvo(co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarPazySalvoTributarioWSDTO)
	 */
	@Override
	public TipoSalidaConsultarPazySalvoTributarioWSDTO consultarPazySalvo(TipoEntradaConsultarPazySalvoTributarioWSDTO atecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto) {

		try {
			TipoEntradaConsultarPazySalvoTributarioWSDTO ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto = atecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto;
			TipoEntradaConsultarPazySalvoTributarioVO ltecpst_tipoEntradaConsultarPazYSalvoTributarioVo = PazySalvoWsDtoConverter.wSDTOAVo(ltecpst_tipoEntradaConsultarPazYSalvoTributarioWsDto);
			TipoSalidaConsultarPazySalvoTributarioWSDTO ltscpst_tipoSalidaConsultarPazySalvoTributarioDTO;

			TipoSalidaConsultarPazySalvoTributarioVO ltscpst_tipoSalidaPazYSalvoTributarioVo = (TipoSalidaConsultarPazySalvoTributarioVO) UtilidadBusCliente.crearEntradaClienteIntegracionBase(EnumServiciosWs.CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO, EnumOperacionesWs.CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO, ltecpst_tipoEntradaConsultarPazYSalvoTributarioVo);
			ltscpst_tipoSalidaConsultarPazySalvoTributarioDTO = PazySalvoWsDtoConverter.voAWSDTO(ltscpst_tipoSalidaPazYSalvoTributarioVo);

			UtilidadHistoricoConsulta.registrarHistorioConsulta(
					EnumOperacionesWs.CONSULTAR_PAZ_Y_SALVO_TRIBUTARIO.getIs_nombreServicio(), 
					ltecpst_tipoEntradaConsultarPazYSalvoTributarioVo.toString(), 
					ltscpst_tipoSalidaConsultarPazySalvoTributarioDTO);			
			
			return ltscpst_tipoSalidaConsultarPazySalvoTributarioDTO;

		} catch (Exception ae_excepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesAlcaldiaParametrizacion.PAZ_SALVO_FALLIDO,ae_excepcion);
		}


	}

}