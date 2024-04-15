package ar.com.unpaz.service;

import java.util.List;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.Venta;

public interface Servicio {
	
	/* ---CLIENTES--- */
	public List<Cliente> leerClientes (String archivoCliente);
	void mostrarClientes(List<Cliente> datosCliente);
	
	/* ---DETALLE--- */
	public List<Detalle> leerDetalles (String archivoDetalle);
	void mostrarDetalles(List<Detalle> datosDetalle);
	
	/* ---PRODUCTO--- */
	public List<Producto> leerProductos (String archivoProducto);
	void mostrarProductos(List<Producto> datosProducto);
	
	/* ---VENTAS--- */
	public List<Venta> leerVentas (String archivoVenta);
	void mostrarVentas(List<Venta> datosVenta);
	
<<<<<<< HEAD
	/* ---MOSTRAR INFORME--- */
	void mostrarInformeCliente(int idCliente, String archivoCliente, String archivoVenta);
=======
	/* ---COMPLETO--- */
	void mostrarCompleto(int idCliente, String archivoCliente, String archivoVenta);
>>>>>>> 9c3294e12e1ddac796f6a7740a4b8c4451c1f477
}
