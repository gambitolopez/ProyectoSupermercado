package negocio;

public class Caja {
	
	private float efectivo;
	private float cambio;
	private int clave;
	
	public Caja(){
	}
	
	public float getCambio() {
		return this.cambio;
	}
	public void setCambio(float cambio) {
		this.cambio = cambio;
	}
	public int getClave() {
		return this.clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public float getEfectivo() {
		return this.efectivo;
	}
	public void setEfectivo(float efectivo) {
		this.efectivo = efectivo;
	}
}
