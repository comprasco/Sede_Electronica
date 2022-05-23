/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanHistorialSolicitudes.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanHistorialSolicitudes
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.primefaces.PrimeFaces;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialSolicitudesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesEntradaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialSolicitudesSalidaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TurnoHistorialSolicitudesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumEstadoBancarizacion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesFlujoTransaccion;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesServicios;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Historial solicitudes.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanHistorialSolicitudes")
@ViewScoped
public class BeanHistorialSolicitudes implements Serializable{
	
	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanHistorialSolicitudes.class);

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IHistorialSolicitudesBusiness para definir la
	 * propiedad historial solicitudes business.
	 */
	@EJB
	private IHistorialSolicitudesBusiness iihs_historialSolicitudesBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo HistorialSolicitudesEntradaDTO para definir la
	 * propiedad historial solicitudes entrada.
	 */
	//Datos
	private HistorialSolicitudesEntradaDTO ihse_historialSolicitudesEntradaDto;
	
	/**
	 * Atributo de instancia tipo lista de EnumTipoServicio para definir la
	 * propiedad lista tipo servicio.
	 */
	private List<EnumTipoServicio> ilets_listaTipoServicio;	
	
	/**
	 * Atributo de instancia tipo lista de HistorialSolicitudesSalidaDTO para
	 * definir la propiedad lista historial solicitudes.
	 */
	//Listas consultadas
	private List<HistorialSolicitudesSalidaDTO> ilhss_listaHistorialSolicitudesDto;
	
	/**
	 * Atributo de instancia tipo HistorialSolicitudesSalidaDTO para definir la
	 * propiedad historial solicitud seleccionado.
	 */
	//Datos seleccionados
	private HistorialSolicitudesSalidaDTO ihss_historialSolicitudSeleccionadoDto;
	
	/**
	 * Atributo de instancia tipo lista de HistorialSolicitudesSalidaDTO para
	 * definir la propiedad filtro historial solicitudes salida.
	 */
	private List<HistorialSolicitudesSalidaDTO> ilhss_filtroHistorialSolicitudesSalidaDto;
	
	/**
	 * Atributo de instancia tipo lista de TurnoHistorialSolicitudesDTO para definir
	 * la propiedad filtro turno historial solicitudes.
	 */
	private List<TurnoHistorialSolicitudesDTO> ilths_filtroTurnoHistorialSolicitudesDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad vista.
	 */
	private Boolean ib_vista;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad numero dias
	 * maximos.
	 */
	private Integer ii_numeroDiasMaximos;
	
	/**
	 * Define la constante CS_RECIBO_CAJA.
	 */
	private static final String CS_RECIBO_CAJA = "comprobante_pago_";
	
	/**
	 * Define la constante CS_EXTENSION.
	 */
	private static final String CS_EXTENSION = ".pdf";
	
	/**
	 * Define la constante CS_DESCARGA_ARCHIVO.
	 */
	private static final String CS_DESCARGA_ARCHIVO = "botonDescargaArchivo('%s','%s','%s')";
	
	/**
	 * Define la constante CC_VALOR_S.
	 */
	private static final char CC_VALOR_S = 'S';
	
	/**
	 * Define la constante CC_VALOR_N.
	 */
	private static final char CC_VALOR_N = 'N';
	
	/**
	 * Define la constante CC_VALOR_R.
	 */
	private static final char CC_VALOR_R = 'R';

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		ihss_historialSolicitudSeleccionadoDto = new HistorialSolicitudesSalidaDTO();
		ii_numeroDiasMaximos = Integer.decode(iip_parametroBusiness.consultarParametro(EnumParametros.NUMERO_MAXIMO_DIAS.getIs_nombreParametro()).getIs_valor());
		ihse_historialSolicitudesEntradaDto = new HistorialSolicitudesEntradaDTO();
		ilets_listaTipoServicio = EnumTipoServicio.consultarServicios();
		ib_vista = null;
	}

	/**
	 * Metodo que se encarga de consultar por tipo de solicitud y carga los datos a
	 * una lista de tipo <b>HistorialSolicitudesSalidaDTO</b> posteriormente procede
	 * a modificar la variable <b>ib_vista</b> para actualizar la vista con los
	 * datos obtenidos.
	 */
	public void buscarSolicitudes() {
		try {
			if(StringUtils.isNullOrEmpty(ihse_historialSolicitudesEntradaDto.getIs_servicio()) || 
					(ihse_historialSolicitudesEntradaDto.getId_fechaDesde() == null) ||
					(ihse_historialSolicitudesEntradaDto.getId_fechaHasta() == null)) {
				throw new ExcepcionesNegocio(EnumExcepcionesFlujoTransaccion.HISTORIAL_CAMPO_OBLIGATORIOS);
			}else {
				if(ihse_historialSolicitudesEntradaDto.getIs_nir() != null && !ihse_historialSolicitudesEntradaDto.getIs_nir().isEmpty() && !validarFormatoNir(ihse_historialSolicitudesEntradaDto.getIs_nir()))
					throw new ExcepcionesNegocio(EnumExcepcionesFlujoTransaccion.HISTORIAL_FORMATO_NIT);
				Calendar lc_calendarDesde = Calendar.getInstance();
				lc_calendarDesde.setTime(ihse_historialSolicitudesEntradaDto.getId_fechaDesde());
				lc_calendarDesde.set(Calendar.HOUR_OF_DAY,00);
				ihse_historialSolicitudesEntradaDto.setId_fechaDesde(lc_calendarDesde.getTime());
				Calendar lc_calendarHasta = Calendar.getInstance();
				lc_calendarHasta.setTime(ihse_historialSolicitudesEntradaDto.getId_fechaHasta());
				lc_calendarHasta.set(Calendar.HOUR_OF_DAY,23);
				ihse_historialSolicitudesEntradaDto.setId_fechaHasta(lc_calendarHasta.getTime());
				ilhss_listaHistorialSolicitudesDto = iihs_historialSolicitudesBusiness.consultarHistorial(ihse_historialSolicitudesEntradaDto);
				if(ihse_historialSolicitudesEntradaDto.getIs_servicio().equals(EnumTipoServicio.CERTIFICADO.getIs_codigo()))
					ilhss_listaHistorialSolicitudesDto.addAll(iihs_historialSolicitudesBusiness.consultarHistorialBancarizacion(UtilidadAutoridadUsuario.consultarUsuarioSesion().getIs_idUsuario(), ihse_historialSolicitudesEntradaDto.getId_fechaDesde() , ihse_historialSolicitudesEntradaDto.getId_fechaHasta()));
				
				if (ilhss_listaHistorialSolicitudesDto.isEmpty()) {
					throw new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_RESPUESTA_NULA);
				}
				
				ib_vista = true;			
			}
		}catch(Exception ae_excepcion) {
			CL_LOGGER.error(ae_excepcion.getMessage());
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);		
			ilhss_listaHistorialSolicitudesDto = new ArrayList<>();
			ilhss_listaHistorialSolicitudesDto.addAll(iihs_historialSolicitudesBusiness.consultarHistorialBancarizacion(UtilidadAutoridadUsuario.consultarUsuarioSesion().getIs_idUsuario(), ihse_historialSolicitudesEntradaDto.getId_fechaDesde() , ihse_historialSolicitudesEntradaDto.getId_fechaHasta()));
			if (!ilhss_listaHistorialSolicitudesDto.isEmpty()) {
				ib_vista = true;					
			}
		}
	}

	/**
	 * Metodo encargado de validar el formato del NIR.
	 *
	 * @param as_nir String a validar
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private Boolean validarFormatoNir(String as_nir) {
		Boolean lb_respuestaFormato;
		lb_respuestaFormato = (as_nir.charAt(0) == CC_VALOR_S);
		lb_respuestaFormato = lb_respuestaFormato && (as_nir.charAt(1) ==  CC_VALOR_N);
		lb_respuestaFormato = lb_respuestaFormato && (as_nir.charAt(2) ==  CC_VALOR_R);
		String ls_temporal = as_nir.substring(3);
		try {
			new BigInteger(ls_temporal);
		}catch (NumberFormatException anfe_excepcionFormatoNumero) {
			lb_respuestaFormato = false;
		}
		return lb_respuestaFormato;
	}

	/**
	 * Metodo que se encarga de traer el recibo de pago de un historial y generar la
	 * descarga del mismo.
	 *
	 * @param ahss_historialSolicitudSalidaDto <b> Resultado: </b> Descarga del
	 *                                         documento o growl de error
	 */
	public void consultarReciboCaja(HistorialSolicitudesSalidaDTO ahss_historialSolicitudSalidaDto) {
		try {
			String ls_archivo = "";

			if (ahss_historialSolicitudSalidaDto.getIs_estadoBancarizacion() != null && ahss_historialSolicitudSalidaDto.getIs_estadoBancarizacion().equals(EnumEstadoBancarizacion.OK.getIs_estado())) {
				ls_archivo = ahss_historialSolicitudSalidaDto.getIs_reciboConvertido();
			}else {
				ls_archivo = iihs_historialSolicitudesBusiness.consultarArchivo(ahss_historialSolicitudSalidaDto);
			}
			
			if(!ls_archivo.isEmpty()) {
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript(String.format(CS_DESCARGA_ARCHIVO, ls_archivo,
						EnumTiposMIME.PDF.getIs_tipoMime(), CS_RECIBO_CAJA+ahss_historialSolicitudSalidaDto.getIs_nir()+ahss_historialSolicitudSalidaDto.getId_fechaServicio()+CS_EXTENSION));
			}else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(new ExcepcionesNegocio(EnumExcepcionesServicios.PROBLEMA_NO_INFO));
			}
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);			
		}
	}



	/**
	 * Metodo que se encarga de consultar por la solicitud seleccionada y carga los
	 * datos a una lista de tipo <b>TurnoHistorialSolicitudesDTO</b> posteriormente
	 * procede a modificar la variable <b>ib_vista</b> para actualizar la vista con
	 * los datos obtenidos.
	 *
	 * @param ahss_historialSolicitudesSalidaDto el parametro historial solicitudes
	 *                                           salida dto
	 */
	public void consultarDetalleSolicitud(HistorialSolicitudesSalidaDTO ahss_historialSolicitudesSalidaDto) {
		ihss_historialSolicitudSeleccionadoDto = ahss_historialSolicitudesSalidaDto;

		if (ahss_historialSolicitudesSalidaDto.getIs_estadoBancarizacion() != null && compararEstadoPendienteGeneracion(ahss_historialSolicitudesSalidaDto.getIs_estadoBancarizacion())) {			
			HistorialSolicitudesSalidaDTO lhss_historialSolicitudes = iihs_historialSolicitudesBusiness.consultarTurnosBancarizacion(ahss_historialSolicitudesSalidaDto.getIs_referenciaPago());
			ahss_historialSolicitudesSalidaDto = lhss_historialSolicitudes;	
			ihss_historialSolicitudSeleccionadoDto.setIlths_turnoHistorialSolicitudesDto(ahss_historialSolicitudesSalidaDto.getIlths_turnoHistorialSolicitudesDto());
			ib_vista = false;
			return;
		}
		else if(ahss_historialSolicitudesSalidaDto.getIs_estadoBancarizacion() != null && ahss_historialSolicitudesSalidaDto.getIs_estadoBancarizacion().equals("OK")) {
			ihss_historialSolicitudSeleccionadoDto.setIlths_turnoHistorialSolicitudesDto(ahss_historialSolicitudesSalidaDto.getIlths_turnoHistorialSolicitudesDto());
			ib_vista = false;
			return;
		}

		try {
			List<TurnoHistorialSolicitudesDTO> llths_listaTurnoHistorialSolicitudesDto = iihs_historialSolicitudesBusiness.detalleHistorial(ahss_historialSolicitudesSalidaDto);
			ihss_historialSolicitudSeleccionadoDto.setIlths_turnoHistorialSolicitudesDto(llths_listaTurnoHistorialSolicitudesDto);
			ib_vista = false;
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);			
		}
	}

	private Boolean compararEstadoPendienteGeneracion(String as_estadoBancarizacion) {
		return (as_estadoBancarizacion.equals(EnumEstadoBancarizacion.PENDIENTE_CONFIRMACION.getIs_estado()) || as_estadoBancarizacion.equals(EnumEstadoBancarizacion.NO_GENERADO.getIs_estado()));
	}

	/**
	 * Metodo que valida la fecha maxima que se puede usar en los calendarios para
	 * consultar.
	 *
	 * @return Date fecha maxima
	 */
	public Date fechaMaxima() {
		Date ld_fechaMaxima = null;
		if(this.ihse_historialSolicitudesEntradaDto.getId_fechaDesde() == null) {
			ld_fechaMaxima = new Date();
		}else {
			ld_fechaMaxima = UtilidadFecha.sumarDias(this.ii_numeroDiasMaximos, this.ihse_historialSolicitudesEntradaDto.getId_fechaDesde());
		}
		return ld_fechaMaxima;
	}


	/**
	 * Metodo que sirve para regresar entre vistas.
	 */
	public void regresar() {
		if(ib_vista) {
			ib_vista = null;
			limpiarDatos();
		}else {
			ib_vista = true;
		}
	}

	/**
	 * Metodo que limpia los componentes para una nueva consulta.
	 */
	public void limpiarDatos() {
		ihse_historialSolicitudesEntradaDto = new HistorialSolicitudesEntradaDTO();
		ihss_historialSolicitudSeleccionadoDto = null;
		ilhss_listaHistorialSolicitudesDto = null;

	}

	/**
	 * Obtiene el valor para la propiedad historial solicitudes entrada dto.
	 *
	 * @return El valor de la propiedad historial solicitudes entrada dto
	 */
	//Getters & Setters
	public HistorialSolicitudesEntradaDTO getIhse_historialSolicitudesEntradaDto() {
		return ihse_historialSolicitudesEntradaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial solicitudes entrada
	 * dto.
	 *
	 * @param ahse_historialSolicitudesEntradaDto el nuevo valor para la propiedad
	 *                                            historial solicitudes entrada dto
	 */
	public void setIhse_historialSolicitudesEntradaDto(HistorialSolicitudesEntradaDTO ahse_historialSolicitudesEntradaDto) {
		this.ihse_historialSolicitudesEntradaDto = ahse_historialSolicitudesEntradaDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista tipo servicio.
	 *
	 * @return El valor de la propiedad lista tipo servicio
	 */
	public List<EnumTipoServicio> getIlets_listaTipoServicio() {
		return ilets_listaTipoServicio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista tipo servicio.
	 *
	 * @param alets_listaTipoServicio el nuevo valor para la propiedad lista tipo
	 *                                servicio
	 */
	public void setIlets_listaTipoServicio(List<EnumTipoServicio> alets_listaTipoServicio) {
		this.ilets_listaTipoServicio = alets_listaTipoServicio;
	}

	/**
	 * Obtiene el valor para la propiedad lista historial solicitudes dto.
	 *
	 * @return El valor de la propiedad lista historial solicitudes dto
	 */
	public List<HistorialSolicitudesSalidaDTO> getIlhss_listaHistorialSolicitudesDto() {
		return ilhss_listaHistorialSolicitudesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista historial solicitudes dto.
	 *
	 * @param alhss_listaHistorialSolicitudesDto el nuevo valor para la propiedad
	 *                                           lista historial solicitudes dto
	 */
	public void setIlhss_listaHistorialSolicitudesDto(
			List<HistorialSolicitudesSalidaDTO> alhss_listaHistorialSolicitudesDto) {
		this.ilhss_listaHistorialSolicitudesDto = alhss_listaHistorialSolicitudesDto;
	}

	/**
	 * Obtiene el valor para la propiedad historial solicitud seleccionado dto.
	 *
	 * @return El valor de la propiedad historial solicitud seleccionado dto
	 */
	public HistorialSolicitudesSalidaDTO getIhss_historialSolicitudSeleccionadoDto() {
		return ihss_historialSolicitudSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad historial solicitud seleccionado
	 * dto.
	 *
	 * @param ahss_historialSolicitudSeleccionadoDto el nuevo valor para la
	 *                                               propiedad historial solicitud
	 *                                               seleccionado dto
	 */
	public void setIhss_historialSolicitudSeleccionadoDto(
			HistorialSolicitudesSalidaDTO ahss_historialSolicitudSeleccionadoDto) {
		this.ihss_historialSolicitudSeleccionadoDto = ahss_historialSolicitudSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad vista.
	 *
	 * @return El valor de la propiedad vista
	 */
	public Boolean getIb_vista() {
		return ib_vista;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad vista.
	 *
	 * @param ab_vista el nuevo valor para la propiedad vista
	 */
	public void setIb_vista(Boolean ab_vista) {
		this.ib_vista = ab_vista;
	}

	/**
	 * Obtiene el valor para la propiedad numero dias maximos.
	 *
	 * @return El valor de la propiedad numero dias maximos
	 */
	public Integer getIi_numeroDiasMaximos() {
		return ii_numeroDiasMaximos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero dias maximos.
	 *
	 * @param ai_numeroDiasMaximos el nuevo valor para la propiedad numero dias
	 *                             maximos
	 */
	public void setIi_numeroDiasMaximos(Integer ai_numeroDiasMaximos) {
		this.ii_numeroDiasMaximos = ai_numeroDiasMaximos;
	}

	/**
	 * Obtiene el valor para la propiedad filtro historial solicitudes salida dto.
	 *
	 * @return El valor de la propiedad filtro historial solicitudes salida dto
	 */
	public List<HistorialSolicitudesSalidaDTO> getIlhss_filtroHistorialSolicitudesSalidaDto() {
		return ilhss_filtroHistorialSolicitudesSalidaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro historial solicitudes
	 * salida dto.
	 *
	 * @param alhss_filtroHistorialSolicitudesSalidaDto el nuevo valor para la
	 *                                                  propiedad filtro historial
	 *                                                  solicitudes salida dto
	 */
	public void setIlhss_filtroHistorialSolicitudesSalidaDto(
			List<HistorialSolicitudesSalidaDTO> alhss_filtroHistorialSolicitudesSalidaDto) {
		this.ilhss_filtroHistorialSolicitudesSalidaDto = alhss_filtroHistorialSolicitudesSalidaDto;
	}

	/**
	 * Obtiene el valor para la propiedad filtro turno historial solicitudes dto.
	 *
	 * @return El valor de la propiedad filtro turno historial solicitudes dto
	 */
	public List<TurnoHistorialSolicitudesDTO> getIlths_filtroTurnoHistorialSolicitudesDto() {
		return ilths_filtroTurnoHistorialSolicitudesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad filtro turno historial
	 * solicitudes dto.
	 *
	 * @param alths_filtroTurnoHistorialSolicitudesDto el nuevo valor para la
	 *                                                 propiedad filtro turno
	 *                                                 historial solicitudes dto
	 */
	public void setIlths_filtroTurnoHistorialSolicitudesDto(
			List<TurnoHistorialSolicitudesDTO> alths_filtroTurnoHistorialSolicitudesDto) {
		this.ilths_filtroTurnoHistorialSolicitudesDto = alths_filtroTurnoHistorialSolicitudesDto;
	}

}
