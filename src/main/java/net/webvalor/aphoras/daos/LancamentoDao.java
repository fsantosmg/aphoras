package net.webvalor.aphoras.daos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import net.webvalor.aphoras.models.Lancamento;

public class LancamentoDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@PersistenceContext
	EntityManager managers;
	
	@Transactional
	public void salvar(Lancamento lancamento){
		managers.persist(lancamento);
	}

	public List<Lancamento> listaLancamentos(){
		
		return managers.createQuery("select l from Lancamento l", Lancamento.class).getResultList();
	}
}
