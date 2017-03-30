package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Estilo;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.cerveja.EstilosQueries;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries {

	public Optional<Estilo> findByNomeIgnoreCase(String nome);
	
}