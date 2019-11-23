package br.com.webService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.webService.model.Meta;

public interface MetaRepository extends JpaRepository<Meta, Long> {
	
	@Query(value = "select bean from Meta bean where bean.nome like :pesquisa")
	public List<Meta> buscar(@Param("pesquisa") String pesquisa);
}
