/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: AuditoriaInicioSesionInterceptador.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.interceptors
 * Nombre del elemento: AuditoriaInicioSesionInterceptador
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.interceptors;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.log4j.Logger;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICatalogoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialInicioSesionBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialInicioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumMensajesLog;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRol;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoAutenticacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;

/**
 * El elemento Class AuditoriaInicioSesionInterceptador.<br>
 * Representa un/una auditoria inicio sesion interceptador.<br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Interceptor
@AuditoriaInicioSesionAnotacion
public class AuditoriaInicioSesionInterceptador implements Serializable {

	/**
	 * Atributo de instancia tipo IHistorialInicioSesionBusiness para definir la
	 * propiedad inicio sesion historico.
	 */
	@EJB
	private IHistorialInicioSesionBusiness iihis_inicioSesionHistorico;

	/**
	 * Atributo de instancia tipo ICatalogoBusiness para definir la propiedad
	 * catalogos business.
	 */
	@EJB
	private ICatalogoBusiness iic_catalogosBusiness;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(AuditoriaInicioSesionInterceptador.class);

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Metodo que permite auditar el inicio de sesion.
	 *
	 * @param aic_contexto cotexto de usuario
	 * @return Resultado para auditar inicio sesion retornado como Object
	 * @throws Exception la excepcion exception
	 */
	@AroundInvoke
	public Object auditarInicioSesion(InvocationContext aic_contexto) throws Exception {

		Object[] lo_parameters = aic_contexto.getParameters();
		UsuarioSesionDTO lus_usuarioSesion = (UsuarioSesionDTO) lo_parameters[0];
		Object lo_resultado = aic_contexto.proceed();
		EnumRol ler_rol = EnumRol.consultarRol(lus_usuarioSesion.getIs_rol());
		HistorialInicioSesionDTO lhs_historicoSesion;

		CatalogoDTO lc_catalogoDto = iic_catalogosBusiness
				.consultarCatalogoCodigoValor(EnumTipoAutenticacion.INGRESO_SESION.getIs_codigo());

		if (lc_catalogoDto != null && ler_rol != null) {

			lhs_historicoSesion = new HistorialInicioSesionDTO();

			lhs_historicoSesion.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
			lhs_historicoSesion.setIs_estereotipo(ler_rol.getIs_estereotipo());
			lhs_historicoSesion = (HistorialInicioSesionDTO) UtilidadAuditoria
					.adicionarDatosCreacion(lhs_historicoSesion);
			lhs_historicoSesion.setIs_idCatalogoAccionUsuario(lc_catalogoDto.getIs_id());
			lhs_historicoSesion.setIs_idUsuarioCreacion(lus_usuarioSesion.getIs_idUsuario());
			lhs_historicoSesion.setIs_idUsuario(lhs_historicoSesion.getIs_idUsuarioCreacion());
			lhs_historicoSesion.setIs_ipUsuario(lhs_historicoSesion.getIs_ipCreacion());
			lhs_historicoSesion.setId_fecha(lhs_historicoSesion.getId_fechaCreacion());

			iihis_inicioSesionHistorico.crearInicioSesion(lhs_historicoSesion);

		} else {
			CL_LOGGER.error(EnumMensajesLog.INICIO_SESION_INCORRECTO.getIs_criterio());
		}

		return lo_resultado;
	}

}
