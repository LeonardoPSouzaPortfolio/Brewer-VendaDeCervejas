package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.LeonardoPSouzaPortfolio.brewer.dto.CervejaDTO;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {

	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);
	
	public List<CervejaDTO> porSkuOuNome(String skuOuNome);
	
}