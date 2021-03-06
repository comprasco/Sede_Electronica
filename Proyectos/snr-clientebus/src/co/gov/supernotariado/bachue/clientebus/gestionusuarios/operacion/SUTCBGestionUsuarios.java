
package co.gov.supernotariado.bachue.clientebus.gestionusuarios.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obteneraccesosporrol.TipoEntradaObtenerAccesosPorRol;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obteneraccesosporrol.TipoSalidaObtenerAccesosPorRol;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad.TipoEntradaObtenerConveniosEntidad;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad.TipoSalidaObtenerConveniosEntidad;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerentidadesconvenio.EntradaObtenerEntidadesConvenio;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerentidadesconvenio.TipoSalidaObtenerEntidadesConvenio;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenermodulosporrol.TipoEntradaObtenerModulosPorRol;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenermodulosporrol.TipoSalidaObtenerModulosPorRol;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerorips.EntradaObtenerORIPs;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerorips.TipoSalidaObtenerORIPs;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerroles.EntradaObtenerRoles;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerroles.TipoSalidaObtenerRoles;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.TipoEntradaObtenerRolesComponente;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.TipoSalidaObtenerRolesComponente;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerusuariosrolorip.TipoEntradaObtenerUsuariosRolOrip;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerusuariosrolorip.TipoSalidaObtenerUsuariosRolOrip;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario.TipoEntradaRegistrarUsuario;
import co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario.TipoSalidaRegistrarUsuario;
import co.gov.supernotariado.bachue.clientebus.types.obtenerrolesusuario.TipoEntradaObtenerRolesUsuario;
import co.gov.supernotariado.bachue.clientebus.types.obtenerrolesusuario.TipoSalidaObtenerRolesUsuario;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SUT_CB_GestionUsuarios", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obteneraccesosporrol.ObtenerAccesosPorRolObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obteneraccesosporrol.ObtenerAccesosPorRolObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerconveniosentidad.ObtenerConveniosEntidadObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerentidadesconvenio.ObtenerEntidadesConvenioObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenermodulosporrol.ObtenerModulosPorRolObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerorips.EntradaObtenerORIPs.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerroles.ObtenerRolesObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerrolescomponente.ObtenerRolesComponenteObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.types.obtenerrolesusuario.ObtenerRolesUsuarioObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.obtenerusuariosrolorip.ObtenerUsuariosRolOripObjectFactory.class,
	co.gov.supernotariado.bachue.clientebus.gestionusuarios.types.registrarusuario.RegistrarUsuarioObjectFactory.class
})
public interface SUTCBGestionUsuarios {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerroles.v1.TipoSalidaObtenerRoles
     */
    @WebMethod(operationName = "ObtenerRoles", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerRoles")
    @WebResult(name = "salidaObtenerRoles", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1", partName = "salida")
    public TipoSalidaObtenerRoles obtenerRoles(
        @WebParam(name = "entradaObtenerRoles", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerroles/v1", partName = "entrada")
        EntradaObtenerRoles entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerorips.v1.TipoSalidaObtenerORIPs
     */
    @WebMethod(operationName = "ObtenerORIPs", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerORIPs")
    @WebResult(name = "salidaObtenerORIPs", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerorips/v1", partName = "salida")
    public TipoSalidaObtenerORIPs obtenerORIPs(
        @WebParam(name = "entradaObtenerORIPs", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerorips/v1", partName = "entrada")
        EntradaObtenerORIPs entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.registrarusuario.v1.TipoSalidaRegistrarUsuario
     */
    @WebMethod(operationName = "RegistrarUsuario", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/RegistrarUsuario")
    @WebResult(name = "salidaRegistrarUsuario", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", partName = "salida")
    public TipoSalidaRegistrarUsuario registrarUsuario(
        @WebParam(name = "entradaRegistrarUsuario", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/registrarusuario/v1", partName = "entrada")
        TipoEntradaRegistrarUsuario entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerentidadesconvenio.v1.TipoSalidaObtenerEntidadesConvenio
     */
    @WebMethod(operationName = "ObtenerEntidadesConvenio", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerEntidadesConvenio")
    @WebResult(name = "salidaObtenerEntidadesConvenio", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerentidadesconvenio/v1", partName = "salida")
    public TipoSalidaObtenerEntidadesConvenio obtenerEntidadesConvenio(
        @WebParam(name = "entradaObtenerEntidadesConvenio", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerentidadesconvenio/v1", partName = "entrada")
        EntradaObtenerEntidadesConvenio entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerconveniosentidad.v1.TipoSalidaObtenerConveniosEntidad
     */
    @WebMethod(operationName = "ObtenerConveniosEntidad", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerConveniosEntidad")
    @WebResult(name = "salidaObtenerConveniosEntidad", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", partName = "salida")
    public TipoSalidaObtenerConveniosEntidad obtenerConveniosEntidad(
        @WebParam(name = "entradaObtenerConveniosEntidad", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerconveniosentidad/v1", partName = "entrada")
        TipoEntradaObtenerConveniosEntidad entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolesusuario.v1.TipoSalidaObtenerRolesUsuario
     */
    @WebMethod(operationName = "ObtenerRolesUsuario", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerRolesUsuario")
    @WebResult(name = "salidaObtenerRolesUsuario", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", partName = "salida")
    public TipoSalidaObtenerRolesUsuario obtenerRolesUsuario(
        @WebParam(name = "entradaObtenerRolesUsuario", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolesusuario/v1", partName = "entrada")
        TipoEntradaObtenerRolesUsuario entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerrolescomponente.v1.TipoSalidaObtenerRolesComponente
     */
    @WebMethod(operationName = "ObtenerRolesComponente", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerRolesComponente")
    @WebResult(name = "salidaObtenerRolesComponente", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", partName = "salida")
    public TipoSalidaObtenerRolesComponente obtenerRolesComponente(
        @WebParam(name = "entradaObtenerRolesComponente", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerrolescomponente/v1", partName = "entrada")
        TipoEntradaObtenerRolesComponente entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenerusuariosrolorip.v1.TipoSalidaObtenerUsuariosRolOrip
     */
    @WebMethod(operationName = "ObtenerUsuariosRolOrip", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerUsuariosRolOrip")
    @WebResult(name = "salidaObtenerUsuariosRolOrip", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", partName = "salida")
    public TipoSalidaObtenerUsuariosRolOrip obtenerUsuariosRolOrip(
        @WebParam(name = "entradaObtenerUsuariosRolOrip", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenerusuariosrolorip/v1", partName = "entrada")
        TipoEntradaObtenerUsuariosRolOrip entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obteneraccesosporrol.v1.TipoSalidaObtenerAccesosPorRol
     */
    @WebMethod(operationName = "ObtenerAccesosPorRol", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerAccesosPorRol")
    @WebResult(name = "salidaObtenerAccesosPorRol", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", partName = "salida")
    public TipoSalidaObtenerAccesosPorRol obtenerAccesosPorRol(
        @WebParam(name = "entradaObtenerAccesosPorRol", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obteneraccesosporrol/v1", partName = "entrada")
        TipoEntradaObtenerAccesosPorRol entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.cb.gestionusuarios.obtenermodulosporrol.v1.TipoSalidaObtenerModulosPorRol
     */
    @WebMethod(operationName = "ObtenerModulosPorRol", action = "https://www.supernotariado.gov.co/services/bachue/cb/gestionusuarios/v1/ObtenerModulosPorRol")
    @WebResult(name = "salidaObtenerModulosPorRol", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", partName = "salida")
    public TipoSalidaObtenerModulosPorRol obtenerModulosPorRol(
        @WebParam(name = "entradaObtenerModulosPorRol", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestionusuarios/obtenermodulosporrol/v1", partName = "entrada")
        TipoEntradaObtenerModulosPorRol entrada);

}
