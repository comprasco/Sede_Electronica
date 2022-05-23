/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: SolicitudRecuperacionClaveBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: SolicitudRecuperacionClaveBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ISolicitudRecuperacionClaveDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.SolicitudRecuperacionClaveHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.SolicitudRecuperacionClave;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Solicitud
 * recuperacion clave. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "SolicitudRecuperacionClaveBusiness", mappedName = "SolicitudRecuperacionClaveBusiness")
@LocalBean
public class SolicitudRecuperacionClaveBusiness implements ISolicitudRecuperacionClaveBusiness {
	
	/**
	 * Atributo de instancia tipo ISolicitudRecuperacionClaveDAO para definir la
	 * propiedad solicitud recuperacion clave DAO.
	 */
	@EJB
	private ISolicitudRecuperacionClaveDAO iisrc_solicitudRecuperacionClaveDAO;
	
	/**
	 * Atributo de instancia tipo IHistoricoClaveBusiness para definir la propiedad
	 * historico clave business.
	 */
	@EJB
	private IHistoricoClaveBusiness iihcb_historicoClaveBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness#crearSolicitudRecuperacionClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO)
	 */
	@Override
	public Boolean crearSolicitudRecuperacionClave(SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto) {
		asrc_solicitudRecuperacionClaveDto = (SolicitudRecuperacionClaveDTO) UtilidadAuditoria.adicionarDatosCreacion(asrc_solicitudRecuperacionClaveDto);
		return iisrc_solicitudRecuperacionClaveDAO.crearSolicitudRecuperacionClave(SolicitudRecuperacionClaveHelper
				.dtoAEntidadCompleto(asrc_solicitudRecuperacionClaveDto, new SolicitudRecuperacionClave()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness#consultaUsuariosRecuperacionClave(java.lang.String)
	 */
	@Override
	public SolicitudRecuperacionClaveDTO consultaUsuariosRecuperacionClave(String as_codigo) {
		SolicitudRecuperacionClaveDTO lsrc_solicitudRecuperacionClaveDTO;
			lsrc_solicitudRecuperacionClaveDTO = SolicitudRecuperacionClaveHelper
					.entidadADtoCompleto(iisrc_solicitudRecuperacionClaveDAO.consultaUsuariosRecuperacionClave(as_codigo));
		return lsrc_solicitudRecuperacionClaveDTO;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness#actualizarUsuariosRecuperacionClave(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO)
	 */
	@Override
	public Boolean actualizarUsuariosRecuperacionClave(SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDTO) {
		SolicitudRecuperacionClaveDTO lsrc_solicitudRecuperacionClave = consultaUsuariosRecuperacionClave(asrc_solicitudRecuperacionClaveDTO.getIs_uuidUrlRecuperacion());
		lsrc_solicitudRecuperacionClave.setIs_claveTemporalUsada(asrc_solicitudRecuperacionClaveDTO.getIs_claveTemporalUsada());
		lsrc_solicitudRecuperacionClave = (SolicitudRecuperacionClaveDTO) UtilidadAuditoria.adicionarDatosModificacion(lsrc_solicitudRecuperacionClave);
		iisrc_solicitudRecuperacionClaveDAO.actualizarUsuariosRecuperacionClave(SolicitudRecuperacionClaveHelper
				.dtoAEntidadCompleto(lsrc_solicitudRecuperacionClave, new SolicitudRecuperacionClave()));
		return true;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ISolicitudRecuperacionClaveBusiness#actualizarClaveUsuario(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SolicitudRecuperacionClaveDTO, co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoClaveDTO)
	 */
	@Override
	public void actualizarClaveUsuario(UsuarioDTO aud_usuarioDTO,
			SolicitudRecuperacionClaveDTO asrc_solicitudRecuperacionClaveDto, HistoricoClaveDTO ahc_historicoClaveDTO) {
		iiub_usuarioBusiness.actualizaUsuario(aud_usuarioDTO);
		iihcb_historicoClaveBusiness.crearHistoricoClave(ahc_historicoClaveDTO);
		actualizarUsuariosRecuperacionClave(asrc_solicitudRecuperacionClaveDto);
	}
}
