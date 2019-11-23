package br.com.webService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import br.com.webService.model.Meta;
import br.com.webService.repository.MetaRepository;

@Service
public class MetaService {

	@Autowired
	MetaRepository repository;
	
	public Meta salvar(Meta meta) {
		return repository.save(meta);
	}
	
	public List<Meta> buscar(String pesquisa){
		if(pesquisa.equals(""))
			pesquisa = "a";
		
		return repository.buscar("%" + pesquisa + "%");
	}
}
