package br.com.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.webService.model.Funcionario;
import br.com.webService.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository repository;
	
	public Funcionario salvar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	
	public List<Funcionario> buscar(String pesquisa){
		if(pesquisa.equals("zzz"))
			pesquisa = "";
		
		return repository.buscar("%" + pesquisa + "%");
	}
}