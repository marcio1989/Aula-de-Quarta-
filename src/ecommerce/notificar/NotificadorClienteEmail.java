/**
 * 
 */
package ecommerce.notificar;

import ecommerce.model.Cliente;

/**
 * @author marcio
 *
 */
public class NotificadorClienteEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		cliente.setAtivo();
		System.out.printf("Notificando o cliente %s atra©s do e-mail %s\nCom a mensagem: %s",
				cliente.getNome(), cliente.getEmail(), mensagem );
		
	}

}
