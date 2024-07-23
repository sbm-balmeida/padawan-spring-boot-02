package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

//	List<Topico> findByCurso_Nome(String nomeCurso);
	
	List<Topico> findByCurso_Nome(String nomeCurso);
	
//	@Query("SELECT T FROM Topico T WHERE T.CURSO.NOME = :nomeCurso")
//	List<Topico> carregarPorNomeDorCurso(@Param("nomeCurso") String nomeCurso);
}
