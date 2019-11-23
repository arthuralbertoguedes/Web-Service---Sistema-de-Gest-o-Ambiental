package br.com.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webService.model.Atividade;
import br.com.webService.model.AtividadeFuncionario;
import br.com.webService.repository.AtividadeFuncionarioRepository;

@Service
public class AtividadeFuncionarioService {

	@Autowired
	AtividadeFuncionarioRepository repository;
	
	@Autowired
	AtividadesService atividadeService;
		
	public AtividadeFuncionario salvar(List<AtividadeFuncionario> atividadeFuncionario) {
		for(AtividadeFuncionario atividadeFuncio: atividadeFuncionario) {
//			Atividade atividade = atividadeService.salvar(atividadeFuncio.getAtividade());
//			atividadeFuncio.setAtividade(atividade);
			repository.save(atividadeFuncio);
		}
		return null;
	}
	
	public List<AtividadeFuncionario> buscar(String pesquisa){
		if(pesquisa.equals("zzz"))
			pesquisa = "";
		
//		return repository.buscar("%" + pesquisa + "%");
		return null;
	}
}
