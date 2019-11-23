package br.com.webService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.webService.model.AtividadeFuncionario;
import br.com.webService.model.Funcionario;

@Repository
public interface AtividadeFuncionarioRepository extends JpaRepository<AtividadeFuncionario, Long> {


	
//	@Query(value = "select bean from AtividadeFuncionario bean ")
//	public List<AtividadeFuncionario> buscar(@Param("pesquisa") String pesquisa);
}
