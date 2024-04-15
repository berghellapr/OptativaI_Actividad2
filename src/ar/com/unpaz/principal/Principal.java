package ar.com.unpaz.principal;

import ar.com.unpaz.service.Servicio;
import ar.com.unpaz.service.ServicioImp;
import java.util.List;
<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 9c3294e12e1ddac796f6a7740a4b8c4451c1f477
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.model.Producto;
import ar.com.unpaz.model.Venta;

public class Principal {

	public static void main(String[] args) {
		
		Servicio servicio = new ServicioImp();

<<<<<<< HEAD
		
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
=======
        String archivoCliente = "cliente.txt";
        String archivoDetalle = "detalle.txt";
        String archivoProducto = "producto.txt";
        String archivoVenta = "venta.txt";
        
        /* ---CLIENTES--- */
        List<Cliente> datosCliente = servicio.leerClientes(archivoCliente);
        servicio.mostrarClientes(datosCliente);

        /* ---DETALLE--- */
        List<Detalle> datosDetalle = servicio.leerDetalles(archivoDetalle);
        servicio.mostrarDetalles(datosDetalle);
        
        /* ---PRODUCTO--- */
        List<Producto> datosProducto = servicio.leerProductos(archivoProducto);
        servicio.mostrarProductos(datosProducto);
        
        /* ---VENTA--- */
        List<Venta> datosVenta = servicio.leerVentas(archivoVenta);
        servicio.mostrarVentas(datosVenta);
        
        /* ---COMPLETO--- */
        servicio.mostrarCompleto(0);
>>>>>>> 9c3294e12e1ddac796f6a7740a4b8c4451c1f477
	}

}
