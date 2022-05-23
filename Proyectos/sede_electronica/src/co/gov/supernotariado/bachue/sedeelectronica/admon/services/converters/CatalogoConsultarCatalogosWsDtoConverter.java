/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CatalogoConsultarCatalogosWsDtoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters
 * Nombre del elemento: CatalogoConsultarCatalogosWsDtoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.converters;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.consultacatalogos.CatalogoVO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Catalogo
 * consultar catalogos ws dto. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalogoConsultarCatalogosWsDtoConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * CatalogoConsultarCatalogosWsDtoConverter.
	 */
	private CatalogoConsultarCatalogosWsDtoConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Metodo que convierte de VO a WSDTO (De Objeto de valores de Servicio, a
	 * Objeto de Transferencia de Datos de Servicio Web).<br>
	 * Se usa para convertir el resultado o salida de servicio(objeto VO) a un
	 * objeto WSDTO para ser manipulado en la capa de negocio. <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> CatalogoVO <b>a</b> CatalogoWSDTO, <br>
	 * En otras palabras, <b>de</b> Catalogo objeto con valores de servicio <b>a</b>
	 * Catalogo web service dto.
	 *
	 * @param ac_catalogoVo el parametro catalogo vo
	 * @return Resultado para convertir objeto de valores de servicio a web service
	 *         dto, retornado como CatalogoWSDTO
	 */
	public static CatalogoWSDTO entidadAVo(CatalogoVO ac_catalogoVo) {
		CatalogoWSDTO lc_catalogoWsDto = new CatalogoWSDTO();
		lc_catalogoWsDto.setIs_codigo(ac_catalogoVo.getIs_codigo());
		lc_catalogoWsDto.setIs_nombre(ac_catalogoVo.getIs_nombre());
		return lc_catalogoWsDto;
	}

	/**
	 * Metodo que convierte de una lista de VO a una lista de WSDTO (De Objetos de
	 * valores de Servicio, a Objetos de Transferencia de Datos de Servicio
	 * Web).<br>
	 * Se usa para convertir una lista de resultados o salidas de servicio(objetos
	 * VO) a una lista de objetos WSDTO para ser manipulados en la capa de negocio.
	 * <br>
	 * Servicio consumido mediante la UtilidadBusCliente.<br>
	 * <br>
	 * Especificamente convierte <b>de</b> una CatalogoVO <b>a</b> una
	 * CatalogoWSDTO, <br>
	 * En otras palabras, <b>de</b> una Catalogo objeto con valores de servicio
	 * <b>a</b> una Catalogo web service dto.
	 *
	 * @param alc_listaCatalogoVo el parametro lista catalogo vo
	 * @return Resultado para convertir de lista de valores de servicio a lista de
	 *         web service dto, retornado como una lista de CatalogoWSDTO
	 */
	public static List<CatalogoWSDTO> listaEntidadAListaVo(List<CatalogoVO> alc_listaCatalogoVo) {
		List<CatalogoWSDTO> llc_listaCatalogoWsDto = new ArrayList<>();
		for (CatalogoVO lc_catalogoVo : alc_listaCatalogoVo) {
			llc_listaCatalogoWsDto.add(entidadAVo(lc_catalogoVo));
		}
		return llc_listaCatalogoWsDto;
	}
}