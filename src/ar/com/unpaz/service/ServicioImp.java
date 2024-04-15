package ar.com.unpaz.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.Venta;

public class ServicioImp implements Servicio {

	/* ---CLIENTE--- */
	@Override
	public List<Cliente> leerClientes(String archivoCliente) {
		
	        List<Cliente> datosCliente = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(archivoCliente))){
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(",");
	                int idCliente = Integer.parseInt(partes[0]);
	                String nombre = partes[1];
	                String apellido = partes[2];
	                String telefono = partes[3];
	              
	                datosCliente.add(new Cliente(idCliente, nombre, apellido, telefono));
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return datosCliente;
	    }
	
	public void mostrarClientes(List<Cliente> datosCliente) {
		System.out.println("\n ---CLIENTES--- \n");

		for (Cliente cliente : datosCliente) {
            System.out.println("ID: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println();
		}
	}
	
	
	/* ---DETALLE--- */
	public List<Detalle> leerDetalles(String archivoDetalle) {
		
        List<Detalle> datosDetalle = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoDetalle))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int idDetalle = Integer.parseInt(partes[0]);
                int idVenta = Integer.parseInt(partes[1]);
                int idProducto = Integer.parseInt(partes[2]);
                int cantidad = Integer.parseInt(partes[3]);
                float precio = Float.parseFloat(partes[4]);
                
              
                datosDetalle.add(new Detalle(idDetalle, idVenta, idProducto, cantidad, precio));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datosDetalle;
    }

	public void mostrarDetalles(List<Detalle> datosDetalle) {
		System.out.println("\n ---DETALLES--- \n");
		
		for (Detalle detalle : datosDetalle) {
	        System.out.println("ID: " + detalle.getIdDetalle());
	        System.out.println("Venta (ID): " + detalle.getIdVenta());
	        System.out.println("Producto: " + detalle.getIdProducto());
	        System.out.println("Cantidad: " + detalle.getCantidad());
	        System.out.println("Precio: $" + detalle.getPrecio());
	        System.out.println();
		}
	}
	
	/* ---PRODUCTO--- */
	public List<Producto> leerProductos(String archivoProducto) {
		
        List<Producto> datosProducto = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoProducto))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int idProducto = Integer.parseInt(partes[0]);
                String nombreProducto = partes[1];
                int cantidad = Integer.parseInt(partes[2]);
                float precio = Float.parseFloat(partes[3]);
                
              
                datosProducto.add(new Producto(idProducto, nombreProducto, cantidad, precio));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datosProducto;
    }

	public void mostrarProductos(List<Producto> datosProducto) {
		System.out.println("\n ---PRODUCTOS--- \n");
		
		for (Producto producto : datosProducto) {
	        System.out.println("ID: " + producto.getIdProducto());
	        System.out.println("Nombre del producto: " + producto.getNombreProducto());
	        System.out.println("Cantidad: " + producto.getCantidad());
	        System.out.println("Precio: $" + producto.getPrecio());
	        System.out.println();
		}
	}
	
	/* ---VENTAS--- */
	public List<Venta> leerVentas(String archivoVenta) {
		
        List<Venta> datosVenta = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoVenta))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                int idVenta = Integer.parseInt(partes[0]);
                String fecha = partes[1];
                int idCliente = Integer.parseInt(partes[2]);
                float total = Float.parseFloat(partes[3]);
                
              
                datosVenta.add(new Venta(idVenta, fecha, idCliente, total));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datosVenta;
    }

	public void mostrarVentas(List<Venta> datosVenta) {
		System.out.println("\n ---VENTAS--- \n");
		
		for (Venta venta : datosVenta) {
	        System.out.println("ID: " + venta.getIdVenta());
	        System.out.println("Fecha: " + venta.getFecha());
	        System.out.println("Cliente: " + venta.getIdCliente());
	        System.out.println("Total: $" + venta.getTotal());
	        System.out.println();
		}
	}
	
	/* ---MOSTRAR INFORME--- */
	
	public void mostrarInformeCliente(int idCliente, String archivoCliente, String archivoVenta) {
	    final ClienteServicio clienteServicio = new ClienteServicioImp();
	    
	    List<Cliente> clientes = leerClientes(archivoCliente);
	    Cliente cliente = clienteServicio.getClienteById(idCliente, clientes);
	    
	    if (cliente != null) {
	        int cantVentas = 0;
	        float montoTotal = 0;
	        List<Venta> ventas = leerVentas(archivoVenta);

	        for (Venta venta : ventas) {
	            if (venta.getIdCliente() == idCliente) {
	                cantVentas++;
	                montoTotal += venta.getTotal();
	            }
	        }

	        System.out.println("El cliente " + cliente.getNombre().toUpperCase() + " " + cliente.getApellido().toUpperCase() +
	                " hizo " + cantVentas + " venta(s) con un total de $" + montoTotal + ".");
	    } else {
	        System.out.println("Cliente no encontrado con ID " + idCliente);
	    }
	}
}

