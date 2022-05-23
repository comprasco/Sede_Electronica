/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanHistorialNotificaciones.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanHistorialNotificaciones
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.jboss.logging.Logger;
import org.primefaces.PrimeFaces;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialNotificacionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaMensajesHitorialNotificacionesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.ListaTipoDocumentalWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCriterio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTiposMIME;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadDescargaPdf;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Historial de notificaciones.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanHistorialNotificaciones")
@ViewScoped
public class BeanHistorialNotificaciones implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * img general.
	 */
	@ManagedProperty(value = "#{img_general}")
	private transient ResourceBundle irb_bundleImgGeneral;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * cuenta cupo.
	 */
	@ManagedProperty(value = "#{txt_historialNotificaciones}")
	private transient ResourceBundle irb_bundleHistorialNotificaciones;

	/**
	 * Define la constante CL_LOGGER.
	 */
	static final Logger CL_LOGGER = Logger.getLogger(BeanHistorialNotificaciones.class);
	
	/**
	 * Define la constante CS_MENSAJE_PAGINA_INICIAL.
	 */
	private static final String CS_MENSAJE_PAGINA_INICIAL = "mensaje.PaginaInicial";
	
	/**
	 * Define la constante CS_MENSAJE_ULTIMA_PAGINA
	 */
	private static final String CS_MENSAJE_ULTIMA_PAGINA = "mensaje.UltimaPagina";
	
	/**
	 * Define la constante CI_CERO
	 */
	private static final int CI_CERO = 0;
	
	/**
	 * Define la constante CI_UNO
	 */
	private static final int CI_UNO = 1;
	
	/**
	 * Define la constante CI_DOS
	 */
	private static final int CI_DOS = 2;
	
	/**
	 * Define la constante CI_TRES
	 */
	private static final int CI_TRES = 3;
	
	/**
	 * Define la constante CI_DIEZ
	 */
	private static final int CI_DIEZ = 10;
	
	/**
	 * Define la constante CI_CIEN
	 */
	private static final int CI_CIEN = 100;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad
	 * historial notificaciones business.
	 */
	@EJB
	private IHistorialNotificacionesBusiness iihn_historialNotificacionesBusiness;

	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * consultado.
	 */
	private Boolean ib_consultado;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * campoNumero.
	 */
	private Boolean ib_campoNumero;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * fechaFinal.
	 */
	private Boolean ib_fechaFinal;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha maxima.
	 */
	private Date id_fechaMaxima;

	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Atributo de instancia tipo lista DTO para definir la propiedad
	 * listaNotificaciones
	 */
	private ListaNotificacionesDTO iln_listaNotificacionesDto;

	/**
	 * Atributo de instancia tipo lista DTO para definir la propiedad
	 * listaNotificaciones
	 */
	private HistorialNotificacionesDTO ihn_historialNotificacionesDto;

	/**
	 * Atributo de instancia tipo lista para definir la propiedad
	 * lista<EnumCriterio>
	 */
	private List<EnumCriterio> ilec_filtro;

	/**
	 * Atributo de instancia tipo lista para definir la propiedad
	 * lista<ListaNotificacionesDTO>
	 */
	private List<ListaNotificacionesDTO> illn_listaNotificacionesDto;

	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;

	/**
	 * Atributo de instancia tipo TipoSalidaConsultarHistorialWSDTO para definir la
	 * propiedad tipo salida consultar historial.
	 */
	private TipoSalidaConsultarHistorialWSDTO itsch_tipoSalidaConsultarHistorialWsDto;

	/**
	 * Atributo de instancia tipo integer para definir la propiedad pagina actual.
	 */
	private int ii_paginaActual;

	/**
	 * Atributo de instancia tipo integer para definir la propiedad numero pagina.
	 */
	private int ii_numeroPagina;

	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad volver.
	 */
	private Boolean ib_volver;
	
	/**
	 * Atributo de instancia tipo Boolean para definir la propiedad siguiente.
	 */
	private Boolean ib_siguiente;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	private void init() {
		itsch_tipoSalidaConsultarHistorialWsDto = new TipoSalidaConsultarHistorialWSDTO();
		ihn_historialNotificacionesDto = new HistorialNotificacionesDTO();
		ib_consultado = false;
		ib_fechaFinal = true;
		ii_paginaActual = CI_UNO;
		ii_numeroPagina = CI_UNO;
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		consultarFiltro();
		illn_listaNotificacionesDto = new ArrayList<>();
		iln_listaNotificacionesDto = new ListaNotificacionesDTO();
	}

	/**
	 * Metodo que valida la fecha final que no sea mayor a tres meses
	 * 
	 * @return id_fechaMaxima
	 */
	public Date fechaFinal() {
		Calendar lc_fecha = Calendar.getInstance();
		if (ihn_historialNotificacionesDto.getId_fechaInicial() == null) {
			ib_fechaFinal = true;
		} else {
			lc_fecha.setTime(ihn_historialNotificacionesDto.getId_fechaInicial());
			lc_fecha.add(Calendar.DAY_OF_YEAR, 90);
			id_fechaMaxima = lc_fecha.getTime();
			ib_fechaFinal = false;
		}
		return id_fechaMaxima;
	}

	/**
	 * Genera una lista de los tipos documentales para enviar documentos al owcc.
	 *
	 * @return ilec_filtro Resultado para consultar tipo documental retornado como
	 *         una lista de Filtro
	 */
	public List<EnumCriterio> consultarFiltro() {
		ilec_filtro = new ArrayList<>();
		ilec_filtro.add(EnumCriterio.NIR);
		ilec_filtro.add(EnumCriterio.TURNO);
		return ilec_filtro;
	}

	/**
	 * Metodo que se utiliza para mostrar el campo numero
	 */
	public void mostrarCampoNumero() {
		ib_campoNumero = true;
	}

	/**
	 * Metodo encargado de limpiar los campos de la consulta historico
	 * notificaciones.
	 */
	public void limpiarConsulta() {
		PrimeFaces lpf_current = PrimeFaces.current();
		iln_listaNotificacionesDto = new ListaNotificacionesDTO();

		ihn_historialNotificacionesDto.setId_fechaInicial(null);
		ihn_historialNotificacionesDto.setId_fechaFinal(null);
		ihn_historialNotificacionesDto.setIs_filtro(null);
		ihn_historialNotificacionesDto.setIs_numero(null);

		ihn_historialNotificacionesDto = new HistorialNotificacionesDTO();

		illn_listaNotificacionesDto = new ArrayList<>();
		ib_consultado = false;
		ib_campoNumero = false;
		ii_paginaActual = CI_UNO;

		lpf_current.ajax().update("panelHistorialNotificaciones");
	}

	/**
	 * Metodo encargado de mostrar las paginas anterios de notificaciones
	 */
	public void consultarNotificacionesVolver() {
		ii_paginaActual = ii_paginaActual - CI_UNO;
		if (ii_paginaActual < CI_UNO) {
			GeneradorGrowlGenerico.generarMensajeError(irb_bundleHistorialNotificaciones.getString(CS_MENSAJE_PAGINA_INICIAL));
			ii_paginaActual = ii_paginaActual + CI_UNO;
		} else {
			ihn_historialNotificacionesDto.setIs_pagina(Integer.toString(ii_paginaActual));
			consultarNotificaciones();
		}
	}

	/**
	 * Metodo encargado de mostrar las paginas siguientes de notificaciones
	 */
	public void consultarNotificacionesSiguiente() {
		if (ii_paginaActual >= ii_numeroPagina) {
			GeneradorGrowlGenerico.generarMensajeInformacion(irb_bundleHistorialNotificaciones.getString(CS_MENSAJE_ULTIMA_PAGINA));
		} else {
			ii_paginaActual = ii_paginaActual + CI_UNO;
			ihn_historialNotificacionesDto.setIs_pagina(Integer.toString(ii_paginaActual));
			consultarNotificaciones();
		}
	}

	/**
	 * Metodo que se encarga de consultar los movimientos de cuenta cupo.
	 * 
	 * @return illn_listaNotificacionesDto
	 */
	public List<ListaNotificacionesDTO> consultarNotificaciones() {
		try {
			List<ListaNotificacionesDTO> llln_listaNotificacionesDto = new ArrayList<>();
			itsch_tipoSalidaConsultarHistorialWsDto = this.iihn_historialNotificacionesBusiness
					.consultarHistorial(iu_usuarioDto, ihn_historialNotificacionesDto);
			validarPaginaSeleccionada();
			if (itsch_tipoSalidaConsultarHistorialWsDto.getIbi_numeroRegistros() != null && itsch_tipoSalidaConsultarHistorialWsDto.getIbi_numeroRegistros().intValue() >= CI_DIEZ) {
				for (int li_paginador = CI_DIEZ; li_paginador <= itsch_tipoSalidaConsultarHistorialWsDto.getIbi_numeroRegistros().intValue(); li_paginador = li_paginador
						+ CI_DIEZ) {
					ii_numeroPagina = CI_TRES;
				}
				int li_pag;
				String ls_pag;
				for (li_pag = CI_DIEZ; li_pag < itsch_tipoSalidaConsultarHistorialWsDto.getIbi_numeroRegistros()
						.intValue(); li_pag = li_pag + CI_DIEZ)
					;
				if (li_pag >= CI_CIEN) {
					ls_pag = Integer.toString(li_pag).substring(CI_CERO, CI_DOS);
				} else {
					ls_pag = Integer.toString(li_pag).substring(CI_CERO, CI_UNO);
				}
				ii_numeroPagina = Integer.parseInt(ls_pag);
			} else {
				ii_numeroPagina = CI_UNO;
				ib_siguiente = false;
			}
			for (ListaMensajesHitorialNotificacionesWSDTO llmhn_listaMensajesHitorialNotificacionesWsDto : itsch_tipoSalidaConsultarHistorialWsDto
					.getIllmhn_listaMensajesHitorialNotificacionesWsDto()) {
				ListaNotificacionesDTO lln_listaNotificacionesDto = new ListaNotificacionesDTO();
				int li_posicionAsunto = illn_listaNotificacionesDto.size();
				iln_listaNotificacionesDto.setIs_id(String.valueOf(li_posicionAsunto));
				lln_listaNotificacionesDto.setId_fechaComunicacion(llmhn_listaMensajesHitorialNotificacionesWsDto.getId_fechaEnvio());
				lln_listaNotificacionesDto.setIs_turno(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_turno());
				lln_listaNotificacionesDto.setIs_nir(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_nir());
				lln_listaNotificacionesDto.setIs_tramite(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_tipoTramiteCurso());
				lln_listaNotificacionesDto
						.setIs_de(ius_usuarioSesionDto.getIs_nombre() + " " + ius_usuarioSesionDto.getIs_apellido());
				lln_listaNotificacionesDto.setIs_para(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_para());
				lln_listaNotificacionesDto.setIs_asunto(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_asunto());
				lln_listaNotificacionesDto.setId_fechaAsunto(llmhn_listaMensajesHitorialNotificacionesWsDto.getId_fechaEnvio());
				for (ListaTipoDocumentalWSDTO lln_listaNotificacionDto : llmhn_listaMensajesHitorialNotificacionesWsDto
						.getIlltd_listaTipoDocumentalWsDto()) {
					lln_listaNotificacionesDto.setIs_adjunto(lln_listaNotificacionDto.getIs_nomTipoDocumentoPublico());
				}
				lln_listaNotificacionesDto.setIs_texto(llmhn_listaMensajesHitorialNotificacionesWsDto.getIs_cuerpo());
				llln_listaNotificacionesDto.add(lln_listaNotificacionesDto);
			}
			illn_listaNotificacionesDto = llln_listaNotificacionesDto;
	
			ib_consultado = true;
			return illn_listaNotificacionesDto;
		}catch(Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return null;
		}
	}

	/**
	 * Metodo encargado de validar la pagina seleccionada
	 * 
	 * @return ii_paginaActual
	 */
	public int validarPaginaSeleccionada() {
		if (ihn_historialNotificacionesDto.getIs_pagina() == null) {
			ii_paginaActual = CI_UNO;
		} else if (Integer.parseInt(ihn_historialNotificacionesDto.getIs_pagina()) != ii_paginaActual) {
			ii_paginaActual = Integer.parseInt(ihn_historialNotificacionesDto.getIs_pagina());
		}
		return ii_paginaActual;
	}

	/**
	 * Metodo encargado de generar el id del asunto
	 * 
	 * @param aln_listaNotificacionesDto
	 */
	public void cargarIdAsunto(ListaNotificacionesDTO aln_listaNotificacionesDto) {
		iln_listaNotificacionesDto = aln_listaNotificacionesDto;
	}

	/**
	 * Metodo encargado de descargar el asunto del historial consultado en formato
	 * pdf
	 */
	public void descargarPdf() {
		try {
			List<ArchivosDinamicosDTO> llad_archivos;
			llad_archivos = UtilidadDescargaPdf.generarDocumentoPdf(irb_bundleImgGeneral);

			byte[] lb_archivo = iihn_historialNotificacionesBusiness
					.consultarDocumentoAsuntoHistorialNotificaciones(iln_listaNotificacionesDto, llad_archivos);
			String ls_archivoConvertido = new String(Base64.getEncoder().encode(lb_archivo));
			PrimeFaces.current().executeScript(String.format("botonDescargaArchivo('%s','%s','%s')",
					ls_archivoConvertido, EnumTiposMIME.PDF.getIs_tipoMime(), "Historial notificacion.pdf"));
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
		modalAsunto();
	}

	/**
	 * Metodo encargado de cerrar modal de asunto.
	 */
	public void modalAsunto() {
		PrimeFaces lpf_current = PrimeFaces.current();
		lpf_current.executeScript("PF('asunto').hide()");
	}

	/**
	 * Obtiene el valor para la propiedad consultado.
	 *
	 * @return El valor de la propiedad consultado
	 */
	public Boolean getIb_consultado() {
		return ib_consultado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad consultado.
	 *
	 * @param ab_consultado el nuevo valor para la propiedad consultado
	 */
	public void setIb_consultado(Boolean ab_consultado) {
		this.ib_consultado = ab_consultado;
	}

	/**
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

	/**
	 * Obtiene el valor para la propiedad bundle img general.
	 *
	 * @return El valor de la propiedad bundle img general
	 */
	public ResourceBundle getIrb_bundleImgGeneral() {
		return irb_bundleImgGeneral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle img general.
	 *
	 * @param arb_bundleImgGeneral el nuevo valor para la propiedad bundle img
	 *                             general
	 */
	public void setIrb_bundleImgGeneral(ResourceBundle arb_bundleImgGeneral) {
		this.irb_bundleImgGeneral = arb_bundleImgGeneral;
	}

	/**
	 * Obtiene el valor para la propiedad fecha actual.
	 *
	 * @return El valor de la propiedad fecha actual
	 */
	public Date getid_fechaMaxima() {
		return id_fechaMaxima;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha actual.
	 *
	 * @param ad_fechaMaxima el nuevo valor para la propiedad fecha actual
	 */
	public void setid_fechaMaxima(Date ad_fechaMaxima) {
		this.id_fechaMaxima = ad_fechaMaxima;
	}

	/**
	 * Obtiene el valor para el bundle historial notificaciones.
	 *
	 * @return El valor del bundle historial notificaciones
	 */
	public ResourceBundle getIrb_bundleHistorialNotificaciones() {
		return irb_bundleHistorialNotificaciones;
	}

	/**
	 * Cambia/actualiza el valor para el bundle historial notificaciones.
	 *
	 * @param ad_fechaMaxima el nuevo valor para el bundle historial notificaciones
	 */
	public void setIrb_bundleHistorialNotificaciones(ResourceBundle arb_bundleHistorialNotificaciones) {
		this.irb_bundleHistorialNotificaciones = arb_bundleHistorialNotificaciones;
	}

	/**
	 * Obtiene el valor para la propiedad EnumCriterio
	 * 
	 * @return ilec_filtro
	 */
	public List<EnumCriterio> getIlec_filtro() {
		return ilec_filtro;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad EnumCriterio
	 * 
	 * @param alec_filtro el nuevo valor para la propiedad EnumCriterio
	 */
	public void setIlec_filtro(List<EnumCriterio> alec_filtro) {
		this.ilec_filtro = alec_filtro;
	}

	/**
	 * Obtiene el valor para la propiedad campoNumero
	 * 
	 * @return ib_campoNumero
	 */
	public Boolean getIb_campoNumero() {
		return ib_campoNumero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad campoNumero
	 * 
	 * @param ab_campoNumeo
	 */
	public void setIb_campoNumero(Boolean ab_campoNumeo) {
		this.ib_campoNumero = ab_campoNumeo;
	}

	/**
	 * Obtiene el valor para la propiedad ListaNotificacionesDTO
	 * 
	 * @return illn_listaNotificacionesDto
	 */
	public List<ListaNotificacionesDTO> getIlln_listaNotificacionesDto() {
		return illn_listaNotificacionesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ListaNotificacionesDto
	 * 
	 * @param alln_listaNotificacionesDto
	 */
	public void setIlln_listaNotificacionesDto(List<ListaNotificacionesDTO> alln_listaNotificacionesDto) {
		this.illn_listaNotificacionesDto = alln_listaNotificacionesDto;
	}

	/**
	 * Obtiene el valor para la propiedad fechaFinal
	 * 
	 * @return ib_fechaFinal
	 */
	public Boolean getIb_fechaFinal() {
		return ib_fechaFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fechaFinal
	 * 
	 * @param ab_fechaFinal
	 */
	public void setIb_fechaFinal(Boolean ab_fechaFinal) {
		this.ib_fechaFinal = ab_fechaFinal;
	}

	/**
	 * Obtiene el valor para la propiedad listaNotificacionesDto
	 * 
	 * @return iln_listaNotificacionesDto
	 */
	public ListaNotificacionesDTO getIln_listaNotificacionesDto() {
		return iln_listaNotificacionesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad la listaNotificacionesDto
	 * 
	 * @param aln_listaNotificacionesDto
	 */
	public void setIln_listaNotificacionesDto(ListaNotificacionesDTO aln_listaNotificacionesDto) {
		this.iln_listaNotificacionesDto = aln_listaNotificacionesDto;
	}

	/**
	 * Obtiene el valor para la propiedad HistorialNotificacionesDTO
	 * 
	 * @return ihn_historialNotificacionesDto
	 */
	public HistorialNotificacionesDTO getIhn_historialNotificacionesDto() {
		return ihn_historialNotificacionesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad HistorialNotificacionesDTO
	 * 
	 * @param ahn_historialNotificacionesDto
	 */
	public void setIhn_historialNotificacionesDto(HistorialNotificacionesDTO ahn_historialNotificacionesDto) {
		this.ihn_historialNotificacionesDto = ahn_historialNotificacionesDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad salida consultar historial dto.
	 *
	 * @return El valor de la propiedad TipoSalidaConsultarHistorialWSDTO dto
	 */
	public TipoSalidaConsultarHistorialWSDTO getItsch_tipoSalidaConsultarHistorialWsDto() {
		return itsch_tipoSalidaConsultarHistorialWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo salida consultar historial
	 * dto.
	 *
	 * @param atsch_tipoSalidaConsultarHistorialWsDto el nuevo valor para la
	 *                                                propiedad consulta historial
	 */
	public void setItsch_tipoSalidaConsultarHistorialWsDto(
			TipoSalidaConsultarHistorialWSDTO atsch_tipoSalidaConsultarHistorialWsDto) {
		this.itsch_tipoSalidaConsultarHistorialWsDto = atsch_tipoSalidaConsultarHistorialWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad pagina actual.
	 *
	 * @return El valor de la propiedad pagina actual
	 */
	public int getIi_paginaActual() {
		return ii_paginaActual;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad pagina actual.
	 *
	 * @param ai_paginaActual el nuevo valor para la propiedad pagina actual
	 */
	public void setIi_paginaActual(int ai_paginaActual) {
		this.ii_paginaActual = ai_paginaActual;
	}

	/**
	 * Obtiene el valor para la propiedad numero pagina.
	 *
	 * @return El valor de la propiedad numero pagina
	 */
	public int getIi_numeroPagina() {
		return ii_numeroPagina;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero pagina.
	 *
	 * @param ai_numeroPagina el nuevo valor para la propiedad numero pagina
	 */
	public void setIi_numeroPagina(int ai_numeroPagina) {
		this.ii_numeroPagina = ai_numeroPagina;
	}

	/**
	 * Obtiene el valor para la propiedad volver.
	 *
	 * @return El valor de la propiedad volver
	 */
	public Boolean getIb_volver() {
		return ib_volver;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad volver.
	 *
	 * @param ib_siguiente el nuevo valor para la propiedad volver
	 */
	public void setIb_volver(Boolean ib_volver) {
		this.ib_volver = ib_volver;
	}

	/**
	 * Obtiene el valor para la propiedad siguiente.
	 *
	 * @return El valor de la propiedad siguiente
	 */
	public Boolean getIb_siguiente() {
		return ib_siguiente;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad siguiente.
	 *
	 * @param ib_siguiente el nuevo valor para la propiedad siguiente
	 */
	public void setIb_siguiente(Boolean ib_siguiente) {
		this.ib_siguiente = ib_siguiente;
	}
}
