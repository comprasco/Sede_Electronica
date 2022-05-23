/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: HistorialNotificacionesBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: HistorialNotificacionesBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigInteger;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.bachue.snr.formularios.dto.comun.ArchivoDinamicoDTO;
import com.bachue.snr.formularios.dto.comun.ISalidaGenericaDocumentoDTO;
import com.bachue.snr.formularios.dto.entrada.AsuntoHistorialNotificacionesDTO;
import com.bachue.snr.formularios.enums.EnumFormulario;
import com.bachue.snr.formularios.factory.DocumentosFactory;

import co.gov.supernotariado.bachue.sedeelectronica.admon.exception.ExcepcionesDatosEntrada;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IHistorialNotificacionesBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ArchivosDinamicosDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.HistorialNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ListaNotificacionesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.ejb.stateless.IHistorialNotificacionesWSBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoEntradaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoSalidaConsultarHistorialWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.mensajes.excepciones.EnumExcepcionesGenerales;
import co.gov.supernotariado.bachue.sedeelectronica.documentos.converters.ArchivoDinamicoConverter;
import co.gov.supernotariado.bachue.sedeelectronica.documentos.converters.AsuntoHistorialNotificacionesConverter;
import net.sf.jasperreports.engine.JRException;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Historial
 * Notificaciones. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "HistorialNotificacionesBusiness", mappedName = "HistorialNotificacionesBusiness")
@LocalBean
public class HistorialNotificacionesBusiness implements IHistorialNotificacionesBusiness {

	/**
	 * Atributo de instancia tipo IAlertaTierrasWSBusiness para definir la propiedad
	 * alerta tierra ws business.
	 */
	@EJB
	private IHistorialNotificacionesWSBusiness iihn_historialNotificacionesWSBusiness;

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IHistorialNotificacionesBusiness#
	 * consultarDocumentoAsuntoHistorialNotificaciones(co.gov.supernotariado.bachue.
	 * sedeelectronica.admon.persistence.dto.ListaNotificacionesDTO,
	 * co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.
	 * ArchivosDinamicosDTO, java.util.List)
	 */
	@Override
	public byte[] consultarDocumentoAsuntoHistorialNotificaciones(ListaNotificacionesDTO aln_listaNotificacionesDto,
			List<ArchivosDinamicosDTO> alad_archivos) throws JRException {

		AsuntoHistorialNotificacionesDTO lahn_asuntoHistorialNotificacionesDto = AsuntoHistorialNotificacionesConverter
				.dtoAFormularioDto(aln_listaNotificacionesDto);
		List<ArchivoDinamicoDTO> llad_archivos = ArchivoDinamicoConverter.listaDtoAFormularioDto(alad_archivos);

		lahn_asuntoHistorialNotificacionesDto
				.setLs_nombreFormulario(EnumFormulario.ASUNTO_HISTORIAL_NOTIFICACIONES.getIs_nombreFormulario());
		lahn_asuntoHistorialNotificacionesDto.setImagenes(llad_archivos);

		ISalidaGenericaDocumentoDTO lisgd_salidaArchivoDto = DocumentosFactory
				.generarFormulario(lahn_asuntoHistorialNotificacionesDto);

		byte[] lb_archivo;
		lb_archivo = lisgd_salidaArchivoDto.consultarDocumentoGenerado();
		return lb_archivo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.
	 * IAlertaTierrasBusiness#consultarTiposOficinaOrigen()
	 */
	@Override
	public TipoSalidaConsultarHistorialWSDTO consultarHistorial(UsuarioDTO aus_usuarioSesionDto,
			HistorialNotificacionesDTO ahn_historialNotificacionesDto) {
		TipoEntradaConsultarHistorialWSDTO ltech_tipoEntradaConsultarHistorialWsDto = new TipoEntradaConsultarHistorialWSDTO();
		ltech_tipoEntradaConsultarHistorialWsDto
				.setIbi_numeroTelefonoDestinatario(new BigInteger(aus_usuarioSesionDto.getIs_celular()));
		ltech_tipoEntradaConsultarHistorialWsDto
				.setIs_direccionCorreoElectronicoDestinatario(aus_usuarioSesionDto.getIs_correoElectronico());
		ltech_tipoEntradaConsultarHistorialWsDto.setId_fechaFinal(ahn_historialNotificacionesDto.getId_fechaFinal());
		ltech_tipoEntradaConsultarHistorialWsDto
				.setId_fechaInicial(ahn_historialNotificacionesDto.getId_fechaInicial());
		ltech_tipoEntradaConsultarHistorialWsDto.setIs_identificador(ahn_historialNotificacionesDto.getIs_numero());
		if (ahn_historialNotificacionesDto.getIs_pagina() == null) {
			ltech_tipoEntradaConsultarHistorialWsDto.setIs_pagina("");
		} else {
			ltech_tipoEntradaConsultarHistorialWsDto.setIs_pagina(ahn_historialNotificacionesDto.getIs_pagina());
		}
		ltech_tipoEntradaConsultarHistorialWsDto.setIs_tipoId(ahn_historialNotificacionesDto.getIs_filtro());

		TipoSalidaConsultarHistorialWSDTO ltsch_tipoSalidaConsultarHistorialWsDto = new TipoSalidaConsultarHistorialWSDTO();
		try {
			ltsch_tipoSalidaConsultarHistorialWsDto = iihn_historialNotificacionesWSBusiness
					.consultarHistorial(ltech_tipoEntradaConsultarHistorialWsDto);
		} catch (Exception ae_excepcion) {
			throw new ExcepcionesDatosEntrada(EnumExcepcionesGenerales.ERROR_TECNICO, ae_excepcion);
		}
		return ltsch_tipoSalidaConsultarHistorialWsDto;
	}

}
