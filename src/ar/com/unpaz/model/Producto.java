package ar.com.unpaz.model;

public class Producto {

	private int idProducto;
	private String nombreProducto;
	private int cantidad;
	private float precio;
	
	public Producto(int idProducto, String nombreProducto, int cantidad, float precio) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public float getPrecio() {
		return precio;
	}
}
