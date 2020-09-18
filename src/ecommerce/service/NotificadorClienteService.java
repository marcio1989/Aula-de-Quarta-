/**
 * 
 */
package ecommerce.service;

import ecommerce.model.Cliente;
import ecommerce.notificar.Notificador;

/**
 * @author marcio
 *
 */
public class NotificadorClienteService {

	private Notificador notificador;
	
	public NotificadorClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		notificador.notificar(cliente, mensagem);
	}
	
}
