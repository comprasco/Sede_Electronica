/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: FormularioCuentaCupoConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.documentos.converters
 * Nombre del elemento: FormularioCuentaCupoConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.documentos.converters;

import com.bachue.snr.formularios.dto.entrada.AsuntoHistorialNotificacionesDTO;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaNotificacionesDTO;

/**
 * Clase auxiliar(converter) que permite transformar un Value Object (VO, objeto
 * que recibe el cliente de servicios) a un objeto WsDto (Objeto de
 * transferencia de datos de servicio web), y viceversa. <br>
 * Contiene operaciones de transformacion para el VO y el WsDto Formulario
 * historial notificaciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
public class AsuntoHistorialNotificacionesConverter {

	/**
	 * Construye una nueva instancia/objeto de la clase
	 * AsuntoHistorialNotificacionesConverter.
	 */
	private AsuntoHistorialNotificacionesConverter() {
		// Constructor vacio de la clase
	}

	/**
	 * Dto A formulario dto.
	 *
	 * @param aln_listaNotificacionesDto el parametro formulario
	 *                                               modificar cuenta cupo dto
	 * @param au_usuarioDto                          el parametro usuario dto
	 * @return Resultado para dto A formulario dto retornado como
	 *         FormularioModificacionCuentaCupoDTO
	 */
	public static AsuntoHistorialNotificacionesDTO dtoAFormularioDto(
			ListaNotificacionesDTO aln_listaNotificacionesDto) {

		AsuntoHistorialNotificacionesDTO lahn_asuntoHistorialNotificacionesDto = new AsuntoHistorialNotificacionesDTO();
		lahn_asuntoHistorialNotificacionesDto.setDe(aln_listaNotificacionesDto.getIs_de());
		lahn_asuntoHistorialNotificacionesDto.setPara(aln_listaNotificacionesDto.getIs_para());
		lahn_asuntoHistorialNotificacionesDto.setAsunto(aln_listaNotificacionesDto.getIs_asunto());
		lahn_asuntoHistorialNotificacionesDto.setFecha(aln_listaNotificacionesDto.getId_fechaAsunto());
		lahn_asuntoHistorialNotificacionesDto.setAdjunto(aln_listaNotificacionesDto.getIs_adjunto());
		lahn_asuntoHistorialNotificacionesDto.setTexto(aln_listaNotificacionesDto.getIs_texto());

		return lahn_asuntoHistorialNotificacionesDto;
	}

}
