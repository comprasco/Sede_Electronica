/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: RangoTarifasAlertasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: RangoTarifasAlertasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRangoTarifasAlertasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RangoTarifasAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IRangoTarifasAlertasDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IGestionAlertasTitularesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TarifaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Rango
 * tarifas alertas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Singleton(name = "RangoTarifasAlertasBusiness", mappedName = "RangoTarifasAlertasBusiness")
@LocalBean
public class RangoTarifasAlertasBusiness implements IRangoTarifasAlertasBusiness{

	/**
	 * Atributo de instancia tipo IRangoTarifasAlertasDAO para definir la propiedad
	 * rango tarifas alertas dao.
	 */
	@EJB
	private IRangoTarifasAlertasDAO iirta_rangoTarifasAlertasDao;
	
	/**
	 * Atributo de instancia tipo IGestionAlertasTitularesBusiness para definir la
	 * propiedad gestion alertas titulares business.
	 */
	@EJB
	private IGestionAlertasTitularesBusiness iigat_gestionAlertasTitularesBusiness;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRangoTarifasAlertasBusiness#consultarRangoTarifasAlertas()
	 */
	@Override
	public List<RangoTarifasAlertaDTO> consultarRangoTarifasAlertas() {
		TipoEntradaConsultarTarifaAlertasTitularesWSDTO ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto = new TipoEntradaConsultarTarifaAlertasTitularesWSDTO();
		ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		List<TarifaWSDTO> llt_listaTarifaWsDto = iigat_gestionAlertasTitularesBusiness.consultarTarifaAlertasTitulares(ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto).getIlt_listaTarifaWsDto();
		return cargarListaRangoTarifa(llt_listaTarifaWsDto);
	}
	
	/**
	 * Metodo que llena la lista de rangoTarifa de alertas para mostrar al usuario.
	 *
	 * @param alt_listaTarifaWsDto lista de tarifa traidas desde el servicio
	 * @return Resultado para cargar lista rango tarifa retornado como una lista de
	 *         RangoTarifasAlertaDTO
	 */
	private List<RangoTarifasAlertaDTO> cargarListaRangoTarifa(List<TarifaWSDTO> alt_listaTarifaWsDto)
	{
		List<RangoTarifasAlertaDTO> llrta_listaRangoTarifaAlertaDto = new ArrayList<>();
		for(TarifaWSDTO lt_tarifaWsDto: alt_listaTarifaWsDto)
		{
			RangoTarifasAlertaDTO lrta_rangoTarifaAlertaDto = new RangoTarifasAlertaDTO();
			lrta_rangoTarifaAlertaDto.setIs_rango(lt_tarifaWsDto.getIs_rango());
			lrta_rangoTarifaAlertaDto.setIs_valorTarifa(lt_tarifaWsDto.getIs_valor());
			llrta_listaRangoTarifaAlertaDto.add(lrta_rangoTarifaAlertaDto);
		}
		return llrta_listaRangoTarifaAlertaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRangoTarifasAlertasBusiness#consultarRangoTarifasAlertas(java.lang.Integer, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO)
	 */
	@Override
	public TipoSalidaConsultarTarifaAlertasTitularesWSDTO consultarRangoTarifasAlertas(Integer ai_cantidadAlertas,PersonaDTO ap_personaDto) {
		TipoEntradaConsultarTarifaAlertasTitularesWSDTO ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto = new TipoEntradaConsultarTarifaAlertasTitularesWSDTO();
		ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.setIs_cantidadAlertasNuevas(Integer.toString(ai_cantidadAlertas));
		ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.setIs_numeroDocumento(ap_personaDto.getIs_numeroDocumento());
		ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto.setIs_tipoDocumento(ap_personaDto.getItd_tipoDocumentoDto().getIs_id());
		return iigat_gestionAlertasTitularesBusiness.consultarTarifaAlertasTitulares(ltectat_tipoEntradaConsultarTarifaAlertasTitularesWsDto);
	}

}
