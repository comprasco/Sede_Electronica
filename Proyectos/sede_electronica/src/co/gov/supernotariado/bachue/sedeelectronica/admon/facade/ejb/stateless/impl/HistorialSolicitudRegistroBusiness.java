/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialSolicitudRegistroBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistorialSolicitudRegistroBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudRegistroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IHistorialSolicitudRegistroDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.HistorialSolicitudRegistroHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.UsuarioHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.HistorialSolicitudRegistro;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historial
 * solicitud registro. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistorialSolicitudRegistroBusiness", mappedName = "HistorialSolicitudRegistroBusiness")
@LocalBean
public class HistorialSolicitudRegistroBusiness implements IHistorialSolicitudRegistroBusiness{

	/**
	 * Atributo de instancia tipo IHistorialSolicitudRegistroDAO para definir la
	 * propiedad historial solicitud registro dao.
	 */
	@EJB
	private IHistorialSolicitudRegistroDAO iihsr_historialSolicitudRegistroDao;
	
	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudRegistroBusiness#crearSolicitudRegistro(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudRegistroDTO)
	 */
	@Override
	public Boolean crearSolicitudRegistro(HistorialSolicitudRegistroDTO ahsr_historialSolicitudRegistroDto) {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();

		Usuario lu_usuarioAutenticado = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		UsuarioDTO lu_usuarioAutenticadoDto = UsuarioHelper.entidadADtoCompletoDTO(lu_usuarioAutenticado);
		ahsr_historialSolicitudRegistroDto.setIu_usuarioAccionDto(lu_usuarioAutenticadoDto);
		HistorialSolicitudRegistroDTO lhsr_historialSolicitudRegistroDto = (HistorialSolicitudRegistroDTO) UtilidadAuditoria.adicionarDatosCreacion(ahsr_historialSolicitudRegistroDto);

		HistorialSolicitudRegistro lhsr_historialSolicitudRegistro = HistorialSolicitudRegistroHelper.dtoAEntidadCompleto(lhsr_historialSolicitudRegistroDto, new HistorialSolicitudRegistro());

		return iihsr_historialSolicitudRegistroDao.crearSolicitudRegistro(lhsr_historialSolicitudRegistro);
	}
}
