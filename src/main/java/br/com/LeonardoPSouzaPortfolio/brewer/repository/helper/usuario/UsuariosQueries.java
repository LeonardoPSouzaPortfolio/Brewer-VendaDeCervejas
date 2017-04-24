package br.com.LeonardoPSouzaPortfolio.brewer.repository.helper.usuario;

import java.util.List;
import java.util.Optional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Usuario;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.UsuarioFilter;

public interface UsuariosQueries {

	public Optional<Usuario> porEmailEAtivo(String email);
	
	public List<String> permissoes(Usuario usuario);
	
	public List<Usuario> filtrar(UsuarioFilter filtro);
	
}