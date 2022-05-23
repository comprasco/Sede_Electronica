/**
 * Archivo del proyecto Sede Electronica
 * --------------------------------------
 * Nombre del archivo: MenuSelectorConverter.java
 * Paquete del archivo: co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n
 * Nombre del elemento: MenuSelectorConverter
 * @author Smartsoft Solutions S.A.S 
 * @version 1.0
 */
package co.gov.supernotariado.bachue.sedeelectronica.admon.jsf.i18n;

import java.io.Serializable;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import co.gov.supernotariado.bachue.sedeelectronica.admon.persistence.dto.GenericoDTO;

/**
 * Clase que se usa para incluir DTO's como valores en un <b>SelectOneMenu</b>.
 *
 * @author SmartSoft Solutions S.A.S
 * @version 1.0
 */
@FacesConverter(forClass = GenericoDTO.class, value = "selectOneMenuConverter")
public class MenuSelectorConverter implements Converter, Serializable {

	/**
	 * Define la constante serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext,
	 * javax.faces.component.UIComponent, java.lang.String)
	 */
	@Override
	public Object getAsObject(FacesContext afc_facesContexto, UIComponent aui_componente, String as_valor) {
		if (as_valor == null || as_valor.equals("-1")) {
			return null;
		}

		return fromSelect(aui_componente, as_valor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext,
	 * javax.faces.component.UIComponent, java.lang.Object)
	 */
	@Override
	public String getAsString(FacesContext afc_facesContext, UIComponent aui_componente, Object as_valor) {
		return serialize(as_valor);
	}

	/**
	 * Serializa el objeto.
	 *
	 * @param ao_objeto the object
	 * @return Resultado para serialize retornado como String
	 */
	private String serialize(final Object ao_objeto) {
		if (ao_objeto == null) {
			return null;
		}
		return ao_objeto.getClass() + "@" + ao_objeto.hashCode();
	}

	/**
	 * Desde un selector.
	 *
	 * @param aui_componente  the currentcomponent
	 * @param as_objetoString the object string
	 * @return Resultado para from select retornado como Object
	 */
	private Object fromSelect(final UIComponent aui_componente, final String as_objetoString) {

		if (aui_componente.getClass() == UISelectItem.class) {
			final UISelectItem luisi_item = (UISelectItem) aui_componente;
			final Object lo_valor = luisi_item.getValue();
			if (as_objetoString.equals(serialize(lo_valor))) {
				return lo_valor;
			}
		}

		if (aui_componente.getClass() == UISelectItems.class) {
			UISelectItems luisi_item = (UISelectItems) aui_componente;
			@SuppressWarnings("unchecked")
			List<Object> llo_elementos = (List<Object>) luisi_item.getValue();
			for (final Object lo_elemento : llo_elementos) {
				if (as_objetoString.equals(serialize(lo_elemento))) {
					return lo_elemento;
				}
			}
		}

		if (!aui_componente.getChildren().isEmpty()) {
			for (final UIComponent lui_componente : aui_componente.getChildren()) {
				final Object lo_resultado = fromSelect(lui_componente, as_objetoString);
				if (lo_resultado != null) {
					return lo_resultado;
				}
			}
		}
		return null;
	}

}
