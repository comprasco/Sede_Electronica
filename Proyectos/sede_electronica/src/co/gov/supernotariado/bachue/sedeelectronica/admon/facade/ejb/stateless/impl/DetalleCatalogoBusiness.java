/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: DetalleCatalogoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: DetalleCatalogoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IDetalleCatalogoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CatalogoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.DetalleCatalogoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Catalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoCatalogo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Detalle
 * catalogo. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "DetalleCatalogoBusiness", mappedName = "DetalleCatalogoBusiness")
@LocalBean
public class DetalleCatalogoBusiness implements IDetalleCatalogoBusiness{

	/**
	 * Atributo de instancia tipo IDetalleCatalogoDAO para definir la propiedad
	 * detalle catalogo dao.
	 */
	@EJB
	private IDetalleCatalogoDAO iidc_detalleCatalogoDao;
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogos()
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogos() {
		return DetalleCatalogoHelper.listaEntidadADtoCompleto(iidc_detalleCatalogoDao.consultarDetallesCatalogos());
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogos(java.lang.String)
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogos(String as_codigoServicio) {
		return DetalleCatalogoHelper.listaEntidadADtoCompleto(iidc_detalleCatalogoDao.consultarDetallesCatalogos(as_codigoServicio));
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogoTipoDocumental(java.lang.String)
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogoTipoDocumental(String as_idCodigoServicio) {
		return DetalleCatalogoHelper.listaEntidadADtoCompleto(iidc_detalleCatalogoDao.consultarDetalleCatalogoTipoDocumental(as_idCodigoServicio));
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetalleCatalogo(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO)
	 */
	@Override 
	public DetalleCatalogoDTO consultarDetalleCatalogo(CatalogoDTO ac_catalogo)
	{
		return DetalleCatalogoHelper.entidadADtoCompleto(iidc_detalleCatalogoDao.consultarDetalleCatalogo(CatalogoHelper.dtoAEntidadSimple(ac_catalogo, new Catalogo())));
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetalleCatalogo(java.lang.String)
	 */
	@Override 
	public DetalleCatalogoDTO consultarDetalleCatalogo(String as_codigoSubServicio)
	{
		return DetalleCatalogoHelper.entidadADtoCompleto(iidc_detalleCatalogoDao.consultarDetalleCatalogo(as_codigoSubServicio));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogosSinEspecial(java.lang.String)
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosSinEspecial(String as_codigoServicio) {
		List<DetalleCatalogoDTO> lldc_listaDetalleCatalogoDto = consultarDetallesCatalogos(as_codigoServicio);
		List<DetalleCatalogoDTO> lldc_listaResultadoDetalleCatalogoDto = new ArrayList<>();
		for(DetalleCatalogoDTO ldc_detalleCatalogoDto :lldc_listaDetalleCatalogoDto)
		{
			if(ldc_detalleCatalogoDto.getIs_especial().equals(EnumBoolean.CHAR_N.getIs_codigo()))
				lldc_listaResultadoDetalleCatalogoDto.add(ldc_detalleCatalogoDto);
		}
		return lldc_listaResultadoDetalleCatalogoDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogosCertificadosEspeciales()
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosCertificadosEspeciales() {
		List<DetalleCatalogoDTO> lldc_listaDetalleCatalogoDto = consultarDetallesCatalogos(EnumTipoServicio.CERTIFICADO.getIs_codigo());
		List<DetalleCatalogoDTO> lldc_listaResultadoDetalleCatalogoDto = new ArrayList<>();
		for(DetalleCatalogoDTO ldc_detalleCatalogoDto :lldc_listaDetalleCatalogoDto)
		{
			if(ldc_detalleCatalogoDto.getIs_especial().equals(EnumBoolean.CHAR_S.getIs_codigo()))
				lldc_listaResultadoDetalleCatalogoDto.add(ldc_detalleCatalogoDto);
		}
		return lldc_listaResultadoDetalleCatalogoDto;
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IDetalleCatalogoBusiness#consultarDetallesCatalogosDocumentosCuentaCupo()
	 */
	@Override
	public List<DetalleCatalogoDTO> consultarDetallesCatalogosDocumentosCuentaCupo() {
		List<DetalleCatalogoDTO> lldc_listaDetalleCatalogoDto = consultarDetallesCatalogos(EnumTipoCatalogo.DOCUMENTO_CUENTA_CUPO.getIs_codigo());
		List<DetalleCatalogoDTO> lldc_listaResultadoDetalleCatalogoDto = new ArrayList<>();
		for(DetalleCatalogoDTO ldc_detalleCatalogoDto :lldc_listaDetalleCatalogoDto)
		{
			if(ldc_detalleCatalogoDto.getIs_especial().equals(EnumBoolean.CHAR_S.getIs_codigo()))
				lldc_listaResultadoDetalleCatalogoDto.add(ldc_detalleCatalogoDto);
		}
		return lldc_listaResultadoDetalleCatalogoDto;
	}
}
