package br.com.webService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.com.webService.model.Meta;
import br.com.webService.service.MetaService;

@RestController
@RequestMapping("/meta")
public class MetaController {

	@Autowired
	MetaService service;
	
	@PostMapping("/salvar")
	public Meta salvar(@RequestBody Meta meta) {
		return service.salvar(meta);
	}
	
	@GetMapping("/buscar/{pesquisa}")
	public List<Meta> buscar(@PathVariable("pesquisa") String pesquisa){
		return service.buscar(pesquisa);
	}
}
