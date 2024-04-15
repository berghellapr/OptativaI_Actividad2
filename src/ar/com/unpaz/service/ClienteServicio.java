package ar.com.unpaz.service;
import java.util.List;

import ar.com.unpaz.model.Cliente;

public interface ClienteServicio {

	public Cliente getClienteById(int idCliente, List<Cliente> clientes);
}
