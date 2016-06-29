package main.java.br.com.caronex.repository;

import java.util.Date;
import java.util.List;

import main.java.br.com.caronex.domain.Avaliacao;
import main.java.br.com.caronex.domain.Carona;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CaronaRepository extends MongoRepository<Carona, String> {

	@Query("{'passageiros' :{'$ref' : 'passageiro' , '$id' : ?0}}")
	List<Carona> findByPassageiro(String id);
	
	List<Avaliacao> findByAvaliacaoNotaGreaterThan(Long nota);
	
	List<Carona> findByDia(Date dia);
	
}
