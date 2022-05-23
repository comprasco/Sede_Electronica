/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: ConfiguracionSpringSecurity.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.common.security
 * Nombre del elemento: ConfiguracionSpringSecurity
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.common.security;

import java.util.Arrays;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.vote.AffirmativeBased;
import org.springframework.security.access.vote.RoleVoter;
import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm;
import org.springframework.security.web.access.expression.WebExpressionVoter;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.context.request.RequestContextListener;

import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumSeguridad;

/**
 * Clase que contiene la configuracion para filtrar URL publicadas por rol. <br>
 * Extiende/especializa de la clase WebSecurityConfigurerAdapter del framework
 * spring security
 * 
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Configuration
@EnableWebSecurity
public class ConfiguracionSpringSecurity extends WebSecurityConfigurerAdapter {

	/**
	 * El elemento Class ObjectPostProcessorImplementation.<br>
	 * Representa un/una object post processor implementation.<br>
	 *
	 * @author Smartsoft Solutions S.A.S
	 * @version 1.0
	 */
	private final class ObjectPostProcessorImplementation implements ObjectPostProcessor<FilterSecurityInterceptor> {

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.springframework.security.config.annotation.ObjectPostProcessor#
		 * postProcess(O)
		 */
		public <O extends FilterSecurityInterceptor> O postProcess(O ao_fsi) {
			ao_fsi.setSecurityMetadataSource(consultarFiltroSeguridadRoles());
			return ao_fsi;
		}
	}

	/**
	 * Define la constante CANTIDAD_SESION_MAXIMA_USUARIO.
	 */
	private static final Integer CANTIDAD_SESION_MAXIMA_USUARIO = 1;

	/**
	 * Configuracion Spring Security.
	 *
	 * @param ahs_http el parametro http
	 * @throws Exception la excepcion exception
	 */
	@Override
	protected void configure(HttpSecurity ahs_http) throws Exception {

		// Generacion de seguridad (Repositorio y gestion de sesiones)
		configuracionSeguridad(ahs_http);

		// Configuracion formulario para el inicio de sesion
		configuracionFormularioInicioSesion(ahs_http);
		AffirmativeBased lab_affirmativeBased = new AffirmativeBased(
				Arrays.asList(new RoleVoter(), new WebExpressionVoter()));

		// Se delega el repositorio de urls y roles
		ahs_http.authorizeRequests().accessDecisionManager(lab_affirmativeBased).anyRequest().authenticated()
		.withObjectPostProcessor(new ObjectPostProcessorImplementation());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.config.annotation.web.configuration.
	 * WebSecurityConfigurerAdapter#configure(org.springframework.security.config.
	 * annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	// Llamado a la autenticacion por JPA
	@Override
	protected void configure(AuthenticationManagerBuilder aamb_autenticador) throws Exception {
		aamb_autenticador.eraseCredentials(false);
		aamb_autenticador.userDetailsService(consultarAutenticadorBD());
	}

	/**
	 * Metodos privados para la configuracion de Spring Security.
	 *
	 * @param ahs_http el parametro http
	 * @throws Exception la excepcion exception
	 */
	private void configuracionFormularioInicioSesion(HttpSecurity ahs_http) throws Exception {

		// Configuracion de formulario
		ahs_http.authorizeRequests().and().formLogin()
		.loginPage(EnumSeguridad.URL_INICIO_PRINCIPAL.getIs_nombreParametro()).permitAll()

		// Acciones y URL para la autenticacion por formulario
		.loginProcessingUrl(EnumSeguridad.LOGIN_PROCESAMIENTO.getIs_nombreParametro()) // Submit URL
		.successHandler(consultarManejadorAutenticacionIngreso())
		.failureHandler(consultarManejadorAutenticacionFallida())
		.usernameParameter(EnumSeguridad.USER_NAME.getIs_nombreParametro())
		.passwordParameter(EnumSeguridad.PASSWORD.getIs_nombreParametro())

		// Configuracion para cerrar sesion
		.and().logout()

		// URL para cerrar sesion por POST
		.logoutUrl(EnumSeguridad.LOGOUT_PROCESAMIENTO.getIs_nombreParametro())
		.logoutSuccessHandler(consultarManejadorAutenticacionSalida());

	}

	/**
	 * Metodo que especifica la configuracion de seguridad .
	 *
	 * @param ahs_http canal de seguridad
	 * @throws Exception la excepcion exception
	 */
	private void configuracionSeguridad(HttpSecurity ahs_http) throws Exception {


		if (EnumBoolean.CHAR_S.getIb_valor()) {
			ahs_http.csrf().disable();			
		}

		// Contexto de sesiones y seguridad
		ahs_http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED).invalidSessionUrl("/").maximumSessions(CANTIDAD_SESION_MAXIMA_USUARIO)
		.expiredUrl(EnumSeguridad.URL_INICIO_PRINCIPAL_CIERRE_SESION.getIs_nombreParametro())
		.maxSessionsPreventsLogin(false);

		// Redireccion a pagina no permitida
		ahs_http.authorizeRequests().and().exceptionHandling()
		.accessDeniedPage(EnumSeguridad.URL_ACCESO_DENEGADO.getIs_nombreParametro());

	}

	/**
	 * Beans requeridos por Spring Security.
	 *
	 * @return Resultado para consultar manejador autenticacion ingreso retornado
	 *         como AuthenticationSuccessHandler
	 */
	@Bean
	public AuthenticationSuccessHandler consultarManejadorAutenticacionIngreso() {
		return new ManejadorAutenticacionCompletada();
	}

	/**
	 * Consultar autenticador BD.
	 *
	 * @return Resultado para consultar autenticador BD retornado como
	 *         UserDetailsService
	 */
	@Bean
	public UserDetailsService consultarAutenticadorBD() {
		return new AutenticadorUsuariosBD();
	}

	/**
	 * Consultar manejador autenticacion salida.
	 *
	 * @return Resultado para consultar manejador autenticacion salida retornado
	 *         como LogoutSuccessHandler
	 */
	@Bean
	public LogoutSuccessHandler consultarManejadorAutenticacionSalida() {
		return new ManejadorAutenticacionTerminada();
	}

	/**
	 * Consultar filtro seguridad roles.
	 *
	 * @return Resultado para consultar filtro seguridad roles retornado como
	 *         FilterInvocationSecurityMetadataSource
	 */
	@Bean
	public FilterInvocationSecurityMetadataSource consultarFiltroSeguridadRoles() {
		return new RepositorioFiltrosURL();
	}

	/**
	 * Consultar geerador hash.
	 *
	 * @return Resultado para consultar geerador hash retornado como PasswordEncoder
	 */
	@Bean
	public PasswordEncoder consultarGeeradorHash() {
		Pbkdf2PasswordEncoder lppe_sha = new Pbkdf2PasswordEncoder(EnumSeguridad.SECRET.getIs_nombreParametro());
		lppe_sha.setAlgorithm(SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256);
		return lppe_sha;
	}

	/**
	 * Request context listener.
	 *
	 * @return Resultado para request context listener retornado como
	 *         RequestContextListener
	 */
	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

	/**
	 * Consultar manejador autenticacion fallida.
	 *
	 * @return Resultado para consultar manejador autenticacion fallida retornado
	 *         como AuthenticationFailureHandler
	 */
	@Bean
	public AuthenticationFailureHandler consultarManejadorAutenticacionFallida() {
		return new ManejadorAutenticacionFallida();
	}

	/**
	 * Verificar contrasena invalida.
	 *
	 * @return Resultado para verificar contrasena invalida retornado como
	 *         ApplicationListener
	 */
	@Bean
	public ApplicationListener<AbstractAuthenticationEvent> verificarContrasenaInvalida() {
		return new AutenticadorListener();
	}

}