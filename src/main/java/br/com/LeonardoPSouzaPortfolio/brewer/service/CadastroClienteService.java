package br.com.LeonardoPSouzaPortfolio.brewer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cliente;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Clientes;
import br.com.LeonardoPSouzaPortfolio.brewer.service.exception.CpfCnpjClienteJaCadastradoException;

@Service
public class CadastroClienteService {

	@Autowired
	private Clientes clientes;
	
	@Transactional
	public void salvar(Cliente cliente) {
		Optional<Cliente> clienteExistente = clientes.findByCpfOuCnpj(cliente.getCpfOuCnpjSemFormatacao());
		if (clienteExistente.isPresent() && !clienteExistente.get().equals(cliente)) {
			throw new CpfCnpjClienteJaCadastradoException("CPF/CNPJ já cadastrado");
		}
		
		clientes.save(cliente);
	}

	@Transactional
	public void excluir(Long codigo) {
		clientes.delete(codigo);
	}
	
}