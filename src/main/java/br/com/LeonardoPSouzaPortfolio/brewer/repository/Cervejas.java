package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {

}