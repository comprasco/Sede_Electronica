package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper;

import java.util.ArrayList;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoDocumentalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.CatalogoWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;

/**
 * Clase auxiliar(helper) que permite transformar objetos de DTO(Data Transfer
 * Object) a JSON de servicio y viceversa. <br>
 * Contiene operaciones de transformacion para el DTO 
 * y el JSON que regresa los tipos documentales. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class CatalgoTipoDocumentalHelper {

	private CatalgoTipoDocumentalHelper(){
		// Constructor vacio de la clase
	}
	
	public static CatalogoDocumentalDTO entidadAWsDto(CatalogoWSDTO ac_catalogoWsdto) {
		CatalogoDocumentalDTO ldc_catalogoDto = new CatalogoDocumentalDTO();
		TipoDocumentalDTO ltd_tipoDocumentalDto = (TipoDocumentalDTO) GenericoDTO.toObject(ac_catalogoWsdto.getIs_nombre(), TipoDocumentalDTO.class);
		ldc_catalogoDto.setIs_id(ac_catalogoWsdto.getIs_codigo());
		ldc_catalogoDto.setIs_nombre(ltd_tipoDocumentalDto.getIs_nombre());
		ldc_catalogoDto.setIs_codigoValor(ltd_tipoDocumentalDto.getIs_tipoDocumental());
		ldc_catalogoDto.setIb_opcional(EnumBoolean.buscarBooleano(ltd_tipoDocumentalDto.getIs_opcional()).getIb_valor());
		return ldc_catalogoDto;
	}
	
	public static List<CatalogoDocumentalDTO> listaCatalogoDtoADocumentalDto(List<CatalogoDTO> alc_listaCatalogoDto){
		List<CatalogoDocumentalDTO> llcd_listaCatalogoDocumental = new ArrayList<>();
		for(CatalogoDTO lc_catalogoDto :alc_listaCatalogoDto)
			llcd_listaCatalogoDocumental.add(new CatalogoDocumentalDTO(lc_catalogoDto));
		return llcd_listaCatalogoDocumental;
	}
}
