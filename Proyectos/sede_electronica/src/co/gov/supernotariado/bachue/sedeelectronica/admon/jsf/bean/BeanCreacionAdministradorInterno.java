/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCreacionAdministradorInterno.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCreacionAdministradorInterno
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEnvioCorreoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TipoEstadoCuentaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoActivo;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoEstadoCuenta;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesPersona;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesRecuperarContrasena;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.dto.PlantillaCorreoInstanciaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.EnumPlantillasCorreo;
import co.gov.supernotariado.bachue.sedeelectronica.common.mailer.enums.parametrosPlantillas.EnumParametrosCreacionUsuarioAdministrador;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadClaveAleatoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadSeguridad;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Creacion administrador interno.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "BeanCreacionAdministradorInterno")
@ViewScoped
public class BeanCreacionAdministradorInterno implements Serializable {

	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo lista de EnumEstadoActivo para definir la
	 * propiedad estados.
	 */
	private List<EnumEstadoActivo> ileea_estados;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iud_usuarioDto;	
	
	/**
	 * Atributo de instancia tipo PrimeFaces para definir la propiedad current.
	 */
	private transient PrimeFaces ipf_current;
	
	/**
	 * Define la constante CS_DOMINIOS.
	 */
	private static final String CS_DOMINIOS = "DOMINIOS";
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	private static final Logger CL_LOGGER = Logger.getLogger(BeanCreacionAdministradorInterno.class);


	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad
	 * usuario.
	 */
	@EJB
	private IUsuarioBusiness iiu_usuario;

	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro.
	 */
	@EJB
	private IParametroBusiness iip_parametro;

	/**
	 * Atributo de instancia tipo IEnvioCorreoBusiness para definir la propiedad
	 * envio correo business.
	 */
	@EJB
	private IEnvioCorreoBusiness iiec_envioCorreoBusiness;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {

		ileea_estados = EnumEstadoActivo.consultarEstadosActivo();
		iud_usuarioDto = new UsuarioDTO();
		iud_usuarioDto.setIs_descripcion("");
		iud_usuarioDto.setIs_correoElectronico("");
		iud_usuarioDto.setIs_usuario("");
		iud_usuarioDto.setIs_celular("");
		iud_usuarioDto.setIs_rolLegible("");
		iud_usuarioDto.setIs_activo("");

	}


	/**
	 * Metodo que permite crear usuario.
	 */
	public void crearUsuario() {
		try {

			this.ipf_current = PrimeFaces.current();
			validarDatos();
			TipoEstadoCuentaDTO ltc_tipoEstadoCuenta = new TipoEstadoCuentaDTO();
			ltc_tipoEstadoCuenta.setIs_id(EnumTipoEstadoCuenta.ACTIVO.getIs_id());
			String ls_contrasena = UtilidadClaveAleatoria.generadorClave(8);
			String ls_hashContrasena = UtilidadSeguridad.encriptarTexto(ls_contrasena);		

			iud_usuarioDto.setIs_claveHash(ls_hashContrasena);
			iud_usuarioDto.setIs_contrasenaConfirmacion(EnumBoolean.CHAR_N.getIs_codigo());
			iud_usuarioDto.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
			iud_usuarioDto.setIs_celularConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
			iud_usuarioDto.setIs_activo(EnumEstadoActivo.buscarDescripcionCodigo(iud_usuarioDto.getIs_activo()).getIs_codigo());
			iud_usuarioDto.setItec_tipoEstadoCuentaDto(ltc_tipoEstadoCuenta);
			iud_usuarioDto.setIs_correoElectronicoConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
			iud_usuarioDto.setIs_celularConfirmado(EnumBoolean.CHAR_N.getIs_codigo());
			iud_usuarioDto = (UsuarioDTO) UtilidadAuditoria.adicionarDatosCreacion(iud_usuarioDto);

			if (iiu_usuario.crearUsuario(iud_usuarioDto)) {
				generarCorreo(ls_contrasena);

				ipf_current.executeScript("PF('modalCrearUsuario').hide();");
				ipf_current.executeScript("PF('modalCreacionExitosa').show();");
			}

		} catch (Exception ae_excepcion) {
			ipf_current.executeScript("PF('modalCrearUsuario').hide();");
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}

	}
	
	/**
	 * Metodo que permite generar y enviar correo al crear usuario.
	 *
	 * @param as_contrasena contrasena del usuario creada
	 */
	public void generarCorreo(String as_contrasena){
		try {
			
			String ls_servidor = UtilidadSeguridad.consultarUrlServidor();
			
			PlantillaCorreoInstanciaDTO lpci_plantillaInstanciaCorreo = iiec_envioCorreoBusiness.crearPlantillaCorreo(EnumPlantillasCorreo.CREACION_USUARIO_ADMINISTRADOR);					
			lpci_plantillaInstanciaCorreo.addMensaje(EnumParametrosCreacionUsuarioAdministrador.USUARIO.getIs_parametro(), iud_usuarioDto.getIs_usuario())
			.addMensaje(EnumParametrosCreacionUsuarioAdministrador.SERVIDOR.getIs_parametro(),ls_servidor)
			.addMensaje(EnumParametrosCreacionUsuarioAdministrador.USUARIO.getIs_parametro(),iud_usuarioDto.getIs_usuario())
			.addMensaje(EnumParametrosCreacionUsuarioAdministrador.CONTRASENA.getIs_parametro(), as_contrasena)
			.addAsunto(EnumParametrosCreacionUsuarioAdministrador.USUARIO.getIs_parametro(),iud_usuarioDto.getIs_usuario());
			
			lpci_plantillaInstanciaCorreo.setIs_destino(iud_usuarioDto.getIs_correoElectronico());
			lpci_plantillaInstanciaCorreo.generarCorreo();
			
			Boolean lb_estadoEnvioCorreo = iiec_envioCorreoBusiness.enviarCorreo(lpci_plantillaInstanciaCorreo);
			if (!lb_estadoEnvioCorreo) 
				throw new ExcepcionesNegocio(EnumExcepcionesRecuperarContrasena.SOLICITUD_RECIBIDA);
			
		} catch (Exception ae_exception) {
			CL_LOGGER.error(ae_exception.getMessage(), ae_exception);
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_exception);
		}
	}


	/**
	 * Metodo que permite validar el correo el dominio y limpiar el correo.
	 *
	 * @param as_correo el parametro correo
	 * @return cadena de texto con el nombre de usuario potencial
	 */
	public String limpiarCorreo(String as_correo) {

		String[] ls_correo = as_correo.split("@");

		ParametroDTO lp_parametro  = iip_parametro.consultarParametro(CS_DOMINIOS);
		String[] ls_dominios = lp_parametro.getIs_valor().split(",");
		Boolean lb_estado = true;

		for (int i = 0; i < ls_dominios.length; i++) {
			if (ls_correo[1].equals(ls_dominios[i])) {
				lb_estado = false;
			}	
		}

		if (lb_estado) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.DOMINIO_CORREO_INVALIDO);
		}

		return ls_correo[0];

	}

	/**
	 * Metodo que permite generar nombre de usuario.
	 */
	public void generarNombreUsuario() {

		try {

			String ls_nombreUsuario = limpiarCorreo(iud_usuarioDto.getIs_correoElectronico());
			List<String> llu_usuarioDto = iiu_usuario.consultarUsuariosNombre(ls_nombreUsuario);

			if (!llu_usuarioDto.isEmpty() && llu_usuarioDto.contains(ls_nombreUsuario)) {				
				for (Integer i = 1; i < llu_usuarioDto.size()+1; i++) {
					if (!llu_usuarioDto.contains(ls_nombreUsuario.concat(i.toString()))) {
						iud_usuarioDto.setIs_usuario(ls_nombreUsuario.concat(i.toString()));
						return;
					}
				}				
			}
			else {
				iud_usuarioDto.setIs_usuario(ls_nombreUsuario);
			}
		} catch (Exception ae_excepciones) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepciones);
		}

	}

	/**
	 * Metodo que permite validar datos de entrada con las reglas de negocio.
	 */
	private void validarDatos() {
		try {
			if (iud_usuarioDto.getIs_usuario().isEmpty()) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.USUARIO_ADMIN_INVALIDO);
			}

			limpiarCorreo(iud_usuarioDto.getIs_correoElectronico());

			if (iiu_usuario.consultarUsuario(iud_usuarioDto.getIs_usuario()) != null) {
				throw new ExcepcionesDatosEntrada(EnumExcepcionesPersona.NOMBRE_USUARIO_EXISTENTE);
			}
		} catch (EJBException ae_excepcion) {
			if (!(ae_excepcion.getCause() instanceof ExcepcionesDatosEntrada)) {
				throw ae_excepcion;
			}
		}
	}

	/**
	 * Obtiene el valor para la propiedad estados.
	 *
	 * @return El valor de la propiedad estados
	 */
	public List<EnumEstadoActivo> getIle_estados() {
		return ileea_estados;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estados.
	 *
	 * @param aleea_estados el nuevo valor para la propiedad estados
	 */
	public void setIle_estados(List<EnumEstadoActivo> aleea_estados) {
		this.ileea_estados = aleea_estados;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIud_usuarioDto() {
		return iud_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param aud_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIud_usuarioDto(UsuarioDTO aud_usuarioDto) {
		this.iud_usuarioDto = aud_usuarioDto;
	}

}
