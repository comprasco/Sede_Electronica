/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanRegistroAlertaIndividual.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanRegistroAlertaIndividual
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */

package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;
import org.primefaces.event.FlowEvent;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesNegocio;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRangoTarifasAlertasBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRegistroAlertaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.RangoTarifasAlertaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarTarifaAlertasTitularesWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumModoTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesAlertas;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Registro alerta individual.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanRegistroAlertaIndividual")
@ViewScoped
public class BeanRegistroAlertaIndividual extends BeanTransacciones implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo IRegistroAlertaBusiness para definir la propiedad
	 * registro alerta business.
	 */
	@EJB
	private IRegistroAlertaBusiness iira_registroAlertaBusiness;
	
	/**
	 * Atributo de instancia tipo ICarritoBusiness para definir la propiedad carrito
	 * business.
	 */
	@EJB
	private ICarritoBusiness iic_carritoBusiness;
	
	/**
	 * Atributo de instancia tipo IRangoTarifasAlertasBusiness para definir la
	 * propiedad rango tarifas alertas business.
	 */
	@EJB
	private IRangoTarifasAlertasBusiness iirta_rangoTarifasAlertasBusiness;

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
	 * Atributo de instancia tipo IntegracionTemporalDTO para definir la propiedad
	 * integracion temporal.
	 */
	private IntegracionTemporalDTO iit_integracionTemporalDto;
	
	/**
	 * Atributo de instancia tipo TransaccionIndividualDTO para definir la propiedad
	 * transaccion individual.
	 */
	private TransaccionIndividualDTO iti_transaccionIndividualDto;
	
	/**
	 * Atributo de instancia tipo lista de RangoTarifasAlertaDTO para definir la
	 * propiedad lista rango tarifas alertas.
	 */
	private List<RangoTarifasAlertaDTO> ilrta_listaRangoTarifasAlertasDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;
	
	/**
	 * Atributo de instancia tipo SalidaMatriculaDTO para definir la propiedad
	 * salida matricula.
	 */
	private SalidaMatriculaDTO ism_salidaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		setIets_enumTipoServicio(EnumTipoServicio.ALERTA);
		this.cargarUrls();
		this.cargarDatos();
		this.cargarListas();
		consultarRangoTarifasAlertas();
		this.iti_transaccionIndividualDto = new TransaccionIndividualDTO(
				this.cargarTransaccion(EnumModoTipoServicio.INDIVIDUAL, EnumTipoProceso.REGISTRO_ALERTAS));
		this.iti_transaccionIndividualDto.setIdc_detalleCatalogoDto(getIldc_listaDetalleCatalogoInmediatosDto().get(0));
		this.is_correoEnvio = iti_transaccionIndividualDto.getIp_personaDto().getIu_usuarioDto()
				.getIs_correoElectronico();
		this.ism_salidaMatriculaDto = new SalidaMatriculaDTO();
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#validarSiguiente(org.primefaces.event.FlowEvent)
	 */
	@Override
	public String validarSiguiente(FlowEvent afe_evento) {
		if (getIctv_carritoTransaccionVigenteDto() != null) {
			this.iti_transaccionIndividualDto = getIctv_carritoTransaccionVigenteDto()
					.getIti_transaccionIndividualDto();
		}
		String ls_proximoPaso = validadorPasos(afe_evento, iti_transaccionIndividualDto);
		if (afe_evento.getOldStep().equals(CS_PASO_PAGO) && afe_evento.getNewStep().equals(CS_PASO_RESUMEN)
				&& ls_proximoPaso.equals(afe_evento.getNewStep())) {
			TipoSalidaConsultarTarifaAlertasTitularesWSDTO ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto = iirta_rangoTarifasAlertasBusiness
					.consultarRangoTarifasAlertas(iti_transaccionIndividualDto.getIlsm_listaSalidaMatriculaDto().size(),
							iti_transaccionIndividualDto.getIp_personaDto());
			setIs_cantidadMatriculas(ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto.getIs_alertasInscrtitas());
			setIs_valorTotal(ltsctat_tipoSalidaConsultarTarifaAlertasTitularesWsDto.getIs_tarifaNuevasAlertas());

			String ls_valorTotal = getIs_valorTotal().replace("$ ", "");

			ls_valorTotal = ls_valorTotal.replace(".", "");
			BigDecimal lbd_valorTotal = new BigDecimal(ls_valorTotal);
			iti_transaccionIndividualDto.setIbd_valorTotal(lbd_valorTotal);
			iti_transaccionIndividualDto.setIs_valorTotal(ls_valorTotal);
			PrimeFaces lpf_current = PrimeFaces.current();
			lpf_current.ajax().update("wizard:formModalTarifa");
			lpf_current.executeScript("PF('modalTarifa').show();");
		}
		return ls_proximoPaso;
	}

	/**
	 * Metodo que se encarga de consultar los datos de la matricula y con ellos
	 * mostrar un modal
	 * 
	 * <b>Resultado: </b> Carga en la isc_salidaCertificadoDto con los datos de la
	 * matricula consultados.
	 */

	public void consultarDatosMatricula() {
		try {
			validarMatricula();
		} catch (EJBTransactionRolledbackException aejbtre_transaccionRollbackExcepcion) {
			if (aejbtre_transaccionRollbackExcepcion.getCause() instanceof ExcepcionesNegocio) {
				ExcepcionesNegocio len_excepcionNegocio = (ExcepcionesNegocio) aejbtre_transaccionRollbackExcepcion
						.getCause();
				if (len_excepcionNegocio.consultarCatalogo() == EnumExcepcionesAlertas.SOLICITANTE_NO_TITULAR) {
					PrimeFaces lpf_current = PrimeFaces.current();
					lpf_current.executeScript("PF('noTitular').show();");
				} else {
					GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aejbtre_transaccionRollbackExcepcion);
				}
			} else {
				GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(aejbtre_transaccionRollbackExcepcion);
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de validar matricula.
	 */
	private void validarMatricula() {
		if (this.getIcr_circuloRegistralSeleccionadoDto() != null && this.is_numeroMatricula != null
				&& !this.is_numeroMatricula.isEmpty()) {
			if (this.is_numeroMatricula.length() > 11 || this.is_numeroMatricula.length() < 0) {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.FORMATO_MATRICULA_VALIDACION);
			} else {
				MatriculaDTO lm_matriculaDto = new MatriculaDTO();
				lm_matriculaDto.setIs_codigoMatricula(this.is_numeroMatricula);
				lm_matriculaDto.setIcr_circuloRegistralMatricula(getIcr_circuloRegistralSeleccionadoDto());
				List<MatriculaDTO> llm_listaMatriculaDto = new ArrayList<>();
				llm_listaMatriculaDto.add(lm_matriculaDto);
				this.ism_salidaMatriculaDto = iira_registroAlertaBusiness
						.consultarMatricula(llm_listaMatriculaDto, this.iti_transaccionIndividualDto).get(0);

				PrimeFaces lpf_current = PrimeFaces.current();
				lpf_current.executeScript("PF('dialogConfirmacionDatosMatricula').show();");
			}
		} else {
			GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.DATOS_VACIOS);
		}
	}

	/**
	 * Metodo que se encarga de llenar la lista de certificados con la
	 * salidaCertificado que se desea
	 * 
	 * <b>Resultado: </b> Agrega a la lista de certificado la sdalida que se tiene.
	 */
	public void cargarSolicitud() {
		try {
			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
			boolean lb_existe = false;
			if (this.iti_transaccionIndividualDto.getIlsm_listaSalidaMatriculaDto() != null) {
				for (SalidaMatriculaDTO lsm_salidaMatriculaDto : this.iti_transaccionIndividualDto
						.getIlsm_listaSalidaMatriculaDto()) {
					if (lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula()
							.equals(this.ism_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula())
							&& lsm_salidaMatriculaDto.getIm_matriculaDto().getIcr_circuloRegistralMatricula().getIs_id()
									.equals(this.ism_salidaMatriculaDto.getIm_matriculaDto()
											.getIcr_circuloRegistralMatricula().getIs_id())) {
						lb_existe = true;
					} else {
						llsm_listaSalidaMatriculaDto.add(lsm_salidaMatriculaDto);
					}
				}
			}
			if (lb_existe) {
				GeneradorGrowlGenerico.generarMensajeInformacion(EnumMensajesCertificados.CERTIFICADO_YA_CARGADO);
			} else {
				llsm_listaSalidaMatriculaDto.add(this.ism_salidaMatriculaDto);
				if (llsm_listaSalidaMatriculaDto.size() > 10) {
					PrimeFaces lpf_current = PrimeFaces.current();
					lpf_current.executeScript("PF('maximoMatricula').show();");

				} else {
					this.iti_transaccionIndividualDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDto);
					this.iic_carritoBusiness.guardarTransaccionVigente(this.iti_transaccionIndividualDto,
							EnumTipoProceso.ALERTA_TIERRAS);
					getIbc_beanCarrito().recargarTransacciones(false);
					GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_AGREGADO);
				}
			}
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de borrar una matricula consultada y la elimina de la
	 * lista de certificados.
	 *
	 * @param as_registroAlerta codigoMatricula que se quiere quitar de la lista de
	 *                          certificados <b>Resultado: </b> Actualiza la lista
	 *                          de los certificados que va a realizar
	 */
	public void descartarAlerta(String as_registroAlerta) {
		try {
			List<SalidaMatriculaDTO> llsm_listaSalidaMatriculaDto = new ArrayList<>();
			for (SalidaMatriculaDTO lsm_salidaMatriculaDto : this.iti_transaccionIndividualDto
					.getIlsm_listaSalidaMatriculaDto()) {
				if (!lsm_salidaMatriculaDto.getIm_matriculaDto().getIs_codigoMatricula().equals(as_registroAlerta)) {
					llsm_listaSalidaMatriculaDto.add(lsm_salidaMatriculaDto);
				}
			}
			this.iti_transaccionIndividualDto.setIlsm_listaSalidaMatriculaDto(llsm_listaSalidaMatriculaDto);
			if (llsm_listaSalidaMatriculaDto.isEmpty()) {
				iira_registroAlertaBusiness.cancelarTransaccionVigente(iti_transaccionIndividualDto);

			} else {
				iira_registroAlertaBusiness.guardarTransaccionVigente(iti_transaccionIndividualDto);
			}
			getIbc_beanCarrito().recargarTransacciones(false);
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que se encarga de limpiar las variables de numero de Matricula y
	 * oficina de registro
	 * 
	 * <b>Resultado: </b> limpiar las variables de numero de Matricula y oficina de
	 * registro.
	 */
	public void limpiarComponenteBuscar() {
		this.setIcr_circuloRegistralSeleccionadoDto(null);
		this.setIs_numeroMatricula(null);
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
	 * Metodo que se encarga de guardar los datos de la transacion en la tabla de
	 * IntegrationTemporal y consulta los datos para el pago de Core BACHUE
	 * 
	 * <b>Resultado: </b> Agrega a la tabla integration Temporal y trae los datos
	 * para el pago del core BACHE.
	 */
	public void guardarTransaccion() {
		try {
			guardarTransaccionGenerica(this.iti_transaccionIndividualDto);
			PrimeFaces lpf_current = PrimeFaces.current();
			getIbc_beanCarrito().recargarTransacciones(false);
			lpf_current.executeScript("PF('solicitudGenerada').show();");
		} catch (Exception ae_excepcion) {
			GeneradorGrowlGenerico.manejadorExcepcionesPresentacion(ae_excepcion);
		}
	}

	/**
	 * Metodo que asigna true al checkbox de politicas.
	 */
	public void validarPoliticas() {
		this.setIb_seleccionoPoliticas(true);
	}

	/**
	 * Obtiene el valor para la propiedad correo envio.
	 *
	 * @return El valor de la propiedad correo envio
	 */
	// Getters & Setters
	public String getIs_correoEnvio() {
		return is_correoEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula.
	 *
	 * @return El valor de la propiedad numero matricula
	 */
	public String getIs_numeroMatricula() {
		return is_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad salida matricula dto.
	 *
	 * @return El valor de la propiedad salida matricula dto
	 */
	public SalidaMatriculaDTO getIsm_salidaMatriculaDto() {
		return ism_salidaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad transaccion individual dto.
	 *
	 * @return El valor de la propiedad transaccion individual dto
	 */
	public TransaccionIndividualDTO getIti_transaccionIndividualDto() {
		return iti_transaccionIndividualDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#getIit_integracionTemporalDto()
	 */
	@Override
	public IntegracionTemporalDTO getIit_integracionTemporalDto() {
		return iit_integracionTemporalDto;
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
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean.BeanTransacciones#setIit_integracionTemporalDto(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.IntegracionTemporalDTO)
	 */
	@Override
	public void setIit_integracionTemporalDto(IntegracionTemporalDTO ait_integracionTemporalDto) {
		this.iit_integracionTemporalDto = ait_integracionTemporalDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida matricula dto.
	 *
	 * @param asm_salidaMatriculaDto el nuevo valor para la propiedad salida
	 *                               matricula dto
	 */
	public void setIsm_salidaMatriculaDto(SalidaMatriculaDTO asm_salidaMatriculaDto) {
		this.ism_salidaMatriculaDto = asm_salidaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad transaccion individual dto.
	 *
	 * @param ati_transaccionIndividualDto el nuevo valor para la propiedad
	 *                                     transaccion individual dto
	 */
	public void setIti_transaccionIndividualDto(TransaccionIndividualDTO ati_transaccionIndividualDto) {
		this.iti_transaccionIndividualDto = ati_transaccionIndividualDto;
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
	 * Obtiene el valor para la propiedad nupre.
	 *
	 * @return El valor de la propiedad nupre
	 */
	public String getIs_nupre() {
		return is_nupre;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nupre.
	 *
	 * @param as_nupre el nuevo valor para la propiedad nupre
	 */
	public void setIs_nupre(String as_nupre) {
		this.is_nupre = as_nupre;
	}

}
