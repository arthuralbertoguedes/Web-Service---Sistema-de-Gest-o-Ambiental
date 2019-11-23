package br.com.webService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.webService.model.Funcionario;
import br.com.webService.model.Meta;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	
	@Query(value = "select bean from Funcionario bean where bean.nome like :pesquisa")
	public List<Funcionario> buscar(@Param("pesquisa") String pesquisa);
}
