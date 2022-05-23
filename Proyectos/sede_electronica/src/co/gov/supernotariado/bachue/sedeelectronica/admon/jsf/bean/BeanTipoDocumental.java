package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CargaDocumentosFormularioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SoporteTransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CatalgoTipoDocumentalHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IConsultaCatalogosBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarCatalogosWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoDocumental;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadExcepciones;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Tipo documental.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class BeanTipoDocumental implements Serializable{

	private static final long serialVersionUID = 1L;

	private static final String CS_SALTO_LINEA = "<br />";

	private static final String CS_SEPARADOR = ",";
	
	private static final String CS_FINALIZADOR = ". ";
	
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	@EJB
	protected IConsultaCatalogosBusiness iicc_consultarCatalogosBusinees;
	
	/**
	 * Atributo de instancia tipo lista de CatalogoDTO para definir la propiedad
	 * tipo documental.
	 */
	private List<CatalogoDocumentalDTO> ilcd_tipoDocumental;

	private String is_nombreDocumentosObligatorios;

	/**
	 * Metodo que se encarga de llamar al servicio de catalogos y carga la respuesta 
	 * para ello se revisa si es apoderado para el poder y el parametro del servicio catalogo
	 * 
	 * @param aletd_tipoDocumentalesDependientes variable de tipo enum con los tipos documentales que son obligatorios segun regla de negocio
	 * @param as_parametro parametro del tipo de tipo proceso para consumir el servicio
	 * @param ab_mostrarOpcionales variable que dice si muestra los documentos no obligatorios
	 * 
	 * @return String cadena de caracteres con los id de los tipos documentales obligatorios y se carga variable con la nombre de los tipos documetnales
	 */
	protected String consultarTipoDocumental(List<EnumTipoDocumental> aletd_tipoDocumentalesDependientes,String as_parametro, Boolean ab_mostrarOpcionales) {
		String ls_respuesta = "";
		String ls_cadenaObligatorios = "";
		ParametroDTO lp_parametro = iip_parametroBusiness.consultarParametro(as_parametro);
		TipoEntradaConsultarCatalogosWSDTO ltecc_tipoEntradaConsultarCatalogosWsDto = new TipoEntradaConsultarCatalogosWSDTO();
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_catalogo(EnumCriterio.CATALOGO_TIPODOC.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_modulo(EnumCriterio.CANAL_ORIGEN.getIs_criterio());
		ltecc_tipoEntradaConsultarCatalogosWsDto.setIs_parametro(lp_parametro.getIs_valor());
		TipoSalidaConsultarCatalogosWSDTO ltscc_tipoSalidaConsultarCatalogo = iicc_consultarCatalogosBusinees.consultarCatalogos(ltecc_tipoEntradaConsultarCatalogosWsDto);
		UtilidadExcepciones.manejadorExcepcionServicios(ltscc_tipoSalidaConsultarCatalogo);
		setIlcd_tipoDocumental(new ArrayList<>());
		for(CatalogoWSDTO lc_catalogoWsdto: ltscc_tipoSalidaConsultarCatalogo.getIlc_listaCatalogo()) {
			CatalogoDocumentalDTO lcd_catalogoDocumentalDto = CatalgoTipoDocumentalHelper.entidadAWsDto(lc_catalogoWsdto);
			for(EnumTipoDocumental aetd_tipoDocumental :aletd_tipoDocumentalesDependientes)
				if(lcd_catalogoDocumentalDto.getIs_id().equals(aetd_tipoDocumental.getIs_codigo()))
					lcd_catalogoDocumentalDto.setIb_opcional(false);
			if(!lcd_catalogoDocumentalDto.getIb_opcional()) {
				ls_respuesta = ls_respuesta.concat(lcd_catalogoDocumentalDto.getIs_id() + CS_SEPARADOR);
				ls_cadenaObligatorios = ls_cadenaObligatorios.concat(" " + lcd_catalogoDocumentalDto.getIs_nombre().toLowerCase() + CS_SEPARADOR);
				getIlcd_tipoDocumental().add(lcd_catalogoDocumentalDto);
			}else if(ab_mostrarOpcionales){
				getIlcd_tipoDocumental().add(lcd_catalogoDocumentalDto);
			}
		}
		if(!ls_cadenaObligatorios.equals(""))
			ls_cadenaObligatorios = ls_cadenaObligatorios.substring(0, ls_cadenaObligatorios.length() - 1);
		setIs_nombreDocumentosObligatorios(ls_cadenaObligatorios + CS_FINALIZADOR);
		return ls_respuesta;
	}
	
	/**
	 * Metodo que se encarga de convertir una lista de soporte transaccion a lista carga documentos formulario
	 * 
	 * @param alst_listaSoportes lista de soportes transaccion
	 * @return List<CargaDocumentosFormularioDTO> lista de carga documentos formulario convertido
	 */
	protected List<CargaDocumentosFormularioDTO> convertirLista(List<SoporteTransaccionDTO> alst_listaSoportes){
		List<CargaDocumentosFormularioDTO> llcf_listaCargaFormularioDto = new ArrayList<>();
		for (SoporteTransaccionDTO lst_soporteSuspensionTurnoCargadoDto : alst_listaSoportes)
			llcf_listaCargaFormularioDto.add(lst_soporteSuspensionTurnoCargadoDto);
		
		return llcf_listaCargaFormularioDto;
	}
	
	/**
	 * Metodo que se encarga de validar que todos los documentos obligatorios hayan sido cargados
	 * 
	 * @param alcdf_listaDocumento lista de documentos de soporte cargados en la transaccion
	 * @return String lista de documentos obligatorios no cargados
	 */
	protected String validarDocumentos(List<CargaDocumentosFormularioDTO> alcdf_listaDocumento) {
		String ls_respuesta = "";
		for(CatalogoDocumentalDTO lcd_catalogoDocumetnalDto :getIlcd_tipoDocumental()) {
			if(!lcd_catalogoDocumetnalDto.getIb_opcional())
			{
				boolean lb_cargueExitoso = false;
				for (CargaDocumentosFormularioDTO lcdf_cargaDocumentoFormularioDto : alcdf_listaDocumento) {	
					if(lcdf_cargaDocumentoFormularioDto.getIcd_catalogoDocumentoDto().getIs_codigoValor().equals(lcd_catalogoDocumetnalDto.getIs_codigoValor())) {
						lb_cargueExitoso = true;
						break;
					}
				}
				if(!lb_cargueExitoso)
					ls_respuesta = ls_respuesta.concat(lcd_catalogoDocumetnalDto.getIs_nombre() + CS_SALTO_LINEA);
			}
		}
		return ls_respuesta;
	}

	public List<CatalogoDocumentalDTO> getIlcd_tipoDocumental() {
		return ilcd_tipoDocumental;
	}

	public void setIlcd_tipoDocumental(List<CatalogoDocumentalDTO> alcd_tipoDocumental) {
		this.ilcd_tipoDocumental = alcd_tipoDocumental;
	}
	
	public String getIs_nombreDocumentosObligatorios() {
		return is_nombreDocumentosObligatorios;
	}

	public void setIs_nombreDocumentosObligatorios(String as_nombreDocumentosObligatorios) {
		this.is_nombreDocumentosObligatorios = as_nombreDocumentosObligatorios;
	}
}
