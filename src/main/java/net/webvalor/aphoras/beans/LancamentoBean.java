package net.webvalor.aphoras.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import net.webvalor.aphoras.daos.AtividadeDao;
import net.webvalor.aphoras.daos.LancamentoDao;
import net.webvalor.aphoras.daos.ProjetoDao;
import net.webvalor.aphoras.models.Atividade;
import net.webvalor.aphoras.models.Lancamento;
import net.webvalor.aphoras.models.Projeto;

@Named
@RequestScoped
public class LancamentoBean {

	@Inject
	LancamentoDao dao;

	private Lancamento lancamento = new Lancamento();

	@Inject
	private ProjetoDao projetoDao;

	@Inject
	private AtividadeDao atividadeDao;

	public void salvar() {
		dao.salvar(this.lancamento);
	}

	public List<Projeto> completaProjeto(String nome) {

		return projetoDao.buscarPorNome(nome);
	}

	public List<Atividade> completaAtividade(String descricao) {
		return atividadeDao.buscarPorDescricao(descricao);
	}

	public List<Lancamento> getLista() {

		return dao.listaLancamentos();
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
}
