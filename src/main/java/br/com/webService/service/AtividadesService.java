package br.com.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webService.model.Atividade;
import br.com.webService.repository.AtividadesRepository;

@Service
public class AtividadesService {

	@Autowired
	AtividadesRepository repository;
		
	public Atividade salvar(Atividade funcionario) {
		return repository.save(funcionario);
	}
	
	public List<Atividade> buscar(String pesquisa){
		if(pesquisa.equals("zzz"))
			pesquisa = "";
		
		return repository.buscar("%" + pesquisa + "%");
	}
}
