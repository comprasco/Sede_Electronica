/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: PoderDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: PoderDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.poderes.NotificacionWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Poder.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class PoderDTO extends GenericoDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado poder.
	 */
	private String is_estadoPoder;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * actualizacion documento.
	 */
	private String is_actualizacionDoc;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad uso
	 * poder.
	 */
	private String is_usoPoder;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * correccion.
	 */
	private Boolean ib_correccion;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre documento.
	 */
	private String is_dDocName;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * documento.
	 */
	private String is_did;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo documento
	 */
	private String is_tipoDocumento;

	/**
	 * Define la constante CS_SEPARADOR_OBSERVACION.
	 */
	private static final String CS_SEPARADOR_OBSERVACION = "\n ------- \n";

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo poder.
	 */
	private CatalogoDTO ic_tipoPoder;

	/**
	 * Atributo de instancia tipo lista NotificacionWSDTO para definir la propiedad
	 * notificaciones
	 */
	private List<NotificacionWSDTO> iln_notificaciones;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad id
	 * notaria origen.
	 */
	private String is_idNotariaOrigen;

	/**
	 * Atributo de instancia tipo DepartamentoDTO para definir la propiedad
	 * departamento.
	 */
	private DepartamentoDTO id_departamentoDto;

	/**
	 * Atributo de instancia tipo MunicipioDTO para definir la propiedad municipio.
	 */
	private MunicipioDTO im_municipioDto;

	/**
	 * Atributo de instancia tipo cadena para definir la propiedad departamentos.
	 */
	private String is_departamentos;

	/**
	 * Atributo de instancia tipo c para definir la propiedad municipios.
	 */
	private String is_municipios;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * diligencia reconocimiento.
	 */
	private String is_diligenciaReconocimiento;

	/**
	 * Atributo de instancia tipo lista ObservacionPoderDTO para definir la
	 * propiedad observaciones.
	 */
	private List<ObservacionPoderDTO> ilop_observaciones;

	/**
	 * Atributo de instancia tipo verdadero/falso para definir la propiedad
	 * diligencia reconocimiento.
	 */
	private Boolean ib_diligenciaReconocimiento;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha vencimiento.
	 */
	private Date id_fechaVencimiento;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha cargue.
	 */
	private Date id_fechaCargue;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero escritura.
	 */
	private String is_numEscritura;

	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha escritura.
	 */
	private Date id_fechaEscritura;

	/**
	 * Atributo de instancia tipo ArchivoDTO para definir la propiedad archivo
	 * poder.
	 */
	private ArchivoDTO ia_archivoPoder;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones.
	 */
	private String is_observaciones;

	/**
	 * Atributo de instancia tipo lista AgregarPredioMatriculasDTO para definir la
	 * propiedad lista predio con matricula.
	 */
	private List<AgregarPredioMatriculasDTO> ilapm_listaPredioConMatriculas;

	/**
	 * Atributo de instancia tipo lista AgregarPredioMatriculasDTO para definir la
	 * propiedad lista predio sin matricula.
	 */
	private List<AgregarPredioMatriculasDTO> ilapm_listaPredioSinMatriculas;

	/**
	 * Atributo de instancia tipo lista AgregarPoderdanteApoderadoDTO para definir
	 * la propiedad lista poderdantes.
	 */
	private List<AgregarPoderdanteApoderadoDTO> ilapa_listaPoderdantes;

	/**
	 * Atributo de instancia tipo lista AgregarPoderdanteApoderadoDTO para definir
	 * la propiedad lista apoderados.
	 */
	private List<AgregarPoderdanteApoderadoDTO> ilapa_listaApoderados;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * notificaciones existentes.
	 */
	private String is_notificacionesExistentes;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * entidad cargue.
	 */
	private String is_entidadCargue;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * numero documento poderdantes.
	 */
	private String is_numDocPoderdantes;

	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * observaciones cargue.
	 */
	private String is_observacionesCargue;

	/**
	 * Atributo de instancia tipo CatalogoDTO para definir la propiedad tipo
	 * documento.
	 */
	private CatalogoDTO ic_tipoDocumento;

	/**
	 * Construye una nueva instancia/objeto de la clase PoderDTO.
	 */
	public PoderDTO() {
		ilapm_listaPredioConMatriculas = new ArrayList<>();
		ilapm_listaPredioSinMatriculas = new ArrayList<>();
		ilapa_listaPoderdantes = new ArrayList<>();
		ilapa_listaApoderados = new ArrayList<>();
		setIb_correccion(false);
	}

	/**
	 * Obtiene el valor para la propiedad estado poder.
	 *
	 * @return El valor de la propiedad estado poder
	 */
	public String getIs_estadoPoder() {
		return is_estadoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado poder.
	 *
	 * @param as_estadoPoder el nuevo valor para la propiedad estado poder
	 */
	public void setIs_estadoPoder(String as_estadoPoder) {
		this.is_estadoPoder = as_estadoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad departamento.
	 *
	 * @return El valor de la propiedad departamento
	 */
	public DepartamentoDTO getId_departamentoDto() {
		return id_departamentoDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamento.
	 *
	 * @param ad_departamentoDto el nuevo valor para la propiedad departamento
	 */
	public void setId_departamentoDto(DepartamentoDTO ad_departamentoDto) {
		this.id_departamentoDto = ad_departamentoDto;
	}

	/**
	 * Obtiene el valor para la propiedad municipio.
	 *
	 * @return El valor de la propiedad municipio
	 */
	public MunicipioDTO getIm_municipioDto() {
		return im_municipioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipio.
	 *
	 * @param am_municipioDto el nuevo valor para la propiedad municipio
	 */
	public void setIm_municipioDto(MunicipioDTO am_municipioDto) {
		this.im_municipioDto = am_municipioDto;
	}

	/**
	 * Obtiene el valor para la propiedad diligencia reconocimiento.
	 *
	 * @return El valor de la propiedad diligencia reconocimiento
	 */
	public String getIs_diligenciaReconocimiento() {
		return is_diligenciaReconocimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad diligencia reconocimiento.
	 *
	 * @param as_diligenciaReconocimiento el nuevo valor para la propiedad
	 *                                    diligencia reconocimiento
	 */
	public void setIs_diligenciaReconocimiento(String as_diligenciaReconocimiento) {
		this.is_diligenciaReconocimiento = as_diligenciaReconocimiento;
	}

	/**
	 * Obtiene el valor para la propiedad fecha vencimiento.
	 *
	 * @return El valor de la propiedad fecha vencimiento
	 */
	public Date getId_fechaVencimiento() {
		return id_fechaVencimiento;
	}

	/**
	 * Obtiene el valor para la propiedad fecha vencimiento texto.
	 *
	 * @return El valor de la propiedad fecha vencimiento texto
	 */
	public String getId_fechaVencimientoTexto() {
		if (id_fechaVencimiento != null)
			return UtilidadFecha.formatearFecha(id_fechaVencimiento);
		return null;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha vencimiento.
	 *
	 * @param ad_fechaVencimiento el nuevo valor para la propiedad fecha vencimiento
	 */
	public void setId_fechaVencimiento(Date ad_fechaVencimiento) {
		this.id_fechaVencimiento = ad_fechaVencimiento;
	}

	/**
	 * Obtiene el valor para la propiedad fecha cargue.
	 *
	 * @return El valor de la propiedad fecha cargue
	 */
	public Date getId_fechaCargue() {
		return id_fechaCargue;
	}

	/**
	 * Obtiene el valor para la propiedad fecha cargue.
	 *
	 * @return El valor de la propiedad fecha cargue
	 */
	public String getId_fechaCargueTexto() {
		if (id_fechaCargue != null)
			return UtilidadFecha.formatearFecha(id_fechaCargue);
		return null;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha cargue.
	 *
	 * @param ad_fechaCargue el nuevo valor para la propiedad fecha cargue
	 */
	public void setId_fechaCargue(Date ad_fechaCargue) {
		this.id_fechaCargue = ad_fechaCargue;
	}

	/**
	 * Obtiene el valor para la propiedad numero escritura.
	 *
	 * @return El valor de la propiedad numero escritura
	 */
	public String getIs_numEscritura() {
		return is_numEscritura;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero escritura.
	 *
	 * @param as_numEscritura el nuevo valor para la propiedad numero escritura
	 */
	public void setIs_numEscritura(String as_numEscritura) {
		this.is_numEscritura = as_numEscritura;
	}

	/**
	 * Obtiene el valor para la propiedad fecha escritura.
	 *
	 * @return El valor de la propiedad fecha escritura
	 */
	public Date getId_fechaEscritura() {
		return id_fechaEscritura;
	}

	/**
	 * Obtiene el valor para la propiedad fecha escritura.
	 *
	 * @return El valor de la propiedad fecha escritura
	 */
	public String getId_fechaEscrituraTexto() {
		if (id_fechaEscritura != null)
			return UtilidadFecha.formatearFecha(id_fechaEscritura);
		return null;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha escritura.
	 *
	 * @param ad_fechaEscritura el nuevo valor para la propiedad fecha escritura
	 */
	public void setId_fechaEscritura(Date ad_fechaEscritura) {
		this.id_fechaEscritura = ad_fechaEscritura;
	}

	/**
	 * Obtiene el valor para la propiedad archivo poder.
	 *
	 * @return El valor de la propiedad archivo poder
	 */
	public ArchivoDTO getIa_archivoPoder() {
		return ia_archivoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo poder.
	 *
	 * @param aa_archivoPoder el nuevo valor para la propiedad archivo poder
	 */
	public void setIa_archivoPoder(ArchivoDTO aa_archivoPoder) {
		this.ia_archivoPoder = aa_archivoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public String getIs_observaciones() {
		return is_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param as_observaciones el nuevo valor para la propiedad observaciones
	 */
	public void setIs_observaciones(String as_observaciones) {
		this.is_observaciones = as_observaciones;
	}

	/**
	 * Obtiene el valor para la propiedad lista predio con matricula.
	 *
	 * @return El valor de la propiedad lista predio con matricula
	 */
	public List<AgregarPredioMatriculasDTO> getIlapm_listaPredioConMatriculas() {
		return ilapm_listaPredioConMatriculas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista predio con matricula.
	 *
	 * @param alapm_listaPredioConMatriculas el nuevo valor para la propiedad lista
	 *                                       predio con matricula
	 */
	public void setIlapm_listaPredioConMatriculas(List<AgregarPredioMatriculasDTO> alapm_listaPredioConMatriculas) {
		this.ilapm_listaPredioConMatriculas = alapm_listaPredioConMatriculas;
	}

	/**
	 * Obtiene el valor para la propiedad lista predio sin matricula.
	 *
	 * @return El valor de la propiedad lista predio sin matricula
	 */
	public List<AgregarPredioMatriculasDTO> getIlapm_listaPredioSinMatriculas() {
		return ilapm_listaPredioSinMatriculas;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista predio sin matricula.
	 *
	 * @param alapm_listaPredioSinMatriculas el nuevo valor para la propiedad lista
	 *                                       predio sin matricula
	 */
	public void setIlapm_listaPredioSinMatriculas(List<AgregarPredioMatriculasDTO> alapm_listaPredioSinMatriculas) {
		this.ilapm_listaPredioSinMatriculas = alapm_listaPredioSinMatriculas;
	}

	/**
	 * Obtiene el valor para la propiedad lista poderdante.
	 *
	 * @return El valor de la propiedad lista poderdante
	 */
	public List<AgregarPoderdanteApoderadoDTO> getIlapa_listaPoderdantes() {
		return ilapa_listaPoderdantes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista poderdante.
	 *
	 * @param alapa_listaPoderdantes el nuevo valor para la propiedad lista
	 *                               poderdante
	 */
	public void setIlapa_listaPoderdantes(List<AgregarPoderdanteApoderadoDTO> alapa_listaPoderdantes) {
		this.ilapa_listaPoderdantes = alapa_listaPoderdantes;
	}

	/**
	 * Obtiene el valor para la propiedad lista apoderados.
	 *
	 * @return El valor de la propiedad lista apoderados
	 */
	public List<AgregarPoderdanteApoderadoDTO> getIlapa_listaApoderados() {
		return ilapa_listaApoderados;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista apoderados.
	 *
	 * @param alapa_listaApoderados el nuevo valor para la propiedad lista
	 *                              apoderados
	 */
	public void setIlapa_listaApoderados(List<AgregarPoderdanteApoderadoDTO> alapa_listaApoderados) {
		this.ilapa_listaApoderados = alapa_listaApoderados;
	}

	/**
	 * Obtiene el valor para la propiedad notificaciones existentes.
	 *
	 * @return El valor de la propiedad notificaciones existentes
	 */
	public String getIs_notificacionesExistentes() {
		return is_notificacionesExistentes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad notificaciones existentes.
	 *
	 * @param as_notificacionesExistentes el nuevo valor para la propiedad
	 *                                    notificaciones existentes
	 */
	public void setIs_notificacionesExistentes(String as_notificacionesExistentes) {
		this.is_notificacionesExistentes = as_notificacionesExistentes;
	}

	/**
	 * Obtiene el valor para la propiedad entidad cargue.
	 *
	 * @return El valor de la propiedad entidad cargue
	 */
	public String getIs_entidadCargue() {
		return is_entidadCargue;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad entidad cargue.
	 *
	 * @param as_entidadCargue el nuevo valor para la propiedad entidad cargue
	 */
	public void setIs_entidadCargue(String as_entidadCargue) {
		this.is_entidadCargue = as_entidadCargue;
	}

	/**
	 * Obtiene el valor para la propiedad numero documento poderdantes.
	 *
	 * @return El valor de la propiedad numero documento poderdantes
	 */
	public String getIs_numDocPoderdantes() {
		return is_numDocPoderdantes;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad numero documento poderdantes.
	 *
	 * @param as_numDocPoderdantes el nuevo valor para la propiedad numero documento
	 *                             poderdantes
	 */
	public void setIs_numDocPoderdantes(String as_numDocPoderdantes) {
		this.is_numDocPoderdantes = as_numDocPoderdantes;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones cargue.
	 *
	 * @return El valor de la propiedad observaciones cargue
	 */
	public String getIs_observacionesCargue() {
		return is_observacionesCargue;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones cargue.
	 *
	 * @param as_observacionesCargue el nuevo valor para la propiedad observaciones
	 *                               cargue
	 */
	public void setIs_observacionesCargue(String as_observacionesCargue) {
		this.is_observacionesCargue = as_observacionesCargue;
	}

	/**
	 * Obtiene el valor para la propiedad numero observaciones cargue.
	 *
	 * @return El valor de la propiedad observaciones cargue
	 */
	public String getIlop_listaObservacionesPoderDtoTexto() {
		StringBuilder lsb_notificaciones = new StringBuilder();

		if (ilop_observaciones != null && !ilop_observaciones.isEmpty()) {
			ilop_observaciones.forEach(ls_observaciones -> lsb_notificaciones.append(ls_observaciones.getIs_fecha())
					.append(" : ").append(ls_observaciones.getIs_notariaCreadora()).append(" : ")
					.append(ls_observaciones.getIs_tipoPoder()).append(" : ").append("\n")
					.append(ls_observaciones.getIs_observaciones()).append(CS_SEPARADOR_OBSERVACION));
		}

		return lsb_notificaciones.toString();
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public CatalogoDTO getIc_tipoDocumento() {
		return ic_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param ac_tipoDocumento el nuevo valor para la propiedad tipo documento
	 */
	public void setIc_tipoDocumento(CatalogoDTO ac_tipoDocumento) {
		this.ic_tipoDocumento = ac_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad tipo poder.
	 *
	 * @return El valor de la propiedad tipo poder
	 */
	public CatalogoDTO getIc_tipoPoder() {
		return ic_tipoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo poder.
	 *
	 * @param ac_tipoPoder el nuevo valor para la propiedad tipo poder
	 */
	public void setIc_tipoPoder(CatalogoDTO ac_tipoPoder) {
		this.ic_tipoPoder = ac_tipoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad diligencia reconocimiento.
	 *
	 * @return El valor de la propiedad diligencia reconocimiento
	 */
	public Boolean getIb_diligenciaReconocimiento() {
		return ib_diligenciaReconocimiento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad diligencia reconocimiento.
	 *
	 * @param ab_diligenciaReconocimiento el nuevo valor para la propiedad
	 *                                    diligencia reconocimiento
	 */
	public void setIb_diligenciaReconocimiento(Boolean ab_diligenciaReconocimiento) {
		this.ib_diligenciaReconocimiento = ab_diligenciaReconocimiento;
	}

	/**
	 * Obtiene el valor para la propiedad id notaria origen.
	 *
	 * @return El valor de la propiedad id notaria origen
	 */
	public String getIs_idNotariaOrigen() {
		return is_idNotariaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id notaria origen.
	 *
	 * @param as_idNotariaOrigen el nuevo valor para la propiedad id notaria origen
	 */
	public void setIs_idNotariaOrigen(String as_idNotariaOrigen) {
		this.is_idNotariaOrigen = as_idNotariaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad actualizacion documento.
	 *
	 * @return El valor de la propiedad actualizacion documento
	 */
	public String getIs_actualizacionDoc() {
		return is_actualizacionDoc;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad actualizacion documento.
	 *
	 * @param as_actualizacionDoc el nuevo valor para la propiedad actualizacion
	 *                            documento
	 */
	public void setIs_actualizacionDoc(String as_actualizacionDoc) {
		this.is_actualizacionDoc = as_actualizacionDoc;
	}

	/**
	 * Obtiene el valor para la propiedad uso poder.
	 *
	 * @return El valor de la propiedad uso poder
	 */
	public String getIs_usoPoder() {
		return is_usoPoder;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad uso poder.
	 *
	 * @param as_usoPoder el nuevo valor para la propiedad uso poder
	 */
	public void setIs_usoPoder(String as_usoPoder) {
		this.is_usoPoder = as_usoPoder;
	}

	/**
	 * Obtiene el valor para la propiedad correcion.
	 *
	 * @return El valor de la propiedad correcion
	 */
	public Boolean getIb_correccion() {
		return ib_correccion;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correcion.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad correcion
	 */
	public void setIb_correccion(Boolean ab_correccion) {
		this.ib_correccion = ab_correccion;
	}

	/**
	 * Obtiene el valor para la propiedad observaciones.
	 *
	 * @return El valor de la propiedad observaciones
	 */
	public List<ObservacionPoderDTO> getIlop_observaciones() {
		return ilop_observaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad observaciones.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad observaciones
	 */
	public void setIlop_observaciones(List<ObservacionPoderDTO> alop_observaciones) {
		this.ilop_observaciones = alop_observaciones;
	}

	/**
	 * Obtiene el valor para la propiedad nombre documento.
	 *
	 * @return El valor de la propiedad nombre documento
	 */
	public String getIs_dDocName() {
		return is_dDocName;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre documento.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad nombre documento
	 */
	public void setIs_dDocName(String as_dDocName) {
		this.is_dDocName = as_dDocName;
	}

	/**
	 * Obtiene el valor para la propiedad id documento.
	 *
	 * @return El valor de la propiedad id documento
	 */
	public String getIs_did() {
		return is_did;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad id documento.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad id documento
	 */
	public void setIs_did(String as_did) {
		this.is_did = as_did;
	}

	/**
	 * Obtiene el valor para la propiedad notificaciones.
	 *
	 * @return El valor de la propiedad notificaciones
	 */
	public List<NotificacionWSDTO> getIln_notificaciones() {
		return iln_notificaciones;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad notificaciones.
	 *
	 * @param aln_notificaciones el nuevo valor para la propiedad notificaciones
	 */
	public void setIln_notificaciones(List<NotificacionWSDTO> aln_notificaciones) {
		this.iln_notificaciones = aln_notificaciones;
	}

	/**
	 * Obtiene el valor para la propiedad tipo documento.
	 *
	 * @return El valor de la propiedad tipo documento
	 */
	public String getIs_tipoDocumento() {
		return is_tipoDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo documento.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad tipo documento
	 */
	public void setIs_tipoDocumento(String as_tipoDocumento) {
		this.is_tipoDocumento = as_tipoDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad departamentos.
	 *
	 * @return El valor de la propiedad departamentos
	 */
	public String getIs_departamentos() {
		return is_departamentos;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad departamentos.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad departamentos
	 */
	public void setIs_departamentos(String as_departamentos) {
		this.is_departamentos = as_departamentos;
	}

	/**
	 * Obtiene el valor para la propiedad municipios.
	 *
	 * @return El valor de la propiedad municipios
	 */
	public String getIs_municipios() {
		return is_municipios;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad municipios.
	 *
	 * @param ab_correccion el nuevo valor para la propiedad municipios
	 */
	public void setIs_municipios(String as_municipios) {
		this.is_municipios = as_municipios;
	}

}
