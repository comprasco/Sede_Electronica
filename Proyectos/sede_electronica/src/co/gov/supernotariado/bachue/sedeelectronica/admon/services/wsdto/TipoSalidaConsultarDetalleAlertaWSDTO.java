/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TipoSalidaConsultarDetalleAlertaWSDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto
 * Nombre del elemento: TipoSalidaConsultarDetalleAlertaWSDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO;

/**
 * Clase tipo objeto de transferencia de datos para web service (WSDTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y servicios web.
 * <br>
 * Contiene propiedades para representar los datos del objeto Tipo salida
 * consultar detalle alerta.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarDetalleAlertaWSDTO extends GenericoDTO implements ISalidaServicioWSDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo mensaje.
	 */
	private String is_codigoMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * descripcion mensaje.
	 */
	private String is_descripcionMensaje;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * tipo alerta.
	 */
	private String is_tipoAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre entidad.
	 */
	private String is_nombreEntidad;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * proceso nro radicado.
	 */
	private String is_procesoNroRadicado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad proceso fecha
	 * radicado.
	 */
	private Date id_procesoFechaRadicado;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre oficina origen.
	 */
	private String is_nomOficinaOrigen;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * nombre tipo documento publico.
	 */
	private String is_nomTipoDocumentoPublico;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha documento.
	 */
	private Date id_fechaDocumento;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento numero.
	 */
	private String is_docNumero;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * documento id SGD.
	 */
	private String is_docIdSGD;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad documento name
	 * SGD.
	 */
	private Date id_docNameSGD;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad nit
	 * comunidad etnica.
	 */
	private String is_nitComunidadEtnica;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * estado.
	 */
	private String is_estado;
	
	/**
	 * Atributo de instancia tipo fecha para definir la propiedad fecha inactivacion
	 * alerta.
	 */
	private Date id_fechaInactivacionAlerta;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * creado SNR.
	 */
	private String is_creadoSNR;
	
	/**
	 * Atributo de instancia tipo lista de ListaMatriculasDetalleAlertasWSDTO para
	 * definir la propiedad lista matriculas ws.
	 */
	private List<ListaMatriculasDetalleAlertasWSDTO> illm_listaMatriculasWsDto;
	
	/**
	 * Atributo de instancia tipo InactivacionWSDTO para definir la propiedad
	 * inactivacion ws.
	 */
	private InactivacionWSDTO ili_inactivacionWsDto;
	
	/**
	 * Atributo de instancia tipo lista de ListaAlertasGeneradasWSDTO para definir
	 * la propiedad lista alertas generadas ws.
	 */
	private List<ListaAlertasGeneradasWSDTO> illag_listaAlertasGeneradasWsDto;
	
	/**
	 * Atributo de instancia tipo lista de ProcesoASWSDTO para definir la propiedad
	 * proceso detalle A ws.
	 */
	private List<ProcesoASWSDTO> ilpas_procesoDetalleAWsDto;

	

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_codigoMensaje()
	 */
	public String getIs_codigoMensaje() {
		return is_codigoMensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo mensaje.
	 *
	 * @param as_codigoMensaje el nuevo valor para la propiedad codigo mensaje
	 */
	public void setIs_codigoMensaje(String as_codigoMensaje) {
		this.is_codigoMensaje = as_codigoMensaje;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.interfaces.ISalidaServicioWSDTO#getIs_descripcionMensaje()
	 */
	public String getIs_descripcionMensaje() {
		return is_descripcionMensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad descripcion mensaje.
	 *
	 * @param as_descripcionMensaje el nuevo valor para la propiedad descripcion
	 *                              mensaje
	 */
	public void setIs_descripcionMensaje(String as_descripcionMensaje) {
		this.is_descripcionMensaje = as_descripcionMensaje;
	}

	/**
	 * Obtiene el valor para la propiedad tipo alerta.
	 *
	 * @return El valor de la propiedad tipo alerta
	 */
	public String getIs_tipoAlerta() {
		return is_tipoAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad tipo alerta.
	 *
	 * @param as_tipoAlerta el nuevo valor para la propiedad tipo alerta
	 */
	public void setIs_tipoAlerta(String as_tipoAlerta) {
		this.is_tipoAlerta = as_tipoAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad nombre entidad.
	 *
	 * @return El valor de la propiedad nombre entidad
	 */
	public String getIs_nombreEntidad() {
		return is_nombreEntidad;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre entidad.
	 *
	 * @param as_nombreEntidad el nuevo valor para la propiedad nombre entidad
	 */
	public void setIs_nombreEntidad(String as_nombreEntidad) {
		this.is_nombreEntidad = as_nombreEntidad;
	}

	/**
	 * Obtiene el valor para la propiedad proceso nro radicado.
	 *
	 * @return El valor de la propiedad proceso nro radicado
	 */
	public String getIs_procesoNroRadicado() {
		return is_procesoNroRadicado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso nro radicado.
	 *
	 * @param as_procesoNroRadicado el nuevo valor para la propiedad proceso nro
	 *                              radicado
	 */
	public void setIs_procesoNroRadicado(String as_procesoNroRadicado) {
		this.is_procesoNroRadicado = as_procesoNroRadicado;
	}

	/**
	 * Obtiene el valor para la propiedad proceso fecha radicado.
	 *
	 * @return El valor de la propiedad proceso fecha radicado
	 */
	public Date getId_procesoFechaRadicado() {
		return id_procesoFechaRadicado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso fecha radicado.
	 *
	 * @param ad_procesoFechaRadicado el nuevo valor para la propiedad proceso fecha
	 *                                radicado
	 */
	public void setId_procesoFechaRadicado(Date ad_procesoFechaRadicado) {
		this.id_procesoFechaRadicado = ad_procesoFechaRadicado;
	}

	/**
	 * Obtiene el valor para la propiedad nombre oficina origen.
	 *
	 * @return El valor de la propiedad nombre oficina origen
	 */
	public String getIs_nomOficinaOrigen() {
		return is_nomOficinaOrigen;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre oficina origen.
	 *
	 * @param as_nomOficinaOrigen el nuevo valor para la propiedad nombre oficina
	 *                            origen
	 */
	public void setIs_nomOficinaOrigen(String as_nomOficinaOrigen) {
		this.is_nomOficinaOrigen = as_nomOficinaOrigen;
	}

	/**
	 * Obtiene el valor para la propiedad nombre tipo documento publico.
	 *
	 * @return El valor de la propiedad nombre tipo documento publico
	 */
	public String getIs_nomTipoDocumentoPublico() {
		return is_nomTipoDocumentoPublico;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nombre tipo documento publico.
	 *
	 * @param as_nomTipoDocumentoPublico el nuevo valor para la propiedad nombre
	 *                                   tipo documento publico
	 */
	public void setIs_nomTipoDocumentoPublico(String as_nomTipoDocumentoPublico) {
		this.is_nomTipoDocumentoPublico = as_nomTipoDocumentoPublico;
	}

	/**
	 * Obtiene el valor para la propiedad fecha documento.
	 *
	 * @return El valor de la propiedad fecha documento
	 */
	public Date getId_fechaDocumento() {
		return id_fechaDocumento;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha documento.
	 *
	 * @param ad_fechaDocumento el nuevo valor para la propiedad fecha documento
	 */
	public void setId_fechaDocumento(Date ad_fechaDocumento) {
		this.id_fechaDocumento = ad_fechaDocumento;
	}

	/**
	 * Obtiene el valor para la propiedad documento numero.
	 *
	 * @return El valor de la propiedad documento numero
	 */
	public String getIs_docNumero() {
		return is_docNumero;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento numero.
	 *
	 * @param as_docNumero el nuevo valor para la propiedad documento numero
	 */
	public void setIs_docNumero(String as_docNumero) {
		this.is_docNumero = as_docNumero;
	}

	/**
	 * Obtiene el valor para la propiedad documento id SGD.
	 *
	 * @return El valor de la propiedad documento id SGD
	 */
	public String getIs_docIdSGD() {
		return is_docIdSGD;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento id SGD.
	 *
	 * @param as_docIdSGD el nuevo valor para la propiedad documento id SGD
	 */
	public void setIs_docIdSGD(String as_docIdSGD) {
		this.is_docIdSGD = as_docIdSGD;
	}

	/**
	 * Obtiene el valor para la propiedad documento name SGD.
	 *
	 * @return El valor de la propiedad documento name SGD
	 */
	public Date getId_docNameSGD() {
		return id_docNameSGD;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad documento name SGD.
	 *
	 * @param ad_docNameSGD el nuevo valor para la propiedad documento name SGD
	 */
	public void setId_docNameSGD(Date ad_docNameSGD) {
		this.id_docNameSGD = ad_docNameSGD;
	}

	/**
	 * Obtiene el valor para la propiedad nit comunidad etnica.
	 *
	 * @return El valor de la propiedad nit comunidad etnica
	 */
	public String getIs_nitComunidadEtnica() {
		return is_nitComunidadEtnica;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad nit comunidad etnica.
	 *
	 * @param as_nitComunidadEtnica el nuevo valor para la propiedad nit comunidad
	 *                              etnica
	 */
	public void setIs_nitComunidadEtnica(String as_nitComunidadEtnica) {
		this.is_nitComunidadEtnica = as_nitComunidadEtnica;
	}

	/**
	 * Obtiene el valor para la propiedad estado.
	 *
	 * @return El valor de la propiedad estado
	 */
	public String getIs_estado() {
		return is_estado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad estado.
	 *
	 * @param as_estado el nuevo valor para la propiedad estado
	 */
	public void setIs_estado(String as_estado) {
		this.is_estado = as_estado;
	}

	/**
	 * Obtiene el valor para la propiedad fecha inactivacion alerta.
	 *
	 * @return El valor de la propiedad fecha inactivacion alerta
	 */
	public Date getId_fechaInactivacionAlerta() {
		return id_fechaInactivacionAlerta;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad fecha inactivacion alerta.
	 *
	 * @param ad_fechaInactivacionAlerta el nuevo valor para la propiedad fecha
	 *                                   inactivacion alerta
	 */
	public void setId_fechaInactivacionAlerta(Date ad_fechaInactivacionAlerta) {
		this.id_fechaInactivacionAlerta = ad_fechaInactivacionAlerta;
	}

	/**
	 * Obtiene el valor para la propiedad creado SNR.
	 *
	 * @return El valor de la propiedad creado SNR
	 */
	public String getIs_creadoSNR() {
		return is_creadoSNR;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad creado SNR.
	 *
	 * @param as_creadoSNR el nuevo valor para la propiedad creado SNR
	 */
	public void setIs_creadoSNR(String as_creadoSNR) {
		this.is_creadoSNR = as_creadoSNR;
	}

	/**
	 * Obtiene el valor para la propiedad lista matriculas ws dto.
	 *
	 * @return El valor de la propiedad lista matriculas ws dto
	 */
	public List<ListaMatriculasDetalleAlertasWSDTO> getIllm_listaMatriculasWsDto() {
		return illm_listaMatriculasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas ws dto.
	 *
	 * @param allm_listaMatriculasWsDto el nuevo valor para la propiedad lista
	 *                                  matriculas ws dto
	 */
	public void setIllm_listaMatriculasWsDto(List<ListaMatriculasDetalleAlertasWSDTO> allm_listaMatriculasWsDto) {
		this.illm_listaMatriculasWsDto = allm_listaMatriculasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad inactivacion ws dto.
	 *
	 * @return El valor de la propiedad inactivacion ws dto
	 */
	public InactivacionWSDTO getIli_inactivacionWsDto() {
		return ili_inactivacionWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad inactivacion ws dto.
	 *
	 * @param ali_inactivacionWsDto el nuevo valor para la propiedad inactivacion ws
	 *                              dto
	 */
	public void setIli_inactivacionWsDto(InactivacionWSDTO ali_inactivacionWsDto) {
		this.ili_inactivacionWsDto = ali_inactivacionWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad lista alertas generadas ws dto.
	 *
	 * @return El valor de la propiedad lista alertas generadas ws dto
	 */
	public List<ListaAlertasGeneradasWSDTO> getIllag_listaAlertasGeneradasWsDto() {
		return illag_listaAlertasGeneradasWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista alertas generadas ws dto.
	 *
	 * @param allag_listaAlertasGeneradasWsDto el nuevo valor para la propiedad
	 *                                         lista alertas generadas ws dto
	 */
	public void setIllag_listaAlertasGeneradasWsDto(List<ListaAlertasGeneradasWSDTO> allag_listaAlertasGeneradasWsDto) {
		this.illag_listaAlertasGeneradasWsDto = allag_listaAlertasGeneradasWsDto;
	}

	/**
	 * Obtiene el valor para la propiedad proceso detalle A ws dto.
	 *
	 * @return El valor de la propiedad proceso detalle A ws dto
	 */
	public List<ProcesoASWSDTO> getIlpas_procesoDetalleAWsDto() {
		return ilpas_procesoDetalleAWsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso detalle A ws dto.
	 *
	 * @param alpas_procesoDetalleAWsDto el nuevo valor para la propiedad proceso
	 *                                   detalle A ws dto
	 */
	public void setIlpas_procesoDetalleAWsDto(List<ProcesoASWSDTO> alpas_procesoDetalleAWsDto) {
		this.ilpas_procesoDetalleAWsDto = alpas_procesoDetalleAWsDto;
	}

}
