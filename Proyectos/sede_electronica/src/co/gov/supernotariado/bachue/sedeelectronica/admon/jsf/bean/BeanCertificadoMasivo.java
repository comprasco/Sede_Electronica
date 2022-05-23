/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCertificadoMasivo.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCertificadoMasivo
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FlowEvent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICertificadoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.interfaces.BeanWizard;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RespuestaMasivosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionMasivoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCodigosRespuestas;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumParametrosURL;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.ArchivoUtils;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Certificado masivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCertificadoMasivo")
@ViewScoped
public class BeanCertificadoMasivo extends BeanTransaccionesMasivas implements Serializable, BeanWizard{

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICertificadoBusiness para definir la propiedad
	 * certificado business.
	 */
	@EJB
	private ICertificadoBusiness iic_certificadoBusiness;

	/**
	 * Atributo de instancia tipo ResourceBundle para definir la propiedad bundle
	 * txt certificado.
	 */
	@ManagedProperty(value = "#{txt_certificados}")
	private transient ResourceBundle irb_bundleTxtCertificado;

	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	private String is_correoEnvio;

	private final String is_nombreArchivoResumen =  CS_ARCHIVO_RESUMEN + UtilidadFecha.generarFecha() + CS_FORMATO_CSV;
	private final String is_nombreArchivoNoMigrados = CS_ARCHIVO_NUEVO + UtilidadFecha.generarFecha() + CS_FORMATO_CSV;

	private static final String CS_FORMATO_CSV = ".csv";
	private static final String CS_ARCHIVO_RESUMEN = "archivo_resumen_";
	private static final String CS_ARCHIVO_NUEVO = "archivo_generado_nueva_transaccion_";
	//NO GENERICO

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIets_enumTipoServicio(EnumTipoServicio.CERTIFICADO);
		this.cargarUrls();
		this.cargarDatos();
		this.cargarListas();
		//GENERICO
		setItm_transaccionMasivaDto(new TransaccionMasivoDTO(this.cargarTransaccion(EnumModoTipoServicio.MASIVO,EnumTipoProceso.CERTIFICADOS)));
		is_correoEnvio = getItm_transaccionMasivaDto().getIp_personaDto().getIu_usuarioDto().getIs_correoElectronico();
		getItm_transaccionMasivaDto().setIs_correoEnvio(is_correoEnvio);
		inicializarMasivo();
	}

	/**
	 * Metodo que redirecciona al resumen de la transaccion
	 * @return String Url
	 */
	public String getUrlResumen() {
		String ls_resumen;
		ls_resumen = getIs_redireccionResumenPago() + getIit_integracionTemporalDto().getIs_nir() + EnumParametrosURL.REFERENCIA_PAGO.getIs_nombreParametro() + getIit_integracionTemporalDto().getIs_referenciaPago();		
		return ls_resumen;
	}

	//GENERICO
	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#validarSiguiente(org.primefaces.event.FlowEvent)
	 */
	@Override
	public String validarSiguiente(FlowEvent afe_evento) {
		if(getIctv_carritoTransaccionVigenteDto() != null)
		{
			setItm_transaccionMasivaDto(getIctv_carritoTransaccionVigenteDto().getItm_transaccionMasivoDto());
		}
		if(Objects.nonNull(getItg_transaccionGenericaDto()) && Objects.nonNull(getItg_transaccionGenericaDto().getIdc_detalleCatalogoDto())){
			getItm_transaccionMasivaDto().setIdc_detalleCatalogoDto(getItg_transaccionGenericaDto().getIdc_detalleCatalogoDto());
		}
		return validadorPasos(afe_evento,getItm_transaccionMasivaDto());
	}

	/**
	 * Metodo que se encarga de guardar los datos de la transacion en la tabla de
	 * IntegrationTemporal y consulta los datos para el pago de Core BACHUE
	 * 
	 * <b>Resultado: </b> Agrega a la tabla integration Temporal y trae los datos
	 * para el pago del core BACHUE.
	 */
	public void guardarTransaccionCertificado() {
		try {
			guardarTransaccionGenerica(getItm_transaccionMasivaDto());
			PrimeFaces lpf_current = PrimeFaces.current();
			getIbc_beanCarrito().recargarTransacciones(false);
			lpf_current.executeScript("PF('solicitudGenerada').show();");			
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar las matriculas al consumir el servicio del
	 * core bachue
	 * 
	 * <b> Resultado: </b> Se llenan los datos de resultado en salida matricula y se
	 * carga los errores.
	 */
	public void validarTransaccion()
	{
		try {
			setItm_transaccionMasivaDto(validarErrores(getItm_transaccionMasivaDto()));
			cargarValorTotal();
			PrimeFaces lpf_current = PrimeFaces.current();
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_MASIVO_VALIDADO);	
			lpf_current.executeScript("PF('modalValidacion').show();");	
		}catch(Exception ae_excepcion)
		{
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que carga el subtitulo con el minimo y maximo de datos en el archivo
	 * que permite.
	 *
	 * @return Resultado para subtitulo retornado como String
	 */
	public String subtitulo()
	{
		String ls_subtitulo;
		ls_subtitulo = String.format(irb_bundleTxtCertificado.getString("wizardMasivos.datos.subtitulo"),getIp_parametroMinimaCantidadRegistroPorArchivoDto().getIs_valorUi(), getIp_parametroMaximaCantidadRegistroPorArchivoDto().getIs_valorUi());
		return ls_subtitulo;
	}

	/**
	 * Metodo que carga el modal con los datos del minimo que permite.
	 *
	 * @return Resultado para minimo matriculas retornado como String
	 */
	public String minimoMatriculas()
	{
		String ls_subtitulo;
		ls_subtitulo = String.format(irb_bundleTxtCertificado.getString("wizard.datos.modal.individual.1"),getIp_parametroMinimaCantidadRegistroPorArchivoDto().getIs_valorUi());
		return ls_subtitulo;
	}


	/**
	 * Metodo que se encarga de validar de las matriculas cuales el servicio
	 * devolvio error.
	 *
	 * @param alsm_listaSalidaMatricula lista de matriculas a validar
	 * @param atm_transaccionMasivaDto  transaccion vigente y ala cual se le cargara
	 *                                  la listas de correctas e incorrectas
	 * @return Resultado para validar errores retornado como TransaccionMasivoDTO
	 * 
	 */
	private TransaccionMasivoDTO validarErrores(TransaccionMasivoDTO atm_transaccionMasivaDto)
	{
		TransaccionMasivoDTO ltm_transaccionMasivaDto = atm_transaccionMasivaDto;
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaErroresDto = new ArrayList<>();
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
		List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaNoMigradaDto = new ArrayList<>();

		List<MatriculaDTO> llm_matriculaEstado = iic_certificadoBusiness.clasificarMatriculasMigradas(getItm_transaccionMasivaDto().getIlm_listaMatriculaDto());
		List<MatriculaDTO> llm_matriculaNoMigradas = new ArrayList<>();

		llm_matriculaEstado.forEach(lm_matricula-> {
			if (lm_matricula.getIb_estadoMigracion()) {				
				SalidaMatriculaDTO lsm_salidaMatriculaDto = this.iic_certificadoBusiness.consultarMatricula(lm_matricula, getItm_transaccionMasivaDto());
				clasificarEstadoMatricula(lsm_salidaMatriculaDto, llsm_listaSalidaMatriculaDto, llsm_listaSalidaMatriculaErroresDto);
			}else {
				//llm_matriculaNoMigradas.add(lm_matricula);
				//TODO Quitar esta linea cuando funcione realtek y descomentariar la de arriba
				SalidaMatriculaDTO lsm_salidaMatriculaDto = new SalidaMatriculaDTO();
				lsm_salidaMatriculaDto.setIb_tieneError(true);
				lsm_salidaMatriculaDto.setIs_mensajeError("Matricula no encontrada");
				lsm_salidaMatriculaDto.setIm_matriculaDto(lm_matricula);
				llsm_listaSalidaMatriculaErroresDto.add(lsm_salidaMatriculaDto);
			}
		});

		//Si no hay lista matriculas migradas y solo matriculas no migradas entonces proceder a consultar por bancarizacion
		if (llsm_listaSalidaMatriculaDto.isEmpty() && !llm_matriculaNoMigradas.isEmpty()) {

			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaNoMigrada = iic_certificadoBusiness.consultarInformacionMatriculaMasivas(llm_matriculaNoMigradas);			

			llsm_listaSalidaMatriculaNoMigrada.forEach(lsm_salidaMatriculaDto -> {
				lsm_salidaMatriculaDto.setIb_migradaMatricula(false);
				clasificarEstadoMatricula(lsm_salidaMatriculaDto, llsm_listaSalidaMatriculaDto, llsm_listaSalidaMatriculaErroresDto);
			});

		}else if(!llm_matriculaNoMigradas.isEmpty()) {
			llsm_listaSalidaMatriculaNoMigradaDto = iic_certificadoBusiness.consultarInformacionMatriculaMasivas(llm_matriculaNoMigradas);
		}

		ltm_transaccionMasivaDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDto);
		RespuestaMasivosDTO lrm_respuestaMasivosDto = new RespuestaMasivosDTO();
		lrm_respuestaMasivosDto.setIi_cantidadMatriculasNoExistenSistema(llsm_listaSalidaMatriculaErroresDto.size());
		lrm_respuestaMasivosDto.setIi_cantidadMatriculasCorrectas(llsm_listaSalidaMatriculaDto.size());
		ltm_transaccionMasivaDto.setIrm_respuestaMasivosDto(lrm_respuestaMasivosDto);
		crearArchivo(ltm_transaccionMasivaDto,llsm_listaSalidaMatriculaErroresDto);
		if(!llsm_listaSalidaMatriculaNoMigradaDto.isEmpty())
			crearArchivoNuevo(llsm_listaSalidaMatriculaNoMigradaDto);

		return ltm_transaccionMasivaDto;
	}

	/**
	 * Metodo que permite clasificar si las matriculas son migradas o no
	 * @param asm_salidaMatricula lista de las matriculas
	 * @param alsm_listaCorrecto lista de matricuas correctas
	 * @param alsm_listaError Lista de matriculas con  errores
	 */
	private void clasificarEstadoMatricula(SalidaMatriculaDTO asm_salidaMatricula, List<SalidaMatriculaDTO> alsm_listaCorrecto,List<SalidaMatriculaDTO> alsm_listaError) {
		if(asm_salidaMatricula.getIb_tieneError()) {
			alsm_listaError.add(asm_salidaMatricula);
		}
		else {
			alsm_listaCorrecto.add(asm_salidaMatricula);
		}
	}

	/**
	 * Metodo que se encarga de crear un archivo para la descarga del usuario .
	 *
	 * @param atm_transaccionMasivaDto            transaccion con los datos para la
	 *                                            descarga del archivo
	 * @param alsm_listaSalidaMatriculaErroresDto el parametro lista salida
	 *                                            matricula errores dto
	 * @return true, si se cumple o la accion se realiza exitosamente, false en caso
	 *         contrario.
	 */
	private boolean crearArchivo(TransaccionMasivoDTO atm_transaccionMasivaDto, List<SalidaMatriculaDTO> alsm_listaSalidaMatriculaErroresDto)
	{
		File lf_archivo = new File(is_nombreArchivoResumen);
		try (FileWriter lfw_archivoAEscribir = new FileWriter(lf_archivo)) {
			for(SalidaMatriculaDTO lsm_salidaMatriculaDto: atm_transaccionMasivaDto.getIlsm_listaSalidaMatriculaDto()) {
				lfw_archivoAEscribir.write(lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id() + "-" + lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula() +";"+EnumCodigosRespuestas.CODIGO_200.getIs_mensaje() + "\n");
			}
			for(SalidaMatriculaDTO lsm_salidaMatriculaDto: alsm_listaSalidaMatriculaErroresDto)
			{
				lfw_archivoAEscribir.write(lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id() + "-" + lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula() +";"+ lsm_salidaMatriculaDto.getIs_mensajeError() + "\n");
			}
			lfw_archivoAEscribir.flush();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,aioe_excepcionArchivo);
		}

		try {
			byte[] lb_arregloBytes = ArchivoUtils.inputStreamAArregloBytes(new FileInputStream(lf_archivo));	

			atm_transaccionMasivaDto.getIrm_respuestaMasivosDto().setIb_archivoRespuestaByte(Base64.getEncoder().encode(lb_arregloBytes));
			String ls_textocodificado =  new String(atm_transaccionMasivaDto.getIrm_respuestaMasivosDto().getIb_archivoRespuestaByte());
			setIs_archivoDecodificado(ls_textocodificado);
		} catch (FileNotFoundException afnfe_noEncontroArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,afnfe_noEncontroArchivo);
		}
		return true;
	}

	/**
	 * Metodo que se encarga de crear un archivo para la descarga del usuario 
	 * 
	 * @param atm_transaccionMasivaDto transaccion con los datos para la descarga del archivo
	 * @param alsm_listaSalidaMatriculaDto 
	 * @return boolean
	 */
	private boolean crearArchivoNuevo(List<SalidaMatriculaDTO> alsm_listaSalidaMatriculaDto)
	{
		File lf_archivo = new File(is_nombreArchivoNoMigrados);
		try (FileWriter lfw_archivoAEscribir = new FileWriter(lf_archivo)) {
			for(SalidaMatriculaDTO lsm_salidaMatriculaDto: alsm_listaSalidaMatriculaDto)
			{
				lfw_archivoAEscribir.write(lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id() + "-" + lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula() + "\n");
			}
			lfw_archivoAEscribir.flush();
		} catch (IOException aioe_excepcionArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,aioe_excepcionArchivo);
		}

		try {
			byte[] lb_arregloBytes = ArchivoUtils.inputStreamAArregloBytes(new FileInputStream(lf_archivo));	

			String ls_textocodificado =  new String(Base64.getEncoder().encode(lb_arregloBytes));
			setIs_archivoDecodificadoNuevo(ls_textocodificado);
		} catch (FileNotFoundException afnfe_noEncontroArchivo) {
			throw new ExcepcionesNegocio(EnumExcepcionesGenerales.ERROR_ARCHIVO,afnfe_noEncontroArchivo);
		}
		return true;
	}

	/**
	 * 
	 * Metodo que descarta la transaccion actual.
	 *
	 * @param atm_transaccionMasivaDto transaccion actual <b> Resultado:</b> Se
	 *                                 borra los datos en la transaccion y se
	 *                                 cancela de carrito
	 *                                 
	 */
	public void descartarCertificado(TransaccionMasivoDTO atm_transaccionMasivaDto)
	{
		try {
			atm_transaccionMasivaDto.setIlsm_listaSalidaMatriculaDto(new ArrayList<>());	
			atm_transaccionMasivaDto.setIb_archivoCargadoByte(null);		
			iic_certificadoBusiness.cancelarTransaccionVigente(atm_transaccionMasivaDto);
			getIbc_beanCarrito().recargarTransacciones(false);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que adicciona el resultado de la validacion si el usuario lo aprueba.
	 *
	 * @return booleano si lo realiza correctamente
	 */
	public void adiccionarTransaccion() {
		try {
			if(!getItm_transaccionMasivaDto().getIlsm_listaSalidaMatriculaDto().isEmpty()) {
				this.iic_certificadoBusiness.guardarTransaccionVigente(getItm_transaccionMasivaDto());			
				getIbc_beanCarrito().recargarTransacciones(false);
				GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_MASIVO_VALIDADO);	
			}else {
				throw new ExcepcionesNegocio(EnumExcepcionesCertificados.ERROR_MATRICULA_CARGADA);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que carga el valor total tomando la lista de certificados que tenga
	 * cargada la transaccion
	 * 
	 * <b> Resultado: </b> Se llena en la transaccion el valor total.
	 */
	private void cargarValorTotal() {
		int ii_valorTotal = 0;
		for(SalidaMatriculaDTO lsm_salidaMatriculaDto: getItm_transaccionMasivaDto().getIlsm_listaSalidaMatriculaDto())
		{
			ii_valorTotal = ii_valorTotal + lsm_salidaMatriculaDto.getIbd_valorUnitario().intValue();
		}
		BigDecimal lbd_valorTotal = new BigDecimal(ii_valorTotal);
		this.getItm_transaccionMasivaDto().setIbd_valorTotal(lbd_valorTotal);
	}



	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad bundle txt certificado.
	 *
	 * @return El valor de la propiedad bundle txt certificado
	 */
	public ResourceBundle getIrb_bundleTxtCertificado() {
		return irb_bundleTxtCertificado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bundle txt certificado.
	 *
	 * @param arb_bundleTxtCertificado el nuevo valor para la propiedad bundle txt
	 *                                 certificado
	 */
	public void setIrb_bundleTxtCertificado(ResourceBundle arb_bundleTxtCertificado) {
		this.irb_bundleTxtCertificado = arb_bundleTxtCertificado;
	}

	public String getIs_nombreArchivoResumen() {
		return is_nombreArchivoResumen;
	}


	public String getIs_nombreArchivoNoMigrados() {
		return is_nombreArchivoNoMigrados;
	}


}
