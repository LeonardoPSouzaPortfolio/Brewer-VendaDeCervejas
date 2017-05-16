package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Venda;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.venda.VendasQueries;

public interface Vendas extends JpaRepository<Venda, Long>, VendasQueries {

}