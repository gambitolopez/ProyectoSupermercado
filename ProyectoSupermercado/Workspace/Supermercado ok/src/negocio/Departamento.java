package negocio;

public class Departamento {


	public String nombre;
	public int clave;
	
	
	public Departamento(){
	}
	public Departamento(String n,int c){
		this.nombre=n;
		this.clave=c;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getClave(){
		return this.clave;
	}
	public void setClave(int clave){
		this.clave=clave;
	}
}