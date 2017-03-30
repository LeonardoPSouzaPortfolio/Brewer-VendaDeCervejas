package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.cerveja;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Estilo;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.EstiloFilter;

public interface EstilosQueries {
	
	public Page<Estilo> filtrar(EstiloFilter filtro, Pageable pageable);
	
}