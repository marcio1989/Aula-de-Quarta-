package ecommerce.service;

import java.util.List;

import ecommerce.model.Cliente;

public interface ClienteServiceInterface {

	public Cliente salvar(Cliente cliente);

	public void remover(String cpf);

	public List<Cliente> clientes();

	public Cliente buscoPorCpf(String cpf);

}
