/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: UtilidadHistoricoConsulta.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.utils
 * Nombre del elemento: UtilidadHistoricoConsulta
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistoricoConsultaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistoricoConsultaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.SalidaGenericaWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * El elemento Class UtilidadHistoricoConsulta.<br>
 * Representa un/una utilidad historico consulta.<br>
 * Clase con utilidad que permite realizar auditoria de consultas a bachue por
 * parte de un usuario.
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class UtilidadHistoricoConsulta {

	private UtilidadHistoricoConsulta() {
		// Constructor vacio de la clase
	}

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(UtilidadHistoricoConsulta.class);

	/**
	 * Define la constante CS_USUARIO_SIN_AUTENTICACION.
	 */
	private static final String CS_USUARIO_SIN_AUTENTICACION = "SIN_AUTENTICACION";

	/**
	 * Define la constante CS_SIN_PARAMETROS.
	 */
	private static final String CS_SIN_PARAMETROS = "SIN_PARAMETROS";

	/**
	 * Define la constante CS_OPERACION_EXITOSA.
	 */
	private static final String CS_OPERACION_EXITOSA = "EXITOSA";

	/**
	 * Define la constante CS_OPERACION_FALLIDA.
	 */
	private static final String CS_OPERACION_FALLIDA = "FALLIDA";

	/**
	 * Define la constante CS_CODIGO_EXITOSO.
	 */
	private static final String CS_CODIGO_EXITOSO = "200";

	/**
	 * Metodo que permite realizar auditoria de consulta a bachue por parte de un
	 * usuario.
	 *
	 * @param as_nombreMetodo     el parametro nombre metodo
	 * @param as_entrada          el parametro entrada
	 * @param aiss_salidaServicio el parametro salida servicio
	 */
	public static void registrarHistorioConsulta(String as_nombreMetodo, String as_entrada,
			ISalidaServicioWSDTO aiss_salidaServicio) {
		IHistoricoConsultaBusiness iihc_historicoConsultasBusiness = BeansLocales.consultarHistoricoConsultasBusiness();
		ISalidaServicioWSDTO lissw_resultado = null;
		String ls_entrada = "";
		try {
			if (as_entrada != null) {
				ls_entrada = as_entrada;
			} else {
				ls_entrada = CS_SIN_PARAMETROS;
			}

			// Se obtiene return del metodo
			lissw_resultado = (ISalidaServicioWSDTO) aiss_salidaServicio;
			HttpServletRequest lhsr_solicitud = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
					.getRequest();
			SalidaGenericaWSDTO lsg_salidaGenerica = new SalidaGenericaWSDTO(lissw_resultado);

			String ls_resultado = CS_OPERACION_FALLIDA;

			if (lsg_salidaGenerica.getIs_codigoMensaje() != null && lsg_salidaGenerica.getIs_codigoMensaje().equals(CS_CODIGO_EXITOSO)) 
				ls_resultado = CS_OPERACION_EXITOSA;
			
			UsuarioSesionDTO lus_usuarioSesion = UtilidadAutoridadUsuario.consultarUsuarioSesion();
			String ls_usuario = lus_usuarioSesion == null ? CS_USUARIO_SIN_AUTENTICACION
					: lus_usuarioSesion.getIs_idUsuario();

			HistoricoConsultaDTO lhc_historicoConsulta = new HistoricoConsultaDTO();
			lhc_historicoConsulta = (HistoricoConsultaDTO) UtilidadAuditoria
					.adicionarDatosCreacion(lhc_historicoConsulta);
			lhc_historicoConsulta.setIs_idUsuario(ls_usuario);
			lhc_historicoConsulta.setIs_modeloEntrada(ls_entrada);
			lhc_historicoConsulta.setIs_modeloSalida(lsg_salidaGenerica.toString());
			lhc_historicoConsulta.setIs_nombreConsulta(as_nombreMetodo);
			lhc_historicoConsulta.setIs_url(lhsr_solicitud.getRequestURI());
			lhc_historicoConsulta.setIs_resultado(ls_resultado);

			Boolean lb_estadoHistorico = iihc_historicoConsultasBusiness.agregarConsulta(lhc_historicoConsulta);
			CL_LOGGER.info(lb_estadoHistorico + lhc_historicoConsulta.toString());
		} catch (Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage(), ae_excepcion);
		}
	}

}
