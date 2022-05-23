/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistoricoClaveBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistoricoClaveBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistoricoClaveDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistoricoClaveHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistoricoClave;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historico
 * clave. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistoricoClaveBusiness", mappedName = "HistoricoClaveBusiness")
@LocalBean
public class HistoricoClaveBusiness implements IHistoricoClaveBusiness {
	
	/**
	 * Atributo de instancia tipo IHistoricoClaveDAO para definir la propiedad
	 * historico clave DAO.
	 */
	@EJB
	private IHistoricoClaveDAO iihc_historicoClaveDAO;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness#crearHistoricoClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO)
	 */
	@Override
	public Boolean crearHistoricoClave(HistoricoClaveDTO ahc_historicoClaveDto) {
		try {
			ahc_historicoClaveDto = (HistoricoClaveDTO) UtilidadAuditoria.adicionarDatosCreacion(ahc_historicoClaveDto);
			return iihc_historicoClaveDAO.crearHistoricoClave(
					HistoricoClaveHelper.dtoAEntidadCompleto(ahc_historicoClaveDto, new HistoricoClave()));
		} catch (Exception ae_exception) {
			ae_exception.getMessage();
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness#consultarCantidadHistorialClaveUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, java.lang.Integer)
	 */
	@Override
	public List<HistoricoClaveDTO> consultarCantidadHistorialClaveUsuario(UsuarioDTO au_usuarioDto,Integer ai_cantidadRegistros)
	{
		List<HistoricoClaveDTO> llhc_listaHistorialClaveDto = new ArrayList<>();
		List<HistoricoClave> llhc_listaHistoricoClave = iihc_historicoClaveDAO.consultarHistoricoUsuario(UsuarioHelper.dtoAEntidadCompleto(au_usuarioDto, new Usuario()));
		if(llhc_listaHistoricoClave.isEmpty())
			return llhc_listaHistorialClaveDto;
		Integer li_cantidadRegistros = (ai_cantidadRegistros > llhc_listaHistoricoClave.size())?llhc_listaHistoricoClave.size():ai_cantidadRegistros;
		for(int li_registro = 0; li_registro < li_cantidadRegistros; li_registro++)
		{
			llhc_listaHistorialClaveDto.add(HistoricoClaveHelper.entidadADtoSimple(llhc_listaHistoricoClave.get(li_registro)));
		}
		return llhc_listaHistorialClaveDto;
	}
}
