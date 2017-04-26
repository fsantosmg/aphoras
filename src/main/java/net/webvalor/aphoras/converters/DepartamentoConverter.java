package net.webvalor.aphoras.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import net.webvalor.aphoras.models.Departamento;

@FacesConverter("departamentoConverter")
public class DepartamentoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String id) {

		if (id == null || id.trim().isEmpty())
			return null;

		Departamento departamento = new Departamento();
		departamento.setId(Long.valueOf(id));
		return departamento;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object departamentoObject) {
		if (departamentoObject == null)
			return null;

		Departamento departamento = (Departamento) departamentoObject;

		return departamento.getId().toString();
	}

}
