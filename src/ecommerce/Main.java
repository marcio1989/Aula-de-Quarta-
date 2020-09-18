/**
 * 
 */
package ecommerce;

import ecommerce.model.Cliente;
import ecommerce.service.ClienteService;
import ecommerce.service.ClienteServiceInterface;

/**
 * @author marcio
 *
 */
public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Marcio Ricardo", "marcio-ricardo@gmail.com", "83 9 1234-5678", "089.544.654.21");

		// Notificador notificador = new NotificadorClienteEmail();
		ClienteServiceInterface service = new ClienteService();
		System.out.println(">>>>>>>>> salvando cliente no banco de dados");

		service.salvar(cliente);
		System.out.println(">>>>>>>> cliente salvo");
		
		for(Cliente c : service.clientes()) {
			System.out.println(">>> Java 7 <<< " + c.getNome());
		}
		
		service.clientes().stream().forEach(c -> {
			System.out.println(">>>>> Java 8 <<<<< " + c.getEmail());
		});	
		Cliente clienteCPF = service.buscoPorCpf(cliente.getCpf());
		if(clienteCPF == null) {
			System.out.println("Cliente encontrado");
		}else {
			System.out.println(">>>>>>>Cliente não encontrado: " + clienteCPF.getEmail());
			
		}
	}

}
