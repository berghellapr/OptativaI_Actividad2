package ar.com.unpaz.model;

public class Venta {

	private int idVenta;
	private String fecha;
	private int idCliente;
	private float total;
	
	public Venta() {
		
	}
	
	public Venta(int idVenta, String fecha, int idCliente, float total) {
		this.idVenta = idVenta;
		this.fecha = fecha;
		this.idCliente = idCliente;
		this.total = total;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public String getFecha() {
		return fecha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public float getTotal() {
		return total;
	}
}
