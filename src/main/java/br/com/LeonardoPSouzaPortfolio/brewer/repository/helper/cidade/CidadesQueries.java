package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cidade;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.CidadeFilter;

public interface CidadesQueries {

	public Page<Cidade> filtrar(CidadeFilter filtro, Pageable pageable);
	
	public Cidade buscarComEstados(Long codigo);
	
}