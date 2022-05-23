/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudConsultasBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: SolicitudConsultasBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DatosEntradaSolicitudConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IInterfacesFinancierasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaServicioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSIWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoServicioCTSOWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Solicitud
 * consultas. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudConsultasBusiness", mappedName = "SolicitudConsultasBusiness")
@LocalBean
public class SolicitudConsultasBusiness implements ISolicitudConsultasBusiness{

	/**
	 * Atributo de instancia tipo IInterfacesFinancierasBusiness para definir la
	 * propiedad interfaces financieras business.
	 */
	@EJB
	private IInterfacesFinancierasBusiness iiif_interfacesFinancierasBusiness;
	
	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness#consultarTarifaConsultas(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO)
	 */
	@Override
	public SolicitudConsultasDTO consultarTarifaConsultas(SolicitudConsultasDTO asc_solicitudConsultaDto) {
		List<TipoServicioCTSIWSDTO> llts_listaTipoServicioWsDto = new ArrayList<>();
		for (int i = 0; i < asc_solicitudConsultaDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().size(); ++i) {
			TipoServicioCTSIWSDTO lts_tipoServicioTarifaWsDto = new TipoServicioCTSIWSDTO();
			lts_tipoServicioTarifaWsDto.setIltc_criterios(new ArrayList<>());
			lts_tipoServicioTarifaWsDto
			.setIs_subtipoServicio(asc_solicitudConsultaDto.getIdc_detalleCatalogoDto().getIs_idCodigoSubServicio());
			lts_tipoServicioTarifaWsDto.setIs_tipoServicio(asc_solicitudConsultaDto.getIdc_detalleCatalogoDto().getIs_idCodigoServicio());
			llts_listaTipoServicioWsDto.add(lts_tipoServicioTarifaWsDto);
		}
		TipoSalidaConsultarTarifaServicioWSDTO ltscts_tipoSalidaConsultarTarifaServicioWsDto;
		ltscts_tipoSalidaConsultarTarifaServicioWsDto = iiif_interfacesFinancierasBusiness
				.consultarTarifaServicio(llts_listaTipoServicioWsDto,asc_solicitudConsultaDto.getIp_personaDto());
		if(asc_solicitudConsultaDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().size() == 1)
			UtilidadExcepciones.manejadorExcepcionesServicios(ltscts_tipoSalidaConsultarTarifaServicioWsDto);
		int contador = 0;
		BigDecimal lbd_valorTotal = new BigDecimal(0);
		for(TipoServicioCTSOWSDTO lts_tipoServicioTarifadoWsDto : ltscts_tipoSalidaConsultarTarifaServicioWsDto.getIlts_listaTipoServiciosTarifadosWsDto())
		{
			lbd_valorTotal = lbd_valorTotal.add(lts_tipoServicioTarifadoWsDto.getIbd_valorServicio());
			asc_solicitudConsultaDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().get(contador).setIbd_valorUnitario(lts_tipoServicioTarifadoWsDto.getIbd_valorServicio());
			asc_solicitudConsultaDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().get(contador++).setIs_estado(EnumCodigosRespuestas.CODIGO_200.getIs_mensaje());
		}
		asc_solicitudConsultaDto.setIbd_valorTotal(lbd_valorTotal);
		return asc_solicitudConsultaDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness#consultarTarifaConsulta(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DatosEntradaSolicitudConsultaDTO)
	 */
	@Override 
	public DatosEntradaSolicitudConsultaDTO consultarTarifaConsulta(DatosEntradaSolicitudConsultaDTO adesc_datosEntradaSoliitudConsultaDto) {
		SolicitudConsultasDTO lsc_solicitudConsultasDto = new SolicitudConsultasDTO();
		List<DatosEntradaSolicitudConsultaDTO> lldesc_listaDatosEntradaSolcitudConsultas = new ArrayList<>();
		lldesc_listaDatosEntradaSolcitudConsultas.add(adesc_datosEntradaSoliitudConsultaDto);
		lsc_solicitudConsultasDto.setIldesc_listaDatosEntradaSolicitudConsultaDto(lldesc_listaDatosEntradaSolcitudConsultas);
		lsc_solicitudConsultasDto = consultarTarifaConsultas(lsc_solicitudConsultasDto);		
		return lsc_solicitudConsultasDto.getIldesc_listaDatosEntradaSolicitudConsultaDto().get(0);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness#guardarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudConsultasDTO)
	 */
	@Override 
	public Boolean guardarCarrito(SolicitudConsultasDTO asc_solicitudConsultasDto)
	{
		return iic_carritoBusiness.guardarTransaccionVigente(asc_solicitudConsultasDto,EnumTipoProceso.CONSULTAS);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudConsultasBusiness#cancelarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public boolean cancelarTransaccionVigente(ITransaccionDTO ait_transaccionDto) {
		return iic_carritoBusiness.cancelarCarrito(ait_transaccionDto,EnumTipoProceso.CONSULTAS);
	}
}
