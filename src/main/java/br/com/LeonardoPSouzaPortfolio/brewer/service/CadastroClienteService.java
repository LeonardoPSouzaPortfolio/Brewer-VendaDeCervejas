package br.com.LeonardoPSouzaPortfolio.brewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cliente;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Clientes;

@Service
public class CadastroClienteService {

	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		clientes.save(cliente);
	}
	
}