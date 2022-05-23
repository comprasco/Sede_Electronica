
package co.gov.supernotariado.bachue.clientebus.biometriacorebachue.types.bimetrico;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dedosEnum.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="dedosEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PULGAR_DERECHO"/>
 *     &lt;enumeration value="INDICE_DERECHO"/>
 *     &lt;enumeration value="CORAZON_DERECHO"/>
 *     &lt;enumeration value="ANULAR_DERECHO"/>
 *     &lt;enumeration value="MENIQUE_DERECHO"/>
 *     &lt;enumeration value="PULGAR_IZQUIERDO"/>
 *     &lt;enumeration value="INDICE_IZQUIERDO"/>
 *     &lt;enumeration value="CORAZON_IZQUIERDO"/>
 *     &lt;enumeration value="ANULAR_IZQUIERDO"/>
 *     &lt;enumeration value="MENIQUE_IZQUIERDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dedosEnum")
@XmlEnum
public enum DedosEnum {

    PULGAR_DERECHO,
    INDICE_DERECHO,
    CORAZON_DERECHO,
    ANULAR_DERECHO,
    MENIQUE_DERECHO,
    PULGAR_IZQUIERDO,
    INDICE_IZQUIERDO,
    CORAZON_IZQUIERDO,
    ANULAR_IZQUIERDO,
    MENIQUE_IZQUIERDO;

    public String value() {
        return name();
    }

    public static DedosEnum fromValue(String v) {
        return valueOf(v);
    }

}
