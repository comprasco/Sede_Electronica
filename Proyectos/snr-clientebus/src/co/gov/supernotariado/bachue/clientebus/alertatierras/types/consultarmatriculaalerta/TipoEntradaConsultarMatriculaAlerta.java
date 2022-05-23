
package co.gov.supernotariado.bachue.clientebus.alertatierras.types.consultarmatriculaalerta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEntradaConsultarMatriculaAlerta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoEntradaConsultarMatriculaAlerta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codCirculoRegistral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matriculasPagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEntradaConsultarMatriculaAlerta", propOrder = {
    "idAlerta",
    "codCirculoRegistral",
    "numMatriculaInmobiliaria",
    "matriculasPagina"
})
public class TipoEntradaConsultarMatriculaAlerta {

    protected int idAlerta;
    @XmlElement(required = true)
    protected String codCirculoRegistral;
    protected int numMatriculaInmobiliaria;
    protected int matriculasPagina;

    /**
     * Obtiene el valor de la propiedad idAlerta.
     * 
     */
    public int getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define el valor de la propiedad idAlerta.
     * 
     */
    public void setIdAlerta(int value) {
        this.idAlerta = value;
    }

    /**
     * Obtiene el valor de la propiedad codCirculoRegistral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCirculoRegistral() {
        return codCirculoRegistral;
    }

    /**
     * Define el valor de la propiedad codCirculoRegistral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCirculoRegistral(String value) {
        this.codCirculoRegistral = value;
    }

    /**
     * Obtiene el valor de la propiedad numMatriculaInmobiliaria.
     * 
     */
    public int getNumMatriculaInmobiliaria() {
        return numMatriculaInmobiliaria;
    }

    /**
     * Define el valor de la propiedad numMatriculaInmobiliaria.
     * 
     */
    public void setNumMatriculaInmobiliaria(int value) {
        this.numMatriculaInmobiliaria = value;
    }

    /**
     * Obtiene el valor de la propiedad matriculasPagina.
     * 
     */
    public int getMatriculasPagina() {
        return matriculasPagina;
    }

    /**
     * Define el valor de la propiedad matriculasPagina.
     * 
     */
    public void setMatriculasPagina(int value) {
        this.matriculasPagina = value;
    }

}
