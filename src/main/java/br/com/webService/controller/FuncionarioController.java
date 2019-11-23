package br.com.webService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webService.model.Funcionario;
import br.com.webService.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioService service;
	
	@PostMapping("/salvar")
	public Funcionario salvar(@RequestBody Funcionario funcionario) {
		return service.salvar(funcionario);
	}
	
	@GetMapping("/buscar/{pesquisa}")
	public List<Funcionario> buscar(@PathVariable("pesquisa") String pesquisa){
		return service.buscar(pesquisa);
	}
}
