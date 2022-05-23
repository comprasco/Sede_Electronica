
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.eliminarprocantiguosistema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.eliminarprocantiguosistema.v1 package. 
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
public class EliminarProcAntiguoSistemaObjectFactory {

    private static final QName CQN_ENTRADA_ELIMINAR_PROC_ANTIGUO_SISTEMA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", "entradaEliminarProcAntiguoSistema");
    private static final QName CQN_SALIDA_ELIMINAR_PROC_ANTIGUO_SISTEMA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", "salidaEliminarProcAntiguoSistema");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.eliminarprocantiguosistema.v1
     * 
     */
    public EliminarProcAntiguoSistemaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoSalidaEliminarProcAntiguoSistema }
     * 
     */
    public TipoSalidaEliminarProcAntiguoSistema createTipoSalidaEliminarProcAntiguoSistema() {
        return new TipoSalidaEliminarProcAntiguoSistema();
    }

    /**
     * Create an instance of {@link TipoEntradaEliminarProcAntiguoSistema }
     * 
     */
    public TipoEntradaEliminarProcAntiguoSistema createTipoEntradaEliminarProcAntiguoSistema() {
        return new TipoEntradaEliminarProcAntiguoSistema();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaEliminarProcAntiguoSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", name = "entradaEliminarProcAntiguoSistema")
    public JAXBElement<TipoEntradaEliminarProcAntiguoSistema> createEntradaEliminarProcAntiguoSistema(TipoEntradaEliminarProcAntiguoSistema value) {
        return new JAXBElement<>(CQN_ENTRADA_ELIMINAR_PROC_ANTIGUO_SISTEMA, TipoEntradaEliminarProcAntiguoSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaEliminarProcAntiguoSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/eliminarProcAntiguoSistema/v1", name = "salidaEliminarProcAntiguoSistema")
    public JAXBElement<TipoSalidaEliminarProcAntiguoSistema> createSalidaEliminarProcAntiguoSistema(TipoSalidaEliminarProcAntiguoSistema value) {
        return new JAXBElement<>(CQN_SALIDA_ELIMINAR_PROC_ANTIGUO_SISTEMA, TipoSalidaEliminarProcAntiguoSistema.class, null, value);
    }

}
