/**
 * 
 */
package ecommerce.notificar;

import ecommerce.model.Cliente;

/**
 * @author marcio
 *
 */
public class NotificadorClienteSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		cliente.setAtivo();
		System.out.printf("Notificando o cliente %s através do SMS %s com a mensagem %s",
				cliente.getNome(), cliente.getTelefone(), mensagem );
		
	}

}
