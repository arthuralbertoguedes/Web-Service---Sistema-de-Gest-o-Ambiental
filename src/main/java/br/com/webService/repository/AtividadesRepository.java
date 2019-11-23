package br.com.webService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.webService.model.Atividade;

@Repository
public interface AtividadesRepository extends JpaRepository<Atividade, Long>{

	@Query(value = "select bean from Atividade bean where bean.nome like :pesquisa")
	public List<Atividade> buscar(@Param("pesquisa") String pesquisa);
}
