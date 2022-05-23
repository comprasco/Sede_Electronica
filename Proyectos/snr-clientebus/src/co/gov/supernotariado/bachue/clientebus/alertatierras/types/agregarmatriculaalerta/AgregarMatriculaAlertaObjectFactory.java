
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.agregarmatriculaalerta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarmatriculaalerta.v1 package. 
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
public class AgregarMatriculaAlertaObjectFactory {

    private static final QName CQN_SALIDA_AGREGAR_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", "salidaAgregarMatriculaAlerta");
    private static final QName CQN_ENTRADA_AGREGAR_MATRICULA_ALERTA = new QName("https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", "entradaAgregarMatriculaAlerta");

    /**
     * Create a new ConsultaActosTurnoObjectFactory that can be used to create new instances of schema derived classes for package: https.www_supernotariado_gov_co.schemas.bachue.ee.alertatierras.agregarmatriculaalerta.v1
     * 
     */
    public AgregarMatriculaAlertaObjectFactory() {
    	//Constructor vacio
    }

    /**
     * Create an instance of {@link TipoEntradaAgregarMatriculaAlerta }
     * 
     */
    public TipoEntradaAgregarMatriculaAlerta createTipoEntradaAgregarMatriculaAlerta() {
        return new TipoEntradaAgregarMatriculaAlerta();
    }

    /**
     * Create an instance of {@link TipoSalidaAgregarMatriculaAlerta }
     * 
     */
    public TipoSalidaAgregarMatriculaAlerta createTipoSalidaAgregarMatriculaAlerta() {
        return new TipoSalidaAgregarMatriculaAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSalidaAgregarMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", name = "salidaAgregarMatriculaAlerta")
    public JAXBElement<TipoSalidaAgregarMatriculaAlerta> createSalidaAgregarMatriculaAlerta(TipoSalidaAgregarMatriculaAlerta value) {
        return new JAXBElement<>(CQN_SALIDA_AGREGAR_MATRICULA_ALERTA, TipoSalidaAgregarMatriculaAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEntradaAgregarMatriculaAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.supernotariado.gov.co/schemas/bachue/ee/alertaTierras/agregarMatriculaAlerta/v1", name = "entradaAgregarMatriculaAlerta")
    public JAXBElement<TipoEntradaAgregarMatriculaAlerta> createEntradaAgregarMatriculaAlerta(TipoEntradaAgregarMatriculaAlerta value) {
        return new JAXBElement<>(CQN_ENTRADA_AGREGAR_MATRICULA_ALERTA, TipoEntradaAgregarMatriculaAlerta.class, null, value);
    }

}
