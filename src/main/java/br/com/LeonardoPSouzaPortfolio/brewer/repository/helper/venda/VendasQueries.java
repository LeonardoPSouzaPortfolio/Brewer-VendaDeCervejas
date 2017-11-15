package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.venda;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.LeonardoPSouzaPortfolio.brewer.dto.VendaMes;
import br.com.LeonardoPSouzaPortfolio.brewer.dto.VendaOrigem;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Venda;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.VendaFilter;

public interface VendasQueries {

	public Page<Venda> filtrar(VendaFilter filtro, Pageable pageable);
	
	public Venda buscarComItens(Long codigo);
	
	public BigDecimal valorTotalNoAno(); 
	public BigDecimal valorTotalNoMes(); 
	public BigDecimal valorTicketMedioNoAno();
	
	public List<VendaMes> totalPorMes();
	public List<VendaOrigem> totalPorOrigem();
}