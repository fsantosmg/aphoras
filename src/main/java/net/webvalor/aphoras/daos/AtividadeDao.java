package net.webvalor.aphoras.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import net.webvalor.aphoras.models.Atividade;
import net.webvalor.aphoras.models.Departamento;
import net.webvalor.aphoras.models.Projeto;

public class AtividadeDao {

	@PersistenceContext
	EntityManager manager;

	@Transactional
	public void salvar(Atividade atividade) {
		manager.persist(atividade);

	}

	public List<Atividade> listar() {
		return manager.createQuery("select a from Atividade a", Atividade.class).getResultList();
	}

	public List<Atividade> buscarPorDescricao(String descricao) {
		return manager.createQuery("FROM Atividade WHERE upper(descricao) like :descricao", Atividade.class)
				.setParameter("descricao", descricao.toUpperCase() + "%").getResultList();
	}

}
