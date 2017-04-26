package net.webvalor.aphoras.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.webvalor.aphoras.models.Departamento;

public class DepartamentoDao implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager manager;

	public List<Departamento> listar() {
		
		List<Departamento> lista = manager.
				createQuery("select d from Departamento d", Departamento.class).getResultList();

		return lista;

	}
	

}
