package ar.com.unpaz.principal;

import ar.com.unpaz.service.Servicio;
import ar.com.unpaz.service.ServicioImp;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.Venta;

public class Principal {

	public static void main(String[] args) {
		
		Servicio servicio = new ServicioImp();

		
		String directorioRepository = "src/ar/com/unpaz/repository/";
		
		String archivoCliente = directorioRepository + "cliente.txt";
        String archivoDetalle = directorioRepository + "detalle.txt";
        String archivoProducto = directorioRepository + "producto.txt";
        String archivoVenta = directorioRepository + "venta.txt";
        
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("MENU:");
            System.out.println("1. Listar todos los clientes");
            System.out.println("2. Mostrar detalles de ventas");
            System.out.println("3. Listar todos los productos");
            System.out.println("4. Mostrar todas las ventas");
            System.out.println("5. Mostrar informe de cliente individual");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    List<Cliente> clientes = servicio.leerClientes(archivoCliente);
                    servicio.mostrarClientes(clientes);
                    break;
                case 2:
                    List<Detalle> detalles = servicio.leerDetalles(archivoDetalle);
                    servicio.mostrarDetalles(detalles);
                    break;
                case 3:
                    List<Producto> productos = servicio.leerProductos(archivoProducto);
                    servicio.mostrarProductos(productos);
                    break;
                case 4:
                    List<Venta> ventas = servicio.leerVentas(archivoVenta);
                    servicio.mostrarVentas(ventas);
                    break;
                case 5:
                    System.out.print("Ingrese el ID del cliente: ");
                    int idCliente = scanner.nextInt();
                    servicio.mostrarInformeCliente(idCliente, archivoCliente, archivoVenta);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
	}

}
