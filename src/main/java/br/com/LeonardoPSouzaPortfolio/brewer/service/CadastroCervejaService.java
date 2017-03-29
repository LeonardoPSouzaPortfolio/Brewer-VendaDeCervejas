package br.com.LeonardoPSouzaPortfolio.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Cervejas;

@Service
public class CadastroCervejaService {

	@Autowired
	private Cervejas cervejas;
	
	/**
	 * Abre uma transação
	 * @param cerveja
	 */
	@Transactional
	public void salvar(Cerveja cerveja) {
		cervejas.save(cerveja);
	}
	
}