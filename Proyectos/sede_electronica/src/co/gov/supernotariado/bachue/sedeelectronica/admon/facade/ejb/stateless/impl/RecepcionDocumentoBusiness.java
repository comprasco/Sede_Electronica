package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IRecepcionDocumentoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionRecepcionDocumentoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.wsdto.TipoCriterioWSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumConstantesDevoluciones;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso recepcion de
 * documentos. <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "RecepcionDocumentoBusiness", mappedName = "RecepcionDocumentoBusiness")
@LocalBean
public class RecepcionDocumentoBusiness extends GenericoTransaccionModeloBusiness
		implements IRecepcionDocumentoBusiness {

	@Override
	public String generarSolicitud(TransaccionRecepcionDocumentoDTO atrd_transaccionRecepcionDocumentoDto) {

		List<TipoCriterioWSDTO> lltc_tipoCriterio = new ArrayList<>();
		TipoCriterioWSDTO ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();

		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TURNO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(
				atrd_transaccionRecepcionDocumentoDto.getIssr_seguimientoSolicitudesRespuestaDto().getIs_numeroTurno());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.MOTIVO_SOLICITUD.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_motivo());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.CODIGO_ENTIDAD_FINANCIERA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_entidadBancaria());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TIPO_CUENTA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_tipoCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.NUMERO_CUENTA.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_numCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_TIPO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_tipoCuenta());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_NUMERO_DOCUMENTO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor(atrd_transaccionRecepcionDocumentoDto.getIs_numDoc());
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_NOMBRE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((atrd_transaccionRecepcionDocumentoDto.getIs_primerNombre() != null
				? atrd_transaccionRecepcionDocumentoDto.getIs_primerNombre()
				: ""));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_NOMBRE.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((atrd_transaccionRecepcionDocumentoDto.getIs_segundoNombre() != null
				? atrd_transaccionRecepcionDocumentoDto.getIs_segundoNombre()
				: ""));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_PRIMER_APELLIDO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((atrd_transaccionRecepcionDocumentoDto.getIs_primerApellido() != null
				? atrd_transaccionRecepcionDocumentoDto.getIs_primerApellido()
				: ""));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto
				.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_SEGUNDO_APELLIDO.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((atrd_transaccionRecepcionDocumentoDto.getIs_segundoApellido() != null
				? atrd_transaccionRecepcionDocumentoDto.getIs_segundoApellido()
				: ""));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);

		ltc_tipoCriterioWsDto = new TipoCriterioWSDTO();
		ltc_tipoCriterioWsDto.setIs_codigo(EnumConstantesDevoluciones.TITULAR_CUENTA_RAZON_SOCIAL.getIs_nombreCampo());
		ltc_tipoCriterioWsDto.setIs_valor((atrd_transaccionRecepcionDocumentoDto.getIs_razonSocial() != null
				? atrd_transaccionRecepcionDocumentoDto.getIs_razonSocial()
				: ""));
		lltc_tipoCriterio.add(ltc_tipoCriterioWsDto);
		return generarSolicitudGenerico(atrd_transaccionRecepcionDocumentoDto, lltc_tipoCriterio);

	}


}
