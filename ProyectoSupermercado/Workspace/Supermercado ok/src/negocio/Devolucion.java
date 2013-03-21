package negocio;

public class Devolucion {
	
	public int numeroDevolucion;
	public int calendar;
	public int inventario;
	public String usuario;
	
	public Devolucion(){
		
	}

	public int getNumeroDevolucion() {
		return numeroDevolucion;
	}

	public void setNumeroDevolucion(int numeroDevolucion) {
		this.numeroDevolucion = numeroDevolucion;
	}

	public int getFecha() {
		return calendar;
	}

	public void setFecha(int calendar){
		this.calendar = calendar;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
