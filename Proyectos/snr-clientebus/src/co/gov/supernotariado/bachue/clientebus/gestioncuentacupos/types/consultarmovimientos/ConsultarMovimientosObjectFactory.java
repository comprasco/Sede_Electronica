
package co.gov.supernotariado.bachue.clientebus.gestioncuentacupos.types.consultarmovimientos;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarmovimientos.v1 package. 
 * <p>An ConsultaActosTurnoObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ConsultarMovimientosObjectFactory {

	private static final String CS_QNAME = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1";
    private static final QName CQN_ENTRADA_CONSULTAR_MOVIMIENTOS = new QName(CS_QNAME, "entradaConsultarMovimientos");
    private static final QName CQN_SALIDA_CONSULTAR_MOVIMIENTOS = new QName(CS_QNAME, "salidaConsultarMovimientos");
    private static final QName CQN_TIPO_NOTA_CREDITO_CMO_VALOR = new QName(CS_QNAME, "valor");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.cb.gestioncuentacupos.consultarmovimientos.v1
     * 
     */
    public ConsultarMovimientosObjectFactory() {
    	// constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMovimientos }
     * 
     */
    public TipoSalidaConsultarMovimientos createTipoSalidaConsultarMovimientos() {
        return new TipoSalidaConsultarMovimientos();
    }

    /**
     * Create an instance of {@link TipoEntradaConsultarMovimientos }
     * 
     */
    public TipoEntradaConsultarMovimientos createTipoEntradaConsultarMovimientos() {
        return new TipoEntradaConsultarMovimientos();
    }

    /**
     * Create an instance of {@link TipoMovimientoCMO }
     * 
     */
    public TipoMovimientoCMO createTipoMovimientoCMO() {
        return new TipoMovimientoCMO();
    }

    /**
     * Create an instance of {@link TipoAdminCMI }
     * 
     */
    public TipoAdminCMI createTipoAdminCMI() {
        return new TipoAdminCMI();
    }

    /**
     * Create an instance of {@link TipoReciboCajaCMO }
     * 
     */
    public TipoReciboCajaCMO createTipoReciboCajaCMO() {
        return new TipoReciboCajaCMO();
    }

    /**
     * Create an instance of {@link TipoNotaCreditoCMO }
     * 
     */
    public TipoNotaCreditoCMO createTipoNotaCreditoCMO() {
        return new TipoNotaCreditoCMO();
    }

    /**
     * Create an instance of {@link TipoSalidaConsultarMovimientos.Movimientos }
     * 
     */
    public TipoSalidaConsultarMovimientos.Movimientos createTipoSalidaConsultarMovimientosMovimientos() {
        return new TipoSalidaConsultarMovimientos.Movimientos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaConsultarMovimientos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1", name = "entradaConsultarMovimientos")
    public JAXBElement<TipoEntradaConsultarMovimientos> createEntradaConsultarMovimientos(TipoEntradaConsultarMovimientos value) {
        return new JAXBElement<>(CQN_ENTRADA_CONSULTAR_MOVIMIENTOS, TipoEntradaConsultarMovimientos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaConsultarMovimientos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1", name = "salidaConsultarMovimientos")
    public JAXBElement<TipoSalidaConsultarMovimientos> createSalidaConsultarMovimientos(TipoSalidaConsultarMovimientos value) {
        return new JAXBElement<>(CQN_SALIDA_CONSULTAR_MOVIMIENTOS, TipoSalidaConsultarMovimientos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1", name = "valor", scope = TipoNotaCreditoCMO.class)
    public JAXBElement<BigDecimal> createTipoNotaCreditoCMOValor(BigDecimal value) {
        return new JAXBElement<>(CQN_TIPO_NOTA_CREDITO_CMO_VALOR, BigDecimal.class, TipoNotaCreditoCMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/cb/gestioncuentacupos/consultarmovimientos/v1", name = "valor", scope = TipoReciboCajaCMO.class)
    public JAXBElement<BigDecimal> createTipoReciboCajaCMOValor(BigDecimal value) {
        return new JAXBElement<>(CQN_TIPO_NOTA_CREDITO_CMO_VALOR, BigDecimal.class, TipoReciboCajaCMO.class, value);
    }

}
