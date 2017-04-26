package net.webvalor.aphoras.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import net.webvalor.aphoras.models.Atividade;

@FacesConverter("atividadeConverter")
public class AtividadeConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {
		if (id == null || id.trim().isEmpty())
			return null;
		Atividade atividade = new Atividade();

		atividade.setId(Long.valueOf(id));

		return atividade;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object idObject) {

		if (idObject == null)
			return null;

		Atividade atividade = (Atividade) idObject;
		return atividade.getId().toString();
	}

}
