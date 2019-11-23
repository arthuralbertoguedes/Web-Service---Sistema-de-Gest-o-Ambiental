package br.com.webService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webService.model.AtividadeFuncionario;
import br.com.webService.service.AtividadeFuncionarioService;

@RestController()
@RequestMapping(value = "atividadesFuncionario")
public class AtividadeFuncionarioController {

	@Autowired
	AtividadeFuncionarioService service;
	
	@PostMapping("/salvar")
	public AtividadeFuncionario salvar(@RequestBody List<AtividadeFuncionario> atividadesFuncionario) {
		return service.salvar(atividadesFuncionario);
	}
}
