package ar.com.unpaz.model;

public class Cliente {

	private int idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	
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
}