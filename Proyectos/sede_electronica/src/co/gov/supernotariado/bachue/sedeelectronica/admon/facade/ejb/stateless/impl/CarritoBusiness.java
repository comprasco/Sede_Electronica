/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: CarritoBusiness.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl
 * Nombre del elemento: CarritoBusiness
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IAsociacionUsuarioPersonaJuridicaBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ITipoProcesoBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoTransaccionVigenteDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.PersonaDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.TransaccionIndividualDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.ICarritoDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.ejb.dao.stateless.IUsuarioDAO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CarritoHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.CarritoTransaccionVigenteHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.helper.PersonaHelper;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.AsociacionUsuarioPersonaJuridica;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Carrito;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Persona;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.model.Usuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumBoolean;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso;
import co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoServicio;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.GeneradorUuid;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAuditoria;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadFecha;

/**
 * Clase tipo EJB (Enterprise Java Bean) de la capa de negocio. <br>
 * Contiene la implementacion logica de las operaciones del recurso Carrito.
 * <br>
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@Stateless(name = "CarritoBusiness", mappedName = "CarritoBusiness")
@LocalBean
public class CarritoBusiness implements ICarritoBusiness{

	/**
	 * Atributo de instancia tipo ICarritoDAO para definir la propiedad carrito dao.
	 */
	@EJB
	private ICarritoDAO iic_carritoDao;
	
	/**
	 * Atributo de instancia tipo ITipoProcesoBusiness para definir la propiedad
	 * tipo proceso business.
	 */
	@EJB
	private ITipoProcesoBusiness iitp_tipoProcesoBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioDAO para definir la propiedad usuario dao.
	 */
	@EJB
	private IUsuarioDAO iiu_usuarioDao;
	
	/**
	 * Atributo de instancia tipo IAsociacionUsuarioPersonaJuridicaBusiness para
	 * definir la propiedad asociacion persona juridica business.
	 */
	@EJB
	private IAsociacionUsuarioPersonaJuridicaBusiness iiaupj_asociacionPersonaJuridicaBusiness;

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#guardarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO)
	 */
	@Override
	public Boolean guardarCarrito(CarritoDTO ac_carritoDto)
	{
		CarritoDTO lc_carritoDto = consultarTransaccion(ac_carritoDto);
		ac_carritoDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());

		if(lc_carritoDto != null) {
			lc_carritoDto.setIs_modeloTransaccionVigente(ac_carritoDto.getIs_modeloTransaccionVigente());
			lc_carritoDto.setIs_activo(ac_carritoDto.getIs_activo());
			lc_carritoDto = (CarritoDTO) UtilidadAuditoria.adicionarDatosModificacion(lc_carritoDto);
			return iic_carritoDao.actualizarCarrito(CarritoHelper.dtoAEntidadCompleto(lc_carritoDto, new Carrito()));
		}
		ac_carritoDto = (CarritoDTO) UtilidadAuditoria.adicionarDatosCreacion(ac_carritoDto);
		ac_carritoDto.setIs_uuidUrlCarrito(GeneradorUuid.generaUuid());
		return iic_carritoDao.crearCarrito(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#guardarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO, co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public Boolean guardarTransaccionVigente(ITransaccionDTO ait_transaccionDto,EnumTipoProceso aetp_enumTipo)
	{
		CarritoDTO lc_carritoDto = cargarCarritoTransaccion(ait_transaccionDto,aetp_enumTipo);
		lc_carritoDto.setIs_modeloTransaccionVigente(ait_transaccionDto.toString());
		lc_carritoDto.setIs_activo(EnumBoolean.CHAR_S.getIs_codigo());
		return guardarCarrito(lc_carritoDto);
	}

	/**
	 * Cargar carrito transaccion.
	 *
	 * @param ait_transaccionDto el parametro transaccion dto
	 * @param aetp_enumTipo      el parametro enum tipo
	 * @return Resultado para cargar carrito transaccion retornado como CarritoDTO
	 */
	private CarritoDTO cargarCarritoTransaccion(ITransaccionDTO ait_transaccionDto,EnumTipoProceso aetp_enumTipo) {
		CarritoDTO lc_carritoDto = new CarritoDTO();
		lc_carritoDto.setIs_codigoTipoSubServicio(ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoSubServicio());
		lc_carritoDto.setIs_codigoTipoServicio(ait_transaccionDto.getIdc_detalleCatalogoDto().getIs_codigoServicio());
		lc_carritoDto.setIs_modo(ait_transaccionDto.getIemts_enumModoTipoServicio().getIs_codigo());
		if(aetp_enumTipo != null) {
			lc_carritoDto.setItp_tipoProcesoDto(iitp_tipoProcesoBusiness.consultarTipoProcesoPorCodigo(aetp_enumTipo.getIs_codigo()));
		}
		lc_carritoDto.setIu_usuarioDto(ait_transaccionDto.getIp_personaDto().getIu_usuarioDto());
		lc_carritoDto.setIs_idAsosiacion(ait_transaccionDto.getIs_idAsociacion());
		return lc_carritoDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#cancelarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO, co.gov.supernotariado.bachue.sedeelectronica.common.enums.EnumTipoProceso)
	 */
	@Override
	public Boolean cancelarCarrito(ITransaccionDTO ait_transaccionDto,EnumTipoProceso aetp_enumTipo)
	{
		CarritoDTO lc_carritoCargadoDto = cargarCarritoTransaccion(ait_transaccionDto,aetp_enumTipo);
		CarritoDTO lc_carritoDto = consultarTransaccionVigente(lc_carritoCargadoDto);
		if(lc_carritoDto != null) {
			lc_carritoDto.setIs_activo(EnumBoolean.CHAR_N.getIs_codigo());
			return iic_carritoDao.actualizarCarrito(CarritoHelper.dtoAEntidadCompleto(lc_carritoDto, new Carrito()));
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#eliminarCarrito(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO)
	 */
	@Override
	public Boolean eliminarCarrito(CarritoDTO ac_carritoDto)
	{
		return iic_carritoDao.eliminarCarrito(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO)
	 */
	@Override
	public CarritoDTO consultarTransaccionVigente(CarritoDTO ac_carritoDto) {
		Carrito lc_carrito;
		if(ac_carritoDto.getIs_idAsosiacion() != null && !ac_carritoDto.getIs_idAsosiacion().equals(""))
		{
			lc_carrito = iic_carritoDao.consultarTransacionVigenteConAsociacion(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
		}else {
			lc_carrito = iic_carritoDao.consultarTransacionVigente(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
		}
		if (lc_carrito == null) {
			return null;
		}			
		return CarritoHelper.entidadADtoCompleto(lc_carrito);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarCarrito(java.lang.String)
	 */
	@Override
	public CarritoDTO consultarCarrito(String as_idCarrito) {
		Carrito lc_carrito = iic_carritoDao.consultarTransacionVigente(as_idCarrito);	
		if(lc_carrito == null)
			return null;
		return CarritoHelper.entidadADtoCompleto(lc_carrito);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarTransaccionVigente(java.lang.String)
	 */
	@Override
	public CarritoTransaccionVigenteDTO consultarTransaccionVigente(String as_idCarrito) {
		CarritoDTO lc_carritoDtoRespuesta = consultarCarrito(as_idCarrito);
		if(lc_carritoDtoRespuesta == null)
			return null;
		CarritoTransaccionVigenteDTO lct_carritoTransaccionDto;
		lct_carritoTransaccionDto = CarritoTransaccionVigenteHelper.carritoCarritoDtoATransaccionVigenteDto(lc_carritoDtoRespuesta);
		return lct_carritoTransaccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.CarritoDTO)
	 */
	@Override
	public CarritoDTO consultarTransaccion(CarritoDTO ac_carritoDto) {

		Carrito lc_carrito;
		if(ac_carritoDto.getIs_idAsosiacion() != null && !ac_carritoDto.getIs_idAsosiacion().equals(""))
		{
			lc_carrito = iic_carritoDao.consultarTransacionConAsociacion(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
		}else {
			lc_carrito = iic_carritoDao.consultarTransacion(CarritoHelper.dtoAEntidadCompleto(ac_carritoDto, new Carrito()));
		}
		if (lc_carrito == null) {
			return null;
		}			
		return CarritoHelper.entidadADtoCompleto(lc_carrito);
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarTransacciones()
	 */
	@Override
	public Map<String, List<CarritoTransaccionVigenteDTO>> consultarTransacciones()
	{
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		List<Carrito> llc_listaCarrito;
		if(lus_usuarioSesionDto.getIs_idAsociacion() != null && !lus_usuarioSesionDto.getIs_idAsociacion().equals(""))
		{
			llc_listaCarrito = this.iic_carritoDao.consultarTransacionesConAsociacion(lu_usuarioDto.getIs_id(),lus_usuarioSesionDto.getIs_idAsociacion());
		}else {
			llc_listaCarrito = this.iic_carritoDao.consultarTransaciones(lu_usuarioDto.getIs_id());
		}
		List<CarritoTransaccionVigenteDTO> llctv_carritoTransaccionVigenteDto = CarritoTransaccionVigenteHelper.listaCarritoDtoACarritoTransaccionVigenteDto(
				CarritoHelper.listaEntidadADtoCompleto(llc_listaCarrito));

		Map<String, List<CarritoTransaccionVigenteDTO>> lmslctv_mapaStringListaCarritoTransaccionVigente = new HashMap<>();

		for(EnumTipoServicio lets_enumTipoServicio :EnumTipoServicio.consultarServicios())
		{
			List<CarritoTransaccionVigenteDTO> llctv_listaCarritoTransaccionVigenteDto = new ArrayList<>();
			for(CarritoTransaccionVigenteDTO lc_carritoTransaccionVigenteDto :llctv_carritoTransaccionVigenteDto)
			{
				if(lc_carritoTransaccionVigenteDto.getIs_codigoTipoServicio().equals(lets_enumTipoServicio.getIs_codigo()))
				{	
					llctv_listaCarritoTransaccionVigenteDto.add(lc_carritoTransaccionVigenteDto);
				}
			}

			lmslctv_mapaStringListaCarritoTransaccionVigente.put(lets_enumTipoServicio.getIs_nombreLegible(), llctv_listaCarritoTransaccionVigenteDto);
		}

		return lmslctv_mapaStringListaCarritoTransaccionVigente;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarNumeroTransaccionesVigentes()
	 */
	@Override
	public int consultarNumeroTransaccionesVigentes() {
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		UsuarioDTO lu_usuarioDto = new UsuarioDTO();
		lu_usuarioDto.setIs_id(lus_usuarioSesionDto.getIs_idUsuario());
		int li_numeroTransacciones; 
		if(lus_usuarioSesionDto.getIs_idAsociacion() != null && !lus_usuarioSesionDto.getIs_idAsociacion().equals(""))
		{
			li_numeroTransacciones = this.iic_carritoDao.consultarNumeroTransacionesVigentesConAsociacion(lu_usuarioDto.getIs_id(),lus_usuarioSesionDto.getIs_idAsociacion());
		}else {
			li_numeroTransacciones = this.iic_carritoDao.consultarNumeroTransacionesVigentes(lu_usuarioDto.getIs_id());
		}
		return li_numeroTransacciones;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#consultarTransaccionVigente(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public ITransaccionDTO consultarTransaccionVigente(ITransaccionDTO ait_transaccionDto)
	{
		CarritoDTO lc_carritoDto = cargarCarritoTransaccion(ait_transaccionDto,null);
		CarritoDTO lc_carritoDtoRespuesta = consultarTransaccionVigente(lc_carritoDto);
		if(lc_carritoDtoRespuesta == null)
			return null;
		TransaccionIndividualDTO lt_transaccionDto;
		lt_transaccionDto = (TransaccionIndividualDTO) GenericoDTO.toObject(lc_carritoDtoRespuesta.getIs_modeloTransaccionVigente(),TransaccionIndividualDTO.class);
		lt_transaccionDto.setIs_carritoVigente(lc_carritoDtoRespuesta.getIs_uuidUrlCarrito());
		return lt_transaccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#iniciarTransaccion(co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.interfaces.ITransaccionDTO)
	 */
	@Override
	public ITransaccionDTO iniciarTransaccion(ITransaccionDTO ait_transaccionDto)
	{		
		PersonaDTO lp_personaDto;
		Usuario lu_usuario;
		UsuarioSesionDTO lus_usuarioSesionDto;
		lus_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		lu_usuario = iiu_usuarioDao.consultarUsuario(lus_usuarioSesionDto.getIs_nombreUsuario());
		Persona lp_persona  = new Persona();
		if(lus_usuarioSesionDto.getIs_idAsociacion() != null)
		{
			AsociacionUsuarioPersonaJuridica laupj_asociacionUsuarioPersonaJuridica = iiaupj_asociacionPersonaJuridicaBusiness.consultarPorId(lus_usuarioSesionDto.getIs_idAsociacion());
			lp_persona = laupj_asociacionUsuarioPersonaJuridica.getPersonaJuridica().getPersona();
			lp_persona.setPersonaJuridica(laupj_asociacionUsuarioPersonaJuridica.getPersonaJuridica());
		}else if(lu_usuario.getPersona() != null ) {
			lp_persona = lu_usuario.getPersona();
		}else if(lu_usuario.getPersonaJuridica() != null)
		{
			lp_persona = lu_usuario.getPersonaJuridica().getPersona();
			lp_persona.setUsuario(lu_usuario);
		}
		lp_personaDto = PersonaHelper.entidadADtoCompletoConPersonaJuridicaSinDocumentos(lp_persona);
		ait_transaccionDto.setIbd_valorTotal(new BigDecimal(0));
		ait_transaccionDto.setIp_personaDto(lp_personaDto);
		ait_transaccionDto.setIs_idAsociacion(lus_usuarioSesionDto.getIs_idAsociacion());
		return ait_transaccionDto;
	}

	/* (non-Javadoc)
	 * @see co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.ICarritoBusiness#eliminarCarritoMasivo(java.lang.Integer)
	 */
	@Override
	public Boolean eliminarCarritoMasivo(Integer ai_cantidadDias) {
	
		Calendar lc_calendario = Calendar.getInstance();
		lc_calendario.setTime(new Date());
		lc_calendario.add(Calendar.DAY_OF_YEAR, ai_cantidadDias);
		Date ld_fecahActual = UtilidadFecha.restarDias(ai_cantidadDias, new Date());
				
		return iic_carritoDao.eliminarCarritoMasivo(ld_fecahActual);
	}

}
