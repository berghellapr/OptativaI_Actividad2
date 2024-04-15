package ar.com.unpaz.model;

public class Detalle {

	private int idDetalle;
	private int idVenta;
	private int idProducto;
	private int cantidad;
	private float precio;
	
	public Detalle(int idDetalle, int idVenta, int idProducto, int cantidad, float precio) {
		this.idDetalle = idDetalle;
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getIdDetalle() {
		return idDetalle;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public float getPrecio() {
		return precio;
	}
}
