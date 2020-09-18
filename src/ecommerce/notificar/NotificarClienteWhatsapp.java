/**
 * 
 */
package ecommerce.notificar;

import ecommerce.model.Cliente;

/**
 * @author marcio
 *
 */
public class NotificarClienteWhatsapp implements Notificador {
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		cliente.setAtivo();
		System.out.printf("Notificando o cliente %s através do WHATSAPP %s com a mensagem %s",
				cliente.getNome(), cliente.getTelefone(), mensagem );
		
	}
}
