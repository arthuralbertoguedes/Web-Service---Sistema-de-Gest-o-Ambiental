package br.com.webService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webService.model.Atividade;
import br.com.webService.service.AtividadesService;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

	@Autowired
	AtividadesService service;
	
	@PostMapping("/salvar")
	public Atividade salvar(@RequestBody Atividade atividades) {
		return service.salvar(atividades);
	}
	
	@GetMapping("/buscar/{pesquisa}")
	public List<Atividade> buscar(@PathVariable("pesquisa") String pesquisa){
		return service.buscar(pesquisa);
	}
	
}
