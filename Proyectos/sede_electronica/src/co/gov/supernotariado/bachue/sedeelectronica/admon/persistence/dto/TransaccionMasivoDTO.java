/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: TransaccionMasivoDTO.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto
 * Nombre del elemento: TransaccionMasivoDTO
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Clase tipo objeto de transferencia de datos (DTO). <br>
 * Permite transferir y operar con datos entre capas de negocio y presentacion.
 * <br>
 * Contiene propiedades para representar los datos del objeto Transaccion
 * masivo.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class TransaccionMasivoDTO extends TransaccionGenericaDTO {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * archivo cargado.
	 */
	@SerializedName("archivoCargado")
	private String is_archivoCargado;
	
	/**
	 * Atributo de instancia tipo arreglo de bytes para definir la propiedad archivo
	 * cargado byte.
	 */
	@SerializedName("dataArchivoCargado")
	private byte[] ib_archivoCargadoByte;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * orip secuencia.
	 */
	@SerializedName("orip")
	private String is_oripSecuencia;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula inicial.
	 */
	@SerializedName("matriculaInicial")
	private String is_matriculaInicial;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * matricula final.
	 */
	@SerializedName("matriculaFinal")
	private String is_matriculaFinal;
	
	/**
	 * Atributo de instancia tipo lista de MatriculaDTO para definir la propiedad
	 * lista matricula.
	 */
	@SerializedName("listaMatricula")
	private List<MatriculaDTO> ilm_listaMatriculaDto;
	
	/**
	 * Atributo de instancia tipo RespuestaMasivosDTO para definir la propiedad
	 * respuesta masivos.
	 */
	@SerializedName("respuesta")
	private RespuestaMasivosDTO irm_respuestaMasivosDto;
	
	/**
	 * Atributo de instancia tipo cadena de caracteres para definir la propiedad
	 * correo envio.
	 */
	@SerializedName("correo")
	private String is_correoEnvio;
	
	/**
	 * Atributo de instancia tipo CirculoRegistralDTO para definir la propiedad
	 * circulo registral envio.
	 */
	@SerializedName("oripEnvio")
	private CirculoRegistralDTO icr_circuloRegistralEnvio;
	
	/**
	 * Atributo de instancia tipo Map con claves Integer y valores List para definir
	 * la propiedad mapa numero listas salida matricula.
	 */
	@SerializedName("mapaRespuestas")
	private Map<Integer,List<SalidaMatriculaDTO>> imilsm_mapaNumeroListasSalidaMatriculaDto;

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionMasivoDTO.
	 *
	 * @param atg_transaccionGenericaDto el parametro transaccion generica dto
	 */
	public TransaccionMasivoDTO(TransaccionGenericaDTO atg_transaccionGenericaDto) {
		this.setIlsm_listaSalidaMatriculaDto(atg_transaccionGenericaDto.getIlsm_listaSalidaMatriculaDto());
		this.setIemts_enumModoTipoServicio(atg_transaccionGenericaDto.getIemts_enumModoTipoServicio());
		this.setIdc_detalleCatalogoDto(atg_transaccionGenericaDto.getIdc_detalleCatalogoDto());
		this.setIetp_enumTipoProceso(atg_transaccionGenericaDto.getIetp_enumTipoProceso());
		this.setIbd_valorTotal(atg_transaccionGenericaDto.getIbd_valorTotal());
		this.setIs_carritoVigente(atg_transaccionGenericaDto.getIs_carritoVigente());
		this.setIp_personaDto(atg_transaccionGenericaDto.getIp_personaDto());
		this.setIs_idAsociacion(atg_transaccionGenericaDto.getIs_idAsociacion());
	}

	/**
	 * Construye una nueva instancia/objeto de la clase TransaccionMasivoDTO.
	 */
	public TransaccionMasivoDTO() {
	}

	/**
	 * Obtiene el valor para la propiedad circulo registral envio.
	 *
	 * @return El valor de la propiedad circulo registral envio
	 */
	public CirculoRegistralDTO getIcr_circuloRegistralEnvio() {
		return icr_circuloRegistralEnvio;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad circulo registral envio.
	 *
	 * @param acr_circuloRegistralEnvio el nuevo valor para la propiedad circulo
	 *                                  registral envio
	 */
	public void setIcr_circuloRegistralEnvio(CirculoRegistralDTO acr_circuloRegistralEnvio) {
		this.icr_circuloRegistralEnvio = acr_circuloRegistralEnvio;
	}

	/**
	 * Obtiene el valor para la propiedad archivo cargado.
	 *
	 * @return El valor de la propiedad archivo cargado
	 */
	public String getIs_archivoCargado() {
		return is_archivoCargado;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo cargado.
	 *
	 * @param as_archivoCargado el nuevo valor para la propiedad archivo cargado
	 */
	public void setIs_archivoCargado(String as_archivoCargado) {
		this.is_archivoCargado = as_archivoCargado;
	}

	/**
	 * Obtiene el valor para la propiedad lista matricula dto.
	 *
	 * @return El valor de la propiedad lista matricula dto
	 */
	public List<MatriculaDTO> getIlm_listaMatriculaDto() {
		return ilm_listaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad lista matricula dto.
	 *
	 * @param alm_listaMatriculaDto el nuevo valor para la propiedad lista matricula
	 *                              dto
	 */
	public void setIlm_listaMatriculaDto(List<MatriculaDTO> alm_listaMatriculaDto) {
		this.ilm_listaMatriculaDto = alm_listaMatriculaDto;
	}

	/**
	 * Obtiene el valor para la propiedad archivo cargado byte.
	 *
	 * @return El valor de la propiedad archivo cargado byte
	 */
	public byte[] getIb_archivoCargadoByte() {
		return ib_archivoCargadoByte;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad archivo cargado byte.
	 *
	 * @param ab_archivoCargadoByte el nuevo valor para la propiedad archivo cargado
	 *                              byte
	 */
	public void setIb_archivoCargadoByte(byte[] ab_archivoCargadoByte) {
		this.ib_archivoCargadoByte = ab_archivoCargadoByte;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO#getIs_envio()
	 */
	@Override
	public String getIs_envio() {
		return is_correoEnvio;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionGenericaDTO#getIb_envioMasivo()
	 */
	@Override
	public boolean getIb_envioMasivo() {
		return true;
	}

	/**
	 * Obtiene el valor para la propiedad matricula inicial.
	 *
	 * @return El valor de la propiedad matricula inicial
	 */
	public String getIs_matriculaInicial() {
		return is_matriculaInicial;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula inicial.
	 *
	 * @param as_matriculaInicial el nuevo valor para la propiedad matricula inicial
	 */
	public void setIs_matriculaInicial(String as_matriculaInicial) {
		this.is_matriculaInicial = as_matriculaInicial;
	}

	/**
	 * Obtiene el valor para la propiedad matricula final.
	 *
	 * @return El valor de la propiedad matricula final
	 */
	public String getIs_matriculaFinal() {
		return is_matriculaFinal;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad matricula final.
	 *
	 * @param as_matriculaFinal el nuevo valor para la propiedad matricula final
	 */
	public void setIs_matriculaFinal(String as_matriculaFinal) {
		this.is_matriculaFinal = as_matriculaFinal;
	}

	/**
	 * Obtiene el valor para la propiedad respuesta masivos dto.
	 *
	 * @return El valor de la propiedad respuesta masivos dto
	 */
	public RespuestaMasivosDTO getIrm_respuestaMasivosDto() {
		return irm_respuestaMasivosDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad respuesta masivos dto.
	 *
	 * @param arm_respuestaMasivosDto el nuevo valor para la propiedad respuesta
	 *                                masivos dto
	 */
	public void setIrm_respuestaMasivosDto(RespuestaMasivosDTO arm_respuestaMasivosDto) {
		this.irm_respuestaMasivosDto = arm_respuestaMasivosDto;
	}

	/**
	 * Obtiene el valor para la propiedad orip secuencia.
	 *
	 * @return El valor de la propiedad orip secuencia
	 */
	public String getIs_oripSecuencia() {
		return is_oripSecuencia;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad orip secuencia.
	 *
	 * @param as_oripSecuencia el nuevo valor para la propiedad orip secuencia
	 */
	public void setIs_oripSecuencia(String as_oripSecuencia) {
		this.is_oripSecuencia = as_oripSecuencia;
	}

	/**
	 * Obtiene el valor para la propiedad mapa numero listas salida matricula dto.
	 *
	 * @return El valor de la propiedad mapa numero listas salida matricula dto
	 */
	public Map<Integer,List<SalidaMatriculaDTO>> getImilsm_mapaNumeroListasSalidaMatriculaDto() {
		return imilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Cambia el valor de la propiedad imilsm mapa numero listas salida matricula
	 * dto.
	 *
	 * @param amilsm_mapaNumeroListasSalidaMatriculaDto el parametro mapa numero
	 *                                                  listas salida matricula dto
	 */
	public void setImilsm_mapaNumeroListasSalidaMatriculaDto(Map<Integer,List<SalidaMatriculaDTO>> amilsm_mapaNumeroListasSalidaMatriculaDto) {
		this.imilsm_mapaNumeroListasSalidaMatriculaDto = amilsm_mapaNumeroListasSalidaMatriculaDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad correo envio.
	 *
	 * @param as_correoEnvio el nuevo valor para la propiedad correo envio
	 */
	public void setIs_correoEnvio(String as_correoEnvio) {
		this.is_correoEnvio = as_correoEnvio;
	}

}
