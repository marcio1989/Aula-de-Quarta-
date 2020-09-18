package ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ecommerce.model.Cliente;

public class ClienteService implements ClienteServiceInterface {

	private List<Cliente> clientes;

	public ClienteService() {
		this.clientes = new ArrayList<Cliente>();
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public void remover(String cpf) {

	}

	@Override
	public List<Cliente> clientes() {
		return this.clientes;
	}

	@Override
	public Cliente buscoPorCpf(String cpf) {

		List<Cliente> resultado = this.clientes.stream().filter(c -> 
		cpf.equals(c.getCpf())).collect(Collectors.toList());
				return resultado.get(0);
	}
	
}
