/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanCENumMatricula.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanCENumMatricula
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.mysql.jdbc.StringUtils;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICirculoRegistralBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CENumMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CirculoRegistralDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.DetalleCatalogoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.MatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.SalidaMatriculaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumCertificadosEspeciales;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.EnumMensajesCertificados;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorGrowlGenerico;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para CE(Certificado Especial) numero
 * matricula.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanCENumMatricula")
@ViewScoped
public class BeanCENumMatricula implements Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo ICirculoRegistralBusiness para definir la
	 * propiedad circulo registral business.
	 */
	@EJB
	private ICirculoRegistralBusiness iicr_circuloRegistralBusiness;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero matricula.
	 */
	private String is_numeroMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * cedula catastral.
	 */
	private String is_cedulaCatastral;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * matricula errores.
	 */
	private Boolean ib_matriculaErrores;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * matricula.
	 */
	private Boolean ib_matricula;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad ced
	 * catastral.
	 */
	private Boolean ib_cedCatastral;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha solicitud.
	 */
	private Date id_fechaSolicitud;

	/**
	 * Atributo de instancia tipo MatriculaDTO para definir la propiedad matricula.
	 */
	private MatriculaDTO im_matriculaDto;

	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral envio seleccionado.
	 */
	private CirculoRegistralDTO icr_circuloRegistralEnvioSeleccionadoDto;

	/**
	 * Atributo de instancia tipo lista de CirculoRegistralDTO para definir la
	 * propiedad lista circulo registral.
	 */
	private List<CirculoRegistralDTO> ilcr_listaCirculoRegistralDto;

	/**
	 * Atributo de instancia tipo lista de String para definir la propiedad errores
	 * num matricula.
	 */
	private List<String> ils_erroresNumMatricula;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nupre.
	 */
	private String is_nupre;

	/**
	 * Atributo de instancia tipo CENumMatriculaDTO para definir la propiedad numero
	 * matricula.
	 */
	private CENumMatriculaDTO icenm_numeroMatriculaDTO;

	/**
	 * Atributo de instancia tipo DetalleCatalogoDTO para definir la propiedad
	 * detalle catalogo.
	 */
	private DetalleCatalogoDTO idc_detalleCatalogoDto;

	/**
	 * Atributo de instancia tipo BeanCertificadoEspecial para definir la propiedad
	 * bean certificado especial.
	 */
	@ManagedProperty(value = "#{beanCertificadoEspecial}")
	private BeanCertificadoEspecial ibce_beanCertificadoEspecial;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.ib_cedCatastral = true;
		this.ib_matricula = true;
		this.ib_matriculaErrores = false;
		ils_erroresNumMatricula = new ArrayList<>();
		this.icenm_numeroMatriculaDTO = new CENumMatriculaDTO();
		this.im_matriculaDto = new MatriculaDTO();
		this.ilcr_listaCirculoRegistralDto = iicr_circuloRegistralBusiness.obtenerListaCirculoRegistral();
		this.getIbce_beanCertificadoEspecial().getItce_transaccionCertificadoEspecialDto()
				.setIcr_circuloRegistralEnvioDTO(new CirculoRegistralDTO());
		this.idc_detalleCatalogoDto = ibce_beanCertificadoEspecial.getItce_transaccionCertificadoEspecialDto()
				.getIdc_detalleCatalogoDto();
		getIbce_beanCertificadoEspecial();
		this.campoObligatorio();
	}

	/**
	 * Metodo que se encarga de ocultar los campos nulos del formulario de numero de
	 * matricula en la seccion de resumen <b>Resultado: </b> Oculta campos nulos en
	 * seccion de resumen.
	 */
	public void resumen() {
		if (!Objects.isNull(this.is_numeroMatricula)) {
			this.ib_cedCatastral = false;
			this.ib_matricula = true;
		} else {
			this.ib_cedCatastral = true;
			this.ib_matricula = false;
		}
	}

	/**
	 * Metodo que se encarga de validar los campos en el formulario de numero de
	 * matricula
	 * 
	 * <b>Resultado: </b> Si todas las condiciones son true, listara mensajes de
	 * validacion, si las condiciones son false mostrar growl exitoso.
	 */
	public void validarFormulario() {
		this.getIbce_beanCertificadoEspecial().getIls_bloqueDatos().add(this.getIbce_beanCertificadoEspecial()
				.getIrb_bundleTxtCertificadosCE().getString("wizardCertificado.datos.numeroMatricula"));
		this.ils_erroresNumMatricula.clear();
		this.getIbce_beanCertificadoEspecial().setIb_validar(true);
		this.validarMatriculaCatastral();
		if (this.ils_erroresNumMatricula.isEmpty()) {
			this.id_fechaSolicitud = new Date();
			if (!StringUtils.isNullOrEmpty(this.is_numeroMatricula)) {
				this.icenm_numeroMatriculaDTO.setIsm_salidaMatriculaDTO(new SalidaMatriculaDTO());
				this.icenm_numeroMatriculaDTO.getIsm_salidaMatriculaDTO().setIm_matriculaDto(new MatriculaDTO());
				this.icenm_numeroMatriculaDTO.getIsm_salidaMatriculaDTO().getIm_matriculaDto()
						.setIs_codigoMatricula(this.is_numeroMatricula);
				this.icenm_numeroMatriculaDTO.getIsm_salidaMatriculaDTO().getIm_matriculaDto()
						.setIcr_circuloRegistralMatricula(this.icr_circuloRegistralEnvioSeleccionadoDto);
			}
			this.enviarCedulaCatastral();
			this.getIbce_beanCertificadoEspecial().itce_transaccionCertificadoEspecialDto
					.setIcenm_numeroMatriculaDTO(icenm_numeroMatriculaDTO);
			this.icenm_numeroMatriculaDTO.setId_fechaSolicitud(id_fechaSolicitud);
			this.icenm_numeroMatriculaDTO.setIs_cedulaCatastral((is_cedulaCatastral != null ? is_cedulaCatastral : ""));
			GeneradorGrowlGenerico.generarMensajeExitoso(EnumMensajesCertificados.CERTIFICADO_ESPECIAL_VALIDAR);
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(false);
		} else {
			this.getIbce_beanCertificadoEspecial().setIb_mensajesValidacion(true);
			GeneradorGrowlGenerico.generarMensajeFatal(EnumMensajesCertificados.SE_ENCONTRARON_ERRORES_CE);
		}
		this.getIbce_beanCertificadoEspecial().setIls_errores(this.ils_erroresNumMatricula);
		this.ib_matriculaErrores = this.getIbce_beanCertificadoEspecial().resumen(icenm_numeroMatriculaDTO,
				this.ib_matriculaErrores);
		this.resumen();
	}

	/**
	 * Metodo que se encarga de validar si numero de matricula o cedula catastral es
	 * obligatorio
	 */
	public void validarMatriculaCatastral() {
		if (Objects.isNull(this.icr_circuloRegistralEnvioSeleccionadoDto)
				|| (StringUtils.isNullOrEmpty(this.is_numeroMatricula))) {
			this.ils_erroresNumMatricula.add(
					this.getIbce_beanCertificadoEspecial().consultarMensaje(EnumMensajesCertificados.NUMMATRICULA));
		} else if (this.idc_detalleCatalogoDto.getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.CARENCIA.getIs_codigo())
				&& StringUtils.isNullOrEmpty(this.is_cedulaCatastral)) {
			this.ils_erroresNumMatricula.add(
					this.getIbce_beanCertificadoEspecial().consultarMensaje(EnumMensajesCertificados.CEDCATASTRAL));
		}
	}

	/**
	 * Metodo que se encarga de validar dependiendo del certificado el campo
	 * obligatorio a ingresar
	 * 
	 * @return
	 */
	public Boolean campoObligatorio() {
		Boolean lb_obl = true;
		if (this.idc_detalleCatalogoDto.getIs_codigoSubServicio()
				.equals(EnumCertificadosEspeciales.CARENCIA.getIs_codigo())) {
			return lb_obl;
		} else {
			lb_obl = false;
		}
		return lb_obl;
	}

	/**
	 * Metodo que se encarga de validar si se ingreso o no numero de cedula
	 * catastral.
	 */
	public void enviarCedulaCatastral() {
		if (!this.is_cedulaCatastral.isEmpty()) {
			this.icenm_numeroMatriculaDTO.setIs_cedulaCatastral(is_cedulaCatastral);
		}
	}

	/**
	 * Obtiene el valor para la propiedad numero matricula DTO.
	 *
	 * @return El valor de la propiedad numero matricula DTO
	 */
	public CENumMatriculaDTO getIcenm_numeroMatriculaDTO() {
		return icenm_numeroMatriculaDTO;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero matricula DTO.
	 *
	 * @param acenm_numeroMatriculaDTO el nuevo valor para la propiedad numero
	 *                                 matricula DTO
	 */
	public void setIcenm_numeroMatriculaDTO(CENumMatriculaDTO acenm_numeroMatriculaDTO) {
		this.icenm_numeroMatriculaDTO = acenm_numeroMatriculaDTO;
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
	 * Cambia/actualiza el valor para la propiedad numero matricula.
	 *
	 * @param as_numeroMatricula el nuevo valor para la propiedad numero matricula
	 */
	public void setIs_numeroMatricula(String as_numeroMatricula) {
		this.is_numeroMatricula = as_numeroMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad matricula errores.
	 *
	 * @return El valor de la propiedad matricula errores
	 */
	public Boolean getIb_matriculaErrores() {
		return ib_matriculaErrores;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula errores.
	 *
	 * @param ab_matriculaErrores el nuevo valor para la propiedad matricula errores
	 */
	public void setIb_matriculaErrores(Boolean ab_matriculaErrores) {
		this.ib_matriculaErrores = ab_matriculaErrores;
	}

	/**
	 * Obtiene el valor para la propiedad matricula dto.
	 *
	 * @return El valor de la propiedad matricula dto
	 */
	public MatriculaDTO getIm_matriculaDto() {
		return im_matriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula dto.
	 *
	 * @param am_matriculaDto el nuevo valor para la propiedad matricula dto
	 */
	public void setIm_matriculaDto(MatriculaDTO am_matriculaDto) {
		this.im_matriculaDto = am_matriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad errores num matricula.
	 *
	 * @return El valor de la propiedad errores num matricula
	 */
	public List<String> getIls_erroresNumMatricula() {
		return ils_erroresNumMatricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad errores num matricula.
	 *
	 * @param als_erroresNumMatricula el nuevo valor para la propiedad errores num
	 *                                matricula
	 */
	public void setIls_erroresNumMatricula(List<String> als_erroresNumMatricula) {
		this.ils_erroresNumMatricula = als_erroresNumMatricula;
	}

	/**
	 * Obtiene el valor para la propiedad bean certificado especial.
	 *
	 * @return El valor de la propiedad bean certificado especial
	 */
	public BeanCertificadoEspecial getIbce_beanCertificadoEspecial() {
		return ibce_beanCertificadoEspecial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad bean certificado especial.
	 *
	 * @param abce_beanCertificadoEspecial el nuevo valor para la propiedad bean
	 *                                     certificado especial
	 */
	public void setIbce_beanCertificadoEspecial(BeanCertificadoEspecial abce_beanCertificadoEspecial) {
		this.ibce_beanCertificadoEspecial = abce_beanCertificadoEspecial;
	}

	/**
	 * Obtiene el valor para la propiedad lista circulo registral dto.
	 *
	 * @return El valor de la propiedad lista circulo registral dto
	 */
	public List<CirculoRegistralDTO> getIlcr_listaCirculoRegistralDto() {
		return ilcr_listaCirculoRegistralDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista circulo registral dto.
	 *
	 * @param alcr_listaCirculoRegistralDto el nuevo valor para la propiedad lista
	 *                                      circulo registral dto
	 */
	public void setIlcr_listaCirculoRegistralDto(List<CirculoRegistralDTO> alcr_listaCirculoRegistralDto) {
		this.ilcr_listaCirculoRegistralDto = alcr_listaCirculoRegistralDto;
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral envio seleccionado dto.
	 *
	 * @return El valor de la propiedad circulo registral envio seleccionado dto
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralEnvioSeleccionadoDto() {
		return icr_circuloRegistralEnvioSeleccionadoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral envio
	 * seleccionado dto.
	 *
	 * @param acr_circuloRegistralEnvioSeleccionadoDto el nuevo valor para la
	 *                                                 propiedad circulo registral
	 *                                                 envio seleccionado dto
	 */
	public void setIcr_circuloRegistralEnvioSeleccionadoDto(
			CirculoRegistralDTO acr_circuloRegistralEnvioSeleccionadoDto) {
		this.icr_circuloRegistralEnvioSeleccionadoDto = acr_circuloRegistralEnvioSeleccionadoDto;
	}

	/**
	 * Obtiene el valor para la propiedad matricula.
	 *
	 * @return El valor de la propiedad matricula
	 */
	public Boolean getIb_matricula() {
		return ib_matricula;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula.
	 *
	 * @param ab_matricula el nuevo valor para la propiedad matricula
	 */
	public void setIb_matricula(Boolean ab_matricula) {
		this.ib_matricula = ab_matricula;
	}

	/**
	 * Obtiene el valor para la propiedad ced catastral.
	 *
	 * @return El valor de la propiedad ced catastral
	 */
	public Boolean getIb_cedCatastral() {
		return ib_cedCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad ced catastral.
	 *
	 * @param ab_cedCatastral el nuevo valor para la propiedad ced catastral
	 */
	public void setIb_cedCatastral(Boolean ab_cedCatastral) {
		this.ib_cedCatastral = ab_cedCatastral;
	}

	/**
	 * Obtiene el valor para la propiedad fecha solicitud.
	 *
	 * @return El valor de la propiedad fecha solicitud
	 */
	public Date getId_fechaSolicitud() {
		return id_fechaSolicitud;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha solicitud.
	 *
	 * @param ad_fechaSolicitud el nuevo valor para la propiedad fecha solicitud
	 */
	public void setId_fechaSolicitud(Date ad_fechaSolicitud) {
		this.id_fechaSolicitud = ad_fechaSolicitud;
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

	/**
	 * Obtiene el valor para la propiedad detalle catalogo dto.
	 *
	 * @return El valor de la propiedad detalle catalogo dto
	 */
	public DetalleCatalogoDTO getIdc_detalleCatalogoDto() {
		return idc_detalleCatalogoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad detalle catalogo dto.
	 *
	 * @param adc_detalleCatalogoDto el nuevo valor para la propiedad detalle
	 *                               catalogo dto
	 */
	public void setIdc_detalleCatalogoDto(DetalleCatalogoDTO adc_detalleCatalogoDto) {
		this.idc_detalleCatalogoDto = adc_detalleCatalogoDto;
	}

	/**
	 * Obtiene el valor para la propiedad cedula catastral.
	 *
	 * @return El valor de la propiedad cedula catastral
	 */
	public String getIs_cedulaCatastral() {
		return is_cedulaCatastral;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad cedula catastral.
	 *
	 * @param as_cedulaCatastral el nuevo valor para la propiedad cedula catastral
	 */
	public void setIs_cedulaCatastral(String as_cedulaCatastral) {
		this.is_cedulaCatastral = as_cedulaCatastral;
	}

}
