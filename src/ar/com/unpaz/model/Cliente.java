package ar.com.unpaz.model;

public class Cliente {

	private int idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
<<<<<<< HEAD

=======
	private int cantVentas;
	private float montoTotal;
	
>>>>>>> 9c3294e12e1ddac796f6a7740a4b8c4451c1f477
	public Cliente() {
		
	}
	
	public Cliente(int idCliente, String nombre, String apellido, String telefono) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}
<<<<<<< HEAD
=======

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}	
>>>>>>> 9c3294e12e1ddac796f6a7740a4b8c4451c1f477
}
