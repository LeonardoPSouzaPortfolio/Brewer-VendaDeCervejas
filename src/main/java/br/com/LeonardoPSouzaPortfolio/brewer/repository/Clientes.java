package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
