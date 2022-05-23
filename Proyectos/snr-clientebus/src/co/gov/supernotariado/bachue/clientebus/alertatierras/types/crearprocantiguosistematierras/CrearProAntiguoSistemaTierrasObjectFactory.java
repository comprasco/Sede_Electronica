
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.crearprocantiguosistematierras;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.crearprocantiguosistematierras.v1 package. 
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
public class CrearProAntiguoSistemaTierrasObjectFactory {

    private static final QName CQN_SALIDA_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", "salidaCrearProcAntiguoSistemaTierras");
    private static final QName CQN_ENTRADA_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", "entradaCrearProcAntiguoSistemaTierras");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.crearprocantiguosistematierras.v1
     * 
     */
    public CrearProAntiguoSistemaTierrasObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaCrearProcAntiguoSistemaTierras }
     * 
     */
    public TipoEntradaCrearProcAntiguoSistemaTierras createTipoEntradaCrearProcAntiguoSistemaTierras() {
        return new TipoEntradaCrearProcAntiguoSistemaTierras();
    }

    /**
     * Create an instance of {@link TipoSalidaCrearProcAntiguoSistemaTierras }
     * 
     */
    public TipoSalidaCrearProcAntiguoSistemaTierras createTipoSalidaCrearProcAntiguoSistemaTierras() {
        return new TipoSalidaCrearProcAntiguoSistemaTierras();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaCrearProcAntiguoSistemaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", name = "salidaCrearProcAntiguoSistemaTierras")
    public JAXBElement<TipoSalidaCrearProcAntiguoSistemaTierras> createSalidaCrearProcAntiguoSistemaTierras(TipoSalidaCrearProcAntiguoSistemaTierras value) {
        return new JAXBElement<>(CQN_SALIDA_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS, TipoSalidaCrearProcAntiguoSistemaTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaCrearProcAntiguoSistemaTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/crearProcAntiguoSistemaTierras/v1", name = "entradaCrearProcAntiguoSistemaTierras")
    public JAXBElement<TipoEntradaCrearProcAntiguoSistemaTierras> createEntradaCrearProcAntiguoSistemaTierras(TipoEntradaCrearProcAntiguoSistemaTierras value) {
        return new JAXBElement<>(CQN_ENTRADA_CREAR_PROC_ANTIGUO_SISTEMA_TIERRAS, TipoEntradaCrearProcAntiguoSistemaTierras.class, null, value);
    }

}
