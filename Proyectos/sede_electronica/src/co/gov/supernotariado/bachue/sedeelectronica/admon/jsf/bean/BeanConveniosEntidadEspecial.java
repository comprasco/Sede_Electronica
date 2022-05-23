/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: BeanConveniosEntidadEspecial.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean
 * Nombre del elemento: BeanConveniosEntidadEspecial
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IEntidadEspecialBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.facade.ejb.stateless.IUsuarioBusiness;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadEspecialDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.ConveniosEntidadesEspecialesDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.UsuarioSesionDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.ConvenioRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.admon.services.rsdto.SalidaObtenerConveniosEntidadRSDTO;
import co.gov.supernotariado.bachue.sedeelectronica.common.utils.UtilidadAutoridadUsuario;

/**
 * Clase tipo managed bean de la capa de UI (User Interface). <br>
 * Manipula operaciones y propiedades que permiten manejar <br>
 * la visualizacion de componentes JSF para Convenios entidad especial.
 *
 * @author Smartsoft Solutions S.A.S
 * @version 1.0
 */
@ManagedBean(name = "beanConveniosEntidadEspecial")
@ViewScoped
public class BeanConveniosEntidadEspecial implements Serializable {
	
	/**
	 * Generated serial version.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo de instancia tipo IEntidadEspecialBusiness para definir la propiedad
	 * entidad especial business.
	 */
	@EJB
	private IEntidadEspecialBusiness iiee_entidadEspecialBusiness;
	
	/**
	 * Atributo de instancia tipo IUsuarioBusiness para definir la propiedad usuario
	 * business.
	 */
	@EJB
	private IUsuarioBusiness iiub_usuarioBusiness;

	/**
	 * Atributo de instancia tipo SalidaObtenerConveniosEntidadRSDTO para definir la
	 * propiedad salida convenios entidad especial rs.
	 */
	private SalidaObtenerConveniosEntidadRSDTO isce_salidaConveniosEntidadEspecialRsDto;
	
	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadesEspecialesDTO para
	 * definir la propiedad convenios entidades especiales.
	 */
	private List<ConveniosEntidadesEspecialesDTO> ilcee_conveniosEntidadesEspecialesDto;
	
	/**
	 * Atributo de instancia tipo lista de ConveniosEntidadEspecialDTO para definir
	 * la propiedad convenios entidad especial.
	 */
	private List<ConveniosEntidadEspecialDTO> ilcee_conveniosEntidadEspecialDto;
	
	/**
	 * Atributo de instancia tipo UsuarioDTO para definir la propiedad usuario.
	 */
	private UsuarioDTO iu_usuarioDto;
	
	/**
	 * Atributo de instancia tipo UsuarioSesionDTO para definir la propiedad usuario
	 * sesion.
	 */
	private UsuarioSesionDTO ius_usuarioSesionDto;

	/**
	 * Inicializa el objeto.
	 */
	@PostConstruct
	public void init() {
		this.iu_usuarioDto = new UsuarioDTO();
		ius_usuarioSesionDto = UtilidadAutoridadUsuario.consultarUsuarioSesion();
		iu_usuarioDto = iiub_usuarioBusiness.consultarUsuario(ius_usuarioSesionDto.getIs_nombreUsuario());
		ilcee_conveniosEntidadEspecialDto = new ArrayList<>();
		ilcee_conveniosEntidadesEspecialesDto = new ArrayList<>();
		obtenerConveniosEntidadEspecial(iu_usuarioDto.getIee_entidadEspecial().getIs_codigoEntidad());
	}

	/**
	 * Metodo encargado de listar los convenios asociados a una entidad especial.
	 *
	 * @param as_codigoEntidad el parametro codigo entidad
	 * @return Resultado para obtener convenios entidad especial retornado como una
	 *         lista de ConveniosEntidadEspecialDTO
	 */
	public List<ConveniosEntidadEspecialDTO> obtenerConveniosEntidadEspecial(String as_codigoEntidad) {
		List<ConveniosEntidadEspecialDTO> llcee_conveniosEntidadEspecialDto = new ArrayList<>();
		isce_salidaConveniosEntidadEspecialRsDto = iiee_entidadEspecialBusiness
				.obtenerConveniosEntidadEspecial(as_codigoEntidad);
		for (ConvenioRSDTO lc_convenioRsDto : isce_salidaConveniosEntidadEspecialRsDto.getIc_convenios()
				.getIlc_convenio()) {
			ConveniosEntidadesEspecialesDTO lcee_conveniosEntidadesEspecialesDto;
			lcee_conveniosEntidadesEspecialesDto = (ConveniosEntidadesEspecialesDTO) GenericoDTO
					.toObject(lc_convenioRsDto.toString(), ConveniosEntidadesEspecialesDTO.class);
			ilcee_conveniosEntidadesEspecialesDto.add(lcee_conveniosEntidadesEspecialesDto);
			ConveniosEntidadEspecialDTO lcee_conveniosEntidadEspecial = new ConveniosEntidadEspecialDTO();
			lcee_conveniosEntidadEspecial.setIs_codigoConvenio(lc_convenioRsDto.getIs_codigoConvenio());
			lcee_conveniosEntidadEspecial.setIs_descripcionConvenio(lc_convenioRsDto.getIs_descripcionConvenio());
			lcee_conveniosEntidadEspecial.setIs_fechaInicio(lc_convenioRsDto.getIs_fechaInicio());
			lcee_conveniosEntidadEspecial.setIs_fechaFinalizacion(lc_convenioRsDto.getIs_fechaFinalizacion());
			llcee_conveniosEntidadEspecialDto.add(lcee_conveniosEntidadEspecial);
		}
		ilcee_conveniosEntidadEspecialDto = llcee_conveniosEntidadEspecialDto;
		return llcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidades especiales dto.
	 *
	 * @return El valor de la propiedad convenios entidades especiales dto
	 */
	public List<ConveniosEntidadesEspecialesDTO> getIlcee_conveniosEntidadesEspecialesDto() {
		return ilcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidades especiales
	 * dto.
	 *
	 * @param alcee_conveniosEntidadesEspecialesDto el nuevo valor para la propiedad
	 *                                              convenios entidades especiales
	 *                                              dto
	 */
	public void setIlcee_conveniosEntidadesEspecialesDto(
			List<ConveniosEntidadesEspecialesDTO> alcee_conveniosEntidadesEspecialesDto) {
		this.ilcee_conveniosEntidadesEspecialesDto = alcee_conveniosEntidadesEspecialesDto;
	}

	/**
	 * Obtiene el valor para la propiedad salida convenios entidad especial rs dto.
	 *
	 * @return El valor de la propiedad salida convenios entidad especial rs dto
	 */
	public SalidaObtenerConveniosEntidadRSDTO getIsce_salidaConveniosEntidadEspecialRsDto() {
		return isce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad salida convenios entidad especial
	 * rs dto.
	 *
	 * @param asce_salidaConveniosEntidadEspecialRsDto el nuevo valor para la
	 *                                                 propiedad salida convenios
	 *                                                 entidad especial rs dto
	 */
	public void setIsce_salidaConveniosEntidadEspecialRsDto(
			SalidaObtenerConveniosEntidadRSDTO asce_salidaConveniosEntidadEspecialRsDto) {
		this.isce_salidaConveniosEntidadEspecialRsDto = asce_salidaConveniosEntidadEspecialRsDto;
	}

	/**
	 * Obtiene el valor para la propiedad convenios entidad especial dto.
	 *
	 * @return El valor de la propiedad convenios entidad especial dto
	 */
	public List<ConveniosEntidadEspecialDTO> getIlcee_conveniosEntidadEspecialDto() {
		return ilcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad convenios entidad especial dto.
	 *
	 * @param alcee_conveniosEntidadEspecialDto el nuevo valor para la propiedad
	 *                                          convenios entidad especial dto
	 */
	public void setIlcee_conveniosEntidadEspecialDto(
			List<ConveniosEntidadEspecialDTO> alcee_conveniosEntidadEspecialDto) {
		this.ilcee_conveniosEntidadEspecialDto = alcee_conveniosEntidadEspecialDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario dto.
	 *
	 * @return El valor de la propiedad usuario dto
	 */
	public UsuarioDTO getIu_usuarioDto() {
		return iu_usuarioDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario dto.
	 *
	 * @param au_usuarioDto el nuevo valor para la propiedad usuario dto
	 */
	public void setIu_usuarioDto(UsuarioDTO au_usuarioDto) {
		this.iu_usuarioDto = au_usuarioDto;
	}

	/**
	 * Obtiene el valor para la propiedad usuario sesion dto.
	 *
	 * @return El valor de la propiedad usuario sesion dto
	 */
	public UsuarioSesionDTO getIus_usuarioSesionDto() {
		return ius_usuarioSesionDto;
	}

	/**
	 * Cambia/actualiza el valor para la propiedad usuario sesion dto.
	 *
	 * @param aus_usuarioSesionDto el nuevo valor para la propiedad usuario sesion
	 *                             dto
	 */
	public void setIus_usuarioSesionDto(UsuarioSesionDTO aus_usuarioSesionDto) {
		this.ius_usuarioSesionDto = aus_usuarioSesionDto;
	}

}
