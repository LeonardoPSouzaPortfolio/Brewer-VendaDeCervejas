package br.com.LeonardoPSouzaPortfolio.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

}