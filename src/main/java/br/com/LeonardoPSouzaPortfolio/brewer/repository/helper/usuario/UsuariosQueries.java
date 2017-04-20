package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.usuario;

import java.util.Optional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Usuario;

public interface UsuariosQueries {

	public Optional<Usuario> porEmailEAtivo(String email);
	
}
