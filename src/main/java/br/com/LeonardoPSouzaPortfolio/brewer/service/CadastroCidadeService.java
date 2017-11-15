package br.com.LeonardoPSouzaPortfolio.brewer.service;

import java.util.Optional;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cidade;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Cidades;
import br.com.LeonardoPSouzaPortfolio.brewer.service.exception.ImpossivelExcluirEntidadeException;
import br.com.LeonardoPSouzaPortfolio.brewer.service.exception.NomeCidadeJaCadastradaException;

@Service
public class CadastroCidadeService {

	@Autowired
	private Cidades cidades;
	
	@Transactional
	public void salvar(Cidade cidade) {
		Optional<Cidade> cidadeExistente = cidades.findByNomeAndEstado(cidade.getNome(), cidade.getEstado());
		if (cidadeExistente.isPresent()) {
			throw new NomeCidadeJaCadastradaException("Nome de cidade já cadastrado");
		}
		
		cidades.save(cidade);
	}

	@Transactional
	public void excluir(Long codigo) {
		try {
			cidades.delete(codigo);
			cidades.flush();
		} catch (PersistenceException e) {
			throw new ImpossivelExcluirEntidadeException("Impossível apagar cerveja. Já foi usada em alguma venda.");
		}
	}

	
}