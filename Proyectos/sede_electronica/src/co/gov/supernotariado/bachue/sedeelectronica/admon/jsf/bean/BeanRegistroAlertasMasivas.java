/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRegistroAlertasMasivas.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRegistroAlertasMasivas
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FlowEvent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IParametroBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRangoTarifasAlertasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ParametroDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RangoTarifasAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametros;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumRedireccionURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesTransaccionMasiva;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Registro alertas masivas.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRegistroAlertasMasivas")
@ViewScoped
public class BeanRegistroAlertasMasivas extends BeanTransaccionesMasivas implements Serializable{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Define la constante CS_MATRICULAS_EXITOSAS.
	 */
	private static final String CS_MATRICULAS_EXITOSAS = "Matrículas exitosas";

	/**
	 * Atributo de instancia tipo IRangoTarifasAlertasBusiness para definir la
	 * propiedad rango tarifas alertas business.
	 */
	@EJB
	private IRangoTarifasAlertasBusiness iirta_rangoTarifasAlertasBusiness;
	
	/**
	 * Atributo de instancia tipo IRegistroAlertaBusiness para definir la propiedad
	 * registro alerta business.
	 */
	@EJB
	private IRegistroAlertaBusiness iira_registroAlertaBusiness;
	
	/**
	 * Atributo de instancia tipo IParametroBusiness para definir la propiedad
	 * parametro business.
	 */
	@EJB
	private IParametroBusiness iip_parametroBusiness;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * desde matricula.
	 */
	private String is_desdeMatricula;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * hasta matricula.
	 */
	private String is_hastaMatricula;
	
	/**
	 * Atributo de instancia tipo lista de RangoTarifasAlertaDTO para definir la
	 * propiedad lista rango tarifas alertas.
	 */
	private List<RangoTarifasAlertaDTO> ilrta_listaRangoTarifasAlertasDto;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad conoce
	 * matricula.
	 */
	private Boolean ib_conoceMatricula;
	
	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad archivo
	 * matricula.
	 */
	private Boolean ib_archivoMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cantidad matriculas.
	 */
	private String is_cantidadMatriculas;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * valor total.
	 */
	private String is_valorTotal;

	/**
	 * Atributo de instancia tipo String[] para definir la propiedad lineas archivo.
	 */
	private String[] is_lineasArchivo;
	
	/**
	 * Atributo de instancia tipo Map con claves String y valores String para
	 * definir la propiedad mapa resultado validacion.
	 */
	private Map<String,String> imss_mapaResultadoValidacion;
	
	/**
	 * Atributo de instancia tipo entero para definir la propiedad matriculas
	 * validadas.
	 */
	private Integer ii_matriculasValidadas;
	
	/**
	 * Atributo de instancia tipo Map con claves Integer y valores List para definir
	 * la propiedad mapa numero listas salida matricula.
	 */
	private Map<Integer,List<SalidaMatriculaDTO>> imilsm_mapaNumeroListasSalidaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt alertas.
	 */
	@ManagedProperty(value = "#{txt_registrar_alerta_masiva}")
	private transient ResourceBundle irb_bundleTxtAlertas;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIs_redireccionIndividual(EnumRedireccionURL.REGISTRO_ALERTA_INDIVIDUAL.getIs_url());
		consultarRangoTarifasAlertas();
		setIets_enumTipoServicio(EnumTipoServicio.ALERTA);
		cargarListas();
		cargarUrls();
		setItm_transaccionMasivaDto(new TransaccionMasivoDTO(cargarTransaccion(EnumModoTipoServicio.MASIVO,EnumTipoProceso.REGISTRO_ALERTAS)));
		getItm_transaccionMasivaDto().setIdc_detalleCatalogoDto(getIldc_listaDetalleCatalogoInmediatosDto().get(0));
		inicializarMasivo();
		this.ib_archivoMatricula = true;
		this.ib_conoceMatricula = true;
		this.is_lineasArchivo = new String[4];
	}

	/**
	 * Metodo que carga el modal con los datos del minimo que permite.
	 *
	 * @return 
	 */
	public String minimoMatriculas()
	{
		String ls_subtitulo;
		ls_subtitulo = String.format(irb_bundleTxtAlertas.getString("modal.individual.1"),getIp_parametroMinimaCantidadRegistroPorArchivoDto().getIs_valorUi());
		return ls_subtitulo;
	}
	
	/**
	 * Metodo que carga la lista de rango de tarifa de alertas, consultando a la
	 * base de datos
	 * 
	 * <b> Resultado: </b> Se carga la lista de rango de tarifas si existen en la
	 * base de datos.
	 */
	private void consultarRangoTarifasAlertas() {
		try {
			this.setIlrta_listaRangoTarifasAlertasDto(iirta_rangoTarifasAlertasBusiness.consultarRangoTarifasAlertas()); 
		} catch (Exception ae_excepcion) {
			 GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que llama a los metodos de validar el registro de alerta masivo carga
	 * mensajes y modal con resultado y archivo de validacion <b> Resulta:<b>
	 * Muestra un modal con el resultado de la validacion.
	 */
	public void validarRegistroAlerta()
	{
		try {
			getItm_transaccionMasivaDto().setIs_matriculaFinal("");
			getItm_transaccionMasivaDto().setIs_matriculaInicial("");

			if((!this.ib_archivoMatricula && validarRangoTarifas(is_desdeMatricula,is_hastaMatricula)) || 
					(this.ib_archivoMatricula && getItm_transaccionMasivaDto().getIb_archivoCargadoByte() != null)) {
				TransaccionMasivoDTO ltm_transaccionMasivaDto = iira_registroAlertaBusiness.validarMatriculaMasiva(getItm_transaccionMasivaDto());
				validarErroresAlertasMasivas(ltm_transaccionMasivaDto);
				String ls_textocodificado =  new String(Base64.getEncoder().encode(getItm_transaccionMasivaDto().getIrm_respuestaMasivosDto().getIb_archivoRespuestaByte()));
				setIs_archivoDecodificado(ls_textocodificado);
				getIbc_beanCarrito().recargarTransacciones(false);
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('modalValidacion').show();");
			}
		}catch(ExcepcionesNegocio aen_excepcionNegocio) {
			if(aen_excepcionNegocio.consultarCatalogo() == EnumExcepcionesTransaccionMasiva.CANTIDAD_INFERIOR_DIEZ)
			{
				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('minimoMatricula').show();");
			}else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aen_excepcionNegocio);
			}
		}catch(Exception ae_excepcion){
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Carga los errores en el Dto de errores, leyendo el archivo qwue devuelve el
	 * servicio.
	 *
	 * @param atm_transaccionMasivaDto Transaccion actual
	 */
	private void validarErroresAlertasMasivas(TransaccionMasivoDTO atm_transaccionMasivaDto) {
		InputStream lis_archivoRespuesta = new ByteArrayInputStream(atm_transaccionMasivaDto.getIrm_respuestaMasivosDto().getIb_archivoRespuestaByte());
		InputStreamReader lisr_archivoEntrada = null;
		lisr_archivoEntrada = new InputStreamReader(lis_archivoRespuesta);
		BufferedReader lbr_archivoEntrada = new BufferedReader(lisr_archivoEntrada);	
		String ls_cadenaTemporal;
		Boolean lb_matriculasExitosas = false;
		try {
			imss_mapaResultadoValidacion = new HashMap<>();
			setIi_matriculasValidadas(0);
			while ((ls_cadenaTemporal = lbr_archivoEntrada.readLine()) != null) {
				String[] ls_arrayCadenaTemporal = ls_cadenaTemporal.split(";");
				if(ls_arrayCadenaTemporal.length >= 2)
				{					imss_mapaResultadoValidacion.put(ls_arrayCadenaTemporal[0], ls_arrayCadenaTemporal[1]);
					setIi_matriculasValidadas(getIi_matriculasValidadas() + Integer.parseInt(ls_arrayCadenaTemporal[1]));
				}else if(ls_arrayCadenaTemporal[0].equals(CS_MATRICULAS_EXITOSAS)){
					lb_matriculasExitosas = true;
					break;
				}
			}
		} catch (IOException aioe_archivoExcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,aioe_archivoExcepcion);
		}
		if(lb_matriculasExitosas) {
			cargarMatriculasExitosas(atm_transaccionMasivaDto, lbr_archivoEntrada);
		}
	}

	/**
	 * Metodo que se encarga de consultar las matriculas exitosas y cargarlas al
	 * mapa.
	 *
	 * @param atm_transaccionMasivaDto el parametro transaccion masiva dto
	 * @param abr_archivoEntrada       el parametro archivo entrada
	 */
	private void cargarMatriculasExitosas(TransaccionMasivoDTO atm_transaccionMasivaDto,
			BufferedReader abr_archivoEntrada) {
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
		int li_lineaFinalMatriculasArchivo = Integer.parseInt(imss_mapaResultadoValidacion.get(CS_MATRICULAS_EXITOSAS));
		
		for (int li_lineaLeida = 0; li_lineaLeida < li_lineaFinalMatriculasArchivo; li_lineaLeida++) {
			llsm_listaSalidaMatriculaDto.add(validarYCargarListaSalida(abr_archivoEntrada));
		}
		imilsm_mapaNumeroListasSalidaMatriculaDto = (atm_transaccionMasivaDto.getImilsm_mapaNumeroListasSalidaMatriculaDto() != null)?atm_transaccionMasivaDto.getImilsm_mapaNumeroListasSalidaMatriculaDto(): new HashMap<>();
		
		ParametroDTO lp_parametroCantidadArchivosDto = iip_parametroBusiness.consultarParametro(EnumParametros.MAXIMA_CANTIDAD_ARCHIVOS_ALERTAS.getIs_nombreParametro());
		Integer li_cantidadArchivos = Integer.parseInt(lp_parametroCantidadArchivosDto.getIs_valorUi()) - 1;
		
		for (int li_numeroLLenar = 0; li_numeroLLenar <= li_cantidadArchivos; li_numeroLLenar++) {
			if(!imilsm_mapaNumeroListasSalidaMatriculaDto.containsKey(li_numeroLLenar)) {
				imilsm_mapaNumeroListasSalidaMatriculaDto.put(li_numeroLLenar, llsm_listaSalidaMatriculaDto);
				break;
			}
		}
	}
	
	/**
	 * Metodo complementario de validarErroresAlertasMasivas.
	 *
	 * @param lbr_archivoEntrada el parametro lbr archivo entrada
	 * @return 
	 */
	private SalidaMatriculaDTO validarYCargarListaSalida(BufferedReader lbr_archivoEntrada) {
		SalidaMatriculaDTO lsm_salidaMatricula = new SalidaMatriculaDTO();
		try {
			String ls_cadenaTemporal = lbr_archivoEntrada.readLine();
			String[] ls_arrayCadenaTemporal = ls_cadenaTemporal.split(";");
			String[] ls_arrayCadenaTemporalMatricula = ls_arrayCadenaTemporal[0].split("-");
			if(getItm_transaccionMasivaDto().getIlm_listaMatriculaDto() != null) {
				for(MatriculaDTO lm_matriculaDto : getItm_transaccionMasivaDto().getIlm_listaMatriculaDto()) {
					
					if(lm_matriculaDto.getIs_codigoMatricula().equals(ls_arrayCadenaTemporalMatricula[1])) {
						lsm_salidaMatricula.setIm_matriculaDto(lm_matriculaDto);
						lsm_salidaMatricula.setIs_direccion(ls_arrayCadenaTemporal[1]);
					}
				}
			}else if(!getItm_transaccionMasivaDto().getIs_matriculaInicial().equals("") &&
					!getItm_transaccionMasivaDto().getIs_matriculaFinal().equals(""))
			{
				Integer li_matriculaInicial = Integer.parseInt(getItm_transaccionMasivaDto().getIs_matriculaInicial());
				Integer li_matriculaFinal = Integer.parseInt(getItm_transaccionMasivaDto().getIs_matriculaFinal());
				for(Integer li_matricula = li_matriculaInicial; li_matricula <= li_matriculaFinal; li_matricula++)
				{
					if(li_matricula.toString().equals(ls_arrayCadenaTemporalMatricula[1])) {
						MatriculaDTO lm_matriculaDto = new MatriculaDTO();
						lm_matriculaDto.setIs_codigoMatricula(ls_arrayCadenaTemporalMatricula[1]);
						lm_matriculaDto.setIcr_circuloRegistralMatricula(new CirculoRegistralDTO(ls_arrayCadenaTemporalMatricula[0]));
						lsm_salidaMatricula.setIm_matriculaDto(lm_matriculaDto);
						lsm_salidaMatricula.setIs_direccion(ls_arrayCadenaTemporal[1]);
					}
				}
			}
		}  catch (IOException aioe_archivoExcepcion) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,aioe_archivoExcepcion);
		}
		return lsm_salidaMatricula;
	}

	/**
	 * Metodo que adicciona el resultado de la validacion si el usuario lo aprueba.
	 *
	 * @return booleano si lo realiza correctamente
	 */
	public boolean adiccionarTransaccion() {
		try {
			TransaccionMasivoDTO ltm_transaccionMasivaDto = getItm_transaccionMasivaDto();
			ltm_transaccionMasivaDto.setImilsm_mapaNumeroListasSalidaMatriculaDto(getImilsm_mapaNumeroListasSalidaMatriculaDto());
			ltm_transaccionMasivaDto.setIb_registroSolicitar(true);
			setItm_transaccionMasivaDto(ltm_transaccionMasivaDto);
			iira_registroAlertaBusiness.guardarTransaccionVigente(ltm_transaccionMasivaDto);
			getIbc_beanCarrito().recargarTransacciones(false);
			return true;
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
			return false;
		}
	}

	/**
	 * Metodo que toma la transaccion y genera la solicitud al cor5e bachue
	 * 
	 * <b> Resultado: </b> Se muestra el mensjae que se genero la solicitud para
	 * redirigir al pago.
	 */
	public void guardarTransaccion()
	{
		try {
			TransaccionMasivoDTO ltm_transaccionMasivaDto = getItm_transaccionMasivaDto();
			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDtoRespuesta = new ArrayList<>();
			for(Map.Entry<Integer,List<SalidaMatriculaDTO>> lmilsm_mapNumeroListaSalidaMatriculaDto : ltm_transaccionMasivaDto.getImilsm_mapaNumeroListasSalidaMatriculaDto().entrySet())
			{
				llsm_listaSalidaMatriculaDtoRespuesta.addAll(lmilsm_mapNumeroListaSalidaMatriculaDto.getValue());
			}
			ltm_transaccionMasivaDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDtoRespuesta);
			setItm_transaccionMasivaDto(ltm_transaccionMasivaDto);
			guardarTransaccionGenerica(ltm_transaccionMasivaDto);
			PrimeFaces lpf_current = PrimeFaces.current();
			getIbc_beanCarrito().recargarTransacciones(false);
			lpf_current.executeScript("PF('solicitudGenerada').show();");		
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#validarSiguiente(org.primefaces.event.FlowEvent)
	 */
	@Override 
	public String validarSiguiente(FlowEvent afe_evento) {
		if(getIctv_carritoTransaccionVigenteDto() != null)
		{
			setItm_transaccionMasivaDto(getIctv_carritoTransaccionVigenteDto().getItm_transaccionMasivoDto());
		}
		String ls_proximoPaso = validadorPasos(afe_evento,getItm_transaccionMasivaDto());
		if(afe_evento.getOldStep().equals(CS_PASO_PAGO) && afe_evento.getNewStep().equals(CS_PASO_RESUMEN) && ls_proximoPaso.equals(afe_evento.getNewStep()))
		{
			getItm_transaccionMasivaDto().setIlsm_listaSalidaMatriculaDto(new ArrayList<>());
			getItm_transaccionMasivaDto().getImilsm_mapaNumeroListasSalidaMatriculaDto().forEach((li_entero,llsm_listaSalidaMatricula)->
			getItm_transaccionMasivaDto().getIlsm_listaSalidaMatriculaDto().addAll(llsm_listaSalidaMatricula));
			TipoSalidaConsultarTarifaAlertasTitularesWSDTO ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto = iirta_rangoTarifasAlertasBusiness.consultarRangoTarifasAlertas(getItm_transaccionMasivaDto().getIlsm_listaSalidaMatriculaDto().size(),getItm_transaccionMasivaDto().getIp_personaDto());
			setIs_cantidadMatriculas(ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto.getIs_alertasInscrtitas());
			setIs_valorTotal(ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto.getIs_tarifaNuevasAlertas());
			String ls_valorTotal = getIs_valorTotal().replace("$ ", "");

			ls_valorTotal = ls_valorTotal.replace(".", "");
			BigDecimal lbd_valorTotal = new BigDecimal(ls_valorTotal);
			getItm_transaccionMasivaDto().setIbd_valorTotal(lbd_valorTotal);
			getItm_transaccionMasivaDto().setIs_valorTotal(ls_valorTotal);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.ajax().update("wizard:formModalTarifa");
			lpf_current.executeScript("PF('modalTarifa').show();");
		}
		return ls_proximoPaso;
	}

	/**
	 * Metodo que descarta una alerta.
	 *
	 * @param ai_llaveMatriculas transaccion a descartar <b>Resultado: </b> Descarta
	 *                           la transaccion de carrito
	 */
	public void descartarAlerta(Integer ai_llaveMatriculas)
	{
		try {
			getItm_transaccionMasivaDto().getImilsm_mapaNumeroListasSalidaMatriculaDto().remove(ai_llaveMatriculas);
			if(getItm_transaccionMasivaDto().getImilsm_mapaNumeroListasSalidaMatriculaDto().isEmpty()) {
				iira_registroAlertaBusiness.cancelarTransaccionVigente(getItm_transaccionMasivaDto());
			}else {
				iira_registroAlertaBusiness.guardarTransaccionVigente(getItm_transaccionMasivaDto());
			}
			getIbc_beanCarrito().recargarTransacciones(false);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que valida que el rango de matricula ingresado sea mayor a 10
	 * matriculas.
	 *
	 * @param as_desdeMatricula matricula desde la cual se va a generar el registro
	 *                          de alerta
	 * @param as_hastaMatricula matricula hasta la cual se va a generar el registro
	 *                          de alerta
	 * @return boolean si es true se puede generar la validacion
	 */
	private boolean validarRangoTarifas(String as_desdeMatricula, String as_hastaMatricula) {
		if(is_desdeMatricula != null && !is_desdeMatricula.isEmpty() && is_hastaMatricula != null && !is_hastaMatricula.isEmpty() && getIcr_circuloRegistralSeleccionadoDto() != null) {
			Long lbi_desdeMatricula = Long.parseLong(as_desdeMatricula);
			Long lbi_hastaMatricula = Long.parseLong(as_hastaMatricula);	
			Long lbi_diferenciaMatriculas = lbi_hastaMatricula - lbi_desdeMatricula;
			if(lbi_diferenciaMatriculas < Integer.parseInt(getIp_parametroMinimaCantidadRegistroPorArchivoDto().getIs_valorUi()))
			{
				throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_INFERIOR_DIEZ, new String[] {getIp_parametroMinimaCantidadRegistroPorArchivoDto().getIs_valorUi()});
			}
			if(lbi_diferenciaMatriculas > Integer.parseInt(getIp_parametroMaximaCantidadRegistroPorArchivoDto().getIs_valorUi()))
			{
				throw new ExcepcionesNegocio(EnumExcepcionesTransaccionMasiva.CANTIDAD_SUPERIOR_MIL,new String[] {getIp_parametroMaximaCantidadRegistroPorArchivoDto().getIs_valorUi()});
			}
			getItm_transaccionMasivaDto().setIs_matriculaFinal(as_hastaMatricula);
			getItm_transaccionMasivaDto().setIs_matriculaInicial(as_desdeMatricula);
			getItm_transaccionMasivaDto().setIs_oripSecuencia(getIcr_circuloRegistralSeleccionadoDto() .getIs_id());
			getItm_transaccionMasivaDto().setIb_archivoCargadoByte(null);
			return true;
		}
		return false;
	}

	/**
	 * Obtiene el valor para la propiedad desde matricula.
	 *
	 * @return El valor de la propiedad desde matricula
	 */
	public String getIs_desdeMatricula() {
		return is_desdeMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad desde matricula.
	 *
	 * @param as_desdeMatricula el nuevo valor para la propiedad desde matricula
	 */
	public void setIs_desdeMatricula(String as_desdeMatricula) {
		this.is_desdeMatricula = as_desdeMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad hasta matricula.
	 *
	 * @return El valor de la propiedad hasta matricula
	 */
	public String getIs_hastaMatricula() {
		return is_hastaMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad hasta matricula.
	 *
	 * @param as_hastaMatricula el nuevo valor para la propiedad hasta matricula
	 */
	public void setIs_hastaMatricula(String as_hastaMatricula) {
		this.is_hastaMatricula = as_hastaMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad lista rango tarifas alertas dto.
	 *
	 * @return El valor de la propiedad lista rango tarifas alertas dto
	 */
	public List<RangoTarifasAlertaDTO> getIlrta_listaRangoTarifasAlertasDto() {
		return ilrta_listaRangoTarifasAlertasDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista rango tarifas alertas dto.
	 *
	 * @param alrta_listaRangoTarifasAlertasDto el nuevo valor para la propiedad
	 *                                          lista rango tarifas alertas dto
	 */
	public void setIlrta_listaRangoTarifasAlertasDto(List<RangoTarifasAlertaDTO> alrta_listaRangoTarifasAlertasDto) {
		this.ilrta_listaRangoTarifasAlertasDto = alrta_listaRangoTarifasAlertasDto;
	}

	/**
	 * Obtiene el valor para la propiedad conoce matricula.
	 *
	 * @return El valor de la propiedad conoce matricula
	 */
	public Boolean getIb_conoceMatricula() {
		return ib_conoceMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad conoce matricula.
	 *
	 * @param ab_conoceMatricula el nuevo valor para la propiedad conoce matricula
	 */
	public void setIb_conoceMatricula(Boolean ab_conoceMatricula) {
		this.ib_conoceMatricula = ab_conoceMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad archivo matricula.
	 *
	 * @return El valor de la propiedad archivo matricula
	 */
	public Boolean getIb_archivoMatricula() {
		return ib_archivoMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo matricula.
	 *
	 * @param ab_archivoMatricula el nuevo valor para la propiedad archivo matricula
	 */
	public void setIb_archivoMatricula(Boolean ab_archivoMatricula) {
		this.ib_archivoMatricula = ab_archivoMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad lineas archivo.
	 *
	 * @return El valor de la propiedad lineas archivo
	 */
	public String[] getIs_lineasArchivo() {
		return is_lineasArchivo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lineas archivo.
	 *
	 * @param as_lineasArchivo el nuevo valor para la propiedad lineas archivo
	 */
	public void setIs_lineasArchivo(String[] as_lineasArchivo) {
		this.is_lineasArchivo = as_lineasArchivo;
	}

	/**
	 * Obtiene el valor para la propiedad matriculas validadas.
	 *
	 * @return El valor de la propiedad matriculas validadas
	 */
	public Integer getIi_matriculasValidadas() {
		return ii_matriculasValidadas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matriculas validadas.
	 *
	 * @param ai_matriculasValidadas el nuevo valor para la propiedad matriculas
	 *                               validadas
	 */
	public void setIi_matriculasValidadas(Integer ai_matriculasValidadas) {
		this.ii_matriculasValidadas = ai_matriculasValidadas;
	}

	/**
	 * Obtiene el valor para la propiedad mapa numero listas salida matricula dto.
	 *
	 * @return El valor de la propiedad mapa numero listas salida matricula dto
	 */
	public Map<Integer, List<SalidaMatriculaDTO>> getImilsm_mapaNumeroListasSalidaMatriculaDto() {
		return imilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Cambia el valor de la propiedad imilsm mapa numero listas salida matricula
	 * dto.
	 *
	 * @param amilsm_mapaNumeroListasSalidaMatriculaDto el parametro mapa numero
	 *                                                  listas salida matricula dto
	 */
	public void setImilsm_mapaNumeroListasSalidaMatriculaDto(
			Map<Integer, List<SalidaMatriculaDTO>> amilsm_mapaNumeroListasSalidaMatriculaDto) {
		this.imilsm_mapaNumeroListasSalidaMatriculaDto = amilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad cantidad matriculas.
	 *
	 * @return El valor de la propiedad cantidad matriculas
	 */
	public String getIs_cantidadMatriculas() {
		return is_cantidadMatriculas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cantidad matriculas.
	 *
	 * @param as_cantidadMatriculas el nuevo valor para la propiedad cantidad
	 *                              matriculas
	 */
	public void setIs_cantidadMatriculas(String as_cantidadMatriculas) {
		this.is_cantidadMatriculas = as_cantidadMatriculas;
	}

	/**
	 * Obtiene el valor para la propiedad valor total.
	 *
	 * @return El valor de la propiedad valor total
	 */
	public String getIs_valorTotal() {
		return is_valorTotal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad valor total.
	 *
	 * @param as_valorTotal el nuevo valor para la propiedad valor total
	 */
	public void setIs_valorTotal(String as_valorTotal) {
		this.is_valorTotal = as_valorTotal;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt alertas.
	 *
	 * @return El valor de la propiedad bundle txt alertas
	 */
	public ResourceBundle getIrb_bundleTxtAlertas() {
		return irb_bundleTxtAlertas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt alertas.
	 *
	 * @param arb_bundleTxtAlertas el nuevo valor para la propiedad bundle txt
	 *                             alertas
	 */
	public void setIrb_bundleTxtAlertas(ResourceBundle arb_bundleTxtAlertas) {
		this.irb_bundleTxtAlertas = arb_bundleTxtAlertas;
	}

	/**
	 * Obtiene el valor para la propiedad mapa resultado validacion.
	 *
	 * @return El valor de la propiedad mapa resultado validacion
	 */
	public Map<String,String> getImss_mapaResultadoValidacion() {
		return imss_mapaResultadoValidacion;
	}

	/**
	 * Cambia el valor de la propiedad imss mapa resultado validacion.
	 *
	 * @param amss_mapaResultadoValidacion el parametro mapa resultado validacion
	 */
	public void setImss_mapaResultadoValidacion(Map<String,String> amss_mapaResultadoValidacion) {
		this.imss_mapaResultadoValidacion = amss_mapaResultadoValidacion;
	}

}
