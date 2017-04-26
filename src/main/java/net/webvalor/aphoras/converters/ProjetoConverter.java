package net.webvalor.aphoras.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import net.webvalor.aphoras.models.Projeto;

@FacesConverter("projetoConverter")
public class ProjetoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {
		if (id == null || id.trim().isEmpty())
			return null;

		Projeto projeto = new Projeto();
		projeto.setId(Long.valueOf(id));

		return projeto;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object projetoObject) {

		if (projetoObject == null)
			return null;

		Projeto projeto = (Projeto) projetoObject;

		return projeto.getId().toString();
	}

}
