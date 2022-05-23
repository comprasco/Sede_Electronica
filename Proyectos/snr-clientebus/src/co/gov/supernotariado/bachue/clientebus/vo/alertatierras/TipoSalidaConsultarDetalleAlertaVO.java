/**
 * Archivo del proyecto Cliente BUS de Servicios
 * ----------------------------------------------
 * Nombre del archivo: TipoSalidaConsultarDetalleAlertaVO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.clientebus.vo.alertatierras
 * Nombre del elemento: TipoSalidaConsultarDetalleAlertaVO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.clientebus.vo.alertatierras;

import java.util.Date;
import java.util.List;

import co.gov.supernotariado.bachue.clientebus.vo.ClienteIntegracionVO;

/**
 * Clase tipo objeto de valores de servicios (VO). <br>
 * Permite pasar datos de entrada o devolver los resultados al invocar una
 * operacion de un servicio, <br>
 * consumida usando el cliente bus. <br>
 * Contiene propiedades para representar los datos de entrada/salida del objeto
 * Tipo salida consultar detalle alerta .
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TipoSalidaConsultarDetalleAlertaVO extends ClienteIntegracionVO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * codigo.
	 */
	private String is_codigo;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * mensaje.
	 */
	private String is_mensaje;
	
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
	 * Atributo de instancia tipo lista de ListaMatriculasDetalleAlertasVO para
	 * definir la propiedad lista matriculas vo.
	 */
	private List<ListaMatriculasDetalleAlertasVO> illmda_listaMatriculasVo;
	
	/**
	 * Atributo de instancia tipo InactivacionVO para definir la propiedad
	 * inactivacion vo.
	 */
	private InactivacionVO ii_inactivacionVo;
	
	/**
	 * Atributo de instancia tipo lista de ListaAlertasGeneradasVO para definir la
	 * propiedad lista alertas generadas vo.
	 */
	private List<ListaAlertasGeneradasVO> illag_listaAlertasGeneradasVo;
	
	/**
	 * Atributo de instancia tipo lista de ProcesoASVO para definir la propiedad
	 * proceso detalle A vo.
	 */
	private List<ProcesoASVO> ilpas_procesoDetalleAVo;

	/**
	 * Obtiene el valor para la propiedad codigo.
	 *
	 * @return El valor de la propiedad codigo
	 */
	public String getIs_codigo() {
		return is_codigo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad codigo.
	 *
	 * @param as_codigo el nuevo valor para la propiedad codigo
	 */
	public void setIs_codigo(String as_codigo) {
		this.is_codigo = as_codigo;
	}

	/**
	 * Obtiene el valor para la propiedad mensaje.
	 *
	 * @return El valor de la propiedad mensaje
	 */
	public String getIs_mensaje() {
		return is_mensaje;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad mensaje.
	 *
	 * @param as_mensaje el nuevo valor para la propiedad mensaje
	 */
	public void setIs_mensaje(String as_mensaje) {
		this.is_mensaje = as_mensaje;
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
	 * Obtiene el valor para la propiedad lista matriculas objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad lista matriculas objeto con valores de
	 *         servicio
	 */
	public List<ListaMatriculasDetalleAlertasVO> getIllmda_listaMatriculasVo() {
		return illmda_listaMatriculasVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matriculas objeto con
	 * valores de servicio.
	 *
	 * @param allmda_listaMatriculasVo el nuevo valor para la propiedad lista
	 *                                 matriculas objeto con valores de servicio
	 */
	public void setIllmda_listaMatriculasVo(List<ListaMatriculasDetalleAlertasVO> allmda_listaMatriculasVo) {
		this.illmda_listaMatriculasVo = allmda_listaMatriculasVo;
	}

	/**
	 * Obtiene el valor para la propiedad inactivacion objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad inactivacion objeto con valores de servicio
	 */
	public InactivacionVO getIi_inactivacionVo() {
		return ii_inactivacionVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad inactivacion objeto con valores
	 * de servicio.
	 *
	 * @param ai_inactivacionVo el nuevo valor para la propiedad inactivacion objeto
	 *                          con valores de servicio
	 */
	public void setIi_inactivacionVo(InactivacionVO ai_inactivacionVo) {
		this.ii_inactivacionVo = ai_inactivacionVo;
	}

	/**
	 * Obtiene el valor para la propiedad lista alertas generadas objeto con valores
	 * de servicio.
	 *
	 * @return El valor de la propiedad lista alertas generadas objeto con valores
	 *         de servicio
	 */
	public List<ListaAlertasGeneradasVO> getIllag_listaAlertasGeneradasVo() {
		return illag_listaAlertasGeneradasVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista alertas generadas objeto
	 * con valores de servicio.
	 *
	 * @param allag_listaAlertasGeneradasVo el nuevo valor para la propiedad lista
	 *                                      alertas generadas objeto con valores de
	 *                                      servicio
	 */
	public void setIllag_listaAlertasGeneradasVo(List<ListaAlertasGeneradasVO> allag_listaAlertasGeneradasVo) {
		this.illag_listaAlertasGeneradasVo = allag_listaAlertasGeneradasVo;
	}

	/**
	 * Obtiene el valor para la propiedad proceso detalle A objeto con valores de
	 * servicio.
	 *
	 * @return El valor de la propiedad proceso detalle A objeto con valores de
	 *         servicio
	 */
	public List<ProcesoASVO> getIlpas_procesoDetalleAVo() {
		return ilpas_procesoDetalleAVo;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad proceso detalle A objeto con
	 * valores de servicio.
	 *
	 * @param alpas_procesoDetalleAVo el nuevo valor para la propiedad proceso
	 *                                detalle A objeto con valores de servicio
	 */
	public void setIlpas_procesoDetalleAVo(List<ProcesoASVO> alpas_procesoDetalleAVo) {
		this.ilpas_procesoDetalleAVo = alpas_procesoDetalleAVo;
	}

}
