package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cidade;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Estado;

public interface Cidades extends JpaRepository<Cidade, Long> {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
	
}