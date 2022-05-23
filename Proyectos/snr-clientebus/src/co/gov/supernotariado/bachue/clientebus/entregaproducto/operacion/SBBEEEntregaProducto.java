
package co.gov.supernotariado.bachue.clientebus.entregaproducto.operacion;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.ObtenerProductoObjectFactory;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.TipoEntradaObtenerProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerproducto.TipoSalidaObtenerProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.ObtenerReciboCajaObjectFactory;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.TipoEntradaObtenerReciboCaja;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerrecibocaja.TipoSalidaObtenerReciboCaja;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.ObtenerTurnosRefPagoObjectFactory;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.TipoEntradaObtenerTurnosRefPago;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.obtenerturnosrefpago.TipoSalidaObtenerTurnosRefPago;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.TipoEntradaVerificarProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.TipoSalidaVerificarProducto;
import co.gov.supernotariado.bachue.clientebus.entregaproducto.types.verificarproducto.VerificarProductoObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SBB_EE_EntregaProducto", targetNamespace = "https://www.supernotariado.gov.co/services/bachue/ee/entregaproducto/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	ObtenerProductoObjectFactory.class,
	ObtenerReciboCajaObjectFactory.class,
	ObtenerTurnosRefPagoObjectFactory.class,
	VerificarProductoObjectFactory.class
})
public interface SBBEEEntregaProducto {


    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.verificarproducto.v1.TipoSalidaVerificarProducto
     */
    @WebMethod(operationName = "VerificarProducto", action = "https://www.supernotariado.gov.co/services/bachue/ee/entregaproducto/v1/VerificarProducto")
    @WebResult(name = "salidaVerificarProducto", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", partName = "salida")
    public TipoSalidaVerificarProducto verificarProducto(
        @WebParam(name = "entradaVerificarProducto", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/verificarproducto/v1", partName = "entrada")
        TipoEntradaVerificarProducto entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerproducto.v1.TipoSalidaObtenerProducto
     */
    @WebMethod(operationName = "ObtenerProducto", action = "https://www.supernotariado.gov.co/services/bachue/ee/entregaproducto/v1/ObtenerProducto")
    @WebResult(name = "salidaObtenerProducto", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", partName = "salida")
    public TipoSalidaObtenerProducto obtenerProducto(
        @WebParam(name = "entradaObtenerProducto", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerproducto/v1", partName = "entrada")
        TipoEntradaObtenerProducto entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerturnosrefpago.v1.TipoSalidaObtenerTurnosRefPago
     */
    @WebMethod(operationName = "ObtenerTurnosRefPago", action = "https://www.supernotariado.gov.co/services/bachue/ee/entregaproducto/v1/ObtenerTurnosRefPago")
    @WebResult(name = "salidaObtenerTurnosRefPago", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", partName = "salida")
    public TipoSalidaObtenerTurnosRefPago obtenerTurnosRefPago(
        @WebParam(name = "entradaObtenerTurnosRefPago", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerturnosrefpago/v1", partName = "entrada")
        TipoEntradaObtenerTurnosRefPago entrada);

    /**
     * 
     * @param entrada
     * @return
     *     returns https.www_supernotariado_gov_co.schemas.bachue.ee.entregaproducto.obtenerrecibocaja.v1.TipoSalidaObtenerReciboCaja
     */
    @WebMethod(operationName = "ObtenerReciboCaja", action = "https://www.supernotariado.gov.co/services/bachue/ee/entregaproducto/v1/ObtenerReciboCaja")
    @WebResult(name = "salidaObtenerReciboCaja", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", partName = "salida")
    public TipoSalidaObtenerReciboCaja obtenerReciboCaja(
        @WebParam(name = "entradaObtenerReciboCaja", targetNamespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/entregaproducto/obtenerrecibocaja/v1", partName = "entrada")
        TipoEntradaObtenerReciboCaja entrada);

}