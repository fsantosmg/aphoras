package net.webvalor.aphoras.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import net.webvalor.aphoras.daos.AtividadeDao;
import net.webvalor.aphoras.daos.DepartamentoDao;
import net.webvalor.aphoras.models.Atividade;
import net.webvalor.aphoras.models.Departamento;

@Model
public class AtividadeBean {
	
	
	Atividade atividade = new Atividade();
	
	@Inject
	private AtividadeDao atividadeDao;

	@Inject
	private DepartamentoDao departamentoDao;
	
	public void Salvar(){
		
		atividadeDao.salvar(atividade);
		
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	public List<Departamento> getDepartamentos(){
		return departamentoDao.listar();
	}
	
	public List<Atividade> getAtividades(){
		return atividadeDao.listar();
	}
	
	

}
