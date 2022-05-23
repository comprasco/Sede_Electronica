/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AlertasLazyDataModel.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy
 * Nombre del elemento: AlertasLazyDataModel
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.lazy;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.AlertaTitularEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.AlertaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.BeansLocales;

/**
 * El elemento Class AlertasLazyDataModel.<br>
 * Representa un/una alertas lazy data model.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AlertasLazyDataModel extends LazyDataModel<AlertaWSDTO> {

	/**
	 * Atributo de instancia tipo lista de AlertaWSDTO para definir la propiedad
	 * lista titular salida.
	 */
	private List<AlertaWSDTO> ilats_listaTitularSalidaDto;

	/**
	 * Atributo de instancia tipo IRegistroAlertaBusiness para definir la propiedad
	 * registro alerta business.
	 */
	private transient IRegistroAlertaBusiness iira_registroAlertaBusiness;

	/**
	 * Atributo de instancia tipo AlertaTitularEntradaDTO para definir la propiedad
	 * alerta titular entrada.
	 */
	private AlertaTitularEntradaDTO iate_alertaTitularEntradaDto;

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una nueva instancia/objeto de la clase AlertasLazyDataModel.
	 *
	 * @param aate_alertaTitularDto el parametro alerta titular dto
	 */
	public AlertasLazyDataModel(AlertaTitularEntradaDTO aate_alertaTitularDto) {
		iira_registroAlertaBusiness = BeansLocales.consultarGestionAlertaBusiness();
		iate_alertaTitularEntradaDto = aate_alertaTitularDto;
		ilats_listaTitularSalidaDto = iira_registroAlertaBusiness.consultarAlertasTitulares(aate_alertaTitularDto)
				.getIla_listaAlerta();
		this.setRowCount(ilats_listaTitularSalidaDto.size());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.primefaces.model.LazyDataModel#getRowData(java.lang.String)
	 */
	@Override
	public AlertaWSDTO getRowData(String as_filaLlave) {
		for (AlertaWSDTO la_alertaWsDto : ilats_listaTitularSalidaDto) {
			if (la_alertaWsDto.getIs_identificadorAlerta().equals(as_filaLlave))
				return la_alertaWsDto;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.primefaces.model.LazyDataModel#load(int, int, java.lang.String,
	 * org.primefaces.model.SortOrder, java.util.Map)
	 */
	@Override
	public List<AlertaWSDTO> load(int ai_paginacionIncial, int ai_paginacionFinal, String as_organizacion,
			SortOrder aso_organizador, Map<String, Object> amso_filtros) {

		// consulta con paginado
		iate_alertaTitularEntradaDto.setIs_ultimoIdAlerta(Integer.toString(ai_paginacionIncial));
		ilats_listaTitularSalidaDto = iira_registroAlertaBusiness
				.consultarAlertasTitulares(iate_alertaTitularEntradaDto).getIla_listaAlerta();

		return ilats_listaTitularSalidaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista titular salida dto.
	 *
	 * @return El valor de la propiedad lista titular salida dto
	 */
	public List<AlertaWSDTO> getIlats_listaTitularSalidaDto() {
		return ilats_listaTitularSalidaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista titular salida dto.
	 *
	 * @param alats_listaTitularSalidaDto el nuevo valor para la propiedad lista
	 *                                    titular salida dto
	 */
	public void setIlats_listaTitularSalidaDto(List<AlertaWSDTO> alats_listaTitularSalidaDto) {
		this.ilats_listaTitularSalidaDto = alats_listaTitularSalidaDto;
	}

	/**
	 * Obtiene el valor para la propiedad alerta titular entrada dto.
	 *
	 * @return El valor de la propiedad alerta titular entrada dto
	 */
	public AlertaTitularEntradaDTO getIate_alertaTitularEntradaDto() {
		return iate_alertaTitularEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad alerta titular entrada dto.
	 *
	 * @param aate_alertaTitularEntradaDto el nuevo valor para la propiedad alerta
	 *                                     titular entrada dto
	 */
	public void setIate_alertaTitularEntradaDto(AlertaTitularEntradaDTO aate_alertaTitularEntradaDto) {
		this.iate_alertaTitularEntradaDto = aate_alertaTitularEntradaDto;
	}

}
