/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConsultarAlertaLazyDataModel.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy
 * Nombre del elemento: ConsultarAlertaLazyDataModel
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy;

import java.util.List;

import javax.ejb.EJB;

import org.primefaces.model.LazyDataModel;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAlertaTierrasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.BandejaAlertaTierraDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaAlertasWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarAlertasWSDTO;

/**
 * El elemento Class ConsultarAlertaLazyDataModel.<br>
 * Representa un/una consultar alerta lazy data model.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class ConsultarAlertaLazyDataModel extends LazyDataModel<TipoSalidaConsultarAlertasWSDTO> {

	/**
	 * Atributo de instancia tipo IAlertaTierrasBusiness para definir la propiedad
	 * alerta tierras business.
	 */
	@EJB
	private IAlertaTierrasBusiness iiat_alertaTierrasBusiness;

	/**
	 * Atributo de instancia tipo lista de ListaAlertasWSDTO para definir la
	 * propiedad tipo salida consultar alerta ws.
	 */
	private List<ListaAlertasWSDTO> illa_tipoSalidaConsultarAlertaWsDto;

	/**
	 * Atributo de instancia tipo BandejaAlertaTierraDTO para definir la propiedad
	 * bandeja alerta tierra.
	 */
	private BandejaAlertaTierraDTO ibat_bandejaAlertaTierraDto;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral.
	 */
	private CirculoRegistralDTO icr_circuloRegistralDto;

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * ConsultarAlertaLazyDataModel.
	 *
	 * @param abat_bandejaAlertaTierrasDto el parametro bandeja alerta tierras dto
	 */
	public ConsultarAlertaLazyDataModel(BandejaAlertaTierraDTO abat_bandejaAlertaTierrasDto) {
		ibat_bandejaAlertaTierraDto = abat_bandejaAlertaTierrasDto;
		illa_tipoSalidaConsultarAlertaWsDto = iiat_alertaTierrasBusiness
				.consultarAlertas(abat_bandejaAlertaTierrasDto, icr_circuloRegistralDto).getIlla_listaAlertasWsDto();
		this.setRowCount(illa_tipoSalidaConsultarAlertaWsDto.size());
	}

	/**
	 * Obtiene el valor para la propiedad tipo salida consultar alerta ws dto.
	 *
	 * @return El valor de la propiedad tipo salida consultar alerta ws dto
	 */
	public List<ListaAlertasWSDTO> getIlla_tipoSalidaConsultarAlertaWsDto() {
		return illa_tipoSalidaConsultarAlertaWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar alerta ws
	 * dto.
	 *
	 * @param alla_tipoSalidaConsultarAlertaWsDto el nuevo valor para la propiedad
	 *                                            tipo salida consultar alerta ws
	 *                                            dto
	 */
	public void setIlla_tipoSalidaConsultarAlertaWsDto(List<ListaAlertasWSDTO> alla_tipoSalidaConsultarAlertaWsDto) {
		this.illa_tipoSalidaConsultarAlertaWsDto = alla_tipoSalidaConsultarAlertaWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad bandeja alerta tierra dto.
	 *
	 * @return El valor de la propiedad bandeja alerta tierra dto
	 */
	public BandejaAlertaTierraDTO getIbat_bandejaAlertaTierraDto() {
		return ibat_bandejaAlertaTierraDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bandeja alerta tierra dto.
	 *
	 * @param abat_bandejaAlertaTierraDto el nuevo valor para la propiedad bandeja
	 *                                    alerta tierra dto
	 */
	public void setIbat_bandejaAlertaTierraDto(BandejaAlertaTierraDTO abat_bandejaAlertaTierraDto) {
		this.ibat_bandejaAlertaTierraDto = abat_bandejaAlertaTierraDto;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral dto.
	 *
	 * @return El valor de la propiedad circulo registral dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralDto() {
		return icr_circuloRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral dto.
	 *
	 * @param acr_circuloRegistralDto el nuevo valor para la propiedad circulo
	 *                                registral dto
	 */
	public void setIcr_circuloRegistralDto(CirculoRegistralDTO acr_circuloRegistralDto) {
		this.icr_circuloRegistralDto = acr_circuloRegistralDto;
	}
}
