package ar.com.unpaz.service;

import java.util.List;
import ar.com.unpaz.model.Cliente;

public class ClienteServicioImp implements ClienteServicio{

	public Cliente getClienteById(int idCliente, List<Cliente> clientes) {
		Cliente cliente = new Cliente();
		try {
			
			for (Cliente c : clientes) {
				if(c.getIdCliente() == idCliente) {
				     cliente= c;
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return  cliente;
	}
}

