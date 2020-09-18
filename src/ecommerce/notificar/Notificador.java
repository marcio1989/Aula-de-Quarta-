package ecommerce.notificar;

import ecommerce.model.Cliente;

public interface Notificador {

	public void notificar(Cliente cliente, String mensagem);
}
