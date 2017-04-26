package net.webvalor.aphoras.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.webvalor.aphoras.models.Projeto;

public class ProjetoDao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager manager;
	

	public List<Projeto> buscarPorNome(String nome){
		
		
		return manager.createQuery("FROM Projeto WHERE upper(nome) like:nome", Projeto.class)
				.setParameter("nome", nome.toUpperCase() + "%").getResultList();
	}
	

}
